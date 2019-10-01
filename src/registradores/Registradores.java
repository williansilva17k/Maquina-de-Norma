package registradores;
import Registrador.Registrador;
import java.util.Scanner;

/**
*
* @author WILLIAN
*/
public class Registradores {



    public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Registrador r1 = null;
			Registrador r2 = null;
			Registrador r3 = null;
			Registrador r4 = null;

			System.out.println("Quantos registradores deseja usar ?");
			int a, b, c, d, n = sc.nextInt();
			String op;
			System.out.println();

			if (n == 4) {
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();

				System.out.println("Registrador 1:\n");
				for (int i = 0; i <= a; i++) {
					r1 = new Registrador("Registrador 1", 0, i);
					System.out.println(r1);
				}
				System.out.println("\nRegistrador 2:\n");
				for (int i = 0; i <= b; i++) {
					r2 = new Registrador("Registrador 2", 0, i);
					System.out.println(r2);
				}
				System.out.println("\nRegistrador 3:\n");
				for (int i = 0; i <= c; i++) {
					r3 = new Registrador("Registrador 3", 0, i);
					System.out.println(r3);
				}
				System.out.println("\nRegistrador 4:\n");
				for (int i = 0; i <= d; i++) {
					r4 = new Registrador("Registrador 4", 0, i);
					System.out.println(r4);
				}

				System.out.println("\nEntre com a operação do registrador 1,registrador 2,registrador 3 e registrador 4:");
				op = sc.next();
				if (op.equals("r1+r2+r3+r4")) {
					r1.increment(r1, r4);
					r1.increment(r1, r3);
					r1.increment(r1, r2);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1-r2-3-r4")) {
					r1.decrement(r1, r4);
					r1.decrement(r1, r3);
					r1.decrement(r1, r2);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1-r2+r3+r4")) {

					r1.decrement(r1, r2);
					r1.increment(r1, r3);
					r1.increment(r1, r4);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1+r2-r3+r4")) {

					r1.increment(r1, r2);
					r1.decrement(r1, r3);
					r1.increment(r1, r4);

					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1+r2+r3-r4")) {

					r1.increment(r1, r2);
					r1.increment(r1, r3);
					r1.decrement(r1, r4);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1-r2-r3+r4")) {
					r1.decrement(r1, r2);
					r1.decrement(r1, r3);
					r1.increment(r1, r4);

					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1+r2-r3-r4")) {
					r1.increment(r1, r2);
					r1.decrement(r1, r3);
					r1.decrement(r1, r4);

					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1-r2+r3-r4")) {
					r1.decrement(r1, r2);
					r1.increment(r1, r3);
					r1.decrement(r1, r4);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1*r2*r3*r4")) {
					r1.multi(r1, r2);
					r1.multi(r1, r3);
					r1.multi(r1, r4);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				}

			} else if (n == 3) {
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				System.out.println("Registrador 1:\n");
				for (int i = 0; i <= a; i++) {
					r1 = new Registrador("Registrador 1", 0, i);
					System.out.println(r1);
				}
				System.out.println("\nRegistrador 2:\n");
				for (int i = 0; i <= b; i++) {
					r2 = new Registrador("Registrador 2", 0, i);
					System.out.println(r2);
				}
				System.out.println("\nRegistrador 3:\n");
				for (int i = 0; i <= c; i++) {
					r3 = new Registrador("Registrador 3", 0, i);
					System.out.println(r3);
				}

				System.out.println("\nEntre com a operação do registrador 1,registrador 2,registrador 3:");
				op = sc.next();

				if (op.equals("r1+r2+r3")) {
					r1.increment(r1, r2);
					r1.increment(r1, r3);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1-r2-r3")) {
					r1.decrement(r1, r2);
					r1.decrement(r1, r3);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1-r2+r3")) {
					r1.decrement(r1, r2);
					r1.increment(r1, r3);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1+r2-r3")) {
					r1.increment(r1, r2);
					r1.decrement(r1, r3);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1*2*r3")) {
					r1.multi(r1, r2);
					r1.multi(r1, r3);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				}

			} else if (n == 2) {
				a = sc.nextInt();
				b = sc.nextInt();

				System.out.println("Registrador 1:\n");
				for (int i = 0; i <= a; i++) {
					r1 = new Registrador("Registrador 1", 0, i);
					System.out.println(r1);
				}
				System.out.println("\nRegistrador 2:\n");
				for (int i = 0; i <= b; i++) {
					r2 = new Registrador("Registrador 2", 0, i);
					System.out.println(r2);
				}

				System.out.println("\nEntre com a operação do registrador 1,registrador 2,registrador 3:");
				op = sc.next();

				if (op.equals("r1+r2")) {
					r1.increment(r1, r2);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1-r2")) {
					r1.decrement(r1, r2);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				} else if (op.equals("r1*r2")) {
					r1.multi(r1, r2);
					System.out.println("\n\nResultado:");
					System.out.println(r1);
				}

			} else {
				System.out.println("Registradores devem ser maior do que 2 e menor que 4.");
			}

			sc.close();
		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());

		}

	}

}

