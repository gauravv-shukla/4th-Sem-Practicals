#include<stdio.h>
#include<semaphore.h>
#include<pthread.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/stat.h>


int main(int argc,char *argv[]){
	char * name="my_semaphore";
	int VALUE=2;
	sem_t * sema;
	printf("Open or Creat a named semaphore,%s,its value is %d\n\n",name,VALUE);
	sema=sem_open(name,O_CREAT,0666,VALUE);
	sem_wait(sema);
	printf("Decrease semaphore by 1\n\n");
	sem_post(sema);
	printf("Add semaphore by 1\n\n");
	sem_close(sema);
	sem_unlink(name);
	return 0;
}
