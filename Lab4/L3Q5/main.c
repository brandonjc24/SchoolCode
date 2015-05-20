#include <stdio.h>
#include <stdlib.h>

int **storeEff( int vec1[], int n, int *kPtr) ;
int **addEff( int ** eff1, int ** eff2, int k1, int k2, int *kPtr) ;


int main() 
{
    int vec[8] = {0, 0, 23, 0, -7, 0, 0, 48} ;
    int vec2[6] = {1, 0, -23, 4, 0, 5} ;
    int k , k2, kNew, i, j;
    int ** effArray;
    int ** effArray2 ;
    int ** effAdd ;

    
    effArray = storeEff(vec, 8, &k) ;
    effArray2 = storeEff(vec2, 6, &k2) ;
    

    printf("Eff array 1:\n") ;        
    for (i =0 ; i<2; i++)
    {
        for (j = 0; j< k; j++)
        {
            printf("%d, ", effArray[i][j]) ;
        }
        printf("\n") ;
    }
    
    printf("\n\n") ;
    printf("Eff array 2:\n") ; 
    for (i =0 ; i<2; i++)
    {
        for (j = 0; j< k2; j++)
        {
            printf("%d, ", effArray2[i][j]) ;
        }
        printf("\n") ;
    }
    printf("\n\n") ;
    
    effAdd = addEff( effArray, effArray2, k, k2, &kNew) ;    
    printf("Eff array addition:\n") ; 
    for (i =0 ; i<2; i++)
    {
        for (j = 0; j< kNew; j++)
        {
            printf("%d, ", effAdd[i][j]) ;
        }
        printf("\n") ;
    }
    printf("\n\n") ;
    return 0;
}

int **addEff( int ** eff1, int ** eff2, int k1, int k2, int *kPtr) 
{
    int j=0, i=0, kNew = k1 + k2;
    while( (j+i) < kNew)
    {
        if ( eff1[0][i] == eff2[0][j])
        {
            kNew-- ;
            if ( (eff1[1][i] + eff2[1][j]) == 0)
                kNew-- ;
            i++;
            j++;
        }
        else if(eff1[0][i] < eff2[0][j])
            i++ ;
        else
            j++ ;
    }
    
    *kPtr = kNew ;
    
    int ** newEff ;
    int g = 0;
    newEff = (int**) calloc(2, sizeof(int**)) ;
    
    for (g; g<2; g++) 
        newEff[g] = (int*) calloc (kNew, sizeof(int*));
    
    j=0;
    i=0 ;
    int b = 0 ;
    
    while( (j+i) < (k1+k2))
    {   
        if (i != k1 && j != k2)
        {
            if (eff1[0][i] == eff2[0][j])
            {
                if ( (eff1[1][i] + eff2[1][j]) != 0)
                {
                    newEff[0][b] = eff1[0][i];
                    newEff[1][b] = eff1[1][i] + eff2[1][j] ;
                    b++;
                }
                i++; 
                j++;
            }
            else if (eff1[0][i] < eff2[0][j])
            {
                newEff[0][b] = eff1[0][i] ;
                newEff[1][b] = eff1[1][i] ;
                b++ ;
                i++ ;
            }
            else
            {
                newEff[0][b] = eff2[0][j] ;
                newEff[1][b] = eff2[1][j] ;
                b++ ;
                j++ ;
            }
        }
        else if (i == k1)
        {
                newEff[0][b] = eff2[0][j] ;
                newEff[1][b] = eff2[1][j] ;
                b++ ;
                j++ ;            
        }
        else
        {
                newEff[0][b] = eff1[0][i] ;
                newEff[1][b] = eff1[1][i] ;
                b++ ;
                i++ ;            
        }
    }
    
    return newEff ;
}


int **storeEff( int vec1[], int n, int *kPtr) 
{
    int **eff ;
    int i = 0, a=0 , j =0;
    for (i; i< n; i++) // a stores how many non zero entries are in the array vec1
    {
        if (vec1[i] != 0)
            a++ ;
    }
    *kPtr = a ;
    
    eff = (int**) calloc(2 , sizeof(int**)) ;
    for (i=0; i< 2; i++)
        eff[i] = (int*) calloc( a , sizeof(int*) ) ;
    
    for (i=0; i < n; i++)
    {
        if(vec1[i] != 0)
        {
            eff[1][j] = vec1[i]  ;     
            eff[0][j] =  i ;
            j++ ;
        }
    }
    
    return eff ;
    
}