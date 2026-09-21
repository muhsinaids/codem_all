#include <stdio.h>
#include <math.h>

int main() {
    int number, temp, copy_number, remainder, result = 0, n = 0;

    printf("Enter an integer to check if it's an Armstrong number: ");
    scanf("%d", &number);

    temp = number;
    for (temp = number; temp != 0; ++n) {
        temp /= 10;
    }

    copy_number = number;
    while (copy_number != 0) {
        remainder = copy_number % 10;
        result += pow(remainder, n);
        copy_number /= 10;
    }

    if (result == number)
        printf("%d is an Armstrong number.\n", number);
    else
        printf("%d is not an Armstrong number.\n", number);

    return 0;
}