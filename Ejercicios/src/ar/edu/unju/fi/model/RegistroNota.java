package ar.edu.unju.fi.model;

public class RegistroNota {
	private String codigo; 
	private String alumno;
	private Materia materia;
	private float notaFinal;
	
	public RegistroNota() {
		// TODO Auto-generated constructor stub
	}

	public RegistroNota(String codigo, String alumno, Materia materia, float notaFinal) {
		super();
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.notaFinal = notaFinal;
	}

	public String toString() {
		return "Registro de Nota - codigo=" + codigo + "- alumno="+ alumno + "-materia="+ materia + "- notaFinal="+ notaFinal + "]";
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public float getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}

	
	
}
