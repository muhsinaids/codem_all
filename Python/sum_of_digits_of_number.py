number = int(input("Enter a number:"))
number=abs(number)
sum_digits = 0
print(f"The number is: {number}")
while number>0:
    digit = number%10
    sum_digits = sum_digits + digit
    number = number//10
print(f"The sum of digits of number is: {sum_digits}")