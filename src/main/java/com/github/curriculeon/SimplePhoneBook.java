package com.github.curriculeon;

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook {

    private Map <String, String> phoneMap = new HashMap<>();

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
        List<String> keysInList = new ArrayList<>(phoneMap.keySet());
        keysInList.forEach(System.out::println);
        return keysInList;
    }

    public String reverseLookup(String phoneNumber) {
        // https://stackoverflow.com/questions/1383797/java-hashmap-how-to-get-key-from-value
        for(Map.Entry<String, String> entry : phoneMap.entrySet()) {
            if (Objects.equals(phoneNumber, entry.getValue())) {
                return phoneNumber.getKey();
            }
        }

    }
}
