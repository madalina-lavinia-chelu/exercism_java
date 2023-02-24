package RnaTranscription;

public class RnaTranscription {
    String transcribe(String dnaStrand) {
        String replacement  = dnaStrand
                .replace("G", "1")
                .replace("C", "2")
                .replace("T", "3")
                .replace("A", "4").toString();
        return replacement.replace("1", "C")
                .replace("2", "G")
                .replace("3", "A")
                .replace("4", "U").toString();
    }
}
