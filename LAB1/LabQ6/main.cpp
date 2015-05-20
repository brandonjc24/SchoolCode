/* 
 * File:   main.cpp
 * Author: Brandon
 *
 * Created on September 16, 2013, 7:10 PM
 */

#include <stdio.h>

using namespace std;

int main()
{
    int n, seriesD = 1 ;
    double infSum = 0 ;
    printf("Enter how many terms you want to add for the infinite series of pi: ") ;
    scanf("%d", &n);
    
    for (int i = 1; i <= n; i++)
    {
        if((i%2)==0)
            infSum -= ( 4.0/ seriesD ) ;
        else
            infSum += ( 4.0/ seriesD ) ;
        seriesD += 2;
    }
    printf("\nThe value of Pi using the infinite series with %d terms is: %f\n", n, infSum) ;
    // calculating how many n for 3.1415
    
    seriesD = 1 ;
    double testSum = 0.0 ;
    int a = 1;
    while(testSum < 3.1415 || testSum >= 3.1416)
    {
        if((a%2)==0)
            testSum -= ( 4.0/ seriesD ) ;
        else
            testSum += ( 4.0/ seriesD ) ;
        seriesD += 2 ;
        a++ ;
    } 
    
    printf("\nThe smallest n to obtain pi to %f is %d\n", testSum, a) ;
    
    return 0;
}

