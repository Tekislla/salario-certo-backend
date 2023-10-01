package com.salariocerto.service;

import com.salariocerto.dto.CalculoRequestDTO;
import com.salariocerto.dto.CalculoResponseDTO;

public class CalculoService {
    public CalculoResponseDTO calcular(CalculoRequestDTO req) {
        double salBruto = req.getModelSalBruto();
        double salBrutoAux = req.getModelSalBruto() - req.getModelDescFixo();
        double descFixo = req.getModelDescFixo();
        double pensaoAlimenticia = req.getModelPensaoAlimenticia();
        int numDependentes = req.getModelNumDependentes();
        double descontoINSS = getDescontoINSS(salBrutoAux);
        double salDescINSS = salBrutoAux - descontoINSS;
        double descontoIRRF = getDescontoIRRF(salDescINSS, numDependentes, pensaoAlimenticia);
        double salLiquido = salBrutoAux - descontoINSS - descontoIRRF;

        CalculoResponseDTO response = new CalculoResponseDTO();
        response.setSalBruto(salBruto);
        response.setDescFixo(descFixo);
        response.setPensaoAlimenticia(pensaoAlimenticia);
        response.setNumDependentes(numDependentes);
        response.setDescontoINSS(descontoINSS);
        response.setDescontoIRRF(descontoIRRF);
        response.setSalLiquido(salLiquido);

        return response;
    }

    public double getDescontoINSS(double salBruto) {
        if (salBruto == 1302.00) {
            return salBruto * 0.075;
        } else if (salBruto > 1302.01 && salBruto < 2571.29) {
            return (1302.00 * 0.075) + ((salBruto - 1302.00) * 0.09);
        } else if (salBruto > 2571.30 && salBruto < 3856.94) {
            return (1302.00 * 0.075) + ((2571.29 - 1302.00) * 0.09) + ((salBruto - 2571.29) * 0.12);
        } else if (salBruto > 3856.95 && salBruto < 7507.49) {
            return (1302.00 * 0.075) + ((2571.29 - 1302.00) * 0.09) + ((3856.94 - 2571.29) * 0.12) + ((salBruto - 3856.94) * 0.14);
        } else {
            return (1302.00 * 0.075) + ((2571.29 - 1302.00) * 0.09) + ((3856.94 - 2571.29) * 0.12) + ((7507.49 - 3856.94) * 0.14);
        }
    }

    public double getDescontoIRRF(double salBruto, int numDependentes, double pensaoAlimenticia) {
        double val = 0;
        double descDependentes = numDependentes * 189.59;
        if (salBruto < 1903.98) {
            return val;
        } else if (salBruto > 1903.99 && salBruto < 2826.65) {
            val = (salBruto * 0.075) - 142.8 - descDependentes - pensaoAlimenticia;
        } else if (salBruto > 2826.66 && salBruto < 3751.05) {
            val = (salBruto * 0.15) - 354.8 - descDependentes - pensaoAlimenticia;
        } else if (salBruto > 3751.06 && salBruto < 4664.68) {
            val = (salBruto * 0.225) - 636.13 - descDependentes - pensaoAlimenticia;
        } else {
            val = (salBruto * 0.275) - 869.36 - descDependentes - pensaoAlimenticia;
        }
        if (val > 0) {
            return val;
        } else {
            return 0;
        }
    }

    public String getFaixaINSS(double salBruto) {
        if (salBruto == 1302.00) {
            return "7.5%";
        } else if (salBruto > 1302.01 && salBruto < 2571.29) {
            return "9%";
        } else if (salBruto > 2571.30 && salBruto < 3856.94) {
            return "12%";
        } else if (salBruto > 3856.95 && salBruto < 7507.49) {
            return "14%";
        } else {
            return "Teto";
        }
    }

    public String getFaixaIRRF(double salBruto) {
        if (salBruto < 1903.98) {
            return "0%";
        } else if (salBruto > 1903.99 && salBruto < 2826.65) {
            return "7.5%";
        } else if (salBruto > 2826.66 && salBruto < 3751.05) {
            return "15%";
        } else if (salBruto > 3751.06 && salBruto < 4664.68) {
            return "22.5%";
        } else {
            return "27.5%";
        }
    }

}
