package com.alberto.spring.basic.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * FECIT AH DIE:20.05.22
 */
@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers) {
        // Logic for Quick Sort
        return numbers;
    }
}
