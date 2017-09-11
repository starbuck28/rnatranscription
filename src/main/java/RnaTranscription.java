import java.util.HashMap;
import java.util.Map;

class RnaTranscription {
  private Map <String, String> complements;
  private String rna = "";

  public RnaTranscription() {
    complements = new HashMap<String, String>();
    complements.put("A", "U");
    complements.put("T", "A");
    complements.put("C", "G");
    complements.put("G", "C");
  }

    String transcribe(String dnaStrand) {
          String[] nucleotides = dnaStrand.split("");
         for (String nucleotide: nucleotides) {
            if (!complements.containsKey(nucleotide)) {
                throw new IllegalArgumentException("Invalid input");
            } else {
              rna += complements.get(nucleotide);
            }
           }
        return rna;
      }
}
