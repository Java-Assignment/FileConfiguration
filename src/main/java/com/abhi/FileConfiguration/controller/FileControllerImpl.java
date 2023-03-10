package com.abhi.FileConfiguration.controller;

import com.abhi.FileConfiguration.dto.FileDTO;
import com.abhi.FileConfiguration.entity.File;
import com.abhi.FileConfiguration.exception.AppAccountNotFoundException;
import com.abhi.FileConfiguration.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

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


    @Override
    public ResponseEntity<List<FileDTO>> get(LocalDate createDate) throws AppAccountNotFoundException {
        List<FileDTO> fileDTOs=fileService.findByDate(createDate);
        return new ResponseEntity<>(fileDTOs,HttpStatus.OK);
    }


}
