import random
kostka = input("Ile kostek chcesz rzucić (3-10): ")
def rzuc_kostkami(liczba_kostek):
    wyniki = []
    for _ in range(liczba_kostek):
        random_number = random.randint(1, 6)
        wyniki.append(random_number)
        print(random_number)
    return wyniki

def licz_punkty(wyniki):
    licznik = {}
    punkty = 0
    
    for wynik in wyniki:
        if wynik in licznik:
            licznik[wynik] += 1
        else:
            licznik[wynik] = 1
    
    for wynik, liczba in licznik.items():
        if liczba > 1:
            punkty += wynik * liczba
            
    return punkty

while True:
   
    
    if kostka.isdigit() and 3 <= int(kostka) <= 10:
        wyniki = rzuc_kostkami(int(kostka))
        punkty = licz_punkty(wyniki)
        print(f"Suma punktów z powtarzających się liczb: {punkty}")
    else:
        print("Proszę wprowadzić liczbę od 3 do 10.")

    replay = input("Jeszcze raz? (t/n): ")
    if replay != 't':
        break
