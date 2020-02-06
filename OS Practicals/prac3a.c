#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>

int main(int argc,int *argv[]){
	printf("PID of exec.c=%d\n",getpid());
	char *args[]={"Hellow","World",NULL};
	execv("./prac4",args);
	printf("Back to exec.c");
	return 0;
}
