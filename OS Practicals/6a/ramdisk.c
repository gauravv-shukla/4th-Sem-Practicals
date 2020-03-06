#include <stdio.h>
#include<stdlib.h>
void main() {
system("free -h");
system("sudo rmdir /mnt/ramdisk1");
system("sudo mkdir /mnt/ramdisk1");
system("sudo mount -t tmpfs -o size=4g tmpfs /mnt/ramdisk1"); 
system("cp input.txt /mnt/ramdisk1");
system("cp output.txt /mnt/ramdisk1");
system("cp calculator.c /mnt/ramdisk1");
}
