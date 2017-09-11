import java.util.HashMap;
import java.util.Map;

class RnaTranscription {
  private static Map <String, String> complements;
  private String rna = "";

  static {
    complements = new HashMap<String, String>();
    complements.put("A", "U");
    complements.put("T", "A");
    complements.put("C", "G");
    complements.put("G", "C");
  }

    String transcribe(String dnaStrand) {
          String[] nucleotides = dnaStrand.split("");
         for (String nucleotide: nucleotides) {
           rna += complements.get(nucleotide);
           if (rna.equals(null)) {
               throw new IllegalArgumentException("Invalid input");
           }
          }
          return rna;
        }
}
