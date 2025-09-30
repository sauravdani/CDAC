n = int(input("Ente rht enu"))

ans = 0;
while (n):
    ans = ans * 10
    ans = ans + n%10

    n = n//10

print (ans)


