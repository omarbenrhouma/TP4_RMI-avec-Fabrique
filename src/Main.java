public class Main {
    public static void main(String[] args) {
        if (args.length == 0 || args[0].equalsIgnoreCase("serveur")) {
            ReverseServer.main(new String[]{});
        } else if (args[0].equalsIgnoreCase("client")) {
            ReverseClient.main(new String[]{});
        } else {
            System.out.println("Usage : java Main serveur|client");
        }
    }
}
