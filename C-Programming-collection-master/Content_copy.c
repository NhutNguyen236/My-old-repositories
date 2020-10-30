#include <stdio.h>
//Remember to put all of them in the same dir
int main(){
	FILE *file_read, *file_write;
	char file_name_read[30],file_name_write[30], c;
	printf("Enter file's name: ");
	scanf("%s",file_name_read);
	file_read = fopen(file_name_read,"r");
	while(file_name_read==NULL){
		printf("%s IS NOT FOUND",file_name_read);
		printf("\n Enter file's name: ");
		scanf("%s",file_name_read);
	}
	printf("Enter destination file name: ");
	scanf("%s", file_name_write);
	file_write = fopen(file_name_write,"w");
	while(file_write==NULL){
		printf("%s IS NOT FOUND",file_name_write);
		printf("\n Enter destination file's name: ");
		scanf("%s",file_name_write);
	}
	c = fgetc(file_read);
	while(c!=EOF){
		fputc(c,file_write);
		c = fgetc(file_read);
	}
	printf("\n\tContent has been copied from %s to %s",file_name_read,file_name_write);
	fclose(file_read);
	fclose(file_write);
	return 0;
}
