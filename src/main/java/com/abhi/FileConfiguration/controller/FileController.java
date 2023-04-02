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

@RequestMapping(value = "/file", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
@Validated
@Tag(name = "File configuration API", description = "file configuration api")
public interface FileController {
    @PostMapping
    @Operation(summary = "Create a File Config")
    ResponseEntity<FileDTO> add(@RequestBody @Valid FileDTO fileDTO);


}


