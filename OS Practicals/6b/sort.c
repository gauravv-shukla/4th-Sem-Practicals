#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void main(){
	double time;
	FILE *f,*f1;
	int i,arr[10000],size=10000;	
	clock_t begin=clock();
	clock_t end;

	f=fopen("input1.txt","r");
	for(i=0;i<10000;i++){
	fscanf(f,"%d\n",&arr[i]);
	}
	fclose(f);
	
	for(i=0;i<10000;i++){
		;
	}	
	f1=fopen("output1.txt","w");
	 bubbleSort(arr, 10000); 
	for(i=0;i<10000;i++){
	fprintf(f1,"%d\n",arr[i]);
	}	
	fclose(f1);
	end=clock();
	time=(double)((end-begin)*1000000)/CLOCKS_PER_SEC;
	printf("\n Time required is %f sec.\n",time);
}
	
void swap(int *xp, int *yp) 
{ 
    int temp = *xp; 
    *xp = *yp; 
    *yp = temp; 
} 
  
// A function to implement bubble sort 
void bubbleSort(int arr[], int n) 
{ 
   int i, j; 
   for (i = 0; i < n-1; i++)       
  
       // Last i elements are already in place    
       for (j = 0; j < n-i-1; j++)  
           if (arr[j] > arr[j+1]) 
              swap(&arr[j], &arr[j+1]); 
} 
  

