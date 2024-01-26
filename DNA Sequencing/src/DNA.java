//The program  determines whether there is a protein in a strand of DNA.
public class DNA {

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-
        String dna1= "ATGCGATACGCTTGA";
        String dna2= "ATGCGATACGTGA";
        String dna3="ATTAATATGTACTGA";
        String dna= dna1;
        int length= dna.length();
        System.out.println("length :"+ length);
        int start= dna.indexOf("ATG");
        int end = dna.indexOf("TGA");
        System.out.println(start);
        System.out.println(end);
        if (start != -1 &&  end !=-1 && (end-start) % 3 == 0) {
            String protein = dna.substring(start, end);
            System.out.println("Protein:" + protein);
        }
        else
        {
            System.out.println("No Protein");
        }

    }

}