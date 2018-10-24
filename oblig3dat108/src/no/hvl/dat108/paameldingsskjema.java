package no.hvl.dat108;

import javax.servlet.http.HttpServletRequest;

public class paameldingsskjema {

	private String fornavn;
	private String etternavn;
	private String mobil;
	private String passord;
	private String passordRepeater;

	public paameldingsskjema(HttpServletRequest request) {

		this.fornavn = request.getParameter("fornavn");
		this.etternavn = request.getParameter("etternavn");;
		this.mobil = request.getParameter("mobil");;
		this.passord = request.getParameter("passord");;
		this.passordRepeater = request.getParameter("passordRepetert");;
	}

	public String getFornavn() {
		return fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public String getMobil() {
		return mobil;
	}

	public String getPassord() {
		return passord;
	}

	public String getPassordRepeater() {
		return passordRepeater;
	}
	
	

}
