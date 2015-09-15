package com.itembriyo;

import com.itembriyo.sorting.SortingAlgo;
import com.itembriyo.sorting.impl.InsertionSort;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> records = new ArrayList<Integer>();
        for(int i =5 ;i >=0 ; i--)
        {
            records.add(i);
        }

        SortingAlgo algo = new InsertionSort();

       boolean result =  algo.sort(records);

        System.out.print("sorting result : "+result +" sorted list : "+ records);

    }
}
