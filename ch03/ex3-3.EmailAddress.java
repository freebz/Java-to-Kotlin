// 예제 3.3 [classes.1:src/main/java/travelator/EmailAddress.java]

private final String localPart;
private final String domain;

public EmailAddress(String localPart, String domain) {
    this.localPart = localPart;
    this.domain = domain;
}

public String getLocalPart() {
    return localPart;
}

public String getDomain() {
    return domain;
}