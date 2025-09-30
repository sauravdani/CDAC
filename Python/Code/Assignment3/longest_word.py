def longestword(lst1):
    length = 0
    word=''
    for i in lst1:
        if len(i) > length:
            length = len(i)
            word=i
    return word

lst1=['max','tony','sanika','samruddhi']
print(longestword(lst1))