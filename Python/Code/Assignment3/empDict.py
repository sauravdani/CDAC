# Q.6


# 3. Sort employees by skills
# for the given dictionary of employees

emp_data = {'Amol': ['C', 'C++', 'Java'], 'Aditya': ['Angular', 'Java'], 'Aditi': ['Python', 'PHP', 'Database']}

# 1.Find employees that know 'python'
# knowPython = list(filter(lambda i: "Python" in emp_data[i], emp_data))
# print(knowPython)

# 2. Add a new skill - 'test' in skillset of all employees
addingTest= dict(map(lambda  i : (i, emp_data[i] + ["Test"]), emp_data))
print(addingTest)

# 3. Sort employees by skills
sortedSkills=dict(sorted(emp_data.items(), key=lambda item: item[1]))



