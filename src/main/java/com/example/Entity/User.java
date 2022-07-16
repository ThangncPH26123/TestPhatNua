package com.example.Entity;

import com.sun.istack.NotNull;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DEMOUSER")
public class User {

    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.example.Entity.MyGenerator")
    private String id;

    private String name;

    private int age;

    private boolean gender;

}
