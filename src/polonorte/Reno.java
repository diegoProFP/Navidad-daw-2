package polonorte;

/**
 * Esta clase representa un reno de los de SantaClaus, con sus atributos y operativa para volar
 * @author diego
 * @version 1.0
 */
public class Reno {


    private String nombre;
    private int velocidad;

	//Comentario 2
    private int numCuernos;
    private int numCollares;
    
    private String apodo;
   
    //Esto es un comentario de prueba
	public Reno(){

	}

	/**
	 * Crea un reno con la información mínima
	 * @param nombre Nombre del reno
	 * @param numCuernos Número de cuernos
	 * @param numCollares Número de collares
	 */
	public Reno(String nombre, int numCuernos, int numCollares) {
		this.nombre = nombre;
		this.numCuernos = numCuernos;
		this.numCollares = numCollares;
	}

	public String getApodo() {
		return apodo;
	}


	public void setApodo(String apodo) {
		this.apodo = apodo;
	}


	/**
	 *
	 * @param direccion La direccion a la que vuela el reno. Valores posibles: ADELANTE, ATRAS
	 * @return Mensaje que emite el reno al volar
	 */
	public String volar(String direccion){
        System.out.println("Reno.volar. Volando voyyyy");
		System.out.println("I'm Reno Renardo");
		

        return "mmmmmiiiiii chus chus peeeeerrrr";
    }

    
    public void correr(String direccion){
        //TODO terminar
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getNumCuernos() {
		return numCuernos;
	}

	public void setNumCuernos(int numCuernos) {
		this.numCuernos = numCuernos;
	}

	public int getNumCollares() {
		return numCollares;
	}

	public void setNumCollares(int numCollares) {
		this.numCollares = numCollares;
	}

    

}
