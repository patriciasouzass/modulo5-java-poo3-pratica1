package javaoop.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private Integer contador;
    private HashMap<Integer, List<Roupa>> guardaRoupa;

    public GuardaRoupa(Integer contador, HashMap<Integer, List<Roupa>> guardaRoupa) {
        this.contador = contador;
        this.guardaRoupa = guardaRoupa;
    }

    public Integer guardaRoupas(List<Roupa> listaDeRoupas){
        ++contador;
        guardaRoupa.put(contador, listaDeRoupas);

        return contador;
    }

    public void mostrarRoupas(){
        for (Map.Entry<Integer, List<Roupa>> roupaEntry: guardaRoupa.entrySet()){
            for (Roupa roupaEntry1 : roupaEntry.getValue()){
                System.out.println("Gaveta >> "+roupaEntry.getKey()+" Marca >> " + roupaEntry1.getMarca());
                System.out.println("Gaveta >> "+roupaEntry.getKey()+" Modelo >> " + roupaEntry1.getModelo());
                System.out.println("-----------------------------------------------------");
            }
        }
    }

    public List<Roupa> devolverRoupas(Integer codigo){
        return guardaRoupa.get(codigo);
    }
}
