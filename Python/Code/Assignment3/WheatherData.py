# Q.7
# Following data displays min/max/average temp for cities
# weather= [{'Mumbai' : [28, 30, 32]},.....]
#
# 1. Print the weather data
# 2. Print the city with maximum/min temp
# 3. Print all the cities that expereince min temp more than 30 degree
# 4. Create a dictionary to print 'City':'Ave temp'

weather = [
    {'Mumbai': [28, 30, 32]},
    {'Delhi': [25, 28, 35]},
    {'Chennai': [30, 32, 34]},
    {'Bangalore': [22, 25, 28]},
    {'Kolkata': [30, 32, 38]},
    {'Hyderabad': [26, 29, 33]}
]

# 1. Print the weather data
print(weather)

# 2. Print the city with maximum/min temp

max_temp = -float('inf')
MaxcityName = ''

min_temp=float('inf')
MincityName=''

for i in weather:
    for city, temps in i.items():
        j = temps[2]
        k = temps[0]
        if j > max_temp:
            MaxcityName = city
            max_temp = j
        if k < min_temp:
            MincityName = city
            min_temp = k

print("Max Temp: ",MaxcityName, max_temp)
print("Min Temp: ",MincityName, min_temp)

# 3. Print all the cities that expereince min temp more than 30 degree
for i in weather:
    for city, temps in i.items():
        if temps[0] > 30:
            print(city)

# 4. Create a dictionary to print 'City':'Ave temp'
city_avg = {}

for i in weather:
    for city, temps in i.items():
        city_avg[city] = temps[1]

print(city_avg)