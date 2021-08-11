package com.kodilla.testing.collections;

import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {

    public OddNumbersExterminator(){

    }

    public List<Integer> exterminate(List<Integer> listWithNumbers){
        List<Integer> newListWithEvenNumbers = new LinkedList<>();
        for (Integer number : listWithNumbers) {
            if (number % 2 == 0) newListWithEvenNumbers.add(number);
        }
        return newListWithEvenNumbers;
    }
}
