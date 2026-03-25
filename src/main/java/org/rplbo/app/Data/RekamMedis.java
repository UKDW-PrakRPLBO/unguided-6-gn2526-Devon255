package org.rplbo.app.Data;

public class RekamMedis {
    // Attribute
    private String namaPasien;
    private String diagnosis;
    private String tanggal;
    private int id;
    private String namaDokter;
    // Constructor

    // Constructor yang BENAR sesuai UML
    public RekamMedis(int id, String namaPasien, String diagnosis, String tanggal, String namaDokter) {
        this.id = id;
        this.namaPasien = namaPasien;
        this.diagnosis = diagnosis;
        this.tanggal = tanggal;
        this.namaDokter = namaDokter;
    }

    // Getter

    public String getNamaPasien() {
        return namaPasien;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTanggal() {
        return tanggal;
    }

    public int getId() {
        return id;
    }

    public String getNamaDokter() {
        return namaDokter;
    }
}