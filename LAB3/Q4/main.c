#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char **readWords( int *nPtr ) ;
void outputWords( char ** Array, int size ) ;

int main() 
{
    int n ;
    char **wordArray ;
    wordArray = readWords( &n ) ;
        
    outputWords(wordArray, n) ;
 
    return 0;
}

char **readWords( int *nPtr ) 
{
    int  i, k;    
    char inputWord[20]   ;  
    char **pp; 
    
    FILE* input_file = fopen("inputfile.txt", "r") ;
 
    fscanf(input_file, "%d", nPtr) ;
    
    pp = malloc (*nPtr * sizeof(char*)) ;
            
    for (i = 0; i < *nPtr ; i++)
    {
        fscanf(input_file, "%s", inputWord) ;
        int inputLen = strlen(inputWord) ;
        pp[i] = malloc ((inputLen+1) * sizeof(char)) ;
        for(k = 0; k < inputLen; k++)
            pp[i][k] = inputWord[k] ;
    }
    
    fclose(input_file) ;
    
    return pp ;   
}

void outputWords( char ** Array, int size )
{
    FILE* output_file = fopen("outputfile.txt", "w") ;
    fprintf(output_file, "%d \r\n", size) ;
    
    int i ;
    for (i = 0; i < size; i++)
        fprintf(output_file, "%s \r\n", Array[i]) ;
    
    
    fclose(output_file) ;
}