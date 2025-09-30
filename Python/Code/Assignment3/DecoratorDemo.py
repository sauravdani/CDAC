# Q.4. Decorate the display_greeting() function using a decorator so that greeting is displayed in uppercase

def dec(innerfun):
    def wrapper():
        result = innerfun()
        return result.upper()

    return wrapper


@dec
def display_greeting():
    return "hello brother"


print("With decorator:", display_greeting())
