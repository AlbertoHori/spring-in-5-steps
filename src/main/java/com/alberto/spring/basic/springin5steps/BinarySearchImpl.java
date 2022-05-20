package com.alberto.spring.basic.springin5steps;

/**
 * FECIT AH DIE:20.05.22
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        BubbleSortAlgorithm bubbleSortAlgorithm=new BubbleSortAlgorithm();
        int [] sortedNumbers=bubbleSortAlgorithm.sort(numbers);
   //     int[] sortedNumbers = sortAlgorithm.sort(numbers);
    //    System.out.println(sortAlgorithm);
        // Search the array
        return 3;
    }

}