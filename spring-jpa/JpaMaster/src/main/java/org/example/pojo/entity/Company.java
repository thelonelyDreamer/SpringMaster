package org.example.pojo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/8/10--@0:30
 */
@Entity
@Data
public class Company {
    @Id
    private Long id;

    @OneToMany
    @JoinColumn(name = "company_id")
    private List<Department> departments;
}
