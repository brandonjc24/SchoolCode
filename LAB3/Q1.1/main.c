#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define N 20 

int myAbs(int x) ;
int isDiagDom( int mat[][N]) ;

int main() 
{
    int DD[N][N], NDD[N][N] , i, j ;
    for (i = 0; i < N; i++)
    {
        for (j = 0; j < N; j++)
        {
            if (i == j)
            {
                DD[i][j] = 1 ; // Matrix DD has diagonals of 1 and all other elements 0
                NDD[i][j] = 0 ; // Matrix NDD has diagonals of 0 and all other elements 1
            }   
            else
            {
                DD[i][j] = 0 ; // Matrix DD should output as diagonally dominant
                NDD[i][j] = 1 ; // Matrix NDD should output as not diagonally dominant
            }
        }
    }
    
    if ( isDiagDom( DD ) )
        printf("Matrix DD is diagonally dominant!\n") ;
    else
        printf("Matrix DD is not diagonally dominant!\n") ;
    
    if ( isDiagDom( NDD ) )
        printf("Matrix NDD is diagonally dominant!\n") ;
    else
        printf("Matrix NDD is not diagonally dominant!\n") ;
    
    
    
    return 0;
}

int isDiagDom( int mat[][N])
{
    int diagNum, rowSum, i, k ;
    for (i = 0; i < N; i++)
    {
        diagNum = myAbs(mat[i][i]) ;
        for (k = 0; k < N; k++)
        {
            if (k != i)
                rowSum += myAbs( mat[i][k] ) ;
        }
  
        if (diagNum < rowSum)
            return 0 ;
       
    }
    return 1;
}

int myAbs( int x )
{
    return sqrt(x*x) ;
}