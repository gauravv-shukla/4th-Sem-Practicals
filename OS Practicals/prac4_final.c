#include<stdio.h>
#include<sys/types.h>
#include<sys/shm.h>
#include<sys/stat.h>
#include<stdlib.h>

int main(){
	int w,h,i,j;
	printf("Enter the width and height?");
	scanf("%d%d",&w,&h);
	int **arr=(int **)(h*sizeof(int *));
	for(int i=0;i<h;i++){
		arr[i]=(int*)malloc(w*sizeof(int));
	}
	for(int i=0;i<h;i++){
		for(int j=0;j<w;j++){
			scanf("%d",&arr[i][j]);
			printf("%d",arr[i][j]);
		}
	}
	return 0;
}
