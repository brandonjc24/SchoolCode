#include <stdio.h>
#include <cmath>

void efficient( const int source[], int val[], int pos[], int size); 
void reconstruct( int source[], int m, const int val[], const int pos[], int n) ;

using namespace std;

int main() 
{
    int effSize = 0;
    int size = 10;
   
    do{
        printf("Enter the amount of elements you will enter: ");
        scanf("%d", &size) ;
    } while(size < 1) ;
    
    int source[size] ;
    int recon[size] ;
    
    for (int i = 0; i < size; i++)
    { 
        recon[i] = 0; 
        printf("Enter number %d: ", i+1) ;
        scanf("%d", source[i]) ;
        if (source[i] != 0)
            effSize++ ;
    }

    int val[effSize] ;
    int pos[effSize] ;
    
    printf("%d\n", effSize) ;
    
    for (int i = 0; i < size; i++)
        printf("%d ", source[i]) ;
    
    printf("\n\n") ;
    
    efficient(source, val, pos, size) ;
    
    for (int i = 0 ; i < effSize; i++)
        printf("Value: %d, at Position: %d\n", val[i], pos[i]) ;
   
    
    printf("\n") ; 
    
    for (int i = 0; i < size; i++)
        printf("%d ", recon[i]) ;
    
    printf("\n") ; 
    
    reconstruct(recon, size, val, pos, effSize) ;
    
    for (int i = 0; i < size; i++)
        printf("%d ", recon[i]) ;
    
    printf("\n") ; 
    
    return 0;
}

void efficient( const int source[], int val[], int pos[], int size)
{
    int j = 0;
    for (int i = 0; i < size; i++)
    {
        if (source[i] != 0)
        {
            val[j] = source[i];
            pos[j] = i;
            j++ ;
        }
    }
}

void reconstruct( int source[], int m, const int val[], const int pos[], int n)
{
    for ( int i = 0; i < n; i++)
    {
        source[pos[i]] = val[i] ;
    }
}