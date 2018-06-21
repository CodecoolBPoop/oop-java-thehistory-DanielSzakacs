package com.codecool.thehistory;

import java.util.Arrays;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileReader;
import java.util.List;

public class TheHistoryArray implements TheHistory {

    /**
     * This implementation should use a String array so don't change that!
     */
    private String[] wordsArray = new String[0];

    @Override
    public void add(String text) {
        // TODO refactor
        int newListSize = wordsArray.length;
        String[] tempList = new String[newListSize];

        for(int i = 0; i < wordsArray.length; i++){
            tempList[i] = wordsArray[i];
        }

        String[] wordsArray = new String[tempList.length + 1];

        for(int i = 0; i < tempList.length; i++){
            wordsArray[i] = tempList[i];
        }
        wordsArray[tempList.length] = text;
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        List<String> list = new ArrayList<>(Arrays.asList(wordsArray));
        list.remove(wordToBeRemoved);
        wordsArray = list.toArray(new String[0]);
    }

    @Override
    public int size() {
        //TODO: check the TheHistory interface for more information
        return 0;
    }

    @Override
    public void clear() {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
