#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<errno.h>
#include<string.h>
#include<fcntl.h>

int main(){
	int choice,fd,len,filesize,pos,i,temp0=getpid();
	char file[100],buff[100],msg[10],buf;
	do{
	printf("Enter the choice:\n 1.Create\n 2.Open\n 3.Read\n 4.Write\n 5.Close\n 6.UnLink\n 7.Read in Reverse\n 8.Resource Allocator\n 9.Exit\n");
	scanf("%d",&choice);
	switch(choice){
		case 1://Create
			printf("Enter file name: ");
			scanf("%s",file);
			fd=open(file,O_CREAT,0777);
			break;
		case 2://Open
			fd=open(file,O_RDWR);
			printf("fd=%d\n",fd);
			if(fd==-1){
				printf("Error file doesn't exist.\nError No: %d\n",errno);
				close(fd);
			}
			else{
				printf("File Opened.\n");
				close(fd);
			}
			break;
		case 3://Read
			fd=open(file,O_RDONLY);
			len=read(fd,buff,strlen(file));
			buff[len]='\0';
			if(fd!=-1){
				printf("After reading : %s\n",buff);
				close(fd);
			}
			else{
				printf("Error file doesn't exist.\nError No: %d\n",errno);
				close(fd);
			}
			break;
		case 4://Write
			fd=open(file,O_RDWR);
			printf("Enter contents of the file: ");
			scanf("%s",msg);
			write(fd,msg,sizeof(msg));
			close(fd);
			printf("%d\n",sizeof(msg));
			break;
		case 5://Close
			fd=close(fd);
			if(fd!=-1)
				printf("file closed.\n");
			else
				printf("Error: %d\n",errno);
			break;
		case 6://unLink
			unlink(file);
			break;
		case 7://Read in Reverse
			fd=open(file,O_RDWR);
			filesize = lseek(fd, (off_t) 0, SEEK_END); //filesize is lastby +offset
    		printf("Source file size is %d\n", filesize);

    		for (i = filesize - 1; i >= 0; i--) { //read byte by byte from end
        		pos=lseek(fd, (off_t) i, SEEK_SET);
        		printf("%c",msg[pos]);
        	}
			printf("\n");
			break;
		case 8://Resource Allocator
			printf("\n%d\n",temp0);
			char tt2[100];
			sprintf(tt2,"ls /proc/%d/fd",temp0);
			system(tt2);
			break;
		case 9://Exit
			exit(0);
		}	
		
	
	}while(choice!=0);
	return 0;
}

/* 
	Output

./prac2ab
Enter the choice:
 1.Create
 2.Open
 3.Read
 4.Write
 5.Close
 6.UnLink
 7.Read in Reverse
 8.Resource Allocator
 9.Exit
1
Enter file name: file2.txt
Enter the choice:
 1.Create
 2.Open
 3.Read
 4.Write
 5.Close
 6.UnLink
 7.Read in Reverse
 8.Resource Allocator
 9.Exit
2
fd=4
File Opened.
Enter the choice:
 1.Create
 2.Open
 3.Read
 4.Write
 5.Close
 6.UnLink
 7.Read in Reverse
 8.Resource Allocator
 9.Exit
4
Enter contents of the file: Hey_there
10
Enter the choice:
 1.Create
 2.Open
 3.Read
 4.Write
 5.Close
 6.UnLink
 7.Read in Reverse
 8.Resource Allocator
 9.Exit
3
After reading : Hey_there
Enter the choice:
 1.Create
 2.Open
 3.Read
 4.Write
 5.Close
 6.UnLink
 7.Read in Reverse
 8.Resource Allocator
 9.Exit
7
Source file size is 10
ereht_yeH
Enter the choice:
 1.Create
 2.Open
 3.Read
 4.Write
 5.Close
 6.UnLink
 7.Read in Reverse
 8.Resource Allocator
 9.Exit
8

3766
0  1  2  3  4
Enter the choice:
 1.Create
 2.Open
 3.Read
 4.Write
 5.Close
 6.UnLink
 7.Read in Reverse
 8.Resource Allocator
 9.Exit
6
Enter the choice:
 1.Create
 2.Open
 3.Read
 4.Write
 5.Close
 6.UnLink
 7.Read in Reverse
 8.Resource Allocator
 9.Exit
9
Terminating...		
			
*/			
