package streampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsUsingStreams {

    public List<String> removeFromList(List<String> list, final String elementToRemove) {
        return list.stream().filter(element -> !element.equals(elementToRemove)).collect(Collectors.toList());
    }

    public boolean isPresent(List<String> list, final String elementToRemove) {
        return list.stream().filter(element -> element.equals(elementToRemove)).findFirst().isPresent();
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Alex", 30), new Employee("Sam", 40));

        int sum = employees.stream().mapToInt(employee -> employee.age).sum();

        Employee emp = employees.stream().filter(employee -> employee.age > 50).findFirst().get();
    }


    public static class Employee {
        String name;
        int age;

        public Employee(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
