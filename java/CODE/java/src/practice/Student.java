package practice;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
	import java.time.LocalDate;
	import java.util.*;
	import java.util.stream.Collectors;

public class Student {
	    private String Prn;
	    private String name;
	    private int age;
	    private String course;
	    private LocalDate enrollmentDate;
	    private double gpa;
	    private String city;

	    // Constructor
	    public Student(String prn, String name, int age, String course, LocalDate enrollmentDate, double gpa, String city) {
	        this.Prn = prn;
	        this.name = name;
	        this.age = age;
	        this.course = course;
	        this.enrollmentDate = enrollmentDate;
	        this.gpa = gpa;
	        this.city = city;
	    }

	    // Getter and Setter methods
	    public String getPrn() { return Prn; }
	    public void setPrn(String prn) { this.Prn = prn; }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public int getAge() { return age; }
	    public void setAge(int age) { this.age = age; }

	    public String getCourse() { return course; }
	    public void setCourse(String course) { this.course = course; }

	    public LocalDate getEnrollmentDate() { return enrollmentDate; }
	    public void setEnrollmentDate(LocalDate enrollmentDate) { this.enrollmentDate = enrollmentDate; }

	    public double getGpa() { return gpa; }
	    public void setGpa(double gpa) { this.gpa = gpa; }

	    public String getCity() { return city; }
	    public void setCity(String city) { this.city = city; }

	    @Override
	    public String toString() {
	        return "Student{PRN='" + Prn + "', name='" + name + "', course='" + course + "', GPA=" + gpa + "}";
	    }
	    
	    
	    

	    // 1. Return names of all students from the specified course
	    public static List<String> getStudentNamesByCourse(List<Student> students, String course) {
	        return students.stream()
	                .filter(student -> student.getCourse().equalsIgnoreCase(course))
	                .map(Student::getName)
	                .collect(Collectors.toList());
	    }

	    // 2. Return students with GPA above the given threshold
	    public static List<Student> getStudentsWithHighGPA(List<Student> students, double minGpa) {
	        return students.stream()
	                .filter(student -> student.getGpa() >= minGpa)
	                .collect(Collectors.toList());
	    }

	    // 3. Return unique cities where students are from
	    public static Set<String> getAllCities(List<Student> students) {
	        return students.stream()
	                .map(Student::getCity)
	                .collect(Collectors.toSet());
	    }

	    // 4. Group students by department and count how many in each course
	    public static Map<String, Long> getStudentCountByCourse(List<Student> students) {
	        return students.stream()
	                .collect(Collectors.groupingBy(
	                        Student::getCourse,
	                        Collectors.counting()
	                ));
	    }

	    // 5. Calculate the average GPA of all students
	    public static double getAverageGPA(List<Student> students) {
	        return students.stream()
	                .mapToDouble(Student::getGpa)
	                .average()
	                .orElse(0.0);
	    }

	    // 6. Return top N students with highest GPA
	    public static List<Student> getTopStudentsByGPA(List<Student> students, int limit) {
	        return students.stream()
	                .sorted((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()))
	                .limit(limit)
	                .collect(Collectors.toList());
	    }

	    // 7. Return all students sorted alphabetically by name
	    public static List<Student> getStudentsSortedByName(List<Student> students) {
	        return students.stream()
	                .sorted(Comparator.comparing(Student::getName))
	                .collect(Collectors.toList());
	    }

	    // 8. Group students by their enrollment year
	    public static Map<Integer, List<Student>> getStudentsByEnrollmentYear(List<Student> students) {
	        return students.stream()
	                .collect(Collectors.groupingBy(
	                        student -> student.getEnrollmentDate().getYear()
	                ));
	    }
    
}
