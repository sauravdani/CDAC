#-----------------------Q.1--------------------

# a = input("Enter a string: ")
#
# a = a.lower()
# a1=''
# for i in a :
#     if i.isalpha():
#         a1+=i
#
# if a1 == a1[::-1]:
#     print("Its a planidrome")
# else:
#     print("It's not")


#-------------------------Q. 2----------------------------------


# s=input("Enter a string: ")
# a = True
#
# for i in s:
#     if i.isupper() or i == " ":
#
#         continue
#     else:
#         print("All the letters are not in uppar")
#         a = False
#         break
# if(a):
#     print("It is in upper")

#--------------------- Q 3-----------------------------------------------
# Q.3.  Write a Python function that takes a list of words and returns the length of the longest one

# def longest(words):
#     ans = 0
#     for i in words:
#         if (len(i) > ans):
#             ans = len(i)
#
#
#
#     return ans


# words = ["hello", "hi", "my", 'abay', "mocking"]
# print(longest(words))

#---------------------------Q 4-------------------------------------------
# Q.4. Write a Python program to remove duplicates from a list
# words = ["hello", "hi", "my", "my", 'abay', "mocking"]
# words1 = set(words)
# words = list(words1)
#
# print (words)

#----------------------Q 5---------------------------------------------------
# Q 5. Create a list of books
# booklist = [['Java 8', 700], ['Python for Beginners', 500], ["maths", 1200]]

# Perform following operations on the list
# 1. Add a new book with price
# booklist.append(["maths", 1200])
# print (booklist)

# 2. Remove entry for a book
# booklist.pop(-1)
# print (booklist)


# 3. update price for a book
# book = input("enter the book name: ")
# for i in booklist:
#     if (i[0] == book):
#         i[1]=int(input("enter the new price: "))
# print (booklist)

# 4. Sort the list by book names
# sorted(booklist)
# print(booklist)

# 5. Sort the list by prices
# for i in booklist:
#     i[0], i[1] = i[1], i[0]
# print(sorted(booklist))


# 6. Print the book with max and min price [hint : you may use min()/max() functions of python]
# val = 500000
# index = -1
# for i in booklist:
#     index += 1
#     if i[1] < val:
#         val = i[1]
# print(index)
# print(booklist[index])

#----------------------------Q 6-----------------------------------
# Q.6. Write a Python program to compute element-wise sum of given tuples, using “zip()” function
# Original tuples:
# (1, 2, 3, 4)
# (3, 5, 2, 1)
# (2, 2, 3, 1)
# Element-wise sum of the said tuples:
# (6, 9, 8, 6)

# a = (1, 2, 3, 4)
# b = (3, 5, 2, 1)
# c = (2, 2, 3, 1)
#
# x = tuple(zip(a, b, c))
# x1 = []
# for i in x:
#     x1.append(sum(i))
# print(tuple(x1))

#--------------------------------Q 7------------------------------------------------
# Q.7 In cryptography, a Caesar cipher is a very simple encryption techniques in which
# each letter in the plain text is replaced by a letter some fixed number of positions
# down the alphabet. For example, with a shift of 3, A would be replaced by D, B would become E,
# and so on. Create a cipher to represent each key with corresponding value as :
#
# {'a': 'd', 'b': 'e', 'c': 'f', 'd': 'g', 'e': 'h', 'f': 'i', 'g': 'j', 'h': 'k', 'i': 'l', 'j': 'm', 'k': 'n', 'l': 'o', 'm': 'p', 'n': 'q', 'o': 'r', 'p': 's', 'q': 't', 'r': 'u', 's': 'v', 't': 'w', 'u': 'x', 'v': 'y', 'w': 'z', 'x': 'a', 'y': 'b', 'z': 'c'}
# dict={'a': 'd', 'b': 'e', 'c': 'f', 'd': 'g', 'e': 'h', 'f': 'i', 'g': 'j', 'h': 'k', 'i': 'l', 'j': 'm', 'k': 'n', 'l': 'o', 'm': 'p', 'n': 'q', 'o': 'r', 'p': 's', 'q': 't', 'r': 'u', 's': 'v', 't': 'w', 'u': 'x', 'v': 'y', 'w': 'z', 'x': 'a', 'y': 'b', 'z': 'c'}
# s=input("Enter a string")
# s.lower()
# ans=''
# for i in s:
#     ans+=dict[i]
# print(ans)
# encrypted = 'nbrkrq'
# Expected output : decrypted = python

#-------------------------------Q 8-----------------------------------------------
# Q.8 For a given dictionary [Add few more entries]
#
employees = {'Amol' : ['C', 'C++','Java'],'Toney':['C','C++','Python'],'Max':['Python','Java']}
#
# 1. print employees and their skill sets
print(employees)
# 2. Find all the employees who know Java
for k,v in employees.items():
    if "Java" in v:
        print(k)
# 3. Update skill for an employee
employees['Max'].append("c")
print(employees)

# 4. Add/remove employee data
employees.pop('Amol')
print(employees)