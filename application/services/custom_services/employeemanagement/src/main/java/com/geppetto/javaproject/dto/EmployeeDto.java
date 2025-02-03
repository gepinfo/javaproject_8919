package com.geppetto.javaproject.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    @NotBlank(message = "id cannot be null or empty")
    private String id;
     
    @NotBlank(message = "name cannot be null or empty")  
    private String name;
   
    @NotBlank(message = "role cannot be null or empty")  
    private String role;
   
    @NotNull(message = "salary cannot be null or empty")  
    private Number salary;
  
}
