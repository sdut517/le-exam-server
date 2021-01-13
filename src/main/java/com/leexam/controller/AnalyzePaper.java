package com.leexam.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.leexam.entity.QuesBank;
import com.leexam.entity.Question;
import com.leexam.service.QuesBankService;
import com.leexam.service.QuestionService;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@RestController
public class AnalyzePaper {

    @Autowired
    QuestionService questionService;
    @Autowired
    QuesBankService quesBankService;
    @PostMapping("/wordup")
    public String uploadfile(@RequestParam("file") MultipartFile file,@RequestParam("qbid")int qbid) {
        int ls=0;
        try {


            File uFile = new File("tempFile.docx");//创建一个临时文件
            if (!uFile.exists()) {
                uFile.createNewFile();
            }
            FileCopyUtils.copy(file.getBytes(), uFile);//复制文件内容
            OPCPackage opcPackage = POIXMLDocument.openPackage("tempFile.docx");//包含所有POI OOXML文档类的通用功能，打开一个文件包。
            XWPFDocument document = new XWPFDocument(opcPackage);//使用XWPF组件XWPFDocument类获取文档内容
            List<XWPFParagraph> paras = document.getParagraphs();
            int num=0;
            for (XWPFParagraph paragraph : paras) {
                List<Object> insertqs= new ArrayList<>();

                String words = paragraph.getText();
                System.out.println(words);
                int temp=0;
                int label=0;
                findtype:
                for(int i=0;i<words.length();)
                {
                    char x = words.charAt(i);
                    if(x=='['){
                        for(int j=i;;j++){
                            char y = words.charAt(j);
                            if(y==']'){
                                String type = words.substring(i+1,j);
                                System.out.println(type);
                                insertqs.add(type);
                                if(type.equals("单选")||type.equals("多选")){
                                    label = 1;
                                }
                                temp=j;
                                break findtype;
                            }
                        }
                    }
                }
                finddiff:
                for(int i =temp;i<words.length();i++){
                    char x = words.charAt(i);
                    if(x==':'){
                        for(int j=i;;j++){
                            char y = words.charAt(j);
                            if(y==']'){
                                String diff = words.substring(i+1,j);
                                insertqs.add(diff);
                                temp = j;
                                break finddiff;
                            }

                        }

                    }
                }
                findgrade:
                for(int i =temp;i<words.length();i++){
                    char x = words.charAt(i);
                    if(x==':'){
                        for(int j=i;;j++){
                            char y = words.charAt(j);
                            if(y==']'){
                                String grade = words.substring(i+1,j);
                                insertqs.add(grade);
                                temp = j;
                                break findgrade;
                            }

                        }

                    }
                }
                findtext:
                for(int i =temp;i<words.length();i++){
                    char x = words.charAt(i);
                    if(x==']'){
                        for(int j=i;;j++){
                            char y = words.charAt(j);
                            if(y=='\n'){
                                String text = words.substring(i+1,j);
                                insertqs.add(text);
                                temp = j;
                                break findtext;
                            }

                        }

                    }
                }
                if(label==1){
                    List<String> choice = new ArrayList<String>();
                    findchooseA:
                    for(int i =temp;i<words.length();i++){
                        char x = words.charAt(i);
                        if(x=='A'){
                            for(int j=i;;j++){
                                char y = words.charAt(j);
                                if(y=='\n'){
                                    String chA = words.substring(i+2,j);
                                    choice.add(chA);
                                    temp = j;
                                    break findchooseA;
                                }
                            }
                        }
                    }
                    findchooseB:
                    for(int i =temp;i<words.length();i++){
                        char x = words.charAt(i);
                        if(x=='B'){
                            for(int j=i;;j++){
                                char y = words.charAt(j);
                                if(y=='\n'){
                                    String chB = words.substring(i+2,j);
                                    choice.add(chB);
                                    temp = j;
                                    break findchooseB;
                                }
                            }
                        }
                    }
                    findchooseC:
                    for(int i =temp;i<words.length();i++){
                        char x = words.charAt(i);
                        if(x=='C'){
                            for(int j=i;;j++){
                                char y = words.charAt(j);
                                if(y=='\n'){
                                    String chC = words.substring(i+2,j);
                                    choice.add(chC);
                                    temp = j;
                                    break findchooseC;
                                }
                            }
                        }
                    }

                    findchooseD:
                    for(int i =temp;i<words.length();i++){
                        char x = words.charAt(i);
                        if(x=='D'){
                            for(int j=i;;j++){
                                char y = words.charAt(j);
                                if(y=='\n'){
                                    String chD = words.substring(i+2,j);
                                    choice.add(chD);
                                    temp = j;
                                    break findchooseD;
                                }
                            }
                        }
                    }

                    insertqs.add(choice);


                }
                else {
                    insertqs.add("[]");
                }
                List<String> answer = new ArrayList<String>();
                findanwser:
                for(int i =temp;i<words.length();i++){
                    char x = words.charAt(i);
                    if(x=='案'){
                        for(int j=i;;j++){
                            char y = words.charAt(j);
                            if(y=='\n'){
                                String an = words.substring(i+2,j);
                                insertqs.add(an);
                                temp = j;
                                break findanwser;
                            }
                        }
                    }
                }
                findanaly:
                for(int i =temp;i<words.length();i++){
                    char x = words.charAt(i);
                    if(x=='析'){
                        for(int j=i;;j++){
                            char y = words.charAt(j);
                            if(y=='\n'){
                                String analy = words.substring(i+2,j);
                                insertqs.add(analy);
                                temp = j;
                                break findanaly;
                            }
                        }
                    }
                }
                findcate:
                for(int i =temp;i<words.length();i++){
                    char x = words.charAt(i);
                    if(x=='签'){
                        for(int j=i;;j++){
                            char y = words.charAt(j);
                            if(y==']'){
                                String ca = words.substring(i+2,j);
                                insertqs.add(ca);
                                temp = j;
                                break findcate;
                            }
                        }
                    }
                }

                System.out.println(insertqs);
                num++;
                Question question = new Question();
                question.setQtype(String.valueOf(insertqs.get(0)));
                question.setDifficult(Integer.parseInt(String.valueOf(insertqs.get(1))));
                question.setPoints(Integer.parseInt(String.valueOf(insertqs.get(2))));
                question.setQstem(String.valueOf(insertqs.get(3)));
                question.setOptions(String.valueOf(insertqs.get(4)));
                question.setQans("["+String.valueOf(insertqs.get(5))+"]");
                question.setAnalysis(String.valueOf(insertqs.get(6)));
                question.setTag(String.valueOf(insertqs.get(7)));
                question.setQnumber(num);

                insertqs=null;

                String add = questionService.insertSelective(question);

                if(add=="success"){

                    int qid=questionService.findqid();
                    String s = quesBankService.findAlltype(qbid);
                    ObjectMapper objectMapper = new ObjectMapper();
                    Integer[] integers = objectMapper.readValue(s, Integer[].class);
                    Integer[] integers1 = Arrays.copyOf(integers, integers.length + 1);
                    integers1[integers1.length - 1] = qid;
                    String s1 = objectMapper.writeValueAsString(integers1);
                    int v = quesBankService.intoBank(s1,qbid);

                    if(v>0){
                        ls=1;
                    }
                    else {
                        ls=0;
                    }

                }
                else if(add=="error"){
                    ls=0;

                }
            }

                uFile.delete();

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ls==0){
            return "failed";
        }
        else{
            return "sucess";
        }
    }


}
