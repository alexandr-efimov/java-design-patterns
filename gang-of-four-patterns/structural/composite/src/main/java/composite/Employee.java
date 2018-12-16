package composite;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Getter
@ToString
public class Employee {

    String name;
    String department;
    String post;

    List<Employee> subordinates = new ArrayList<>();

    public void add(Employee employee) {
        this.subordinates.add(employee);
    }
    public void remove(Employee employee) {
        this.subordinates.remove(employee);
    }
}
