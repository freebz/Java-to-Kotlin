// 예제 11.1 [methods-to-properties.0:src/main/java/travelator/CampSite.java]

public class CampSite {
    private final String id;
    private final String name;
    private final Address address;
    ...

    publilc CampSite(
        String id,
        String name,
        Address address
        ...
    ) {
        this.id = id;
        this.name = name;
        this.address = address;
        ...
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return address.getCountryCode();
    }

    public String region() {
        return address.getRegion();
    }
    ...
}