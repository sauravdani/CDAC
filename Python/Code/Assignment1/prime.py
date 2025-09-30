import math

n = int (input("TEnter first number: "))
n1 = int(input("Enter second number: "))

for i in range(n+1, n1):
    flag = True
    for j in range(2, i):
        if (i%j == 0):
            flag=False
            break
    if(flag):
        print(i)
