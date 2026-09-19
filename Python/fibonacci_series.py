def fibonacci(number):
    if number <= 0:
        print("Enter a positive number.")
        return

    num1 ,num2 = 0, 1

    if number >= 1:
        print(num1, end=" ")
    if number >= 2:
        print(num2, end=" ")

    for _ in range(2 ,number):
        num1,num2 = num2, num1+num2
        print(num2, end=" ")
    print()

user_number=int(input("Enter a positive number:" ))
fibonacci(user_number)