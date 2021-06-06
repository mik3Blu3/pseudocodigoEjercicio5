Algoritmo mujeresMayores_hombresMenores
	cantMujerMayorEdad=0
	cantHombreMenorEdad=0
	inicioDatos=1
	Escribir "Ingrese cuantos datos de edad y sexo desea ingresar "
	leer numeroDatos
	Mientras inicioDatos <= numeroDatos Hacer
		Escribir "Ingrese la edad de la persona # ",inicioDatos
		leer edadt
		Escribir "Ingrese el sexo de la persona #",inicioDatos  " Masculino = 0 : Femenino = 1"
		leer sexot
		Si sexot == 0 Entonces
			Si edadt < 18 Entonces
				cantHombreMenorEdad = (cantHombreMenorEdad+1)
			Fin Si
		SiNo
			Si sexot == 1 Entonces
				Si edadt >= 18 Entonces
					cantMujerMayorEdad = (cantMujerMayorEdad+1)
				Fin Si
			Fin Si
		Fin Si
		inicioDatos=inicioDatos+1
	Fin Mientras
	Escribir "La cantidad de Mujeres mayores de edad fue de: ",cantMujerMayorEdad
	Escribir ""
	Escribir "La cantidad de Hombres menores de edad fue de: ",cantHombreMenorEdad
FinAlgoritmo
