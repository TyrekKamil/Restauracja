https://github.com/TyrekKamil/Restauracja/blob/kamil_tyrek/UseCases_customizacja_posilkow.md  
https://github.com/TyrekKamil/Restauracja/blob/kamil_tyrek/UseCases_customizacja_posilkow.md - odnosnik do oryginalnego pliku  
ostatni commit - 5 nov    
# RESTAURACJA  
# CUSTOMIZACJA POSIŁKÓW 
**Aktor podstawowy**: Kelner  
  
## Główni odbiorcy i oczekiwania względem systemu:  
  
* Kelner: chce obsłużyć klienta, mieć możliwość edycji posiłku kelnera (dodawanie/usuwanie składników )
* Klient: chce dostać zmodyfikowany posiłek

## Warunki wstępne:  
* Klient prosi o modyfikację posiłku.
## Warunki końcowe: 
* Kelner dodał posiłek z wybranymi przez Klienta modyfikacjami (usunięcie/dodanie składniów)
  
## Scenaiusz główny  
  
1. Kelner przyjął zamówienie, wybierając dane posiłki w menu.  
2. Klient dobiera dodatki zgodnie z możliwościami danego posiłku. 
3. Kelner zaznacza na tablecie dodatki, dobrane do odpowiednich posiłków.  
4. Zamówienie zostaje przekazane do kuchni  
5. Klient otrzymuje posiłek zgodny z zamówieniem.  
  
## Scenariusz alternatywny  
1a. Klient chce zamówić posiłek, którego składnik(i) są niedostępne w magazynie.  
1b. System informuje kelnera o braku dostępności składników.  
1c. Kelner proponuje zamianę dodatków lub wybór innego dania.  
  
2a. Brak dodatku, który sobie zażyczył klient.  
2a2.Zaproponowanie innego dodatku z menu.  
2a2. Powrót do kroku drugiego.  
2b 
  
## Wymagania specjalne:   
  
* System przechowywania informacji o menu i dostępnych składnikach ??

## Wymagania technologiczne oraz ograniczenia na wprowadzane dane:  
2a. System przechowujący dane o dostępnych składnikach ??

  
## Kwestie otwarte:  
  
* Co w przypadku, gdy pomimo informacji, iż składnik jest dostępny, jest niedostępny (np dwóch kelnerow jednoczesnie wziel posilek z "ostatnim" skladnikiem)? Jak dokonać zmiany w zamówieniu, aby klient nie przepłacił za produkt?
* Czy zmniejszającą się liczbę składników powinno określać się tylko na podstawie zamówień?


  
