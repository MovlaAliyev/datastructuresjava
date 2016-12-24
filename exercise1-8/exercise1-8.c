#include <stdio.h>

int main(){

	int c ,newLine , blank, tab;

	newLine = 0;
	blank = 0;
	tab = 0;
	while((c = getchar()) != EOF){
		if(c == '\n')
			newLine++;
		if(c == '\t')
			tab++;
		if(c == ' ')
			blank++;
	}
	printf("new line: %d\n",newLine);
	printf("tab: %d\n",tab);
	printf("blank: %d\n",blank);

}
