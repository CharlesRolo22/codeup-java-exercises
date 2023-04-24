public class ServerNameGenerator {

        private static String[] adjectives = {"interesting", "decisive", "deadpan", "foreign", "cold", "damp",
        "finicky", "weary", "Hamstrung", "hungry"};

        private static String[] nouns = {"phone", "car", "laptop", "mom", "dad", "cup", "jacket", "glasses",
        "soda", "laser"};

        private static String randomElement(String[] strings){
            int randomNumber = (int) (Math.random() * strings.length);
            return strings[randomNumber];
        }
        public static void main(String[] args){
            String adj = randomElement(adjectives);
            String noun = randomElement(nouns);
            System.out.println("Here is your server name: ");
            System.out.println(adj + " - " + noun);

        }
}
