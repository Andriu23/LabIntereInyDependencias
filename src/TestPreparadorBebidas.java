public class TestPreparadorBebidas {
    public static void main(String[] args) {
        PreparadorBebidas preparador1 = new PreparadorBebidas(new Cafetera(), new Licuadora());
        preparador1.prepararDesayuno();
        preparador1.apagarTodo();

        System.out.println("-----------------");

        PreparadorBebidas preparador2 = new PreparadorBebidas(new MaquinaTe(), new Exprimidor());
        preparador2.prepararDesayuno();
        preparador2.apagarTodo();

        System.out.println("-----------------");

        PreparadorBebidas preparador3 = new PreparadorBebidas(new Cafetera(), new Cafetera());
        preparador3.prepararDesayuno();
        preparador3.apagarTodo();
    }
}
