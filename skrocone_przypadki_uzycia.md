Opis skrócony przypadków użycia
===============================

Aktorzy procesu i ich cele
--------------------------

Aktor       Cel 
----------- -----------------------------
Klient      Wybór posiłku, jego zakup, płatność kartą/gotówką
Kelner      Odebranie zamówienia, wybranie na urządzeniu posiłków z dodatkami, obsługa plantosci
Restauracja  Kontrola stanu zamówień, stanu kasy i terminala. Przechowywanie informacji o stanie składników na magazynie.

Słownik
-------

Hasło       Opis
----------- -----------------------------
Zamówienie  lista zamówionych przez klienta dań
Danie 		 pozycja z menu, np. przystawka, posiłek lub napów
Płatność 	proces zapłacenia za usługę przyrządzenia potrawy

Przypadki użycia
----------------

### Use case 1: Zamówienie

Kelner podchodzi do stolika, aby odebrać zamówienie.
Kelner wprowadza do systemu pozycje z menu zamawiane przez klienta. System generuje zamówienie.
Zamówienie zostaje wysłane do komputera przekazywania zleceń w kuchni.

### Use case 2: Płatność

Klient prosi o rachunek. Kelner pyta o ewentualny podział zamówienia na więcej rachunków. System generuje rachunek lub rachunki. Klient dokonuje płatności gotówką lub kartą w zależności od preferencji. System dodaje zapłaconą kwotę do stanu kasy.

### Use case 3: Customizacja

Klient ma możliwość doboru składników do posiłku. Każdy posiłek ma swoją listę składników, które można dodać lub usunąć.

### Use case 4: Dzielenie rachunku
Klient prosi o podział rachunku. Kelner wybiera opcje i wybiera które posiłki mają znaleźć się na osobnym rachunku. Po wybraniu rachunku następuje platność. Następnie wybierane są produkty to wydzielenia kolejnego rachunku. Operajca trwa do wydzielenia wszytkich posiłków z danego zamówienia.

