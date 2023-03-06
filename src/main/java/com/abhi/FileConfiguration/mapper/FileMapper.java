package com.abhi.FileConfiguration.mapper;


import com.abhi.FileConfiguration.dto.FileDTO;
import com.abhi.FileConfiguration.entity.File;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FileMapper {
    File convertfileDTOtoFile(FileDTO fileDTO);

    FileDTO convertFiletoFileDTO(File filesaved);
}
