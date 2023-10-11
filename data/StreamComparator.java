package ru.gb.oseminar.data;

import java.util.Comparator;


public class StreamComparator implements Comparator<Stream> {


    @Override
    public int compare(Stream o1, Stream o2) {
        int resultOfComparing = o1.getIdStream().compareTo(o2.getIdStream());
        return resultOfComparing;
    }
}
