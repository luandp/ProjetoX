/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.Class;

/**
 *
 * @author Luan Paulo
 */
public class Carro {
        int id;
        String placa;
        String marca;
        String modelo;
        String cor;
        int ano;
        int portas;//2 ou 4;
        boolean arcondicionado;
        String direcao;//eletrica ou hidraulica ou mecanica
        boolean veletrico;
        boolean alarme;
        String tipo;//sedan ou ratch ou suv
        String combustivel;//gasolina ou alcool ou flex ou diesel
        boolean cambioauto;//automatico ou manual
        boolean multimidia;//
        boolean status;//disponivel(aluguel ou venda) -true


        public Carro() {
        this.id = 0;
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.ano = 0;
        this.portas = 0;
        this.arcondicionado = false;
        this.direcao = "";
        this.veletrico = false;
        this.alarme = false;
        this.tipo = "";
        this.combustivel = "";
        this.cambioauto = false;
        this.multimidia = false;
        this.status = false;
    }
        
    public Carro(int id, String placa, String marca, String modelo, String cor, int ano, int portas, boolean arcondicionado, String direcao, boolean veletrico, boolean alarme, String tipo, String combustivel, boolean cambioauto, boolean multimidia, boolean status) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.portas = portas;
        this.arcondicionado = arcondicionado;
        this.direcao = direcao;
        this.veletrico = veletrico;
        this.alarme = alarme;
        this.tipo = tipo;
        this.combustivel = combustivel;
        this.cambioauto = cambioauto;
        this.multimidia = multimidia;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public boolean isVeletrico() {
        return veletrico;
    }

    public void setVeletrico(boolean veletrico) {
        this.veletrico = veletrico;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public boolean isCambioauto() {
        return cambioauto;
    }

    public void setCambioauto(boolean cambioauto) {
        this.cambioauto = cambioauto;
    }

    public boolean isMultimidia() {
        return multimidia;
    }

    public void setMultimidia(boolean multimidia) {
        this.multimidia = multimidia;
    }       
}
