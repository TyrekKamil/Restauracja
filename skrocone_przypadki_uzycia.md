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

Kelner podchodzi do klienta. Na prośbę Klienta wybiera płatność gotówką lub kartą. Jest możliwość podziału rachunku na pare. W przypadku płatnosci gotówką tablet łaczy się z terminalem płatniczym i informuje o powodzeniu płatości.

### Use case 3: Integracja z systemem magazynu

Magazyn na bieżąco informuje o stanie składników. W przypadku, gdy liczba któregoś ze składników jest zerowa, kelner przekazuje informacje, iż dany posiłek jest dostępny bez danego składnika lub wcale nie jest dostępny. Analogicznie, w przypadku chęci dodania do składnika dodatków, kelner otrzymuje informacje, czy dany produkt można zamówić z daną ilością dodatków.

### Use case 4: Dzielenie rachunku
Klient prosi o podział rachunku. Kelner wybiera opcje i wybiera które posiłki mają znaleźć się na osobnym rachunku. Po wybraniu rachunku następuje platność. Następnie wybierane są produkty to wydzielenia kolejnego rachunku. Operajca trwa do wydzielenia wszytkich posiłków z danego zamówienia.

