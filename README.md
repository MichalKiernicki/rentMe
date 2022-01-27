# rentMe

## Aplikacja do wynajmu mieszkań lub domu.

Zadanie:

Java 1.8

Spring-Boot może być w najnowszej wersji
Projket powinien zawierać skrypt do kompilacji.   //TODO

1. Stworzyć relacyjne struktury danych pozwalające na utrwalenie nastepujących
danych:

a. Słownik obiektów do wynajęcia (nazwa, cena jednostkowa, powierzchnia,
opis)

b. Słownik najemców/wynajmujących (nazwa)

c. Rezerwacja (okres najmu, wynajmujący, najemca, koszt)

2. Przy pomocy frameworku Spring-Boot (z wyłączeniem Spring DataREST) stworzyć
aplikację, która pozwoli przy pomocy web-serwisów REST:

a. Dodać nową rezerwację (nie może być dwóch rezerwacji tego samego oiektuw tym samym czasie) //TODO

b. Zmienić rezerwację   //TODO

c. Pobrać listę rezerwacji dla zadanego najemcę (nazwa)   //TODO

d. Pobrać listę rezerwacji dla danego obiektu   //TODO

Założenie:

Baza danych HSQLDB lub podobna pamięciowa

struktura bazy oraz słowniki utworzone i wypełnione podczas startu aplikacji

Zawartość słownika obiektów ładowana z pliku sql

3. Utworzyć test jednostkowy dla jednego z przypadków z punktu 2    //TODO
4. 
Proszę podać przykładowe wywołania usług przy pomocy polecenia curl   //TODO
