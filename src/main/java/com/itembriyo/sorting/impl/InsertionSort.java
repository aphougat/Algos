package com.itembriyo.sorting.impl;

import com.itembriyo.sorting.SortingAlgo;

import java.util.List;

/**
 * Created by abhay on 13/09/15.
 */
public class InsertionSort implements SortingAlgo {

    /**
     * @param elements
     * @return
     */
    @Override
    public boolean sort(List<Integer> elements) {


        for(int i=1;i<elements.size();i++)
        {
            int j = i - 1;
            //int newValue = elements.get(i);

            while ( j >= 0 && (elements.get(j) > elements.get(j+1)))
            {
                int oldValue = elements.get(j);

                int newValue = elements.get(j+1);

                elements.set(j,newValue);

                elements.set(j+1,oldValue);

                j =--j;
            }
        }

        return true;
    }
}
