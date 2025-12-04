import numpy as np

students = np.array([('Alice',95, 20),
                     ('Bob',85, 22),
                     ('Charlie', 90, 23)], dtype=[('name','U10'), ('score','i4'), ('age','i4')])

print("Students Array:" , students) #output : [('Alice', 95, 20) ('Bob', 85, 22) ('Charlie', 90, 23)]

print("Names:", students['name']) #output : ['Alice' 'Bob' 'Charlie']
print("Scores:", students['score']) #output : [95 85 90]
print("Ages:", students['age']) #output : [20 22 23]
