#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void main(){
	FILE *f , *f1;

	double time;
	int n1,n2,choice,result,result1,result2,result3;
	clock_t begin=clock();
	clock_t end;
	
	f=fopen("input.txt","r");
	f1=fopen("output.txt","w");
	fscanf(f,"%d",&n1);
	fscanf(f,"%d",&n2);
	printf("Value is %d \n",n1);
	printf("Value is %d \n",n2);
	
	result=n1+n2;
	fprintf(f1,"After Addition: %d \n",result);
	result1=n1-n2;
	fprintf(f1,"After Subtraction: %d \n",result1);
	result2=n1*n2;
	fprintf(f1,"After Multiplication: %d \n",result2);
	result3=n1/n2;
	fprintf(f1,"After Division: %d \n",result3);
	fclose(f);
	fclose(f1);
	end=clock();
	time=(double)((end-begin)*1000000)/CLOCKS_PER_SEC;
	printf("\n Time required is %f sec.\n",time);
	}




