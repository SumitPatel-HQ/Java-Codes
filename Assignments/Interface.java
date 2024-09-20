interface Testable {
    boolean testCompatibility();
}
class Mobile {
    private String name, brand, operatingSystemName, operatingSystemVersion;

    public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
        this.name = name;
        this.brand = brand;
        this.operatingSystemName = operatingSystemName;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getOperatingSystemName() { return operatingSystemName; }
    public void setOperatingSystemName(String operatingSystemName) { this.operatingSystemName = operatingSystemName; }
    public String getOperatingSystemVersion() { return operatingSystemVersion; }
    public void setOperatingSystemVersion(String operatingSystemVersion) { this.operatingSystemVersion = operatingSystemVersion; }
}
class SmartPhone extends Mobile implements Testable {
    private String networkGeneration;

    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
        super(name, brand, operatingSystemName, operatingSystemVersion);
        this.networkGeneration = networkGeneration;
    }

    // Getter and Setter
    public String getNetworkGeneration() { return networkGeneration; }
    public void setNetworkGeneration(String networkGeneration) { this.networkGeneration = networkGeneration; }

    @Override
    public boolean testCompatibility() {
        String osName = getOperatingSystemName();
        String osVersion = getOperatingSystemVersion();
        switch (networkGeneration) {
            case "3G":
                return osName.equals("Saturn") && osVersion.equals("1.1");
            case "4G":
                return osName.equals("Saturn") && (osVersion.equals("1.2") || osVersion.equals("1.3"));
            case "5G":
                return osName.equals("Saturn") && osVersion.equals("1.3");
            default:
                return false;
        }
    }
}
class Tester {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
        if (smartPhone.testCompatibility())
            System.out.println("The mobile OS is compatible with the network generation!");
        else
            System.out.println("The mobile OS is not compatible with the network generation!");

        // Create more objects for testing your code
    }
}
