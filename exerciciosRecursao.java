
import java.util.ArrayList;

public class exerciciosRecursao {
    public static void main(String[] args) {
        System.out.println(nroDigit(20));
    }

    // Calcule o fatorial de um número n passado como parâmetro
    public static int fatorial(int n) { // Assinatura
        // Caso base
        if (n == 1)
            return 1;
        // Caso erro
        if (n <= 0)
            throw new IllegalArgumentException("Número inválido");
        // Caso recurso
        return n * fatorial(n - 1);
    }

    // Calcule o somatório de um número n até 0.
    public static int somatorio(int n) {
        // Caso base
        if (n == 0)
            return n;
        // Caso recurso
        return n + somatorio(n - 1);
    }

    // Calcule o n-ésimo número da sequência de fibonacci
    public static int fibonacci(int n) {
        // Casos base
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        // Caso recurso
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Calcule o somatório dos número inteiros entre os números k e j, passados como
    // parâmetro.
    public static int somatorioKJ(int k, int j) {
        // Caso base
        if (k == j)
            return j;
        // Casos recurso
        if (k < j)
            return k + somatorioKJ(k + 1, j);
        return somatorioKJ(j, k);
    }

    // Recebe um string e retorna true se este string for um palíndrome, false caso
    // contrário
    public static boolean isPal(String s) {
        // Casos base
        if (s.length() == 0)
            return false;
        if (s.length() <= 1)
            return true;

        char init = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        if (last != init)
            return false;

        // Casos recurso
        return isPal(s.substring(1, s.length() - 1));
        // Recursão com a substring excluindo o primeiro e o último caracteres
    }

    // Modele e implemente um método recursivo que recebe um inteiro zero ou
    // positivo e retorna um String com o número em binário.
    public static String convBase2(int n) {
        // Casos bases
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        // Caso recurso
        if (n % 2 == 0) {
            return convBase2(n / 2) + "0";
        }
        return convBase2(n / 2) + "1";
    }

    // Modele e implemente um método recursivo que calcule o somatório dos números
    // contidos em um ArrayList de inteiros, passado como parâmetro
    public static int somatorioArray(ArrayList<Integer> n) {
        // Caso recurso
        return somatorioArrayAux(n, 0);
    }

    private static int somatorioArrayAux(ArrayList<Integer> n, int index) {
        // Casos base
        if (n.isEmpty()) {
            return 0;
        }
        if (index == n.size() - 1) {
            return n.get(index);
        }
        // Caso recurso
        return n.get(index) + somatorioArrayAux(n, index + 1);
    }

    // Modele e implemente um método recursivo para encontrar o maior elemento de um
    // ArrayList.
    public static int findBiggest(ArrayList<Integer> ar) {
        // Casos base
        if (ar.isEmpty()) {
            return 0;
        }
        // Caso recurso
        return findBiggestAux(ar, 0, ar.get(0));
    }

    private static int findBiggestAux(ArrayList<Integer> ar, int index, int maior) {
        // Caso base
        if (index == ar.size()) {
            return maior;
        }
        // Casos recurso
        if (ar.get(index) > maior) {
            return findBiggestAux(ar, index + 1, ar.get(index));
        }
        return findBiggestAux(ar, index + 1, maior);
    }

    // Implemente um método recursivo para determinar se um string ocorre dentro de
    // outro.
    public static boolean findSubStr(String str, String match) {
        // Casos base
        if (str.length() < match.length()) {
            return false;
        }
        if (match.length() == 0) {
            return true;
        }
        // Casos recurso
        if (str.charAt(0) == match.charAt(0)) {
            return findSubStrAux(str.substring(1), match.substring(1));
        }
        return findSubStr(str.substring(1), match);
    }

    private static boolean findSubStrAux(String str, String match) {
        // Casos base
        if (match.length() == 0) {
            return true;
        }
        // Casos recurso
        if (str.charAt(0) == match.charAt(0)) {
            return findSubStr(str.substring(1), match.substring(1));
        }
        return false;
    }

    // Faça um método recursivo que determina o número de dígitos de um inteiro.
    public static int nroDigit(int n) {
        // Caso base
        if (n < 10) {
            return 1;
        }
        // Caso recurso
        return 1 + nroDigit((n / 10));
    }
}