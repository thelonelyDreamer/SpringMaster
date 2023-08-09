package org.example.pojo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/8/10--@0:30
 */
@Entity
@Data
public class Department {
    @Id
    private Long id;
}
