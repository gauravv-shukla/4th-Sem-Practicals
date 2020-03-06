#include <stdio.h>
#include<stdlib.h>
void main() {
system("free -h");
system("sudo rmdir /mnt/ramdisk1");
system("sudo mkdir /mnt/ramdisk1");
system("sudo mount -t tmpfs -o size=4g tmpfs /mnt/ramdisk1"); 
system("cp input1.txt /mnt/ramdisk1");
system("cp output1.txt /mnt/ramdisk1");
system("cp sort.c /mnt/ramdisk1");
}
