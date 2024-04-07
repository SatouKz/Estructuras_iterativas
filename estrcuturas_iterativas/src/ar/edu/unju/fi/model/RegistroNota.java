package ar.edu.unju.fi.model;

public class RegistroNota {
	
	private String codigo;
	private Alumno alumno;
	private Materia materia;
	private float notaFinal;
	
	public RegistroNota(String codigo, Alumno alumno, Materia materia, float notaFinal) {
		super();
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.notaFinal = notaFinal;
	}
	
	
	@Override
	public String toString() {
		return "---Registro de Notas---" + "\nCodigo: " + codigo + "\n---Alumno" + alumno + "\n---Materia " + materia + "\nNota Final: "+ notaFinal;
	}


	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
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