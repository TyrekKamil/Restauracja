#RESTAURACJA

Aktor podstawowy: Kelner 

Główni odbiorcy i oczekiwania względme systemu:
- Kelner: oczekuje możliwości szybkiego i bezproblemowego wprowadzenia danych, braku problemów z wyświetleniem zamówień niezrealizowanych i zrealizowanych, odebrania płatności.
- Klient: chce szybko zamówić posiłek, otrzymać zgodnie z zamówieniem, szybko i bezproblemowo dokonać płatnosci oraz otrzymać dowód zakupu.
- Restauracja: Kontrola stanu zamówień, stanu kasy i terminala. Przechowywanie informacji o stanie składników na magazynie.

Warunki wstępne: Zalogowanie do tableta przez kelnera.

Warunki końcowe: Poprawnie zrealizowane zamówienie. System magazynowy jest pod kontrolą. Znane są najpopularniejsze pory odwiedzin i posiłków. Rachunek zostaje wydrukowany, płatność przebiegła poprawnie.

Scenaiusz główny

1. Kelner podchodzi do stolika, aby odebrać zamówienie.
2. Kelner wprowadza do systemu pozycje z menu zamawiane przez klienta. System generuje zamówienie.
3. Zamówienie zostaje wysłane do komputera przekazywania zleceń w kuchni.
4. Po przygotowaniu posiłku zmienia się jego status na komputerze przekazywania zleceń w kuchni.System informuje kelnera o gotowości posiłku.
5. Kelner dostarcza posiłek do stolika. System otrzymuje informację, że posiłek jest dostarczony.
6. Po przygotowaniu całego zamówienia znika ono z komputera przekazywania zleceń w kuchni.
//Klient zajada aż mu się uszy trzęsą.
7. Klient prosi o rachunek. Klient wybiera płatność gotówką.
8. System generuje rachunek na podstawie zamówienia.
9. Klient dokonuje płatności u kelnera. 
9a. Kelner wprowadza do systemu otrzymaną kwotę. 
9b. System oblicza resztę na podstawie rachunku.
9c. Kelner wydaje klientowi resztę.
9d. System dodaje zapłaconą kwotę do stanu kasy.
10. Zamówienie zostaje zarchiwizowane.

Scenariusz alternatywny
2a. Klient zamawia danie z inną konfiguracją dodatków niż domyślna.
2b. Kelner wprowadza zamianę dodatków do systemu.
Powrót do punku 3.

Scenariusz alternatywny
2a. Klient chce zamówić posiłek, którego składnik(i) są niedostępne w magazynie.
2b. System informuje kelnera o braku dostępności składników.
2c. Kelner proponuje zamianę dodatków lub wybór innego dania.
Powrót do punktu 2. 

Scenariusz alternatywny
7. Klient chce zapłacić kartą.
8. System generuje rachunek na podstawie zamówienia.
9a. Kelner wprowadza kwotę na terminalu. Klient dokonuje płatności.
9b. Płatność przebiegła pomyślnie. Kelner oznacza w systemie płatność kartą.
Powrót do scenariusza głównego.

Scenariusz alternatywny
7a. Klient chce podzielić rachunek.
7b. Kelner wprowadza do systemu zamówione pozycje dla każdego z osobnych rachunków.
8a. System generuje rachunki.
Powrót do punktu 9. scenariusza głównego.

---- scenariusz do rozwiniecia ----
0.Sprawdzenie, czy w restauracji są klienci
9.1 Kelner wylicza ile zostało reszty klientowi

Rozszerzenia (ścieżki alternatywne): 
2a. Brak posiłku, który sobie zażyczył klient.
    2a2.Zaproponowanie innego posiłku z menu.
    2a2. Powrót do kroku drugiego.
2b. Brak części składników potrzebnych do przygotowania potrawy.
    2b1.Zaproponowanie podania dania bez części składników.
    2b2 Powrót do kroku 2a1.
3a. Brak dodatków dla klienta.
    3a1. Zakomunikowanie klientowi, że nie ma dodatku, ktory sobie życzy.
    3a2. Powrót do kroku trzeciego.
9a. Terminal odrzuca płatność
    9a1. Powrót do kroku ósmego.
 

Wymagania specjalne:
Wymagania technologiczne oraz ograniczenia na wprowadzane dane:

