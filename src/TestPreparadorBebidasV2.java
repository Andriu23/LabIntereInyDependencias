import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPreparadorBebidasV2 {
    public static void main(String[] args) {
        List<EquipoCocina> listaEquipos = new ArrayList<>(Arrays.asList( new Exprimidor(), new Cafetera(), new Licuadora(), new MaquinaTe()));

        PreparadorBebidasV2 preparador1 = new PreparadorBebidasV2(listaEquipos);
        preparador1.prepararDesayuno();
        preparador1.apagarTodo();
    }


}
