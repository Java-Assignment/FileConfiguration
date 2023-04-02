package com.abhi.FileConfiguration.controller;

import com.abhi.FileConfiguration.dto.FileDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

<<<<<<< HEAD
@RequestMapping(value = "/file", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
=======
@RequestMapping(value="/file",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
>>>>>>> fd88eb7ec2085437c44843eb3b056b59fc61870e
@Validated
@Tag(name = "File configuration API", description = "file configuration api")
public interface FileController {
    @PostMapping
    @Operation(summary = "Create a File Config")
    ResponseEntity<FileDTO> add(@RequestBody @Valid FileDTO fileDTO);

}


