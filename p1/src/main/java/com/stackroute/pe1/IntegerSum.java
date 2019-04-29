package com.stackroute.pe1;

public class IntegerSum
{

    boolean flag;
    public int findSum(int[] arr)
    {
        int sum=0;
        int len= arr.length;
        for(int i=0; i<len; i++)
        {
            sum=sum+arr[i];
        }
     return sum;
    }

    public boolean notAnInteger(float[] arr) {
        int len= arr.length;
        for(int i=0; i<len; i++)
        {
            if((int)arr[i] == arr[i]) {
                flag =true;
                break;
            }

        }
        flag = false;

        return flag;

    }
}
