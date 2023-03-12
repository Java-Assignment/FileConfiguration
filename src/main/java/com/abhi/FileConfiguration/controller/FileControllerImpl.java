package com.abhi.FileConfiguration.controller;

import com.abhi.FileConfiguration.dto.FileDTO;
import com.abhi.FileConfiguration.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FileControllerImpl implements FileController{

    @Autowired
    private FileService fileService;

    @Override
    public ResponseEntity<FileDTO> add(FileDTO fileDTO) {
        FileDTO fileDTO1=fileService.add(fileDTO);
        return new ResponseEntity<>(fileDTO1, HttpStatus.CREATED);
    }


}
