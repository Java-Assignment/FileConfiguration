package com.abhi.FileConfiguration.repo;

import com.abhi.FileConfiguration.entity.File;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends MongoRepository<File,String> {
}
