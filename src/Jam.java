
/**
 *
 * @author Hector Guerra
 */
public class Jam {
	private String contents;
	private String date;
	private int capacity;
	private static int numTotalJars, noJam = 0;

        /**
         * 
         * @param contents
         * @param date
         * @param size 
         */
	Jam(String contents, String date, int size) {
		this.contents = contents;
		this.date = date;
		capacity = size;
		numTotalJars++;
	}

    /**
     *
     * @return  Comprova si la Jar esta buida o no.
     */
    public boolean empty() {
		return (capacity == 0);
	}

    /**
     *Imprimeix tota la informacio de la Jar, a mes de informacio relevant al conjunt total de Jars.
     */
    public void print() {
		System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
		System.out.println("El numero total de Jars creats des de l'inici dels temps son: " + Jam.getNumTotalJars());
		System.out.println("El numero de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
	}

    /**
     *
     * @param fluidOz Quantitat de Jam a untar sobre la torrada.
     * Sempre i quan hi hagi Jam al Jar, comprova si la quantitat indicada es menor a la que queda a la Jar.
     * Si es aixi, resta aquesta quantitat a la total, despres de preparar la torrada.
     * Si no, buida la Jar, untant nomes la quantitat disponible.
     */
    public void spread(int fluidOz) {
		if (!empty()) {
			if (fluidOz < capacity) {
				System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
				capacity = capacity - fluidOz;
			} else {
				System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
				capacity = 0;
				noJam++;			}
		} else {
			System.out.println("No jam in the Jar!");
		}
	}

    /**
     *
     * @return retorna el total de Jars preparats desde que s'ha començat a comptar.
     */
    public static int getNumTotalJars() {
		return numTotalJars;
	}

    /**
     *
     * @return retorna la quantitat de Jars que s'han quedat sense Jam.
     */
    public static int getNoJam() {
		return noJam;
	}
}
