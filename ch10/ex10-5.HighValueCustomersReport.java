// 예제 10.5 [extensions.1:src/main/java/travelator/marketing/HighValueCustomersReport.java]

private static String lineFor(CustomerData customer) {
    return customer.getId() + "\t" + marketingNameFor(customer) + "\t" +
            formatMoney(customer.getSpend());
}