package day34mapsiterators;

public class UsStatesRunner {

    public static void main(String[] args) {

        String arizonaAbbreviation = UsStates.ARIZONA.getAbbreviation();
        System.out.println(arizonaAbbreviation);// AZ

        UsStates arizona = UsStates.ARIZONA;
        System.out.println(arizona);// ARIZONA

    }

}
