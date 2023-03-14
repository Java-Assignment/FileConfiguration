package com.abhi.FileConfiguration.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Daily {
    @Schema(description = "indicates which day",defaultValue = "0",allowableValues = "[0,1,2,3,4,5,6,7]")
    private String day;
    private int minutes;
    private int hour;

}
