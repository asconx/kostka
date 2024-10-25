import random

LiczbaRzucen = int(input("Ile kostek chcesz rzucić?(3 - 10): "))
def wynik(): 
    wynik = 0
    for x in range(1,LiczbaRzucen+1) :
        
         wynik += losuj()
    print("Wynik wynosi: ",wynik)

def losuj():
    randomowa_liczba = (random.randint(1,6))
    print(randomowa_liczba)
    return randomowa_liczba
wynik()

   

    