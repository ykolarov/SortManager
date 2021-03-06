package com.sparta.sortTest;

import com.sparta.sortModel.BinarySorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySorterTest {
    BinarySorter binarySorter;
    @BeforeEach
    void setUp() {
        binarySorter = new BinarySorter();
    }

    @Test
    void binarySortReverse() {
        int[] actual = {1000, 8, 6, 5, 3, 1, 9};
        actual = binarySorter.sortArray(actual);
        int[] expected = {1, 3, 5, 6, 8, 9, 1000};
        assertArrayEquals(expected, actual);
    }

    @Test
    void binarySortRandom() {
        int[] actual = {6, 8, 66, 5, 6, 6};
        actual = binarySorter.sortArray(actual);
        int[] expected = {5, 6, 6, 6, 8, 66};
        assertArrayEquals(expected, actual);
    }

    @Test
    void binarySortTraditional() {
        int[] actual = {1,2,3,3,2,1,5,6};
        actual = binarySorter.sortArray(actual);
        int[] expected = {1,1,2,2,3,3,5,6};
        assertArrayEquals(expected, actual);
    }

    @Test
    void binarySortAlreadySorted() {
        int[] actual = {1,2,3,3,4,4,5,6};
        actual = binarySorter.sortArray(actual);
        int[] expected = {1,2,3,3,4,4,5,6};
        assertArrayEquals(expected, actual);
    }

    @Test
    void binarySortEmpty() {
        int[] actual = {};
        actual = binarySorter.sortArray(actual);
        int[] expected = {};
        assertArrayEquals(expected, actual);
    }

    @Test
    void binarySortNull() {
        int[] expected = {};
        assertArrayEquals(expected, binarySorter.sortArray(null));
    }
}