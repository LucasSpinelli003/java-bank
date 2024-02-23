import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;

import java.util.GregorianCalendar;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        var cc = new ContaCorrente(123, 12, new GregorianCalendar());

        ContaPoupanca cp = new ContaPoupanca();
    }
}