# Use Case: Zamówienie
**Aktor podstawowy**: Kelner

## Główni odbiorcy

* Kelner: zrealizuje zamówienie od klienta, oraz w pełni spełni jego oczekiwania
* Klient: otrzyma zamówiony posiłek
* Kucharz: otrzyma właściwe zamówienie do zrealizowania dla klienta

## Warunki wstępne

* Klient musi być zdecyzdowany na zamówienie
* (autoryzacja kelnera)
* Kelner musi mieć sprawny i gotowy do pracy terminal

## Warunki końcowe

* Klient otrzymuje rachunek za zamówienie

## Scenariusz główny (scieżka podstawowa):

1. Kelner inicjalizuje w terminalu tworzenie nowego zamówienia
2. Zapisuje numer stolika
3. Klient zaczyna podawać dania, które chce zamówić, a kelner zaczyna je wprowadzać do nowego zamówienia
4. Kelner podsumowywuje dla klienta zamówienie i je zatwierdza
5. Zamówienie zostaje wysłane do kuchni i oczekuje na zmiane statusu 'do odbioru'
6. Gdy zamówienie będzie gotowe, kucharz zmienia jego status na 'do odbioru'
7. Kelner widzi zamówienie gotowe do odbioru w terminale i je odbiera 
8. Gdy Klient będzie chciał zapłacić za zamówienie, kelner wybiera w terminalu opcję 'zakończ i zapłać'
9. USE CASE PŁATNOŚĆ

## Rozszerzenia (ścieżki alternatywne):

3a. Klient zamawia posiłek którego skłądniki nie nie są dostępne w magazynie
3b. Scenariusz alternatywny 2a w Use Case customizacja posiłków

3a2. Klient zamawia danie z inną konfiguracją dodatków niż domyślna.
3b2. Scenariusz alternatywny 3a w Use Case customizacja posiłków

3a3. Klient zamawia do dania dodatek który jest niedostępny.
3b3. Scenariusz alternatywny 3a1 w Use Case customizacja posiłków

7a. Klient życzy sobie kolejne danie/dodatek do swojego zamówienia
7b. Kelner wybiera na terminalu numer stolika i wybiera opcję 'dodaj do zamówienia'
7c. Powrót do punktu 3


## Wymagania specjalne:

* Musi być obecny klient, który pragnie zrealizować zmówienie
* Musi być obecny kerlner oraz kucharz do zrealizowania zamówienia
* System do składania zamówieień musi być uruchomiony i gotowy do pracy

## Wymagania technologiczne oraz ograniczenia na wprowadzane dane: 

* Terminal dla kelnera
* Terminal dla kuchni
* Baza danych dla stanu magazynu

## Kwestie otwarte:

