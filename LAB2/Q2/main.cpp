#include <stdio.h>

using namespace std;

int isPerfect(int num) ;
int isFactor(int num1, int num2) ;
void printFactors(int i);

int main()
{
    int M;
    do
    {
        printf("Enter a positive number and well find the\n") ;
        printf("perfect numbers from 1 to your number: ") ;
	scanf("%d", &M) ;

    } while(M<1) ;

    for (int i = 1; i <= M; i++)
	if(isPerfect(i)) 
            printFactors(i) ;
    return 0;
}

int isPerfect(int num)
{
    int fsum = 1 ;
    for (int i = 2; i <= (num/2); i++)
    {
        if( isFactor(num, i) )  
        { 
            fsum += i ;
        }
                
    }
    if (fsum == num)
        return 1;
    
    return 0 ;
}

int isFactor(int num1 , int num2)
{
    if ((num1 % num2) == 0)
        return 1;
    return 0 ;
}

void printFactors(int i)
{
    int factor = 2;
    printf("%d is a perfect number, its factors are: 1", i) ;
    for (int factor = 2; factor <= (i/2); factor++)
    {
        if ( isFactor(i, factor) )
            printf(", %d", factor) ;
        
    }
    printf("\n") ;
}

