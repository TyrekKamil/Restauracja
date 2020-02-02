https://github.com/TyrekKamil/Restauracja/blob/kamil_tyrek/UseCases_customizacja_posilkow.md - odnosnik do oryginalnego pliku  
ostatni commit - 5 nov    
# RESTAURACJA  
# CUSTOMIZACJA POSIŁKÓW 
**Aktor podstawowy**: Kelner  
  
## Główni odbiorcy i oczekiwania względem systemu:  
  
* Kelner: chce obsłużyć klienta, mieć możliwość edycji posiłku kelnera (dodawanie/usuwanie składników )
* Klient: chce dostać zmodyfikowany posiłek

## Warunki wstępne:  
* Wybrano danie, Klient prosi o modyfikację tego posiłku.
## Warunki końcowe: 
* Kelner dodał posiłek z wybranymi przez Klienta modyfikacjami (usunięcie/dodanie składniów)
  
## Scenaiusz główny  
  
1. Klient dobiera zmianę do dania, zgodnie z możliwościami danego posiłku. 
2. Kelner zaznacza na tablecie zmianę.
3. System sprawdza dostępność dodatku.
4. Zmodyfikowany posiłek zostaje dodany do zamówienia 
  
## Scenariusz alternatywny  
3a. Klient chce zamówić dodatek, którego składnik(i) są niedostępne w magazynie.
 > 1. System informuje Kelnera o braku dostępności dodatku
 > 2. Kelner informuje Klienta o braku skłandnika.

2a. Klient zażyczył sobie zmiany - dodanie składnika 
> 1. Kelner naciska opcję '+' przy składniku, według zaleceń Klienta    
 
2b. Kelner zażyczył sobie zmiany - usunięcie składnika  
 > 1. Kelner naciska opcję '-' przy składniku, według zaleceń Klienta  
## Wymagania specjalne:   
  

* Możliwość interfejsu wielojęzycznego.

* Ekran dotykowy wyświetlający komunikaty i umożliwiający wprowadzanie danych


## Wymagania technologiczne oraz ograniczenia na wprowadzane dane:
2. Wybór opcji za pomocą ekranu dotykowego  
3. System przechowujący dane o dostępnych składnikach

  
## Kwestie otwarte:  
  
* Czy zmniejszającą się liczbę składników powinno określać się tylko na podstawie zamówień?


  
