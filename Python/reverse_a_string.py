str=input("Enter a string to reverse: ")
print(f"The string is :{str}")
str2=""
for i in str:
    str2=i+str2
print(f"Reversed string is:{str2}")