#include<stdio.h>
#include<stdlib.h>

void main(){
	FILE *f;
	int i;	
	f=fopen("input1.txt","w");
	for(i=10000;i>0;i--){
	fprintf(f,"%d\n",i);
	}
	fclose(f);
	}


