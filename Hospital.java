public class Hospital {
	public Especialidad especialidad;
	private Consultorio consultorio;

	// Constructor
	public Hospital(Especialidad especialidad, Consultorio consultorio) {
			this.especialidad = especialidad;
			this.consultorio = consultorio;
	}

	// Getters
	public Especialidad getEspecialidad() {
			return especialidad;
	}
	
	public Consultorio getConsultorio() {
			return consultorio;
	}

	// Setters
	public void setEspecialidad(Especialidad especialidad) {
			this.especialidad = especialidad;
	}
	
	public void setConsultorio(Consultorio consultorio) {
			this.consultorio = consultorio;
	}
}