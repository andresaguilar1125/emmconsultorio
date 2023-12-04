
public class Main {
    
  public static void main(String[] args) {

    // Maximo 10 doctores
    Doctor[] doctores = new Doctor[10];
    // Maximo 15 pacientes
    Paciente[] pacientes = new Paciente[15];
    // Maximo 6 especialidades
    String[] especialidades = {
      "Laboratorio",
      "Oftalmologia",
      "Odontologia",
      "MedicinaGeneral",
      "Radiologia",
      "Ortopedia"
    };
    // Maximo 30 (5 consultorios * 6 especialidades)
    Consultorio[] consultorios = new Consultorio[5];

    
    doctores[0] = new Doctor("nombre", "MedicinaGeneral", 0, 0);
    pacientes[0] = new Paciente("nombre", 112345678, null, 0);
    consultorios[0] = new Consultorio(pacientes[0], doctores[0]);

    for (especialidades especialidad : especialidad) {
      System.out.println(especialidad);
}

  }
}
