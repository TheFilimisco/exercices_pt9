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

## 4. Sistema de gestió de llibres (_[managementbooks](src/managementbooks)_)

1. Implementeu un classe anomenada Book amb els atributs següents: id (int), title
   (String), author (String), rating (int, valor entre 0 i 5 que representa la valoració d’un
   llibre), i els mètodes necessaris.
2. Classe BookManager: creeu una classe BookManager amb les funcionalitats
   següents:
      1. afegir un llibre a la llista.
      2. mostrar tots els llibres actuals.
      3. retornar un llibre en funció del títol del llibre.
      4. retornar un llibre en funció del autor del llibre.
      5. actualitzar el rating d'un llibre.
      6. retornar una llista ordenada descendent dels llibres en funció dels ratings.
      7. retornar una llista dels millors N llibres en funció dels ratings.
      8. retornar una llista amb els llibres amb rating més gran que un valor minRating.
      9. eliminar un llibre de la llista en funció del id del llibre.
3. Creeu una classe TestBookManager per provar les funcionalitats anteriors, crea 5
   llibres. S’ha de mostrar que totes les funcionalitats funcionen correctament. Afegiu println’s
   perquè es vegi clarament el que s’està fent.

# HashMap 

- put(K key, V value): Adds a key-value pair.
- get(Object key): Retrieves the value for a given key.
- remove(Object key): Removes a key-value pair.
- containsKey(Object key): Checks if a key exists.
- clear(): Removes all mappings.
- size(): Returns the number of entries.

## 1. Mòbils (_[cellphones](src/cellphones)_)

-   Crea un Hashmap capaç d'inventariar tots els mòbils dels alumnes de DAM1. El Hashmap
    serà una estructura conjuntMobils<dni, Mobil>. Dni serà un String i classe Mobil està
    compost per una Marca, un model i un número.
-   Crea les següents opcions:
    - a) Afegir mòbil. (vigilar amb dni's repetits).
    - b) Treure mòbil.
    - c) Buscar un mòbil a partir d'un dni.
    - d) Buscar un dni a partir del número de mòbil.

## 2. Assignació de dorsals d'un equip de futbol. (_[footballteam](src/footballteam)_)

- Cal que definim una estructura de Hashmap <Dorsal, Jugador>, Un dorsal és només un
    enter, mentre que un Jugador és de la classe Jugador. Un Jugador conté un nom, una edat i
    una posició.
- Feu un programa capaç de:
    - a) Introduir Jugadors al Hashmap.
    - b) Buscar un jugador per dorsal en el Hashmap.
    - c) Buscar un jugador per nom en el Hashmap.
    - d) Llistar Jugadors ordenats per número.
    - e) Llistar jugadors per edat.
    - f) Llistar jugadors per posició.

## 3. Sistema de matrícula del curs (_[managementenrollment](src/managementenrollment)_)
1. Classe Student: creeu una classe d'estudiant amb els atributs següents:
   1. IdStudent: Identificador únic de l'estudiant.
   2. Name: Nom de l'alumne.
   3. Age: Edat de l'alumne.
2. Classe CourseManager: creeu una classe CourseManager amb les funcionalitats
   següents:
   1. enrollStudent(Student student): inscriu un estudiant al curs.
   2. unenrollStudent(String id): anul·la la matrícula d'un estudiant del curs en funció del
      seu
      identificador.
   3. findStudentById(String id): cerca i retorna un objecte d'estudiant pel seu
      identificador.
   4. listAllStudents(): enumera tots els estudiants inscrits al curs.

## 4. SCRUM_HashMap (_[scrumhashmap](src/scrumhashmap)_)

Volem gestionar els grups de SCRUM de DAM1 en un HashMap amb els noms dels equips i
els alumnes membres de cada equip.
- 2.1 Classe Student. Implementeu la classe Student amb atributs id (String) i nom
(String) amb els mètodes necessaris.
- 2.2 Classe Scrum. Implementeu la classe Scrum amb un Map<String,
ArrayList<Student>> (o HashMap) com atribut, els mètodes necessaris i les següents
funcionalitats:
  1. public boolean addProject(String projectName): aquest mètode ens permetrà
     afegir nous projectes. Si el projecte existeix, s’ha d’informar que ja existeix.
  2. public boolean addStudent(String projectName, Student student): afegir un nou
     alumne a un projecte. Si el projecte no existeix, es crea un nou projecte i s’afegeix
     l’alumne.
  3. public boolean removeProject(String projectName): esborrar un projecte. Si el
     projecte no existeix, s’ha d’informar que no existeix.
  4. public void showProjects(): mostrar per pantalla els projectes actuals i els
     membres de cada projecte.
  5. public boolean removeStudent(String projectName, String studentId): esborrar un
     alumne del projecte. S’ha de comprovar que el projecte existeix, i que el alumne
     forma part del projecte. Informar dels possibles casos.
- Creeu una classe TestScrum per provar les funcionalitats anteriors. S’ha de mostrar que
  totes les funcionalitats funcionen correctament. Afegiu println’s perquè es vegi clarament el
  que s’està fent.

# HashSet

- add(E e):	Agrega un elemento si no está presente
- clear():	Borra todos los elementos
- clone():	Crea una copia del HashSet
- contains(Object o):	Verifica si un elemento está en el HashSet
- isEmpty():	Verifica si el HashSet está vacío
- iterator():	Devuelve un iterador para recorrer el HashSet
- remove(Object o):	Elimina un elemento si está presente
- size():	Devuelve la cantidad de elementos
- toArray():	Convierte el HashSet en un array

## 1. Loteria (_[lottery](src/lottery)_)

- Crea un sac amb boles d'una loteria. Aquest sac (Hashset) contindrà les boles del 0 al 100.

- Paral·lelament has de crear una classe Jugador que estarà compost d'un dni i un "boleto"
amb 4 números del 0 al 100 diferents.

- Crea 4 jugadors amb 4 boletos random i simula una loteria que vagi traient nombres del sac
creat anteriorment. Un cop un dels jugadors guanya (s'han tret els 4 nombres del jugador)
s'acaba el joc i es treu el dni del guanyador



