/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import studentDao.ClassRosterDaoFileImpl;
import studentDao.classRosterDao;
import studentdto.Student;
import ui.ClassRosterView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

/**
 *

 */
public class ClassRosterController {
    private UserIO io = new UserIOConsoleImpl();
    private ClassRosterView view = new ClassRosterView();
    private classRosterDao dao = new ClassRosterDaoFileImpl();
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {
            switch (menuSelection) {
                case 1:
                    io.print("LIST STUDENTS");
                    break;
                case 2:
                    io.print("CREATE STUDENT");
                    break;
                case 3:
                    io.print("VIEW STUDENT");
                    break;
                case 4:
                    io.print("REMOVE STUDENT");
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }

        }
        io.print("GOOD BYE");
    }
    private int getMenuSelection(){
return view.printMenuAndGetSelection();
}
    private void createStudent() {
    view.displayCreateStudentBanner();
    Student newStudent = view.getNewStudentInfo();
    dao.addStudent(newStudent.getStudentId(), newStudent);
    view.displayCreateSuccessBanner();
}
    private void listStudents() {
        view.displayDisplayAllBanner();
        List<Student> studentList = dao.getAllStudents();
        view.displayStudentList(studentList);    
    }
    
}


