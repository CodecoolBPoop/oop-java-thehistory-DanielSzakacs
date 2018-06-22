package com.codecool.thehistory;

import java.util.LinkedList;
import java.util.List;

public class TheHistoryLinkedList implements TheHistory {
    /**
     * This implementation should use a String LinkedList so don't change that!
     */
    private List<String> wordsLinkedList = new LinkedList<>();

    @Override
    public void add(String text) {
        wordsLinkedList.add(text);
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        wordsLinkedList.removeIf(word -> word.equals(wordToBeRemoved));
    }

    @Override
    public int size() {
        return wordsLinkedList.size();
    }

    @Override
    public void clear() {
        wordsLinkedList.clear();
    }

    @Override
    public void replaceOneWord(String from, String to) {
        for (int word = 0; word < wordsLinkedList.size(); word++) {
            wordsLinkedList.set(wordsLinkedList.indexOf(from), to);
        }
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        for (int word = 0; word < fromWords.length ; word++) {
            try {
                wordsLinkedList.set(wordsLinkedList.indexOf(fromWords[word]), toWords[word])
            }catch (Exception ignored){}
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsLinkedList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

}
