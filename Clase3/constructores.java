Clase libro
	//Atributos
	Definir nombre como caracter
	Definir autor como caracter
	Definir editorial como caracter
	Definir cantidad_paginas como entero
	Definir fecha_publicacion como fecha
	Definir tipo como caracter
	Definir ilustrado como logico
	//constructor por defecto
	Publico metodo libro()
		nombre="Calculo diferencial"
		autor="Jame Stewart"
		editorial="Planeta"
		cantidad_paginas=700
		fecha_publicacion=07/27/1996
		tipo="Fisico"
		ilustrado=Verdadero

	Fin metodo

	//Constructor por parametros
	Publico metodo libro(nom, aut, edit, cantp, fechapu)
		definir fechapu como fecha


		nombre=nom
		autor=aut
		editorial=edit
		cantidad_paginas=cantp
		fecha_publicacion=fechpu
	Fin metodo
Fin clase

algoritmo
	Definir libro1 como libro
	Definir libro2 como libro

	libro1 = new libro()
	libro2 = new libro("Danza de dragones", "Gorge R.R Martin", "HarperCollins", 800, 27/07/1996)

Fin algoritmo 