package practice;

import java.time.LocalDate;
import java.util.*;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import java.util.Arrays;


public class Util {
    public static void main(String[] args) {
        // Create sample student data
        List<Student> students = Arrays.asList(
            new Student("PRN001", "John Smith", 20, "Computer Science", 
                       LocalDate.of(2023, 9, 15), 3.8, "New York"),
            new Student("PRN002", "Emma Johnson", 22, "Business", 
                       LocalDate.of(2023, 8, 20), 3.5, "Los Angeles"),
            new Student("PRN003", "Michael Brown", 19, "Computer Science", 
                       LocalDate.of(2024, 1, 10), 3.9, "Chicago"),
            new Student("PRN004", "Sarah Davis", 21, "Engineering", 
                       LocalDate.of(2022, 9, 1), 3.7, "Houston"),
            new Student("PRN005", "David Wilson", 23, "Business", 
                       LocalDate.of(2023, 9, 5), 3.2, "New York")
        );

        // Test all methods
        System.out.println("1. Computer Science Students: " + 
            Student.getStudentNamesByCourse(students, "Computer Science"));
        
        System.out.println("2. Students with GPA >= 3.5: " + 
            Student.getStudentsWithHighGPA(students, 3.5));
        
        System.out.println("3. All Cities: " + 
            Student.getAllCities(students));
        
        System.out.println("4. Student Count by Course: " + 
            Student.getStudentCountByCourse(students));
        
        System.out.println("5. Average GPA: " + 
            Student.getAverageGPA(students));
        
        System.out.println("6. Top 3 Students by GPA: " + 
            Student.getTopStudentsByGPA(students, 3));
        
        System.out.println("7. Students Sorted by Name: " + 
            Student.getStudentsSortedByName(students));
        
        System.out.println("8. Students by Enrollment Year: " + 
            Student.getStudentsByEnrollmentYear(students));
    }
}
	