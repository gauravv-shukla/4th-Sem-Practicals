#include<stdio.h>
#include<stdlib.h>
#include<semaphore.h>
#include<fcntl.h>
#include<sys/stat.h>
#include<sys/shm.h>
#include<errno.h>

int main(int agc, char **argv){
	int i,n1=5,n2=5;
	int shmid;
	sem_t *sem;
	
	pid_t pid;
	int *p;
	
	unsigned int n;
	unsigned int value;
	
	shmid=shmget(NULL,sizeof(int),0644| IPC_CREAT);
	if(shmid<0){
	perror("shmget\n");
	exit(1);
	}
	
	p=(int*)shmat(shmid,NULL,0);
	*p=1000;
	
	sem=sem_open("psem",O_CREAT|O_EXCL,0644,1);
	printf("Semaphore initialised\n");
	
	for(i=0;i<2;i++){
		pid=fork();
		if(pid==0){
			sem_wait(&sem);
			printf("Parent process running\n");
			while(pid= waitpid(-1,NULL,0)){
			
		}	
			
		}
		
		if(pid>0 && i==0){
			//sem_post(&sem);
			while(n1){
				printf("Inside child A\n");
				printf("Adding 200\n");
				sleep(2);
				*p=*p+200;
				printf("p=%d\n",*p);
				n1--;
			}	
			}
		if(pid>0 && i>0){
			while(n2){
				printf("Inside child B\n");
				printf("Adding 100\n");
				sleep(2);
				*p=*p+100;
				printf("p=%d\n",*p);
				n2--;
			}	
			}
			
		
		/*else if(pid>0 && i!=0){
			while(n2){
				printf("Adding child B\n");
				*p=*p+100;
				n2--;
			}*/
		}
		sem_unlink("psem\n");
			sem_close(sem);
			exit(0);
	}

/* Output 

gaurav@gaurav-VirtualBox:~/cs4b44/OS Practicals$ ./4.1
Semaphore initialised
Inside child A
Adding 200
Parent process running
p=1200
Inside child A
Adding 200
p=1400
Inside child A
Adding 200
p=1600
Inside child A
Adding 200
p=1800
Inside child A
Adding 200
p=2000
Inside child B
Adding 100
Parent process running
p=2100
Inside child B
Adding 100
p=2200
Inside child B
Adding 100
p=2300
Inside child B
Adding 100
p=2400
Inside child B
Adding 100
p=2500
gaurav@gaurav-VirtualBox:~/cs4b44/OS Practicals$ 

*/

			
