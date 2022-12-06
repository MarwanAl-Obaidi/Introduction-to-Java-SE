public class Concatenation {
    public static void main(String[] args) {
		int first = 1, second = 2, third = 7;
		String fourth = "9", fifth = "5";
        
        System.out.println(first + fourth + (second + third) + fifth
             + ":Finland was the world champion in ice hockey.");

        System.out.println(first + "" + (first + third) + (first - 1) + fourth
             + ": Finland went under Russian rule.");   
                       
        System.out.println(first + fifth + fifth + (first - 1)
             + ": Helsinki was founded.");
    }
}