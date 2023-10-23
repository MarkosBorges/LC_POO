package model;

import model.Cliente;
import model.ContaPoupanca;

import java.util.HashMap;
import java.util.Map;

public class ClienteContaPoupancaManager {

    private Map<Cliente, ContaPoupanca> relacaoClienteContaPoupanca;
    public ClienteContaPoupancaManager() {
        Map<Cliente, ContaPoupanca> relacaoClienteContaPoupanca = new HashMap<>();
    }

}
