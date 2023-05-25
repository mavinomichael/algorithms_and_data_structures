package com.mavino.algorithmsdatastructures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mavino.algorithmsdatastructures.search.BinarySearch
import com.mavino.algorithmsdatastructures.search.HashTableSearch
import com.mavino.algorithmsdatastructures.search.LinearSearch
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.Random

class MainActivity : AppCompatActivity() {
    val random = Random()

    val linearSearch = LinearSearch()
    val binarySearch = BinarySearch()
    val hashTableSearch = HashTableSearch()

    companion object{
        val TAG = "AppDebug"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearTime = testLinearSearch(100000)

        val binaryTime = testBinarySearch(100000)

        val hashTableSearch = testHashTableSearch(100000)

        Log.d(TAG, "onCreate linear: $linearTime")
        Log.d(TAG, "onCreate binary: $binaryTime")
        Log.d(TAG, "onCreate binary: $hashTableSearch")
    }

    private fun generateArray(n: Int): IntArray{
        return IntArray(n){random.nextInt()}
    }

    private fun testLinearSearch(n: Int): Long{
        val array = generateArray(n)

        val element = array[random.nextInt(array.size)]

        val startTime = System.nanoTime()

        val result = linearSearch.linearSearch(array, element)

        Log.d(TAG, "testLinearSearch: result $result")

        val endTime = System.nanoTime()

        return endTime - startTime
    }

    private fun testBinarySearch(n: Int): Long{
        val array = generateArray(n)

        array.sort()

        val element = array[random.nextInt(array.size)]

        val startTime = System.nanoTime()

        val result = binarySearch.binarySearch(array, element)

        Log.d(TAG, "testBinarySearch: result $result")

        val endTime = System.nanoTime()

        return endTime - startTime
    }

    private fun testHashTableSearch(n: Int): Long{

        val array = generateArray(n)

        val element = array[random.nextInt(array.size)]

        val startTime = System.nanoTime()

        val result = hashTableSearch.hashTableSearch(array, element)

        Log.d(TAG, "testHashTableSearch: result $result")

        val endTime = System.nanoTime()

        return endTime - startTime

    }
}
