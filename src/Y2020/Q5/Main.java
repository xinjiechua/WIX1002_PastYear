package Y2020.Q5;

public class Main {
    public static void main(String[] args) {
        Job j1 = new Job("J1", 252, 20);
        Job j2 = new Job("J2", 108, 10);
        Job j3 = new Job("J3", 72, 25);

        CloudPackage a = new CloudPackage("P2-15", 4, 15, 1.24);
        CloudPackage b = new CloudPackage("P2-30", 6, 30, 2.11);
        CloudPackage c = new CloudPackage("R5-20", 4, 20, 1.38);
        CloudPackage d = new CloudPackage("R6-20", 6, 20, 1.88);

        Job[] joblist = {j1, j2, j3};
        CloudPackage[] pkglist = {a, b, c, d};

        double total = 0;
        for (Job j : joblist) {
            CloudPackage cheap = new CloudPackage("temp", 1, 5, 1000000);
            for (CloudPackage cp : pkglist)
                if (cp.check(j) && cp.totalCost(j) < cheap.totalCost(j))
                    cheap = cp;
            total += cheap.getCost();
            System.out.println(j);
            System.out.println(cheap);
        }
        System.out.printf("Total Cost: %.2f\n",total);
    }
}
