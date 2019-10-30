package com;

import com.spi.Search;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author CCY
 */
public class Main {
    public static void main(String[] args) {
        //service provider interface
        ServiceLoader<Search> searches = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = searches.iterator();
        while (iterator.hasNext()) {
            Search next = iterator.next();
            String s = next.doWork("spi................");
            System.out.println(s);
        }
    }
}
