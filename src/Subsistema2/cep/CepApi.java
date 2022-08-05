package Subsistema2.cep;

import Gof.Singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {

        super();
    }

    public static CepApi getInstancia() {

        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Rio de Janeiro";
    }

    public String recuperarEstado(String cep) {
        return "RJ";
    }
}
