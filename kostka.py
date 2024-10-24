from random import randint
result = list()

def rand(count: int):
    for i in range(count):
        rand_number = randint(1, 6)
        print(rand_number)
        result.append(rand_number)

def calc_result(items: list):
    calc: int = 0
    for i in items:
        calc = calc + i
    return calc

if __name__ == '__main__':
    while True:
        try:
            rand_count = int(input("count off trying (3 - 10): "))
            print("out off count"), exit() if not (3 <= rand_count <= 10) else None
        except Exception as e:
            print(e)
        rand(rand_count)
        print("count: ", calc_result(result))
        try_again = input("try again (y/n): ")
        if try_again == "y":
            pass
        elif try_again == "n":
            break
        else:
            print(Exception)
            exit()

