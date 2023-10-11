package ru.gb.oseminar.service;

import ru.gb.oseminar.data.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.gb.oseminar.data.StreamComparator;

public class StreamServise {
    private Stream streams;

    public void createStream(Integer idStream, List<StudentGroup> groups) {
        this.streams = new Stream(idStream,groups);
    }

    public List<Stream> getSortedStreams(){
        List<Stream> streamList = new ArrayList<>(streams.getIdStream());
        streamList.sort(new StreamComparator());
        return streamList;

    }



}
