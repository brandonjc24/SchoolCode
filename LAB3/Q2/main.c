#include <stdio.h>
#include <stdlib.h>

void process(double y[], int m, double* avPtr, double* difPtr) ;

int main(int argc, char** argv)
{
    int n, i;
    double* x ;
    double mean, diff, num ;
    do 
    {
        printf("Enter a positive integer: ") ;
        scanf("%d", &n) ;
    }while (n < 1) ;
    

    x = (double *) malloc (n * sizeof(double)) ;
    
    for (i = 0; i < n; i++)
    {
        printf("Enter number %d: ", i+1) ;
        scanf("%lf", &x[i]) ;
    }

    process(x, n, &mean, &diff) ;
    
    printf("The average of your numbers is: %f\n", mean) ;
    printf("The difference between the highest and lowest number is: %f\n", diff) ;
        
    return 0;
}

void process(double y[], int m, double *avPtr, double *difPtr)
{
    double min = y[0] ;
    double max = y[0] ;
    int i;
    for (i = 0; i < m; i++)
    {
        *avPtr += y[i] ;
        if (y[i] < min)
            min = y[i] ;
        if (y[i] > max)
            max = y[i] ;
    }
    *avPtr /= m ;
    *difPtr = max - min ;
}