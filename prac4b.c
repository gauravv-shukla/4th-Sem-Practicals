#include<semaphore.h>
#include<sys/stat.h>
#include<stdio.h>
#include<fcntl.h>
#include<sys/shm.h>
#include<errno.h>
#include<stdlib.h>

int main(int argc, char **argv){
	int i,j;
	int shmid;
	
	
	pid_t pid;
	int *p;
	
	shmid=shmget(NULL,sizeof(int),0644| IPC_CREAT);
	if(shmid<0){
		perror("shmget\n");
		exit(1);
	}
	
	p=(int *) shmat (shmid,NULL,0);
	*p=1000;
	
	
	
	
	for(i=0;i<2;i++){
		pid=fork();
		if(pid>0 && i==0){
			printf("\n\nInside child 1..\n");
			for(j=0;j<5;j++){
				printf("\nchild[0] adds 200..");
				*p=*p+200;
			}
			printf("\n");
		}
		else if(pid>0 && i==1){
			printf("\nInside child 2...\n");
			for(j=0;j<5;j++){
				printf("\nchild[1] adds 200..");
				*p=*p+100;
			}
			printf("\n");
		}
		else if(pid==0){
			printf("\nParent process..\n");
			printf("\n");			
			exit(0);
			
		}
		else{
			printf("\nError\n");
			break;
		}
		
	}
	printf("\nValue=%d\n",*p);
}
