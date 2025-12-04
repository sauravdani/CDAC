import numpy as np
import pandas as pd

np.random.seed(101)

scores = np.random.randint(0,100,(4,3)) #4 rows 3 column with random values 0 - 100
print(scores)

players = ["Virat Kohli", "Rohit Sharma", "KL Rahul", "Shikhar Dhawan"] #index for rows
matches = ["Match1", "Match2", "Match3"] #index for columns

df = pd.DataFrame(data=scores)
print(df)

df = pd.DataFrame(data=scores, index=players)
print(df)

df = pd.DataFrame(data=scores, index=players, columns=matches)
print(df)
print(df.info())

print(df.loc['Virat Kohli'])
print(df.loc[["Virat Kohli", "Rohit Sharma"]])
print(df.loc['Virat Kohli', 'Match2'])

print("#################################################################")
print(df.iloc[0])
print(df.iloc[0:2])
print(df.iloc[0,1])