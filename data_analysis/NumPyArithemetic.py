import numpy as np

arr = np.arange(0, 10)

#Basic arithmetic

# print("Addition:",arr + arr)
# print("Subtraction:",arr - arr)
# print("Multiplication:",arr * arr)
# print("Division:",arr / arr) #warns for division by zero is nan
# print(arr ** 3) #exponentiation
# print("sqrt:", np.sqrt(arr))

#Summaary statistics
# print("Sum:", np.sum(arr))
# print("Mean:", np.mean(arr))
# print("Min:", np.min(arr))
# print("Max:", np.max(arr))
# print("Standard Deviation:", np.std(arr))
# print("Variance:", np.var(arr))

#reverse the array
arr = np.array([1,2,3,4,5])
reversed_arr = arr[::-1]
print("Reversed Array:", reversed_arr)

#Sorting array
arr = np.array([5,2,8,1,3])
sorted_arr = np.sort(arr)
print("sorted_arr", sorted_arr)

#for decending
sorted_arr = np.sort(arr)[::-1] #reversing array
print("sorted arr:",sorted_arr)