'''
 Using for loop, write and run a Python program for this algorithm.
Here is an algorithm to print out n! from 0! to 10!
'''

n=int(input('Enter a number: '))
ans=1
for i in range(1,n+1):
    ans*=i

print(ans)