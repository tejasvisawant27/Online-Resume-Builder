import java.util.Scanner;

class ResumeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Resume Generator!");

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.println("\n[ Education ]");
        System.out.print("Enter your highest degree: ");
        String degree = scanner.nextLine();

        System.out.print("Enter your major: ");
        String major = scanner.nextLine();

        System.out.print("Enter your university: ");
        String university = scanner.nextLine();

        System.out.print("Enter graduation year: ");
        int graduationYear = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.println("\n[ Work Experience ]");
        System.out.print("Enter your job title: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Enter the company name: ");
        String companyName = scanner.nextLine();

        System.out.print("Enter start year: ");
        int startYear = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter end year: ");
        int endYear = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Generate and display the resume
        System.out.println("\n\n================================================");
        System.out.println("                   Resume");
        System.out.println("================================================\n");

        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);

        System.out.println("\n[ Education ]");
        System.out.println("Degree: " + degree);
        System.out.println("Major: " + major);
        System.out.println("University: " + university);
        System.out.println("Graduation Year: " + graduationYear);

        System.out.println("\n[ Work Experience ]");
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company: " + companyName);
        System.out.println("Years: " + startYear + " - " + endYear);

        System.out.println("\n================================================");

        scanner.close();
    }
}
