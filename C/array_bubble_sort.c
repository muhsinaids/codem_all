#include <stdio.h>

int main() {
    int size;

    printf("How many elements do you want to sort? ");
    scanf("%d", &size);

    int unsorted[size];

    printf("Enter the %d numbers: ", size);
    for (int p = 0; p < size; p++) {
        scanf("%d", &unsorted[p]);
    }

    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (unsorted[j + 1] > unsorted[j]) { 
                int temp = unsorted[j];
                unsorted[j] = unsorted[j + 1];
                unsorted[j + 1] = temp;
            }
        }
    }

    printf("Sorted array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", unsorted[i]);
    }
    printf("\n");

    return 0;
}
