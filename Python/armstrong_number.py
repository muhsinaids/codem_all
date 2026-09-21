number = int(input("Enter a number to check if it is an Armstrong number: "))
number = abs(number)
temp = number
copy_number = number 
armstrong_number = 0

count = 0
while(temp>0):
    temp = temp//10
    count += 1

while(copy_number>0):
    digit = copy_number%10
    armstrong_number += digit**count
    copy_number = copy_number//10

print(f"Digit count: {count}, Computed sum: {armstrong_number}")

if armstrong_number == number:
    print(f"{number} is an Armstrong number ")
else:
    print(f"{number} is not an Armstrong number ")