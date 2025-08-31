package permutationvault;

public class Permutationvault {

    public static void main(String[] args) {
        int n = 5;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("The Museum Vault Key " + n + " Unlocks in: " + factorial + " Ways.");
    }
}
