package com.abhi.FileConfiguration.entity;


import com.abhi.FileConfiguration.vo.Schedule;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Document(collection = "FileConfigure")
@Data
public class File {
    @Id
    private String fileName;
    private Schedule schedule;
    private Daily daily;

    private Monthly monthly;
    private Weekly weekly;

}
