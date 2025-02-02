# Arraylist 

## 1. Notes DAM  (_[notesDAM](src/notesDAM)_)
- Volem calcular la nota mitjana de programació de la classe de 1r de DAM. Per fer-ho
crearem un mètode introdueixValors on l'usuari introduirà notes a un ArrayList i acaba quan
s'introdueix un -1.

- A continuació hi haurà una funció sumaValors que sumarà tots els valors d'aquest ArrayList.
(Fes el bucle amb Iterator i sense ell). Sense ell seria utilitzant el foreach, per exemple: for
(Integer i: conjuntIntegers)
- Finalment s'entrega la mitjana aritmètica a l'usuari.

## 2. Vaixells (_[ships](src/ships)_)
- Crea un petit programa per un port pesquer capaç de tenir una estructura ArrayList de
Vaixells. Un Vaixell s'identifica per un nom, un preu i una edat.

- Fes les operacions necessàries per introduir, buscar, modificar i treure un vaixell d'aquest
ArrayList. També volem una opció on es llistin tots els vaixells actualment, a més volem que
es llistin per antiguitat (de més vell a més nou), per ordre lexicogràfic de nom i per preu (de
car a barat).
  - CRUD
    - introduir
    - buscar
    - modificar
    - treure un vaixell
    - llistin tots
  - a més volem que es llistin per antiguitat (de més vell a més nou)
  - per ordre lexicogràfic de nom i per preu (de car a barat).

## 3. Sistema de gestió de jugadors (_[managementplayers](src/managementplayers)_)

- 1. Classe de jugadors (Player): creeu una classe de jugador senzilla amb els atributs
   següents: name (cadena), score (int) i els mètodes necessaris.
- 2. Classe PlayerManager: creeu una classe PlayerManager amb les funcionalitats
   següents:
   - 1. afegeix un jugador a la llista.
   - 2. elimina un jugador de la llista en funció del nom del jugador.
   - 3. retornar el jugador en funció del nom del jugador.
   - 4. actualitza la puntuació d'un jugador.
   - 5. retornar una llista dels millors N jugadors en funció de les seves
     puntuacions.
   - 6. retornar una llista amb els jugadors amb score més gran que un valor
        minScore.
   - 7. obtenir el jugador a més puntuació.
   - 8. mostrar tots els jugadors actuals.
   - 9. Creeu una classe TestPlayerManager per provar les funcionalitats anteriors, crea
        5 jugadors.