package com.salariocerto.dto;

public class CalculoRequestDTO {
    private Double modelSalBruto;
    private Double modelDescFixo;
    private Double modelPensaoAlimenticia;
    private Integer modelNumDependentes;

    public Double getModelSalBruto() {
        return modelSalBruto;
    }

    public void setModelSalBruto(Double modelSalBruto) {
        this.modelSalBruto = modelSalBruto;
    }

    public Double getModelDescFixo() {
        return modelDescFixo;
    }

    public void setModelDescFixo(Double modelDescFixo) {
        this.modelDescFixo = modelDescFixo;
    }

    public Double getModelPensaoAlimenticia() {
        return modelPensaoAlimenticia;
    }

    public void setModelPensaoAlimenticia(Double modelPensaoAlimenticia) {
        this.modelPensaoAlimenticia = modelPensaoAlimenticia;
    }

    public Integer getModelNumDependentes() {
        return modelNumDependentes;
    }

    public void setModelNumDependentes(Integer modelNumDependentes) {
        this.modelNumDependentes = modelNumDependentes;
    }
}