package ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    public List<StudentGroup> stream;
    public Integer idStream;
    public  StudentGroup studentGroup;

    public Stream(List<StudentGroup> groups) {
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "studentGroup=" + studentGroup +
                '}';
    }
}
