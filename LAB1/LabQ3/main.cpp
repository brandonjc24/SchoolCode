/* 
 * File:   main.cpp
 * Author: Brandon
 * Description: This program will ask the user for an integer 
 * input and will tell the user if their input is a 3 digit number
 * Created on September 7, 2013, 10:34 AM
 */

#include <stdio.h>

using namespace std;

int main() 
{
    bool zeroEnter = 0;
    int testInt ;
    int digitCheck ;
    
    printf("This program will take and integer input by the user\n");
    printf("and will tell the user if the integer is a 3 digit number\n\n") ;
    while(!zeroEnter)
    {
        printf("Please input an integer (0 to exit): ") ;
        scanf("%d",&testInt) ;
        if (testInt == 0) 
        { 
            printf("Thanks for using my program!\n") ;
            zeroEnter = 1 ; 
        }
        digitCheck = testInt * testInt ;
        if (digitCheck >= 10000 && digitCheck <= 998001)
        {
            printf("Your input is a 3-digit number: %d \n", testInt) ; 
        }
              
    }
    return 0;
}

