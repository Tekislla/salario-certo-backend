package com.salariocerto.dto;

public class CalculoResponseDTO {
    private Double salBruto;
    private Double descFixo;
    private Double pensaoAlimenticia;
    private Integer numDependentes;
    private Double descontoINSS;
    private Double descontoIRRF;
    private Double salLiquido;

    public Double getSalBruto() {
        return salBruto;
    }

    public void setSalBruto(Double salBruto) {
        this.salBruto = salBruto;
    }

    public Double getDescFixo() {
        return descFixo;
    }

    public void setDescFixo(Double descFixo) {
        this.descFixo = descFixo;
    }

    public Double getPensaoAlimenticia() {
        return pensaoAlimenticia;
    }

    public void setPensaoAlimenticia(Double pensaoAlimenticia) {
        this.pensaoAlimenticia = pensaoAlimenticia;
    }

    public Integer getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(Integer numDependentes) {
        this.numDependentes = numDependentes;
    }

    public Double getDescontoINSS() {
        return descontoINSS;
    }

    public void setDescontoINSS(Double descontoINSS) {
        this.descontoINSS = descontoINSS;
    }

    public Double getDescontoIRRF() {
        return descontoIRRF;
    }

    public void setDescontoIRRF(Double descontoIRRF) {
        this.descontoIRRF = descontoIRRF;
    }

    public Double getSalLiquido() {
        return salLiquido;
    }

    public void setSalLiquido(Double salLiquido) {
        this.salLiquido = salLiquido;
    }
}