#include<unistd.h>
#include<sys/stat.h>
#include<stdio.h>


int main(){
	pid_t ret_val;
	ret_val=fork();
	printf("Process id is %d\n",getpid());
	printf("Pid is %d\n",ret_val);
	if(ret_val<0){
		printf("Fork Failed\n");
	}
	else if(ret_val==0){
		printf("Child Process\n");
		printf("Process id is %d\n",getpid());
		sleep(10);
	}
	else{
		printf("Parent Process\n");
		printf("Process id is %d\n",getpid());
		sleep(30);		
	}
	return 0;
}
