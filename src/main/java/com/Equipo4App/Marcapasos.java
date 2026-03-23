package com.Equipo4App;

public class Marcapasos {
    int idDispositivo;  // 4 bytes
    String codigoFabricante; // Suponiendo 3 digitos = 40 bytes de sobrecarga (cabecera, aprox) + 2(lo que ocupa cada char) * 3 (cant de chars) = 46 bytes
    int latidosPorMinuto; // 4 bytes
    int nivelBateria; // 4 bytes
    private static int contadorInstancias = 0; // 4 bytes
    // Total = 62 bytes

    public Marcapasos(String codigoFabricante, int latidosPorMinuto, int nivelBateria) {
        this.idDispositivo = contadorInstancias;
        this.codigoFabricante = codigoFabricante;
        this.latidosPorMinuto = latidosPorMinuto;
        this.nivelBateria = nivelBateria;
        contadorInstancias++;
    }

    // No tiene setter para idDispositivo ni codigoFabricante porque son constantes para cada objeto
    public void setLatidosPorMinuto(int latidosPorMinuto) {
        this.latidosPorMinuto = latidosPorMinuto;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public String getCodigoFabricante() {
        return codigoFabricante;
    }

    public int getLatidosPorMinuto() {
        return latidosPorMinuto;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }


    public String toString() {
        return "Marcapasos{" +
            "idDispositivo=" + idDispositivo +
            ", codigoFabricante='" + codigoFabricante + '\'' +
            ", latidosPorMinuto=" + latidosPorMinuto +
            ", nivelBateria=" + nivelBateria +
            '}';
    }
}
