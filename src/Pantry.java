
/**
 *
 * @author Hector Guerra
 * Una estanteria on hi caben 3 Jars de Jam.
 */
public class Pantry {
	private Jam jar1;
	private Jam jar2;
	private Jam jar3;
	private Jam selected;

        /**
         * 
         * @param jar1
         * @param jar2
         * @param jar3 
         */
	Pantry(Jam jar1, Jam jar2, Jam jar3) {
		this.jar1 = jar1;
		this.jar2 = jar2;
		this.jar3 = jar3;
		selected = null;
	}

    /**
     *Mostra les dades de cada Jar.
     */
    public void print() {
		System.out.print("1: ");
		jar1.print();
		System.out.print("2: ");
		jar2.print();
		System.out.print("3: ");
		jar3.print();
	}

    /**
     *
     * @param jarNumber selecciona el Jar especificat.
     */
    public void select(int jarNumber) {
		if (jarNumber == 1) {
			selected = jar1;
		} else if (jarNumber == 2) {
			selected = jar2;
		} else {
			selected = jar3;
		}
	}

    /**
     *
     * @param oz unta la quantitat indicada del Jam del Jar seleccionat.
     */
    public void spread(int oz) {
		selected.spread(oz);
	}
}
