#include <stdio.h>
int main() {
    char str[100];
    char vowels[] = {'a', 'e', 'i', 'o', 'u'};
    int inc = 0;

    printf("Enter a String: ");
    fgets(str, sizeof(str), stdin);

    for (int i = 0; str[i] != '\0'; i++) {
        char c = str[i];

        if (c >= 'A' && c <= 'Z') {
            c = c + 32;
        }

        for (int j = 0; j < 5; j++) {
            if (c == vowels[j]) {
                inc++;
            }
        }
    }
    printf("Number of vowels: %d\n", inc);
    return 0;
}