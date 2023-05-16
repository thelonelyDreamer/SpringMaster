package org.example.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/5/16--@15:13
 */
@Data
@Slf4j
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 6695383790847736493L;
    private String name;
    private String password;
}
