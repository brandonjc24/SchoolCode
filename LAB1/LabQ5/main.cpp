/* 
 * File:   main.cpp
 * Author: Brandon
 *
 * Created on September 16, 2013, 6:23 PM
 */

#include <stdio.h>

using namespace std;

int main() 
{
    int inputNum, reverseNum = 0, workNum, testNum, i = 1 ;
    printf("This program will take your input of a positive integer,\n") ;
    printf("then reverse, and output the number\n\n") ;
    do
    {
        printf("Enter a positive integer: ");
        scanf("%d", &inputNum) ;
    } while(inputNum < 0) ;
    workNum = inputNum;
    testNum = inputNum ;
    
    while(testNum > 9)
    {
        testNum /= 10 ;
        i *= 10 ;
    }
    
    while(i >= 1)
    {
        reverseNum += (workNum%10) * i ;
        workNum /=10 ;
        i /= 10 ;
    }
    
    printf("\nThe reverse number of %d, is %d\n", inputNum, reverseNum) ;
    
    return 0;
}

