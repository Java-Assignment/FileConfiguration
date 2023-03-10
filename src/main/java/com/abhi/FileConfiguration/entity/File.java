package com.abhi.FileConfiguration.entity;


import com.abhi.FileConfiguration.vo.Schedule;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Document(collection = "FileConfigure")
@Data
public class File {
    @Id
    @Field("filename")
    private String fileName;
    private Schedule schedule;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate createDate;

}
