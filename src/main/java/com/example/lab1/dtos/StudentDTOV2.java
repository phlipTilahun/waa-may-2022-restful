package com.example.lab1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTOV2 extends StudentDTO {

    private double gpa;
}
