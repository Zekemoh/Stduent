/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentDao;

import java.util.ArrayList;
import studentdto.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *

 */
public class ClassRosterDaoFileImpl implements classRosterDao{

private Map<String, Student> students = new HashMap<>();
@Override
    public Student addStudent(String studentId, Student student) {
    Student prevStudent = students.put(studentId, student);
    return prevStudent;
    }

    @Override
    public List<Student> getAllStudents() {
          return new ArrayList<Student>(students.values());
    }

    @Override
    public Student getStudent(String studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student removeStudent(String studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}