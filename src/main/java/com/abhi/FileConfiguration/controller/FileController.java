package com.abhi.FileConfiguration.controller;

import com.abhi.FileConfiguration.dto.FileDTO;
import com.abhi.FileConfiguration.exception.AppAccountNotFoundException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

@RequestMapping(value="/file",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
@Validated
@Tag(name = "File configuration API",description = "file configuration api")
public interface FileController {
    @PostMapping()
    @Operation(summary = "Create a File Config")
    ResponseEntity<FileDTO> add(@RequestBody @Valid FileDTO fileDTO);

    @GetMapping("/data")
    ResponseEntity <List<FileDTO>> get(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) throws AppAccountNotFoundException;
}


