/* 
 * File:   main.cpp
 * Author: Brandon
 * Description: This program calculates the sum from 1 to 30 of n^2
 * using a for loop, a while loop, and a do-while loop
 * Created on September 7, 2013, 9:20 AM
 */

#include <stdio.h>

using namespace std;

int main() 
{
    int nfor = 0;
    printf("This program uses a for-loop, a while loop, and a \n");
    printf("do while loop to calculate the sum of n^2 from 1 to 30 \n\n") ;
    for (int i=1; i< 31; i++)
    {
        nfor += i * i ;
    }
    printf("The sum by using a for loop is %d\n", nfor) ;
    
    int nwhile = 0;
    int j  = 1;
    while(j < 31)
    {
        nwhile += j*j;
        j++ ;
    }
    printf("The sum by using a while loop is %d\n", nwhile) ;
    
    int ndo = 0;
    int k = 1;
    do
    {
        ndo += k*k ;
        k++ ;
    }while(k<31) ;
    printf("The sum by using a do-while loop is %d\n", ndo) ;
            
    return 0;
}

