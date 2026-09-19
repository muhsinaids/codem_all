#include<stdio.h>
void fibonacci(int number){
    if(number<=0){
        printf("Enter a positive number.\n");
        return;
    }

    int num1 = 0;
    int num2 = 1;

    if(number>=1){
        printf("%d ", num1);
    }
    if(number>=2){
        printf("%d ", num2);
    }

    for(int i=2; i<number; i++){
        int sum = num1 +num2;
        num1 = num2;
        num2 = sum;
        printf("%d ", num2);
    }
    printf("\n");
}
int main(){
    int user_number;
    printf("Enter a number: ");
    scanf("%d", &user_number);

    fibonacci(user_number);
    return 0;
}