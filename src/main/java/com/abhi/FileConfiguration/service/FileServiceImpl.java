package com.abhi.FileConfiguration.service;

import com.abhi.FileConfiguration.dto.FileDTO;
import com.abhi.FileConfiguration.entity.File;
import com.abhi.FileConfiguration.mapper.FileMapper;
import com.abhi.FileConfiguration.repo.FileRepo;
import com.abhi.FileConfiguration.vo.Schedule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

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

}
