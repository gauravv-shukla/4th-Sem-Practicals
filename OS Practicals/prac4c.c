#include<stdio.h>
#include<sys/types.h>
#include<sys/shm.h>
#include<sys/stat.h>

int main(){

	int shmid;
	key_t key=0x1000;
	
	shmid=shmget(key,10,IPC_CREAT | 0666);
	if(shmid<0){
	printf("Unable to Create Shared Memory");
	}
	printf("Shmid : %d\n",shmid);
	
	key=0x1010;
	shmid=shmget(key,10,IPC_CREAT | 0666);
	printf("Shmid : %d\n",shmid);
	shmid=shmget(IPC_PRIVATE,10,IPC_CREAT | 0666);
	printf("Shmid : %d\n",shmid);
	return 0;
}
