package com.piyush.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name="ToDo_Data")
public class ToDos {

    @Id
//    @NotNull
    private Integer id;

    private String name;

    private String dscr;

    private String sts;

}
