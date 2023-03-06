package com.abhi.FileConfiguration.service;

import com.abhi.FileConfiguration.dto.FileDTO;
import com.abhi.FileConfiguration.entity.File;

public interface FileService {
    FileDTO add(FileDTO fileDTO);
}
