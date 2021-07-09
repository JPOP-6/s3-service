package com.s3.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RequestMapping("/s3")
public interface S3Resource {

    @PostMapping(value = "/upload", consumes = "multipart/form-data")
    ResponseEntity upload(@RequestParam("bucketName") String bucketName, @RequestPart("file") MultipartFile file) throws IOException;
}
