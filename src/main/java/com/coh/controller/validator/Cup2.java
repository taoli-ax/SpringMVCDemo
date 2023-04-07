package com.coh.controller.validator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cup2 {
    private int id;
    @NotEmpty(message = "username should not empty")
    private String name;
    @Size(max = 10,min=1,message = "brand length between 1-10")
    private String brand;

}
