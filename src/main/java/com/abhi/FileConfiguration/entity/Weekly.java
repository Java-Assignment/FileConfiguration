package com.abhi.FileConfiguration.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Weekly {
    @Schema(description = "indicates which day of week",defaultValue = "0",allowableValues = "[0,1,2,3,4,5,6,7]")
    private int DayOfWeek;
    private int minutes;

    private int hour;
}
