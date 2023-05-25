package com.mavino.algorithmsdatastructures.search

import android.util.Log
import com.mavino.algorithmsdatastructures.MainActivity.Companion.TAG
import kotlinx.coroutines.delay

class HashTableSearch {

    fun hashTableSearch(array: IntArray, x: Int): Int{
        Log.d(TAG, "hashTableSearch: initial size of array ${array.size}")

        // Create a hash table the same size with the array
        val hashTable = Array<Int?>(array.size){null}

        Log.d(TAG, "hashTableSearch: hash table size ${hashTable.size}")

        // Iterate through the elements in the array
        for (i in array.indices){
            // Calculate the hash code for the current element
            val hashCode = array[i] % array.size

            Log.d(TAG, "hashTableSearch: array element ${array[i]} & hash code $hashCode")

            // Store the element at the calculated hashcode in the hash table
            hashTable[hashCode] = array[i]
        }

        // Calculate the hash code of the element we are searching for
        val hashCode = x % array.size

        // Check if the item is found at the calculate hash code in the hash table
        if (hashTable[hashCode] == x){
            // Return index of the element
            return hashCode
        }

        // If item was not found we return -1
        return -1
    }
}