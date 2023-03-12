package com.abhi.FileConfiguration.service;

import com.abhi.FileConfiguration.dto.FileDTO;
import com.abhi.FileConfiguration.entity.File;
import com.abhi.FileConfiguration.exception.AppAccountNotFoundException;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

public interface FileService {
    FileDTO add(FileDTO fileDTO);
}
