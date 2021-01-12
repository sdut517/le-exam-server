package com.leexam.controller;

import com.leexam.entity.Examinee;
import com.leexam.service.ExamineeService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/12
 */
@Controller
@RequestMapping("excel")
public class ExportExcelController {

    @Autowired
    ExamineeService examineeService;

    @PostMapping("export")
    public void export(@RequestBody Integer[] eeids, HttpServletResponse response) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("考生表");
        List<Examinee> examineeList = examineeService.selectByEeids(eeids);

        // 设置要导出的文件的名字
        String fileName = "examinee" + new Date() + ".xls";

        // 新增数据行，并且设置单元格数据
        int rowNum = 1;

        // headers表示excel表中第一行的表头 在excel表中添加表头
        String[] headers = {"学号", "姓名", "邮箱", "手机号", "性别", "测试日期", "完成日期", "用时", "成绩"};
        HSSFRow row = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        //在表中存放查询到的数据放入对应的列
        for (Examinee examinee : examineeList) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(examinee.getNumber());
            row1.createCell(1).setCellValue(examinee.getName());
            row1.createCell(2).setCellValue(examinee.getEmail());
            row1.createCell(3).setCellValue(examinee.getPhone());
            if (examinee.getGender() == 0) {
                row1.createCell(4).setCellValue("未指定");
            } else if (examinee.getGender() == 1) {
                row1.createCell(4).setCellValue("男");
            } else {
                row1.createCell(4).setCellValue("女");
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            row1.createCell(5).setCellValue(simpleDateFormat.format(examinee.getLoginTime()));
            row1.createCell(6).setCellValue(simpleDateFormat.format(examinee.getFinishTime()));
            Integer costTime = examinee.getCostTime();
            Integer sec = costTime % 60;
            Integer min = costTime / 60 % 60;
            Integer hour = costTime / 3600 % 60;
            row1.createCell(7).setCellValue(hour + "小时" + min + "分钟" + sec + "秒");
            row1.createCell(8).setCellValue(examinee.getGrade());
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }

}
