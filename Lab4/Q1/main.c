#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int id ;
    int midterm ;
    int final ;
    double grade ;
} student;

student **create_class_list( int *sizePtr ) ;
int find( int idNo, student **list, int size ) ;
void input_grades( student **list, int size );
void compute_final_course_mark( student **list, int size)  ;
void output_final_course_mark( student **list, int size) ; 
void print_backwards( student **list, int size ) ;
int withdraw( int idNo, student **list, int size ) ;
void destroy_list( student **list, int size ) ;


int main() 
{
    int size, i, sNum1 = 0, sNum2 = 2222222, sNum3 = 11;
    student **list = create_class_list(&size) ;
    input_grades(list, size) ;
    compute_final_course_mark( list, size)  ;  
    output_final_course_mark( list, size) ; 
    
    print_backwards( list,  size ) ;
    
    size -= withdraw( sNum1, list, size ) ; // not found
    size -= withdraw( sNum2, list, size) ; // 2222222 removed
    size -= withdraw (sNum3, list, size) ; // not found
    
    print_backwards( list,  size ) ;
    
    output_final_course_mark( list, size) ;
    
    
    destroy_list( list, size ) ;
    return 0 ;
}

student **create_class_list( int *sizePtr )
{
    student **list ;

    int idnumber, i, k ;
    
    FILE *input_file = fopen("id.txt", "r") ;
    
    fscanf(input_file, "%d", sizePtr) ;
    
    list = malloc (*sizePtr * sizeof(student*)) ; 
    
    for (i = 0; i < *sizePtr ; i++)
    {
        fscanf(input_file, "%d", &idnumber) ;
        list[i] =  malloc ( sizeof(student)) ;
        (*list[i]).id = idnumber ;
        (*list[i]).midterm = 0 ;
        (*list[i]).final = 0;
        (*list[i]).grade = 0 ;        
    }
           
    fclose(input_file) ;
    
    return list ;
}


int find( int idNo, student **list, int size ) 
{
    int middle, high, low ;
    low = 0 ;
    high = size-1 ;
    while(low <= high)
    {
        middle = (high + low)/2 ;
        if ( (list[middle]->id) == idNo)
            return middle ;
        
        if ( (list[middle]->id) > idNo)
            high = middle-1;
        else
            low = middle+1 ;
    }
    return -1 ;
}


void input_grades( student **list, int size )
{    
    FILE *input_file = fopen("grades.txt", "r") ;
    int i, idNum, midterm, final, index;

    while( fscanf(input_file, "%d", &idNum) != EOF)
    {
        index = find(idNum, list, size) ;
        fscanf(input_file, "%d", &midterm) ; 
        (*list[index]).midterm = midterm ;
        fscanf(input_file, "%d", &final)  ;
        (*list[index]).final = final;
    }
    
}


void compute_final_course_mark( student **list, int size) 
{
    int i;
    for (i=0;i<size;i++)
        (*list[i]).grade = 0.3*(double)(*list[i]).midterm + 0.7*(double)(*list[i]).final ;
}


void output_final_course_mark( student **list, int size) 
{
    FILE* output_file = fopen("course_marks.txt", "w") ;
    int i;
    
    for(i=0;i<size;i++)
        fprintf(output_file, "%d\r\n%f\r\n", list[i]->id, list[i]->grade ) ;

    fclose(output_file) ;
        
}


void print_backwards( student **list, int size )
{
    if (size == 0)
        return ;
    
    printf("%d\n", list[size-1]->id) ;
    print_backwards( list, size -1) ;
    
}

int withdraw( int idNo, student **list, int size )
{
    int index = find( idNo, list, size ) ;
    int i ;

    if( index == -1)
    {
        printf("Student number %d was not found\n", idNo);
        return 0 ;
    }
    
    free( list[index] ) ;
    
    for (i = index; i < size-1; i++)      
        list[i] = list[i + 1] ;

    
    free(list[size]) ;
    printf("Student number %d was removed\n", idNo);
    return 1 ;
}

void destroy_list( student **list, int size )
{
    int i;
    for(i=0;i<size;i++)
        free(list[i]);
 
    free(list) ;
}