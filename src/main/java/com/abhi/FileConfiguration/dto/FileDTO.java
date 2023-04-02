package com.abhi.FileConfiguration.dto;

import com.abhi.FileConfiguration.vo.Daily;
import com.abhi.FileConfiguration.vo.Monthly;
import com.abhi.FileConfiguration.vo.Weekly;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "This is FileDto ")
public class FileDTO {
    @NotNull
    private String fileName;

    private Monthly monthly;
    private Weekly weekly;
    private Daily daily;


}
