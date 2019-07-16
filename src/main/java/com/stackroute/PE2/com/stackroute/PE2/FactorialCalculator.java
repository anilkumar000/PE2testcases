package com.stackroute.PE2.com.stackroute.PE2;

public class FactorialCalculator
{
//    To calculate factorial of a given integer whose return value is integer
public int intFactorial(int num)
{
//   initialization of variable
    int result= 1;
    if(num==0)
    {
        result=1;
    }
    else {
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
    }
    return result;
}

//    To calculate factorial of a given integer whose return value is a long integer
public long getLongFactorial(long num)
{
//   initialization of variable
    long result= 1L;
    if(num==0)
    {
        result=1L;
    }
    else {
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
    }
    return result;
}
}
