
package closestpair;

public class Puntoxy implements Comp<Punto> {

   private static class Punto {

        private int x;
        private int y;
      
      /**
 * Genera un punto, con las coordenadas x e y proporcionadas.<p>
 * Estas coordenadas son enteras y no pueden ser modificadas <p>.
 * Entradas: y x y un entero y <p>
 * Salidas: Un objeto punto con las coordenadas especificadas.
 * @param x Un entero
 * @param y Otro entero
 * */

        Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
      public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    /**
     * Esta implementación no comparable impide la existencia de dos puntos con el mismo valor x
     * */
    public int compareTo(Punto o) {
        return this.x - o.x
}
