package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.*;
import ru.gb.oseminar.service.DataService;
import ru.gb.oseminar.service.StreamServise;
import ru.gb.oseminar.service.StudentGroupService;
import ru.gb.oseminar.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class UserController {


    private final StreamServise streamServise = new StreamServise();
    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();

    public void createStudent(String firstName, String secondName, String patronymic, String dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }

    public List<Stream> getSortedStreams(){
        return streamServise.getSortedStreams();
    }
}
