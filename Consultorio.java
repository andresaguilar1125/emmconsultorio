public class Consultorio {
	
	// Atributos -- Propiedades
	private Paciente paciente;
	private Doctor doctor;

	// Constructor
	public Consultorio(Paciente paciente, Doctor doctor) {
			this.paciente = paciente;
			this.doctor = doctor;
	}

	// Getters
	public Paciente getPaciente() {
			return paciente;
	}

	public Doctor getDoctor() {
			return doctor;
	}

	// Setters
	public void setPaciente(Paciente paciente) {
			this.paciente = paciente;
	}

	public void setDoctor(Doctor doctor) {
			this.doctor = doctor;
	}

	// Functions or methods
	
}