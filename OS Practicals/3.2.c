#include<pthread.h>
#include<stdio.h>
#include<sys/types.h>

int sum;
void *runner(void *param);

int main(int argc,char *argv[]){
	pthread_t tid,tid1;
	pthread_attr_t attr,attr1;
	if(argc!=2){
		fprintf(stderr,"usage: a.out <integer value>\n");
		return -1;
	}
	if(atoi(argv[1])<0){
		fprintf(stderr," %d must be >=0\n",atoi(argv[1]));
		return -1;
	}
	pthread_attr_init(&attr);
	pthread_attr_init(&attr1);
	pthread_create(&tid,&attr,runner,argv[1]);
	pthread_create(&tid1,&attr1,runner,argv[1]);
	pthread_join(tid,NULL);
	pthread_join(tid1,NULL);
	printf("Sum=%d\n",sum);
	return 0;
}

void *runner(void *param){
	int i,upper=atoi(param);
	if(sum==0){
		for(i=1;i<upper/2;i++)
		sum+=i;
		printf("Thread-1 (ID) :%d\n",gettid());
	}
	else{
		for(i=upper/2;i<=upper;i++)
		sum+=i;
		printf("Thread-2 (ID) :%d\n",gettid());
	}
	pthread_exit(0);
}

/* Output

gaurav@gaurav-VirtualBox:~/cs4b44/OS Practicals$ ./3.2 10
Thread-1 (ID) :2277
Thread-2 (ID) :2276
Sum=55

*/
