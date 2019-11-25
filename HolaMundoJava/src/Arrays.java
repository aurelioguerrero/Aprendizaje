public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];
        String cities[][] = new String[4][2];
        int [][][] numbers = new int[2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        /*System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);*/

        for (int i = 0;i < androidVersions.length;i++){
            System.out.println(androidVersions[i]);
        }

        for (String androidVersion:androidVersions) {
            System.out.println(androidVersion);
        }

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";

        for (String[] pair:cities) {
            for (String citie:pair) {
                System.out.println(citie);
            }
        }
    }
}
