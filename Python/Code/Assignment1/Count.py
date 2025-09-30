n = int(input('Enter a number: '))

n1 = str(n)

dsum = 0
even = 0
odd = 0
count = 0
for i in n1:
    count += 1
    dsum += int(i)
    if int(i) % 2 == 0:
        even += 1
    if int(i) % 2 != 0:
        odd += 1
print("Sum: ",dsum)
print("Count: ",count)
print("Even: ",even)
print("odd: ",odd)
