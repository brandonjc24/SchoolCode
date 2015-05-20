#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *myStrcat( const char const * str1, const char const * str2 ) ;

int main() 
{
    printf("%s\n", myStrcat("Hello", "World!") ) ;
    return 0;
}

char *myStrcat( const char const * str1, const char const * str2 )
{
    char *newStr ;
    int i, k;
    int s1 = strlen(str1) ;
    int s2 = strlen(str2) ;
    newStr = malloc (s1 + s2 + 1) ;

    for (i = 0; i < s1; i++)
    {
        newStr[i] = str1[i] ;
    }
    for (k = 0; k < s2; k++)
    {
        newStr[k + i] = str2[k] ;
    }
    newStr[s1 + s2 + 1] =  '\0';

    return newStr ;
}