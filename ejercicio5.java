class Punto {
    int x;
    int y;

    Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class EjercicioPunto2D {

    public static void moverPunto(Punto p, int despX, int despY) {
        p.x += despX;
        p.y += despY;
        System.out.println("Dentro del método: Nueva posición = (" + p.x + ", " + p.y + ")");
    }

    public static void main(String[] args) {
        Punto miPunto = new Punto(2, 3);
        System.out.println("Antes de mover: Posición = (" + miPunto.x + ", " + miPunto.y + ")");
        
        moverPunto(miPunto, 5, -1);
        
        System.out.println("Después de mover: Posición = (" + miPunto.x + ", " + miPunto.y + ")");
    }
}