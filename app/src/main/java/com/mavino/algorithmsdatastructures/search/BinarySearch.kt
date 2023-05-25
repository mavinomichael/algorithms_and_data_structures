package com.mavino.algorithmsdatastructures.search

class BinarySearch {

    fun binarySearch(array: IntArray, x: Int): Int{
        //add sorting of array

        var start = 0
        var end = array.size - 1

        while (start <= end){

            val mid = start + (end - start)/2

            if (array[mid] == x){
                return mid
            }

            if (x <= array[mid]){
                end = mid - 1
            }else{
                start = mid + 1
            }
        }
        return -1
    }
}