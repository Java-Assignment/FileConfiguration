package com.abhi.FileConfiguration.service;

import com.abhi.FileConfiguration.dto.FileDTO;
import com.abhi.FileConfiguration.entity.File;
import com.abhi.FileConfiguration.exception.AppAccountNotFoundException;
import com.abhi.FileConfiguration.mapper.FileMapper;
import com.abhi.FileConfiguration.repo.FileRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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
    public List<FileDTO> findByDate(LocalDate createDate) throws AppAccountNotFoundException {
        Optional<FileDTO> dbac=fileRepo.findByCreateDate(createDate);
        if(dbac.isPresent()){
            List<FileDTO> fileDTO= (List<FileDTO>) fileRepo.findByCreateDate(createDate).get();
            return fileDTO;
        }else {
            throw new AppAccountNotFoundException("Incorrect Date : "+createDate);
        }


    }
}
