a=7
b=18
temp = 0
if (a > b):
    a,b = b,a

for i in range(2, a+1):
    if b%i==0 and a%i==0:
        print(f"the LCM is {i}")
        break
else:
    print (" No LCM")

itr=b
while(itr <= a*b):
    if (itr%b == 0 and itr%a == 0):
        print (f"GCD is {itr}")
        break
    itr+=1

