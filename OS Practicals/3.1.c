#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/ipc.h>
#include<sys/shm.h>
#include<sys/wait.h>
int main()
{
	int row,col,i,j,sum1=0;
	int segment_id;
	printf("Enter no. of Rows and no. of Columns\n");
	scanf("%d %d",&row,&col);
	int arr[row*col];
	for(j=0;j<(row*col);j++)
	{
			printf("Enter value\n");
			scanf("%d",&arr[j]);

	}
	
	segment_id=shmget(IPC_PRIVATE,row*sizeof(int),IPC_CREAT|0666);
	if(segment_id<0)
	{
		printf("Error");
		return 1;
	}
 
	int *row1=shmat(segment_id,NULL,0);
	if(row1<(int*)NULL)
	{
		printf("shmat");
		return 0;
	}
	for(i=0;i<row;i++)
	{
		if(fork()==0)
		{
			row1[i]=0;
			for(j=0;j<col;j++){
				row1[i]=row1[i]+arr[(i*col)+j];
			}
			printf("Child process id is %d\n",getpid());
			return 0;
		}
	}
	for(i=0;i<row;i++)
	{
		wait(&j);
	}
	for(i=0;i<row;i++)
	{
		sum1=sum1+row1[i];
	}
	printf("Parent process id is %d\n",getppid());
	printf("Total sum is %d\n",sum1);
	shmdt(row1);
	shmctl(segment_id,IPC_RMID,NULL);
	return 0;
}

/* Output

gaurav@gaurav-VirtualBox:~/cs4b44/OS Practicals$ ./3.1
Enter no. of Rows and no. of Columns
3
3
Enter value
1
Enter value
2
Enter value
3
Enter value
4
Enter value
5
Enter value
6
Enter value
7
Enter value
8
Enter value
9
Child process id is 2169
Child process id is 2168
Child process id is 2167
Parent process id is 2114
Total sum is 45

*/
