#include <stdio.h>
int main(){
    int num1 ,num2;

    printf("Enter first number: ");
    scanf("%d",&num1);

    printf("Enter second number: ");
    scanf("%d",&num2);

    printf("---------------------------------\n");
    printf("The first number is : %d\n", num1);
    printf("The second number is : %d\n", num2);
    printf("---------------------------------\n");

    num1 = num1 ^ num2;
    num2 = num1 ^ num2;
    num1 = num1 ^ num2;

    printf("The first number after swapping : %d\n", num1);
    printf("The second number after swapping : %d\n", num2);

    return 0;
}