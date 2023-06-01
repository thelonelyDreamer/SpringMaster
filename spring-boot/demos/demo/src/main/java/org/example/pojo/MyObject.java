package org.example.pojo;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/6/1--@7:04
 */
@Data
public class MyObject {

    @NotBlank
    private String m;
    @Max(0)
    private Integer i;
}
