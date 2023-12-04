public class Doctor {
	
	// Atributos -- Propiedades
	private String nombre;
	public Especialidad especialidad;
	private int asigMax;
	private int asigCurso;

	// Constructor
	public Doctor(String nombre, Especialidad especialidad, int asigMax, int asigCurso) {
			this.nombre = nombre;
			this.especialidad = especialidad;
			this.asigMax = asigMax;
			this.asigCurso = asigCurso;
	}

	// Getters
	public String getNombre() {
			return nombre;
	}

	public Especialidad getEspecialidad() {
			return especialidad;
	}

	public int getAsigMax() {
			return asigMax;
	}

	public int getAsigCurso() {
			return asigCurso;
	}

	// Setters
	public void setNombre(String nombre) {
			this.nombre = nombre;
	}

	public void setEspecialidad(Especialidad especialidad) {
			this.especialidad = especialidad;
	}

	public void setAsigMax(int asigMax) {
			this.asigMax = asigMax;
	}

	public void setAsigCurso(int asigCurso) {
			this.asigCurso = asigCurso;
	}

	// Functions or methods
	
}