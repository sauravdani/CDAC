
def fi():
    first = 0
    second = 1
    while True:

        yield second
        first, second = second, first + second

fib_gen = fi()

for i in range(1,10):
    print(next(fib_gen))