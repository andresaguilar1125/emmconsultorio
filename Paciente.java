public class Paciente {

	// Atributos -- Propiedades
	private String nombre;
	private int cedula;
	private Especialidad especialidades;
	private int tiempoEspera;

	// Constructor
	private Paciente(String nombre, int cedula, Especialidad especialidad, int tiempoEspera) {
			this.nombre = nombre;
			this.cedula = cedula;
			this.especialidad = especialidades;
			this.tiempoEspera = tiempoEspera;
	}

	// Getters
	public String getNombre() {
			return nombre;
	}

	public int getCedula() {
			return cedula;
	}

	public Especialidad getEspecialidad() {
			return especialidad;
	}

	public int getTiempoEspera() {
			return tiempoEspera;
	}

	// Setters
	public void setNombre(String nombre) {
			this.nombre = nombre;
	}
	
	public void setCedula(int cedula) {
			this.cedula = cedula;
	}

	public void setEspecialidad(Especialidad especialidad) {
			this.especialidad = especialidad;
	}

	public void setTiempoEspera(int tiempoEspera) {
			this.tiempoEspera = tiempoEspera;
	}
	
	// Functions or methods
	
}