#Q1. Define a function overlapping () that takes two lists and returns True if they have at
# least one member in common, False otherwise.

def overlapping(lst1,lst2):
    for i in lst1:
        if i in lst2:
            return True
    return False

lst1=[1,2,3,4,5,6]
lst2=[7,8,9,0,9,0,0,0]
print(overlapping(lst1,lst2))
