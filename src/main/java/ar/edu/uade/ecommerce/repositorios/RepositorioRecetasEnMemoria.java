package ar.edu.uade.ecommerce.repositorios;



import ar.edu.uade.ecommerce.modelo.Receta;
import org.springframework.stereotype.Repository;


import java.util.LinkedList;
import java.util.List;

@Repository
public class RepositorioRecetasEnMemoria {
    private List<Receta> recetas;

    public RepositorioRecetasEnMemoria() {
        this.recetas = new LinkedList<>();

        Receta sopaCebolla = new Receta();

        sopaCebolla.setNombre("Sopa de cebollas gratinadas");
        sopaCebolla.setId(1);
        sopaCebolla.setImagen("/public/onionSoup.jpg");
        sopaCebolla.setDescripcion("Deliciosa receta facil de preparar en casa");

        recetas.add(sopaCebolla);

        Receta risotto = new Receta();

        risotto.setNombre("risotto");
        risotto.setId(1);
        risotto.setImagen("/public/onionSoup.jpg");
        risotto.setDescripcion("Risotto facil de preparar en casa");

        recetas.add(risotto);

    }

    public List<Receta> obtenerTodos() {

        return recetas;
    }

    public void guardar(Receta receta) {

        recetas.add(receta);
    }


}
