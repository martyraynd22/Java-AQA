package Static_and_modify;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    public Company (int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCompanyName() {
        return companyName;
    }

    static void printCompanyName() {
        System.out.println("Имя компании : " + companyName);
    }
}
