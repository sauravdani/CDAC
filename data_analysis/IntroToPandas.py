import numpy as np
import pandas as pd

#numpy array vs pandas serise

# a=np.array([1,2,3,4,5])
# b=np.array([5,6,7,8,9])
# print(a+b)

# #pandas serise
# s1=pd.Series([10,20,30], index=["Max","Sam","Fam"])
# s2=pd.Series([1,2,3,4], index=["Sam","Fam","Max","Dave"])
# print(s1+s2)

#Ways to create pandas serise

#1)From python list with numeric index
# names= ["Alice","Bob","Charli"]
# marks=[60,70,80]
# students = pd.Series(data=marks)
# print(students) #will retun marks with index

# students = pd.Series(data=marks, index=names)
# print(students)

#2) Creating a Serise from Numpy array
# random_ages = np.random.randint(0,100,3)
# names= ["Alice","Bob","Charli"]
# people_array = pd.Series(index=names, data=random_ages)
# print(people_array)

#3) Creating a Serise From a dictinory
name_age_dict = {"Alice":25, "Bob":30, "Charlie":35}
print(pd.Series(name_age_dict))

#4)Creating Serise for imgeinary sales data(q1 and q2)
q1 = {'Japan': 100, 'India': 150, 'USA': 200}
q2 = {'India': 200, 'USA': 250, 'China': 300}

sales_Q1 = pd.Series(q1)
sales_Q2 = pd.Series(q2)

print(sales_Q1)
print(sales_Q1['Japan']) #using labbeled index
print(sales_Q1[0]) #using numeric index

#5) Errors
print(sales_Q1['England']) #key error
print(sales_Q1['india']) #key error due to case sensitivity
print(sales_Q1[' India ']) #key error due to extra spaces

#6) Series Operations
print(sales_Q1.keys()) #prints all keys
print(sales_Q1 * 2) #multiplies all values by 2
print(sales_Q1 / 10) #divide 10 to all values

#7) Handling mismatched indices
total_sales = sales_Q1 + sales_Q2
print(total_sales) #NaN for missing values
print(total_sales.fillna(0)) #filling NaN with 0