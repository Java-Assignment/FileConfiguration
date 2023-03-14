package com.abhi.FileConfiguration.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Daily {
//    @Schema(description = "indicates which day", defaultValue = "0", allowableValues = "[0,1,2,3,4,5,6,7]")
    private int day;
    private int minutes;
    private int hour;

}
