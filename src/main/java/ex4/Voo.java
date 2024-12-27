package ex4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;

public abstract class Voo {
    private String origem;
    private String destino;
    private double distancia;
    protected double precoEspecifico;
    protected boolean tipoViagem; //True é Nacional
    private String data;


    private static final HashMap <String, double[]> cidadesCoordenadasIN = new HashMap<>();
    private static final HashMap <String, double[]> cidadesCoordenadasBR = new HashMap<>();

    static {
        cidadesCoordenadasBR.put("São Paulo", new double[]{-23.5505, -46.6333});
        cidadesCoordenadasBR.put("Rio de Janeiro", new double[]{-22.9068, -43.1729});
        cidadesCoordenadasIN.put("Nova York", new double[]{40.7128, -74.0060});
        cidadesCoordenadasIN.put("Londres", new double[]{51.5074, -0.1278});
    }

    public boolean getTipoViagem() {
        setTipoViagem();
        return tipoViagem;
    }

    public void setTipoViagem() {
        this.tipoViagem = cidadesCoordenadasBR.containsKey(origem) && cidadesCoordenadasBR.containsKey(destino);
    }

    public double getPrecoEspecifico() {
        return precoEspecifico;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        if(!cidadesCoordenadasBR.containsKey(origem) && !cidadesCoordenadasIN.containsKey(origem)) {
            throw new IllegalArgumentException("Origem invalido");
        } else if (origem.equalsIgnoreCase((getDestino()))) {
            throw new IllegalArgumentException("distancia 0");
        }
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if(!cidadesCoordenadasBR.containsKey(destino) && !cidadesCoordenadasIN.containsKey(destino)) {
            throw new IllegalArgumentException("Destino invalido");
        }
        else if(destino.equalsIgnoreCase((getOrigem()))){
            throw new IllegalArgumentException("distancia 0");
        }
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia() {

        double[] coordOrigem;
        double[] coordDestino;

        if(cidadesCoordenadasBR.containsKey(origem)){
            coordOrigem = cidadesCoordenadasBR.get(origem);
        }
        else{
            coordOrigem = cidadesCoordenadasIN.get(origem);
        }

        if(cidadesCoordenadasBR.containsKey(destino)){
            coordDestino = cidadesCoordenadasBR.get(destino);
        }
        else{
            coordDestino = cidadesCoordenadasIN.get(destino);
        }


        this.distancia = calcularDistancia(coordOrigem[0], coordOrigem[1], coordDestino[0], coordDestino[1]);
    }

    public double calcularDistancia(double lat1, double lon1, double lat2, double lon2) {
        int raio = 6371;

        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double lat1Rad = Math.toRadians(lat1);
        double lat2Rad = Math.toRadians(lat2);


        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return raio * c;
    }

    public String getData() {
        return data;
    }

    public void setData(String entrada) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate data = LocalDate.parse(entrada, formatter);
            if(data.getYear()< 2025){
                throw new IllegalArgumentException("So temos voo de 2025 em diante");
            }
            this.data = entrada;
        }
        catch (DateTimeParseException e) {
            throw new IllegalArgumentException("formato invalido");
        }
    }

    public boolean confereFormato(String entrada){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate data = LocalDate.parse(entrada, formatter);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public abstract double calcularPreco();

    public void setPrecoEspecifico(){
        if(tipoViagem){
            precoEspecifico = 2;
        }
        else {
            precoEspecifico= 3;
        }
    }
}
