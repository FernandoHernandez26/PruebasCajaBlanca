# PruebasCajaBlanca
Ejercicio de Java con pruebas de caja blanca.
🧪 Pruebas de Caja Blanca – Juego Intergaláctico 2
📖 Descripción del Proyecto

Este proyecto implementa el juego Juego Intergaláctico 2 desarrollado en Java.

El objetivo académico del proyecto es aplicar Pruebas de Caja Blanca al método principal del juego (jugar()), calculando su complejidad ciclomática mediante las tres formas conocidas:

✔ Aristas - Nodos + 2

✔ Nodos predicado + 1

✔ Regiones + 1 (incluyendo región externa)

Además, se identifican los caminos independientes del grafo de flujo.

🧠 Lógica del Juego

El jugador comienza en la casilla 1.

Reglas principales:

Si llega a la casilla 42 → Gana.

Si cae en la casilla 33 → Pierde.

Si cae en la casilla 31 → Retrocede a la casilla 13.

Si se pasa de la casilla 42 → Vuelve a la casilla 1.

El avance depende de la diferencia entre direcciones galácticas reducidas.

La complejidad ciclomática del método jugar() es:

M = 5

Por lo tanto, se requieren mínimo 5 caminos independientes para cubrir completamente el método.

[HernandezJaramilloLuisFernandoCajaBlanca.pdf.pdf](https://github.com/user-attachments/files/25667595/HernandezJaramilloLuisFernandoCajaBlanca.pdf.pdf)

