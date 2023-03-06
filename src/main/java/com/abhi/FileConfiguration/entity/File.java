package com.abhi.FileConfiguration.entity;


import com.abhi.FileConfiguration.vo.Schedule;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FileConfigurer")
@Data
public class File {
    @Id
    private String FileName;
    private Schedule schedule;
}
