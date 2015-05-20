/* 
 * File:   main.cpp
 * Author: Brandon
 *
 * Created on September 16, 2013, 7:58 PM
 */

#include <stdio.h>

using namespace std;

int main() 
{
    int n ;
    printf("This program will output four different patterns of stars and spaces\n") ;
    
    do{
        printf("Input an odd integer between 1 and 25 (inclusively) ");
        scanf("%d", &n);      
    } while( (n%2) ==0 ) ;
    
    //rectangle
    printf("\nRectangle\n") ;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < (2*n-1); j++)
        {
            printf("*") ;
        }
        printf("\n") ;
    }
    printf("\n") ;    
    
    //pyramid
    printf("\nPyramid\n") ;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= 2*n-1; j++)
        {
            if (j <=n)
            {
                if (n - j >= i)
                    printf(" ") ;
                else
                    printf("*") ;
            }
            else
            {
                if (j-n >= i)
                    printf(" ");
                else
                    printf("*") ;
            }
        }
        printf("\n") ;
    }
    printf("\n") ;
    
    //triangle
    printf("\nTriangle\n") ;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= 2*n-1; j++)
        {
            if ( ( (2*n-1) - 2*(i-1)) >= j )
                printf("*");
            else
                printf(" ");
        }
        printf("\n") ;
    }
    printf("\n") ;

    // Hourglass
    printf("\nHourglass\n") ;
    for (int j = 1; j <= n; j++) // rows
    {
        for (int i = 1; i <= n; i++) // columns
        {
            if ( i <= (n/2 +1) ) // top half of hourglass
            {
                if (j <= (n/2 +1)) // top-left side of hourglass
                {
                    if ( j <= i )
                        printf("*");
                    else
                        printf(" ") ;                            
                }
                else // top-right side of hourglass
                {
                     if ( (n-j+1) <= i)
                         printf("*") ;
                     else
                         printf(" ") ;
                }
            }
            else // bottom half of hourglass
            {
                if (j <= (n/2 +1)) // bottom-left side of hourglass
                {
                    if( (n-j+1) >= i)
                        printf("*");
                    else
                        printf(" ");
                }
                else // bottom-right side of hourglass
                {
                    if (j >= i)
                        printf("*");
                    else
                        printf(" ") ;
                }                
            }
        }
        printf("\n") ;
    }
    printf("\n") ;
    
    return 0;
}

