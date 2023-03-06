package com.abhi.FileConfiguration.service;

import com.abhi.FileConfiguration.dto.FileDTO;
import com.abhi.FileConfiguration.entity.File;
import com.abhi.FileConfiguration.mapper.FileMapper;
import com.abhi.FileConfiguration.repo.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService{
    @Autowired
    private FileRepo fileRepo;
    @Autowired
    private FileMapper fileMapper;
    @Override
    public FileDTO add(FileDTO fileDTO) {
        File newfile=fileMapper.convertfileDTOtoFile(fileDTO);
        File filesaved=fileRepo.save(newfile);
        FileDTO fileDTO1=fileMapper.convertFiletoFileDTO(filesaved);
        return fileDTO1;
    }
}
