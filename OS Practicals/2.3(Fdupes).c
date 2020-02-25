#include<stdio.h>
#include<fcntl.h>
#include<stdlib.h>
#include<sys/stat.h>
#include<sys/types.h>
#include<unistd.h>
#include<sys/dir.h>
#include <dirent.h>
int main()
{
	char buf[100],first[100],second[100];
	char *b;
	long int s,m,n,g,count=0;
	DIR *v;
	int t1,t,i,j;
	struct dirent **variable;
	struct stat p;
	struct stat s1;
	struct stat s2;
	b=getcwd(buf,sizeof(buf));
	v=opendir(buf);
	if(v==NULL){
		printf("Failed:Directory is not opened!\n");
		printf("Terminating...\n");
		return 0;
		}
	else
	{
		printf("Directory is opened!\n");
		printf("Directory Name:%s \n\n",buf);
		t=scandir(buf,&variable,NULL,alphasort);
		t1=t;
		printf("All the available Files are:\n");

		while(t--){
			printf("Name of File:%s\n",variable[t]->d_name);
			stat(variable[t]->d_name,&p);
			printf("Size(In Bytes):%ld\n",p.st_size);
			printf("Mode:%ud\n",p.st_mode);
			printf("Hard Link:%ld\n",p.st_nlink);
			printf("Group-Id:%ud\n\n",p.st_gid);
			printf("\n\n");
			}

		for(i=1;i<=t1-1;i++){
			stat(variable[i]->d_name,&s1);
			for(j=i+1;j<=t1-1;j++){
			stat(variable[j]->d_name,&s2);
				if (s1.st_size==s2.st_size){
					if(s1.st_nlink==s2.st_nlink){
							if(s1.st_gid==s1.st_gid){		
								printf("Duplicate File %s found\n",variable[j]->d_name);
								count++;
								unlink(variable[j]->d_name);
								printf("Duplicate Files have been deleted\n");
								}
							}
						}
					}
				}
			if(count==0){
			printf("No Duplicate Files were Found\n\n");
			}	
	}
	return 0;
}


/*
	Output
	

./fdupes
Directory is opened!
Directory Name:/home/gaurav/cs4b44 

All the available Files are:
Name of File:prac4.c
Size(In Bytes):794
Mode:33188d
Hard Link:1
Group-Id:1000d



Name of File:prac3a.c
Size(In Bytes):235
Mode:33188d
Hard Link:1
Group-Id:1000d



Name of File:prac3.c
Size(In Bytes):440
Mode:33188d
Hard Link:1
Group-Id:1000d



Name of File:prac3
Size(In Bytes):16872
Mode:33261d
Hard Link:1
Group-Id:1000d



Name of File:prac2_a_b.c
Size(In Bytes):1977
Mode:33188d
Hard Link:1
Group-Id:1000d



Name of File:infin.c
Size(In Bytes):78
Mode:33188d
Hard Link:1
Group-Id:1000d



Name of File:file1.txt
Size(In Bytes):18
Mode:33188d
Hard Link:1
Group-Id:1000d



Name of File:file.txt
Size(In Bytes):18
Mode:33188d
Hard Link:1
Group-Id:1000d



Name of File:fdupeswaala.c
Size(In Bytes):1488
Mode:33188d
Hard Link:1
Group-Id:1000d



Name of File:fdupes
Size(In Bytes):17120
Mode:33261d
Hard Link:1
Group-Id:1000d



Name of File:Java
Size(In Bytes):4096
Mode:16877d
Hard Link:4
Group-Id:1000d



Name of File:..
Size(In Bytes):4096
Mode:16877d
Hard Link:23
Group-Id:1000d



Name of File:.
Size(In Bytes):4096
Mode:16877d
Hard Link:3
Group-Id:1000d



Duplicate File file1.txt found
Duplicate Files have been deleted



*/
