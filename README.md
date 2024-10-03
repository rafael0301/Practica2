# Practica2
***********************************************
		Estudiantes
***********************************************
Rafael Ramirez		-	10149810\n
Ezequiel Almonte	-	00007141

***********************************************


Esta práctica contiene dos programas:

1. Desplazar Arreglo: Desplaza un arreglo de elementos alternando la rotación de las mitades del arreglo. 
La primera mitad se rota a la izquierda y la segunda mitad a la derecha, en función de un valor de desplazamiento T dado por el usuario.

Ejemplo Entrada:

Arr[A B C D E F G H]
T = 3

Salida:

arr[C D A B H E F G]


2. Ordenar Estudiantes: Genera una lista de estudiantes con IDs, nombres y un índice académico aleatorio. 
Los estudiantes son ordenados en función de su índice académico en orden ascendente o descendente, según lo indique el usuario.

Ejemplo Entrada:

estudiantes a generar = 5
orden = asc

Salida:

ID: 847, nombre: estudiante #2, indice academico: 1.577
ID: 283, nombre: estudiante #5, indice academico: 2.124
ID: 127, nombre: estudiante #1, indice academico: 3.137
ID: 512, nombre: estudiante #3, indice academico: 3.739
ID: 982, nombre: estudiante #4, indice academico: 3.928

*****************************************************************************************************
Análisis del Rendimiento


1. Desplazar Arreglo

El algoritmo alterna entre rotaciones de mitades del arreglo en función de T.
El agoritmo tiene un orden de O(n log n), donde n es el tamaño del arreglo.

2. Ordenar Estudiantes

El algoritmo de ordenamiento implementado es una versión del Ordenamiento de Burbuja, que tiene una complejidad de tiempo de O(n²), donde n es el número de estudiantes.
