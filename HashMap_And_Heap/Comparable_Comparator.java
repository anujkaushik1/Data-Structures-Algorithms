import java.io.*;
import java.util.*;

public class Main{
    public static class Student implements Comparable<Student>{
        int rollNo;
        int age;
        int weight;
        
        Student(){};
        
        Student(int rollNo, int age, int weight){
            this.rollNo = rollNo;
            this.age = age;
            this.weight = weight;
        }
        
        public String toString(){
            return ("rollNo = " + this.rollNo + ", age = "+ this.age +", weight = " + this.weight);
        }
        
        public int compareTo(Student other){
            // Smaller rollNo => Greater Priority
            return this.rollNo - other.rollNo;
        }
        
    }
    
    public static class StudentWtComparator implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            // Higher weight => Greater Priority
            return s2.weight - s1.weight;
        }
    }
    
     public static class StudentMrkComparator implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            // Higher marks => Greater Priority
            return s2.marks - s1.marks;
        }
    }
    
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentWtComparator());
        pq.add(new Student(30, 90, 10));
        pq.add(new Student(20, 70, 0));
        pq.add(new Student(50, 10, 110));
        pq.add(new Student(40, 5, 100));
        pq.add(new Student(10, 87, 83));
        
        while(pq.size() > 0){
            Student top = pq.remove();
            System.out.println(top);
        }
    }
}
