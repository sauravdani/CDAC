import numpy as np

# # Create a 1
# # Create a 1D array
# virat_runs = np.array([72,45,68,90,60])
# print(virat_runs)

# #spical arrays
# zeros = np.zeros((2,3))
# onces = np.ones((3,2))
# print(zeros)
# print(onces)

# empty = np.empty((2,2)) #unutilizeed grabage floate array
# full = np.full((2,2),7)
# print(empty)
# print(full)

#creating array with range
# arr = np.arange(55,65,2) 
# print(arr)
# print(arr, arr[0])
# arr[4] = 99
# print(arr[4])

# batting_avg=np.linspace(30,50,5) # create evenly spread 5 num between 30 and 50
# print(batting_avg)

# strike_rate = np.random.uniform(100,200,10) #unifor = prob(any numb) is same
# print(strike_rate)

# runs= np.random.randint(1,151,(2,3))
# print(runs)

#adding new value to an existing array

# arr = np.arange(0,10)
# new_arr_single = np.append(arr,10)
# new_arr_multiple = np. append(arr,[10,11,12])
# print("arr:", arr)
# print("new_arr_single:", new_arr_single)
# print("new_arr_multiple:", new_arr_multiple)

#Reshaping
# marks = np.arange(50,62)
# print("marks:",marks)
# reshaped = marks.reshape(3,4)
# print("reshaped:",reshaped)

#indexing and slicing
marks = np.array([55,68,20,40,67,90,91,37,59,88])
# print(marks)

# print(marks[1:3])
# print(marks[0:5])

#Broadcasting
# marks[0:3] = 75
# print(marks)

#Vectorization
# result = marks + 5 #Add 5 to every element
# print(result)

#Slice and Copy 
# top_batch = marks[0:5] #"Viwe" or "Shallow Copy"
# print("top_batch",top_batch)
# print("marks",marks)

# marks_copy = marks.copy() #deep copy
# print("marks_copy",marks_copy)
# print("marks",marks)

#conditional Selection

print("Marks:",marks)
passed = marks >= 35 
print(passed) #boelean array
print(marks[passed]) # actual valuesa

print(marks[marks >70])