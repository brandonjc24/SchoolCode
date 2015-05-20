/* 
 * File:   main.cpp
 * Author: Brandon
 * Description: This program will prompt the user to 
 * enter how many integers they will enter, and will
 * return the highest number
 * Created on September 7, 2013, 10:08 AM
 */

#include <stdio.h>

using namespace std;

int main() 
{
    int tempmax ;
    int tempnum ;
    int intnum ;
    printf("This program will let you choose how many integers you can enter\n") ;
    printf("and we will tell you the highest number you entered\n\n") ;
    printf("How many integers will you enter? ") ;
    scanf("%d", &intnum) ;
    
    printf("Number 1: ") ;
    scanf("%d", &tempmax) ;
    
    for (int i = 1; i < intnum; i++)
    {
        printf("Number %d: ", i+1) ;
        scanf("%d", &tempnum) ;
        if (tempnum > tempmax) { tempmax = tempnum ; }
    }
    
    printf("The highest number you entered is %d\n", tempmax) ;
    
    return 0;
}

