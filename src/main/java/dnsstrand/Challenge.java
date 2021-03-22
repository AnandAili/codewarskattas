package dnsstrand;

class Challenge {

    public static String dnaComplement(String dna) {

       if(dna.isEmpty()) {
           return "";
       }
       StringBuilder otherDNAStrand = new StringBuilder();
       for (int i = 0 ; i < dna.length(); i++) {
           char currentChar = dna.charAt(i);
           otherBase(otherDNAStrand, currentChar);

       }
        return otherDNAStrand.toString();
    }

    private static void otherBase(StringBuilder otherDNAStrand, char currentChar) {
        switch (currentChar) {
            case 'A':
                otherDNAStrand.append("T");
                break;
            case 'T':
                otherDNAStrand.append("A");
                break;
            case 'C':
                otherDNAStrand.append("G");
                break;
            default:
                otherDNAStrand.append("C");

        }
    }
}