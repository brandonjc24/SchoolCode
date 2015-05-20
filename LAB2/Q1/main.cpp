#include<stdio.h>

using namespace std;

int qualityPoints(float average) ;

int main() 
{
        float stdAvg ;
	int qPoints, numStudent ;
        do{
                printf("Enter a positive number of students averages you will enter: ") ;
                scanf("%d", &numStudent) ;
        }while(numStudent<1) ;
        
        for(int i = 1; i <= numStudent; i++)
        {
                printf("Enter your average: ");
                scanf("%f", &stdAvg) ;
                qPoints = qualityPoints(stdAvg) ;
                if (qPoints == -1)
                {
                        printf("Invalid input\n") ;
                        i-- ;
                }
                else
                        printf("Your quality points are %d\n", qPoints) ;
        }
        return 0;
}

int qualityPoints(float average)
{
	if (average >= 90 && average <= 100)
		return 4;
	else if (average >= 80 && average < 90)
		return 3;
	else if (average >= 70 && average < 80)
		return 2;
	else if (average >= 60 && average < 70)
		return 1;
	else if (average >= 0 && average < 60)
		return 0;
	return -1;
}