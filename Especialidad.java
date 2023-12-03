public enum especialidades {
	/* 
		Se pone public para que sean consistentes con pacientes y con doctores
		Al estar public se puede hacer referencia con "Especialidades"
		Se agrego "SinAsignar" para facilitar el manejo de pacientes y doctores--
		y no crear funciones o mas logica

 		Enum es similar pero no es igual a una lista
	 	https://www.w3schools.com/java/java_enums.asp
	*/
	Laboratorio,
	Oftalmologia,
	MedicinaGeneral,
	Radiologia,
	Ortopedia,
	SinAsignar
}