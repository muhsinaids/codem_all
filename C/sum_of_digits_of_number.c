#include<stdio.h>
int main(){
    int number; int sum_digits = 0;
    int digit;

    printf("Enter a number:");
    scanf("%d",&number);
    printf("The number is: %d\n",number);

    while(number>0){
        digit = number%10;
        sum_digits = sum_digits + digit;
        number = number/10;
    }
    printf("The Sum of Digits is: %d\n",sum_digits);
}