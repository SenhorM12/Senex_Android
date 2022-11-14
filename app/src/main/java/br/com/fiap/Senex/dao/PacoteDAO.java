package br.com.fiap.senex.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.fiap.senex.model.Pacote;

public class PacoteDAO {

    public List<Pacote> lista() {
        List<Pacote> pacotes = new ArrayList<>(Arrays.asList(
                new Pacote("Rogério", "11:45", "Azitromicina", "2", "a"),
                new Pacote( "Marcos", "14:00", "Rusovas", "1", "a"),
                new Pacote( "Rafael", "21:15", "Dipirona", "3", "a"),
                new Pacote( "Ana Maria", "07:00", "Paracetamol", "1", "a")));
        return pacotes;
    }

}
