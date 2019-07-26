package br.com.orientacao_a_objetos;

public class Turma {

	private String periodoTurma;
	private int serieTurma;
	private String siglaTurma;
	private String tipoEnsino;
	
	Turma(String periodoturma, int serieturma, String siglaturma, String tipoensino) {
		this.periodoTurma = periodoturma;
		this.serieTurma = serieturma;
		this.siglaTurma = siglaturma;
		this.tipoEnsino = tipoensino;
	}
	
	public String getPeriodoTurma() {
		return periodoTurma;
	}
	public void setPeriodoTurma(String periodoTurma) {
		this.periodoTurma = periodoTurma;
	}
	public int getSerieTurma() {
		return serieTurma;
	}
	public void setSerieTurma(int serieTurma) {
		this.serieTurma = serieTurma;
	}
	public String getSiglaTurma() {
		return siglaTurma;
	}
	public void setSiglaTurma(String siglaTurma) {
		this.siglaTurma = siglaTurma;
	}
	public String getTipoEnsino() {
		return tipoEnsino;
	}
	public void setTipoEnsino(String tipoEnsino) {
		this.tipoEnsino = tipoEnsino;
	}
	
	
}
