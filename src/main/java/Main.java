// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main{
  public static void main(String[] args){
    Calcolatrice calcolatrice = new Calcolatrice();

    int risultatoSomma = calcolatrice.sum(5,3);
    int risultatoSottrazione = calcolatrice.sottrazione(5,3);
    int risultatoMoltiplicazione = calcolatrice.moltiplicazione(5,3);
    int risultatoDivisione = calcolatrice.divisione(5,3);
    int risultatoRimanenza = calcolatrice.rimanenza(5,3);

    System.out.println(risultatoRimanenza);
  }
}



  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
