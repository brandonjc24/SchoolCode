#include <stdio.h>
#include <cmath>

void letterFreq(const char string[], int freq[]) ;
int charFind( const char string[], char ch) ;
void stringCopy(const char source[], char destination[], int n) ;


using namespace std;

int main()
{
    int i = 0, j = 0 ;
    int index ;
    int freq[26] = {0} ;
    char userCh = 't' ;
    const char source[] = "character changing" ;
    while(source[j] != '\0')
    {
        printf("%c", source[j]) ;
        j++;
    }
    printf("\n") ;
    char newString[15];
    stringCopy(source, newString, 15) ;
    while(newString[i] != '\0')
    {
        printf("%c", newString[i]) ;
        i++;
    }
    printf("\n\n") ; 
    
    index = charFind(source, userCh) ;
    if (index == -1)
        printf("%c was not found!\n", userCh);
    else
        printf("%c was found at index %d\n", userCh, index) ;
    
    letterFreq(source, freq) ;
    
    return 0;
}

void stringCopy(const char source[], char destination[], int n)
{
    int i = 0;
    do
    {
        destination[i] = source[i] ;
        i++ ;
    }while (i < n && source[i] != '\0') ;
}

int charFind( const char string[], char ch)
{
    int i = 0;
    while (string[i] != '\0')
    {
        if (string[i] == ch)
            return i ;
        i++ ;
    }
    return -1 ;
}

void letterFreq(const char string[], int freq[]) // freq size 26
{
    int i = 0;
    while(string[i] != '\0')
    {
        if(string[i] >= 65 && string[i] <= 90)
            freq[string[i] - 65]++ ;
        else if(string[i] >= 97 && string[i] <= 122)
            freq[string[i] - 97]++ ;
        i++ ;
    }
    
    for (int i = 0; i < 26; i++)
    {
        //if (freq[i] != 0)
                printf("%c: %d\n", (i+65), freq[i]) ;
    }
}