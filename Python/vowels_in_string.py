str=input("Enter a String:")
vowels = ('a', 'e', 'i', 'o', 'u')
inc = 0

for ch in str:
    if ch in vowels:
        inc += 1

print("Number of vowels:", inc)