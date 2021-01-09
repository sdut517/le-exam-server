package com.leexam.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author 窦康泰
 * @date 2021/01/08
 */
@Component
public class FileUtil {

    @Value("${web.upload-path}")
    private String imagesPath;

    /**
     * 获取文件后缀
     * @param fileName
     * @return
     */
    public String getSuffix(String fileName){
        return fileName.substring(fileName.lastIndexOf("."));
    }

    /**
     * 生成新的文件名
     * @param fileOriginName 源文件名
     * @return
     */
    public String getFileName(String fileOriginName){
        return getUUID() + getSuffix(fileOriginName);
    }

    public String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }


    public String upload(MultipartFile file){
        String fileName = file.getOriginalFilename();
        String newFileName = getFileName(fileName);
        File dest = new File(imagesPath + newFileName);
        File absoluteFile = dest.getAbsoluteFile();
        if(!absoluteFile.getParentFile().exists()){
            absoluteFile.getParentFile().mkdirs();
        }

        try {
            file.transferTo(absoluteFile);
            return newFileName;
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
