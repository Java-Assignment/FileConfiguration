package com.abhi.FileConfiguration.dto;

import com.abhi.FileConfiguration.vo.Schedule;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Schema(description = "This is FileDto ")
public class FileDTO {
    @NotNull
    private String fileName;
    @Schema(description = "Indicates Schedule status",defaultValue = "HOURLY",allowableValues = "[HOURLY,DAILY,WEEKLY,MONTHLY]")
    @NotNull
    private Schedule schedule;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate createDate;
}
