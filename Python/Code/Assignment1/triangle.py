'''
5. Write a program to check if given triangle is valid if 3 sides of the triangle are provided.
Also print the type of triangle
'''

a=3
b=10
c=3
summ = a + b + c
maxi = max(a,b,c)

summ -= maxi

if (maxi > summ):
    print ("It is not a triangle")
else:
    if (a == b and b == c):
        print ("equilateral triangle")
    elif ((a == b and b != c) or (a == c and c != b) or (b == c and b != a)):
        print("isosceles triangle")
    else:
        print("right or scaler triangle")


