package org.example.pojo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/8/10--@0:15
 */
@Entity
public class Dictionary {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
