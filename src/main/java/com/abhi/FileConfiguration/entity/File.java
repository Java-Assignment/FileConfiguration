package com.abhi.FileConfiguration.entity;


import com.abhi.FileConfiguration.vo.Daily;
import com.abhi.FileConfiguration.vo.Monthly;
import com.abhi.FileConfiguration.vo.Schedule;
import com.abhi.FileConfiguration.vo.Weekly;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FileConfigure")
@Data
public class File {
    @Id
    private String fileName;
    private Boolean isHourly;
    private Boolean isMonthly;
    private Boolean isWeekly;
    private  Boolean isDaily;
    private Monthly monthly;
    private Weekly weekly;
    private Daily daily;

}
