#include<stdio.h>
int main(){
    int number; int reverse = 0;
    int temp; int digit;

    printf("Enter a number:");
    scanf("%d",&number);

    temp = number;

    while(number>0){
        digit = number%10;
        reverse = reverse*10 + digit;
        number = number/10;
    }
    printf("The reverse of the number is: %d\n", reverse);

    if(temp == reverse){
        printf("The number is a palindrome.\n");
    }
    else{
        printf("The number is not a palindrome.\n");
    }
}