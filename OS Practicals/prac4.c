#include<unistd.h>
#include<sys/stat.h>
#include<stdio.h>


int main(){
	int i,j,num,a[10]={10,9,8,7,6,5,4,3,2,1};
	pid_t ret_val;
	ret_val=fork();
	printf("Process id is %d\n",getpid());
	printf("Pid is %d\n",ret_val);
	if(ret_val<0){
		printf("Fork Failed\n");
	}
	else if(ret_val==0){
		for(i=0;i<9;i++){
			for(j=i+1;j<=9;j++){
	 			if(a[i]>a[j]){
					num=a[i];
					a[i]=a[j];
					a[j]=num;
				}
			}
		}
		for(i=0;i<=9;i++){
		printf("%d\t",a[i]);
		}
		printf("\nChild Process\n");
		printf("Process id is %d\n",getpid());
		sleep(10);
	}
	else{
		printf("\nEnter a number\n");
		scanf("%d",&num);
		if(num%2==0){
			printf("Even no.\n");	
		}
		else{
			printf("Odd No.\n");
		}
		printf("Parent Process\n");
		printf("Process id is %d\n",getppid());
		sleep(40);		
	}

	return 0;
}
