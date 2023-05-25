package com.mavino.algorithmsdatastructures.search

class LinearSearch {

    fun linearSearch(array: IntArray, x: Int): Int{
        //iterate through objects of the array
        for (i in array.indices){
            //if the current element is equal to the item we are searching for
            if (array[i] == x){
                //return index of result
                return i
            }
        }
        //if not return -1
        return -1
    }
}