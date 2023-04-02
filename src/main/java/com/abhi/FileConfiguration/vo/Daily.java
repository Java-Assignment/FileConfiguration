package com.abhi.FileConfiguration.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Daily {
    private int hour;
    private int minutes;
}
