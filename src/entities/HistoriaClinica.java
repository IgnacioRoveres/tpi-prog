/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author PC
 */
public class HistoriaClinica {
    private long id;
    private long nroHistoria;
    private GrupoSanguineo grupoSanguineo; 
    private String antecedentes;
    private String medicacionActual;
    private String observaciones;

    public HistoriaClinica(long  id, long  nroHistoria, GrupoSanguineo grupoSanguineo, String antecedentes, String medicacionActual, String observaciones) {
        this.id = id;
        this.nroHistoria = nroHistoria;
        this.grupoSanguineo = grupoSanguineo;
        this.antecedentes = antecedentes;
        this.medicacionActual = medicacionActual;
        this.observaciones = observaciones;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNroHistoria() {
        return nroHistoria;
    }

    public void setNroHistoria(long nroHistoria) {
        this.nroHistoria = nroHistoria;
    }

    public GrupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(GrupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getMedicacionActual() {
        return medicacionActual;
    }

    public void setMedicacionActual(String medicacionActual) {
        this.medicacionActual = medicacionActual;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "HistoriaClinica{" + "id=" + id + ", nroHistoria=" + nroHistoria + ", grupoSanguineo=" + grupoSanguineo + ", antecedentes=" + antecedentes + ", medicacionActual=" + medicacionActual + ", observaciones=" + observaciones + '}';
    }
    
    
}
