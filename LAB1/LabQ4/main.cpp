/* 
 * File:   main.cpp
 * Author: Brandon
 *
 * Created on September 16, 2013, 6:04 PM
 */

#include <stdio.h>

using namespace std;

int main() 
{
    char c='a', charCheck;
    int i = 0;
    printf("Enter the character you want to be looked for in your text: ");
    scanf("%c", &charCheck) ;
    printf("Enter your text (end with an !): ") ;
    
    while ( (c = getchar()) != '!')
    {
        if (c == charCheck)
            i++;
    }
    
    switch(i)
    {
        case '0':
            printf("The character %c was not found!\n", charCheck);
            break;
        case '1':
            printf("The character %c was found 1 time!\n", charCheck) ;
            break;
        default:
            printf("The character %c was found %d times!\n", charCheck, i) ;
    }
    
    return 0;
}

