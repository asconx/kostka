import random


def rzuc_kostkami(ilość_kostek):
    return [random.randint(1, 6) for _ in range(ilość_kostek)]



def oblicz_punkty(wyniki_rzutow):
    punkty = 0
    for liczba in set(wyniki_rzutow):
        liczba_wystapien = wyniki_rzutow.count(liczba)
        if liczba_wystapien > 1:
            punkty += liczba * liczba_wystapien
    return punkty



def wyswietl_wyniki(wyniki_rzutow, punkty):
    for i, wynik in enumerate(wyniki_rzutow, 1):
        print (f"Kostka {i}: {wynik}")
    print(f"Liczba uzyskanych punktów: {punkty}")



def graj():
    while True:
        try: 
            ilosc_kostek = int(input("Ile kostek chcesz rzucic? (3-10): "))
            if 3 <= ilosc_kostek <= 10:
                break
            else:
                print("podaj liczbe w przedziale od 3 do 10")
        except ValueError:
            print("podano nieprawidłową wartość. Spróbuj ponownie")

    wyniki_rzutow = rzuc_kostkami(ilosc_kostek)
    punkty = oblicz_punkty(wyniki_rzutow)
    wyswietl_wyniki(wyniki_rzutow, punkty)

    zagraj_ponownie = input("Jeszcze raz? (t/n): ").lower()
    if zagraj_ponownie != "t":
        print("Dziękujemy za grę!")
        break

    graj()