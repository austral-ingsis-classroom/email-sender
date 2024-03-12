## Email sender example


Este es un ejemplo de como se puede abstraer
los detalles de una implementacion al momento de 
escribir tests.

El objetivo de este ejemplo es que pueda extrapolarlo
al problema de loggers que ustedes mismos deben testear.

El ejemplo es simple, se trata de un modulo que envia 
emails. La interfaz tiene una funcion `send_email` que
recibe como parametros el destinatario, la plantilla 
del email y los datos que se deben reemplazar en la
plantilla.

Veran como implementamos pruebas unitarias para la
interfaz y partes de la implementacion, sin enviar 
emails reales.

Esto mismo podran hacer para probar sus Loggers, 
sin tener que escribir logs reales.