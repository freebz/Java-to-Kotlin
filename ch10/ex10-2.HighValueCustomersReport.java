// 예제 10.2 [extensions.0:src/main/java/travelator/marketing/HighValueCustomersReport.java]

public class HighValueCustomersReport {

    public static void generate(Reader reader, Writer writer) throws IOException {
        List<CustomerData> valuableCustomers = new BufferedReader(reader).lines()
            .skip(1) // header
            .map(line -> customerDataFrom(line))
            .filter(customerData -> customerData.score >= 10)
            .sorted(comparing(customerData -> customerData.score))
            .collect(toList());

        writer.append("ID\tName\tSpend\n");
        for (var customerData: valuableCustomers) {
            writer.append(lineFor(customerData)).append("\n");
        }
        writer.append(summaryFor(valuableCustomers));
    }

    private static String summaryFor(List<CustomerData> valuableCustomers) {
        var total = valuableCustomers.stream()
            .mapToDouble(customerData -> customerData.spend)
            .sum();
        return "\tTOTAL\t" + formatMoney(total);
    }

    static CustomerData customerDataFrom(String line) {
        var parts = line.split("\t");
        double spend = parts.length == 4 ? 0 :
            Double.parseDouble(parts[4]);
        return new CustomerData(
            parts[0],
            parts[1],
            parts[2],
            Integer.parseInt(parts[3]),
            spend
        );
    }

    private static String lineFor(CustomerData customer) {
        return customer.id + "\t" + marketingNameFor(customer) + "\t" +
                formatMoney(customer.spend);
    }

    private static String formatMoney(double moeny) {
        return String.format("%#.2f", money);
    }

    private static String marketingNameFor(CustomerData customer) {
        return customer.familyName.toUpperCase() + ", " + customer.givenName;
    }
}