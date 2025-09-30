word = input("Enter the word")
newWord = ""
if (word[len(word)-2:] == "ie"):

    newWord = word[:len(word)-2] + "ying"
elif (word[len(word)-1:] == "e"):

    newWord = word[:len(word)-1] + "ing"

print (newWord)
