https://github.com/TyrekKamil/Restauracja/blob/kamil_tyrek/UseCases_customizacja_posilkow.md
https://github.com/TyrekKamil/Restauracja/blob/kamil_tyrek/UseCases_customizacja_posilkow.md - odnosnik do oryginalnego pliku
ostatni commit - 5 nov
RESTAURACJA  
CUSTOMIZACJA POSIŁKÓW 
Aktor podstawowy: Kelner  
  
Główni odbiorcy i oczekiwania względme systemu:  
  
Kelner: podczas odbioru zamówienia zaznacza zmiany w posiłkach, jakie życzy sobie klient  
Klient: chce dostać posiłek z dodatkami, które nie są standardowe, na przykład życzy sobie więcej sosu w spaghetti  
Restauracja: kontrola stanu składników, zamówień z ich dodatkami  
Warunki wstępne: Kelner rozpoczął przyjmowanie zamówienia.  
  
Warunki końcowe: Poprawnie zrealizowane zamówienie. Dostarczony posiłek jest zgodny z zamówieniem, z uwzględnieniem dodatków, które zażyczył sobie klient  
  
Scenaiusz główny  
  
1. Kelner przyjął zamówienie, wybierając dane posiłki w menu.  
2. Klient dobiera dodatki zgodnie z możliwościami danego posiłku. 
3. Kelner zaznacza na tablecie dodatki, dobrane do odpowiednich posiłków.  
4. Zamówienie zostaje przekazane do kuchni  
5. Klient otrzymuje posiłek zgodny z zamówieniem.  
  
Scenariusz alternatywny  
3a. Klient zamawia danie z inną konfiguracją dodatków niż domyślna.  
3b. Kelner widzi informację, iż dany składnik nie jest dostępny.  
3c. Kelner informuje klienta i proponuje inne rozwiązanie.  
Powrót do punku 3.  
  
Scenariusz alternatywny  
2a. Klient chce zamówić posiłek, którego składnik(i) są niedostępne w magazynie.  
2b. System informuje kelnera o braku dostępności składników.  
2c. Kelner proponuje zamianę dodatków lub wybór innego dania.  
Powrót do punktu 2.  
  
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
  
Wymagania specjalne:   
  
Aplikacja na urządzeniach mobilnych (tablet), możliwość odczytywania tekstu z 1 metra  
Interfejs wielojęzyczny  
System przechowywania informacji o menu i składnikach

Wymagania technologiczne oraz ograniczenia na wprowadzane dane:  
2a. System przechowujący dane o dostępnych składnikach

  
Kwestie otwarte:  
  
Co w przypadku, gdy pomimo informacji, iż składnik jest dostępny, jest niedostępny? Jak dokonać zmiany w zamówieniu, aby klient nie przepłacił za produkt?
Czy możliwe powinno być ręczne zmniejszanie liczby składników?
Czy zmniejszającą się liczbę składników powinno określać się tylko na podstawie zamówień?


  
