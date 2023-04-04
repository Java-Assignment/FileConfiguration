package com.abhi.FileConfiguration.entity;


import com.abhi.FileConfiguration.vo.Daily;
import com.abhi.FileConfiguration.vo.Hourly;
import com.abhi.FileConfiguration.vo.Monthly;
import com.abhi.FileConfiguration.vo.Weekly;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FileConfigure")
@Data
public class File {
    @Id
    private String fileName;
    private Monthly monthly;
    private Weekly weekly;
    private Daily daily;
    private Hourly hourly;


}
