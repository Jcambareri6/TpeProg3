public class MainGreedy {

	public static void main(String args[]) {

		SolucionGreedy Solucion = new SolucionGreedy("datasets/Procesadores.csv", "datasets/Tareas.csv");
        System.out.println(Solucion.AsignarTareasConGreedy(14000));
	    	 
	}
}