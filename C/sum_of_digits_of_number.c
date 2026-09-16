#include <stdio.h>

int main() {
    int number, digit, sum_digits = 0;

    printf("Enter a number: ");
    scanf("%d", &number);

    while (number > 0) {
        digit = number % 10;
        sum_digits = sum_digits + digit;
        number = number / 10;
    }

    printf("The sum of digits is: %d\n", sum_digits);

    return 0;
}