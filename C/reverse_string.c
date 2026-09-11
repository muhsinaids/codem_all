#include<stdio.h>
int main(){
    char str[100], rev[100];
    int i, j, len = 0;

    printf("Enter a string: ");
    scanf("%s", str);

    while (str[len] != '\0') {
        len++;
    }

    for (i = len - 1, j = 0; i >= 0; i--, j++) {
        rev[j] = str[i];
    }
    rev[j] = '\0'; // Null-terminate the reversed string

    printf("Reversed string: %s\n", rev);

    return 0;   
}