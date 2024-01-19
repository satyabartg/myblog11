package com.myblog.myblog11;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class testclass1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("mike",20,"odisha"),
                                          new Employee("stalin",21,"channai"),
                                          new Employee("Manju",31,"kalkota"),
                                          new Employee("pinku",32,"banglore")

        );
        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(emp -> emp.getAge()));
//        List<Employee> emps = employees.stream().filter(emp -> emp.getAge() >30).collect(Collectors.toList());
//        List<Employee> emp1 = employees.stream().filter(emp -> emp.getName().toLowerCase().startsWith("m")).collect(Collectors.toList());
        System.out.println(collect);
        {
            for (Employee employee:employees) {
                List<Employee> emp = collect.get(employees.get(0).getAge());

                for (Employee x : emp) {
                    System.out.println(x.getName());
                    System.out.println(x.getCity());
                    System.out.println(x.getAge());
                }
            }
        }

    }

}


