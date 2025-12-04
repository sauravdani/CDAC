import numpy as np

sales = [0, 5, 155, 0, 518, 616]
sales_array = np.array(sales)

print(type(sales_array))
print(sales_array.ndim)
print(sales_array.shape)
print(sales_array.size)
print(sales_array.dtype)

#where Function

result_array= np.where(sales_array == 0, "No Sales", "Some Sales")
print(result_array)