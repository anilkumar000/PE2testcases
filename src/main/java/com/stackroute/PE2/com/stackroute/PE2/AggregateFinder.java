package com.stackroute.PE2.com.stackroute.PE2;

public class AggregateFinder  {

//    to calculate average of inputs in an array
    public int getAverage(int[] studentsgrades)
    {
//        initialization of variables
        int average=0;
        int total=0;
        for(int i=0; i<studentsgrades.length; i++)
        {
         total= total+studentsgrades[i];
         average= total/studentsgrades.length;
        }
        return average;
    }

//    to find the minimum integer in an array
    public int getMinimum(int [] studentsgrades)
    {
//        initialization of variables
        int minimum= studentsgrades[0];
        for(int i=0; i<studentsgrades.length; i++)
        {
            if (studentsgrades[i]<minimum)
            {
                minimum= studentsgrades[i];
            }
        }

        return minimum;
    }
//    to find the minimum integer in an array
    public int getMaximum(int [] studentsgrades)
    {
//        initialization of variables
        int maximum= studentsgrades[0];
        for(int i=0; i<studentsgrades.length; i++)
        {
            if (studentsgrades[i]>maximum)
            {
                maximum= studentsgrades[i];
            }
        }
        return maximum;
    }
}
