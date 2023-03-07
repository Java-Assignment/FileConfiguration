package com.abhi.FileConfiguration.entity;


import com.abhi.FileConfiguration.vo.Schedule;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "FileConfigurer")
@Data
public class File {
    @Id
    @Field("filename")
    private String fileName;
    private Schedule schedule;
}
