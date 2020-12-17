package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
public class Student extends BaseEntity {

    private String firstName;
    private String lastName;
    private String faculty;
    private Long course;
    private double grants;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "STUDENT_GROUP", joinColumns = {@JoinColumn(name = "STUDENT_ID", referencedColumnName = "id")}
            , inverseJoinColumns = {@JoinColumn(name = "Group_ID", referencedColumnName = "id")})
    private List<GroupOfStudent> groupOfStudentList;

    public Student(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", grants=" + grants +
                ", groupOfStudentList=" + groupOfStudentList +
                '}';
    }
}
