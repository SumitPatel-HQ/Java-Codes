class Tester {

    public static double[] findDetails(double[] salary) {
        if (salary == null || salary.length == 0) {
            // Handle edge case where the input array is null or empty
            return new double[] { 0.0, 0.0, 0.0 };
        }

        // Calculate the average salary
        double total = 0.0;
        for (double s : salary) {
            total += s;
        }
        double average = total / salary.length;

        // Count the number of salaries greater and lesser than the average
        int greaterCount = 0;
        int lesserCount = 0;
        for (double s : salary) {
            if (s > average) {
                greaterCount++;
            } else if (s < average) {
                lesserCount++;
            }
        }

        // Create the result array and populate it with the calculated values
        double[] result = new double[3];
        result[0] = average;
        result[1] = greaterCount;
        result[2] = lesserCount;

        return result;
    }

    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: " + details[0]);
        System.out.println("Number of salaries greater than the average salary: " + details[1]);
        System.out.println("Number of salaries lesser than the average salary: " + details[2]);
    }
}
