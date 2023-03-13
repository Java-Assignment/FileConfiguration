package com.abhi.FileConfiguration.service;

import com.abhi.FileConfiguration.dto.FileDTO;
import com.abhi.FileConfiguration.entity.File;
import com.abhi.FileConfiguration.mapper.FileMapper;
import com.abhi.FileConfiguration.repo.FileRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class FileServiceImpl implements FileService {

    @Autowired
    private FileRepo fileRepo;
    @Autowired
    private FileMapper fileMapper;


    @Override
    public FileDTO add(FileDTO fileDTO) {

        File newfile = fileMapper.convertfileDTOtoFile(fileDTO);
        File filesaved = fileRepo.save(newfile);
        FileDTO fileDTO1 = fileMapper.convertFiletoFileDTO(filesaved);
        return fileDTO1;
    }

    @Override
    public List<FileDTO> get() {
        List<FileDTO> fileDTOS;
        fileDTOS=fileRepo.findAll().stream().map(file -> fileMapper.convertFiletoFileDTO(file)).collect(Collectors.toList());
        return  fileDTOS;
    }


}
