package com.abhi.FileConfiguration.dto;

import com.abhi.FileConfiguration.vo.Schedule;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "This is FileDto ")
public class FileDTO {

    private String FileName;


    private Schedule schedule;
}
