// restauracja.cpp : Ten plik zawiera funkcję „main”. W nim rozpoczyna się i kończy wykonywanie programu.
//

#include "pch.h"
#include <iostream>
#include <conio.h>
using namespace std;
void menu()
{
	cout << "1. Kotlet Schabowy 15 zl\n";
	cout << "2. Klasyczna pizza 20zl \n";
	cout << "3. Zupa Pomidorowa 10 zl \n";
	cout << "4. Salatka grecka 8 zl\n";
	cout << "5. Wyjdz\n";
	
}

void skladniki()
{
	cout << "1.Ketchup 1 zl\n";
	cout << "2.Sos smietanowy 2 zl\n";
	cout << "3.Frytki 5zl \n";
	cout << "4.Wyjdz\n";

}


int main()
{
	int suma =0;
	cout << "Co chcesz zrobic\n";
	cout << "1. Pokaz menu\n";
	cout << "2.Pokaz dodatki\n";
	cout << "3. Wyjdz\n";
	while (1)
	{
		int liczba;
		cin >> liczba;
		switch (liczba)
		{
		case 1:
			menu();
			break;
		case 2:
			skladniki();
			break;
		default:
			break;
		}
		if (liczba == 3) break;
	}
	cout << "wybierz danie glowne\n";
	while (1)
	{
		int liczba2;
		cin >> liczba2;
		switch (liczba2)
		{
		case 1:
			suma += 15;
			break;
		case 2:
			suma += 20;
			break;
		case 3:
			suma += 10;
			break;
		case 4:
			suma += 8;
			break;
		default:
			break;

		}
		if (liczba2 == 5) break;
	}
	cout << "dodatek\n";
	while (1)
	{
		int liczba3;
		cin >> liczba3;
		switch (liczba3)
		{
		case 1:
			suma += 1;
			break;
		case 2:
			suma += 2;
			break;
		case 3:
			suma += 5;
			break;
		default:
			break;

		}
		if (liczba3 == 4) break;
	}
	cout << "Twoj rachunek wynosi " << suma << "zl";
}

// Uruchomienie programu: Ctrl + F5 lub menu Debugowanie > Uruchom bez debugowania
// Debugowanie programu: F5 lub menu Debugowanie > Rozpocznij debugowanie

// Porady dotyczące rozpoczynania pracy:
//   1. Użyj okna Eksploratora rozwiązań, aby dodać pliki i zarządzać nimi
//   2. Użyj okna programu Team Explorer, aby nawiązać połączenie z kontrolą źródła
//   3. Użyj okna Dane wyjściowe, aby sprawdzić dane wyjściowe kompilacji i inne komunikaty
//   4. Użyj okna Lista błędów, aby zobaczyć błędy
//   5. Wybierz pozycję Projekt > Dodaj nowy element, aby utworzyć nowe pliki kodu, lub wybierz pozycję Projekt > Dodaj istniejący element, aby dodać istniejące pliku kodu do projektu
//   6. Aby w przyszłości ponownie otworzyć ten projekt, przejdź do pozycji Plik > Otwórz > Projekt i wybierz plik sln
