package ru.gb.oseminar.service;

import ru.gb.oseminar.data.*;

import java.util.ArrayList;
import java.util.List;

public class StreamServise {
    private Stream streams;

    public void createStream(List<StudentGroup> groups) {
        this.streams = new Stream(groups);
    }

    public List<Stream> getSortedStreams(){

        return null;
    }



}
