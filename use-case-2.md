https://github.com/TyrekKamil/Restauracja/blob/malwina_chudzinska/use-case-2.md

Use Case 2: Płatność
=====================

Aktorzy: Kelner, klient, system


Główni odbiorcy i oczekiwania względem systemu:
-----------------------------------------------

- Klient: szybkie i bezproblemowe dokonanie płatności, możliwość płatności kartą, możliwość podziału rachunku

- Kelner: pobranie płatności na kwotę na podstawie rachunku, brak konieczności wyliczania zapłaty i reszty do wydania 

Warunki wstępne: 
Klient poprosił o rachunek


Warunki końcowe:
Klient dokonał płatności


Scenariusz główny (ścieżka podstawowa):
---------------------------------------

  1. Kelner pyta o ewentualny podział rachunku i formę płatności.
  2. Klient prosi o wspólny rachunek i wybiera płatność gotówką.
  3. Po wprowadzeniu danych do terminala system generuje rachunek dla danego stolika. System archiwizuje zamówienie. 
  4. Kelner przekazuje rachunek klientowi.
  5. Kelner pobiera gotówkę. 
  6. Kelner oznacza na terminalu płatność gotówką i wprowadza otrzymaną kwotę.
  7. System dolicza kwotę do oczekiwanego stanu kasy i oblicza resztę do wydania.
  8. Kelner wydaje klientowi resztę.

Rozszerzenia (ścieżki alternatywne):
------------------------------------

 Płatność kartą
 
 2a. Klient prosi o wspólny rachunek i wybiera płatność kartą.
 ...
 5a. Kelner wprowadza kwotę na terminalu płatniczym.
 5aa. Klient dokonuje płatności kartą.
 5aaa. Płatność się powiodła.
 6a. Kelner oznacza na terminalu płatność kartą i wprowadza otrzymaną kwotę.
 7a. System dolicza kwotę do oczekiwanego stanu konta.
 
 
 Podział rachunku
 
 2b. Klient prosi o podział rachunku i płatność gotówką.
 2bb. Kelner zaznacza w systemie podział rachunku. Na ekranie terminala kelnera wyświetla się zamówienie. 
      Dla każdego z rachunków kelner wybiera pozycje, które mają się na nim znaleźć. Po zaznaczeniu danej pozycji znika ona z ekranu.
 3b. System generuje osobne rachunki i archiwizuje zamówienie. 
 Dla każdego z rachunków jest kontyuowany scenariusz podstawowy.
 

Wymagania specjalne:
--------------------

  - Sprawny terminal płatniczy.
  
  - System przechowywania informacji o menu, składnikach i cenach.

  - Istnieje tylko jedno nieopłacone zamówienie dla danego numeru stolika.


Wymagania technologiczne oraz ograniczenia na wprowadzane dane:
---------------------------------------------------------------

 1. System identyfikuje numer stolika z zamówieniem.
