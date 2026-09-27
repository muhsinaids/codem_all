unsorted=list(map(int, input("Enter the array elements separated by space: ").split()))

for i in range(len(unsorted)-1):
    
    for j in range(len(unsorted)-1-i):
        
        if unsorted[j+1] > unsorted[j]:
            unsorted[j], unsorted[j+1] = unsorted[j+1], unsorted[j]
print(unsorted)