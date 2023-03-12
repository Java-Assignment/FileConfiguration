package com.abhi.FileConfiguration.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Daily {
    private String day;
    private int minutes;
    private int seconds;
    private int hour;
    @DateTimeFormat()
    private LocalDate createDate;

}
