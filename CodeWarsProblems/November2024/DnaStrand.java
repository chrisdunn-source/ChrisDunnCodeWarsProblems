public class DnaStrand {
    
    // This method takes a DNA string as input and returns its complementary DNA string.
    public static String makeComplement(String dna) {
        // Create a new StringBuilder to build the complementary DNA strand.
        StringBuilder complement = new StringBuilder();
        
        // Loop through each character (nucleotide) in the input DNA string.
        for (char nucleotide : dna.toCharArray()) {
            // Check which nucleotide we have and append the corresponding complement.
            switch (nucleotide) {
                case 'A': // If the nucleotide is 'A'
                    complement.append('T'); // Add 'T' to the complement
                    break; // Stop checking other cases
                case 'T': // If the nucleotide is 'T'
                    complement.append('A'); // Add 'A' to the complement
                    break; // Stop checking other cases
                case 'C': // If the nucleotide is 'C'
                    complement.append('G'); // Add 'G' to the complement
                    break; // Stop checking other cases
                case 'G': // If the nucleotide is 'G'
                    complement.append('C'); // Add 'C' to the complement
                    break; // Stop checking other cases
            }
        }
        
        // Convert the StringBuilder to a String and return the complementary DNA strand.
        return complement.toString();
    }

    // The main method is where the program starts running.
    public static void main(String[] args) {
        // Test the makeComplement method with some example DNA strings.
        System.out.println(makeComplement("ATTGC")); // This should print: TAACG
        System.out.println(makeComplement("GTAT"));  // This should print: CATA
    }
}
