package com.abhi.FileConfiguration.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Data
@NoArgsConstructor
public class Monthly {
    private  int  Day_of_month;
    private int minutes;
    private int hour;
}
