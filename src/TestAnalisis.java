public class TestAnalisis {
    public static void main(String[] args) {
//        Verion sin refactor
//        PreparadorBebidas bebida1 = new PreparadorBebidas();
//        bebida1.prepararDesayuno();
//        bebida1.apagarTodo();
//        System.out.println("El preparador esta amarrado a cafetera y licuadora");

        PreparadorBebidas bebida1 = new PreparadorBebidas(new Cafetera(), new Cafetera());
        bebida1.prepararDesayuno();
        bebida1.apagarTodo();

    }
}
