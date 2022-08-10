/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentDao;

import studentdto.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *

 */
public interface classRosterDao {

   
    Student addStudent(String studentId, Student student);

    
    List<Student> getAllStudents();

   
    Student getStudent(String studentId);

   
     
    Student removeStudent(String studentId);
    
 
}