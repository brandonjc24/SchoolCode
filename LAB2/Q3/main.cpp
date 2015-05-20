#include <stdio.h>
#include <cmath>
//#include "vectorlib.h"

float norm2(double vector[], int n) ;
float scalarProd(double vector1[], double vector2[], int n) ;
void addVectors(double vector1[], double vector2[], double vector3[], int n) ;
float norm1(double array[], int size) ;
void printVector( double array[], int size) ;

using namespace std;

int main()
{
    int n ;
    printf("Enter a positive integer for how many vector elements you\n");
    printf("will enter: ") ;
    scanf("%d", &n) ;
    double vector1[n] ;
    double vector2[n] ;
    double sum[n] ;
    printf("\nEnter the numbers for the first vector\n");
    for (int i = 1; i <= n; i++)
    {
        printf("Number %d: ", i) ;
        scanf("%d ", vector1[i-1]) ;
    }
    
    printf("\nEnter the numbers for the second vector\n");
    for (int i = 1; i <= n; i++)
    {
        printf("Number %d: ", i) ;
        scanf("%d ", vector2[i-1]) ;
    }
    printf("\n\nHere are the two vectors you input: \n");
    printf("Vector 1: ") ;
    printVector(vector1, n) ;
    printf("Vector 2: ") ;
    printVector(vector2, n) ;
            
    printf("\nHere are the two L1 norms of the vectors:\n") ;
    printf("Vector1 = %f", norm1(vector1, n)) ;
    printf("\nVector2 = %f", norm1(vector2, n)) ;
    
    addVectors(vector1, vector2, sum, n) ;
    printf("\n\nThe sum of the two vectors is: \n");
    printVector(sum, n) ;
    
    printf("\n\nThe scalar product of the two vectors is: %f", scalarProd(vector1, vector2, n)) ;
    printf("The L2 norms of the vectors are:\n");
    printf("Vector 1: %$d\n", norm2(vector1, n)) ;
    printf("Vector 2: %d", norm2(vector2, n)) ;
    
    return 0;
}


void printVector( double array[], int size)
{
    printf("%d", array[0]) ;
    for (int i = 1; i < size; i++)
        printf(", %d", array[i]) ;
    
    printf("\n") ;
}


float norm1(double array[], int size)
{
    float sum = 0;
    for (int i = 0; i < size; i++)
        sum += abs(array[i]) ;
    return sum ;
}

void addVectors(double vector1[], double vector2[], double vector3[], int n)
{
    for (int i = 0; i < n; i++)
    {
        vector3[i] = vector1[i] + vector2[i] ;
    }
}

float scalarProd(double vector1[], double vector2[], int n)
{
    float scalar ;
    for (int i = 0; i < n; i++)
    {
        scalar += vector1[i]*vector2[i] ;
    }
    return scalar ;
}

float norm2(double vector[], int n)
{
    float l2 ;
    l2 =  sqrt( scalarProd( vector, vector, n)) ;
    return l2 ;
}