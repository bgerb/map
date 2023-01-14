import java.util.ArrayList;

public class Main {
    //A collection of key-value pairs.
    public static void main(String[] args) {
        ArrayList<keypair> mapp = new ArrayList<keypair>();
        keypair first = new keypair("Hi", 5);
        keypair sec = new keypair("Hi", 4);
        keypair th = new keypair("Hi", 3);
        keypair fo = new keypair("Hi", 2);
        keypair fi = new keypair("Hi", 1);
        mapp.add(first);
        mapp.add(sec);
        mapp.add(th);
        mapp.add(fo);
        mapp.add(fi);
        for (int a = 0; a < mapp.size(); a++) {
            System.out.println(mapp.get(a));

        }

    }
}