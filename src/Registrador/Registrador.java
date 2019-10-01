package Registrador;

/**
*
* @author WILLIAN
*/

public class Registrador {
	private String nome;
	private Integer operador;
	private Integer numero;

	public Registrador(String nome, Integer operador, Integer numero) {
		this.nome = nome;
		this.operador = operador;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getOperador() {
		return operador;
	}

	public void setOperador(Integer operador) {
		this.operador = operador;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Boolean eZero2(int a) {

		if (a == 0) {
			return false;
		} else {
			return true;
		}

	}

	public Boolean eZero(Registrador a) {

		if (a.getNumero() == 0) {
			return false;
		} else {
			return true;
		}

	}

	public Registrador increment(Registrador a, Registrador b) {
		int n1, n2;
		n1 = a.getNumero();
		n2 = b.getNumero();
		while (eZero(b)) {
			n1++;
			n2--;
			a.setNumero(n1);
			b.setNumero(n2);
			System.out.printf(
					"\n%s [operador =" + " %d" + ", numero =" + " %d" + "]" + "  " + "%s [operador =" + " %d" + ", numero ="
							+ " %d" + "]",
					a.getNome(), a.getOperador(), a.getNumero(), b.getNome(), b.getOperador(), b.getNumero());
		}

		return a;
	}

	public Registrador decrement(Registrador a, Registrador b) {
		int n1, n2;
		n1 = a.getNumero();
		n2 = b.getNumero();
		while (eZero(b)) {
			n1--;
			n2--;
			if (n1 >= 0) {
				a.setNumero(n1);
			} else if (n1 < 0) {
				a.setNumero(n1);
				a.setOperador(1);
			}
			b.setNumero(n2);

			System.out.printf(
					"\n%s [operador =" + " %d" + ", numero =" + " %d" + "]" + "  " + "%s [operador =" + " %d" + ", numero ="
							+ " %d" + "]",
					a.getNome(), a.getOperador(), a.getNumero(), b.getNome(), b.getOperador(), b.getNumero());
		}

		return a;
	}

	public Registrador multi(Registrador a, Registrador b) {
		int n1, n2, aux, aux2, i = 1, j = 0;
		n1 = a.getNumero();
		n2 = b.getNumero();
		aux = n1;
		aux2 = n2;

		while (i < n2) {
			while (j < n1) {
				aux++;
				aux2--;
				j++;
				a.setNumero(aux);
				b.setNumero(aux2);
				System.out.printf(
						"\n%s [operador =" + " %d" + ", numero =" + " %d" + "]" + "  " + "%s [operador =" + " %d"
								+ ", numero =" + " %d" + "]",
						a.getNome(), a.getOperador(), a.getNumero(), b.getNome(), b.getOperador(), b.getNumero());
			}
			aux2 = n2;
			j = 0;
			i++;
		}
		return a;
	}

	@Override
	public String toString() {
		return String.format("%s [operador =" + " %d" + ", numero =" + " %d" + "]", nome, operador, numero);
	}

}