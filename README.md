Proyecto Loteria Falsa
 
1º Definir los casos de prueba
2º Crear los test unitarios
3º Programar y completar la práctica
 
5 bombos 1 2 3 4 5
cada bombo 0-9
0-9 -> %10
 
Sacamos tirada 
35917
 
Bombo 1:
3 -> %9.1 (restamos 0.9)
Resto -> %10.1 (Aumentamos 0.1)
 
Bombo 2:
5 -> 0.0....
 
 
Listar ganadores (Integer size) { Te da los "size" ultimos números ganadores }
Introducir nuevo ganador(Integer numGanador) { Add a la lista de ganadores }
Mostrar por bombo (Integer numBombo) { Te devuelve los pesos de todos los dígitos posibles en el bombo 'numBombo' }
Mostrar por dígito (Integer digito) { Te devuelve los pesos del dígito introducido en cada bombo }
Calcular probabilidad (Integer numeroAJugar) { Maravilloso }
 
 
Pistas:
No hacer todo a la vez
Servicio Bombo Individual

CASOS DE PRUEBA
de un solo bombo (las probabilidades):
public void saleNumero() -> el numero es del 0 al 9
public void probabilidadNumeroTrasSalirLaPrimeraVez() -> dado un numero 0, su probabilidad en el bombo es 9,1%
public void probabilidadRestoNumerosDadoLaPrimeraVezQueSaleUnNumero() -> dado un numero 0 que es la primera vez que sale, la probabilidad del resto de numeros es 10,1% ¿? dentro del mismo test, o test para cada número?¿
public void probabilidadNumeroTrasSalirSegundaVez() -> dado un numero 0 que es la segunda vez que sale, su probabilidad es 8,2%
public void probabilidadRestoNumerosDadoLaSegundaVezQueSaleUnNumero() -> el 0 ha salido dos veces, la probabilidad del resto es 10,2%
public void probabilidadNumeroTrasSalirLaPrimeraVezYLuegoSalirOtroNumero() -> el 0 sale (9,1%) y el resto (10,1%), sale el 1 -> 1 = 9,2% y el 0 = 9,2% y el resto 10,2%
public void probabilidadNegativaNumero() -> 0 su probabilidad < 0.9% -> que no pueda salir ese número (booleano a falso).

de lista ganadores
public void daElNumeroCorrectoDeGanadores() -> size que le pasa = size que devuelve
public void sizeQueLePasaMayorASizeGanadores() -> le pedimos los últimos 2 ganadores pero sólo hay 1
public void noHayGanadores() -> le pedimos los últimos 2 ganadores pero no hay ninguno

de calcular probabilidad
public void calcularProbabilidad() -> probabilidad esperada = probabilidad que da el método

al introducir numero ganador
public void longitudIncorrectaGanadorPorSuperior() -> le añadimos un número con más de 5 dígitos
public void longitudIncorrectaGanadorPorInferior() -> le añadimos un número con menos de 5 dígitos
public void ganadorNegativo() -> le añadimos un ganador negativo
public void ganadorIntroducido() -> el ganador se añade a la lista
public void ganadorNoEsNumero() -> le introducimos un ganador que no es un número

