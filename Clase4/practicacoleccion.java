Clase Capitulo

publico numero, cantidad_pag como entero
publico descripcion como caracter

Fin clase

clase libro

	publico nombre, autor, fecha_publicacion como caracter
	privado capitulos como coleccion<Capitulo>

	publico metodo agregar_elemento()
		// capitulos.agregar(objeto)
		capitulos.agregar(nuevo capitulo())
	Fin metodo

Fin clase

algoritmo Biblioteca

	definir cap como capitulos
	definir lib como libro

	cap = nuevo Capitulo()
	lib = nuevo Libro()
//los get y set no aplica para cuando se va agregar un objeto a alguna coleccion.
	// lib.agregar_elemento(cap)
	lib.agregar_elemento()

Fin algoritmo