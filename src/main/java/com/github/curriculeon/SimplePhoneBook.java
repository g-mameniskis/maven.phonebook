package com.github.curriculeon;

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook {

    private Map <String, String> phoneMap = new HashMap<String, String>();
     private Object List;

    public void add(String name, String phoneNumberToAdd) {
        phoneMap.put(name, phoneNumberToAdd);

    }

    public String get(String name) {

        return name;
    }

    public Boolean hasEntry(String phoneNumber) {

        return phoneMap.containsKey(phoneNumber);
    }

    public void remove(String name) {

        phoneMap.remove(name);
    }

    public List<String> getAllContactNames() {
        // https://www.mkyong.com/java8/java-8-convert-map-to-list/
        return List<String> keysInList = new ArrayList<>(phoneMap.keySet());
        keysInList.forEach(System.out::println);
    }

    public String reverseLookup(String phoneNumber) {

        return null;
    }
}
