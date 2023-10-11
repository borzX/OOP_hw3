package ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    public List<StudentGroup> stream;
    public Integer idStream;
    public  StudentGroup studentGroup;


    public Stream(Integer idStream, List<StudentGroup> groups) {
        this.idStream=idStream;
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return null;
    }

    public Integer getIdStream() {
        return idStream;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void setIdStream(Integer idStream) {
        this.idStream = idStream;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "studentGroup=" + studentGroup +
                '}';
    }
}
