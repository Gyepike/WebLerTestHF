package hu.webler.weblerspringthymeleafbootstrap.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee>  {

    private String name;
    private String position;
    private String office;
    private Date startDate;
    private double salary;

    @Override
    public int compareTo(Employee other) {
        // Implement comparison logic based on your requirements
        // For example, comparing by last name
        return this.name.compareTo(other.name);
    }
}
