package com.example.demo.model;

import javafx.scene.Group;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Sort;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
public class GroupOfStudent extends BaseEntity {

    public GroupOfStudent(Long numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    private Long numberOfGroup;

    @ManyToMany(mappedBy = "groupOfStudentList", fetch = FetchType.EAGER)
    private List<Student> groupValue;

    @Override
    public String toString() {
        return "GroupOfStudent{" +
                "numberOfGroup=" + numberOfGroup +
                '}';
    }
}
