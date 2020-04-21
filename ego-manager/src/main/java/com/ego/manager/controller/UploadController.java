package com.ego.manager.controller;

import com.ego.common.result.FileResult;
import com.ego.manager.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 文件上传Controller
 *
 * @author : wangjd
 * @version : 1.0.0
 * @date : 2020-04-21 16:03
 **/
@Controller
@RequestMapping("fileUpload")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @RequestMapping("save")
    @ResponseBody
    private FileResult upload(MultipartFile file) throws IOException {

        String fileName = file.getOriginalFilename();

        String date = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDateTime.now());
        fileName = date + System.currentTimeMillis() + fileName.substring(fileName.lastIndexOf("."));
        return uploadService.upload(file.getInputStream(),fileName);
    }

}
