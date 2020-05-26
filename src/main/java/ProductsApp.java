import java.util.Scanner;

import com.sda.pid.exercise1.service.ProductsService;

public class ProductsApp {

	public static void main(String[] args) {

		ProductsService service = new ProductsService();

		try (Scanner sc = new Scanner(System.in)) {
			int userOption;
			do {

				System.out.println("Welcome do Products Manager");
				System.out.println("Pick an option:");
				System.out.println("(1) Show the name of all bars.");
				System.out.println("(2) Sort bars based on highest protein content.");
				System.out.println("(3) Sort bars based on highest fat content.");
				System.out.println("(4) Filter bars which has less than a defined fiber.");
				System.out.println(
						"(5) Find all protein bars with more than a defined protein value and reviewed by defined user");
				System.out.println("(6) Quit");

				userOption = Integer.parseInt(sc.nextLine());

				switch (userOption) {
				case 1:
					System.out.print("Name ");
					System.out.println("_____________");
					service.retrieveAllBarNames().stream().forEach(barName -> System.out.println(barName));
					break;
				case 2:
					service.sortByProtein().stream().forEach(myBar -> {
						System.out.print("Name \t\t Fett \t Fiber \t Kolhydrat \tProtein \t Energy \n");
						System.out
								.println("___________________________________________________________________________");
						System.out.println(myBar.getSN() + "\t\t  " + myBar.getFett() + "\t  " + myBar.getFiber()
								+ "\t  " + myBar.getKolhydrat() + "\t\t " + myBar.getProtein() + "\t\t "
								+ myBar.getEnergy() + "\n");
						if (myBar.getReview() != null && myBar.getReview().getReviewer() != null) {
							myBar.getReview().getReviewer().forEach(myReview -> {
								System.out.print("Reviewer \t\t Date \t\t Scrore \n");
								System.out.println("_______________________________________________");
								System.out.println(myReview.getPersonID() + "\t\t\t" + myReview.getDate() + "\t    "
										+ myReview.getScore() + "\n");
							});
						} else {
							System.out.println("No reviews");
						}
						System.out.println(
								"----------------------------------------------------------------------------");
					});
					break;
				case 3:
					service.sortByFat().stream().forEach(myBar -> {
						System.out.print("Name \t\t Fett \t Fiber \t Kolhydrat \tProtein \t Energy \n");
						System.out
								.println("___________________________________________________________________________");
						System.out.println(myBar.getSN() + "\t\t  " + myBar.getFett() + "\t  " + myBar.getFiber()
								+ "\t  " + myBar.getKolhydrat() + "\t\t " + myBar.getProtein() + "\t\t "
								+ myBar.getEnergy() + "\n");
						if (myBar.getReview() != null && myBar.getReview().getReviewer() != null) {
							myBar.getReview().getReviewer().forEach(myReview -> {
								System.out.print("Reviewer \t\t Date \t\t Scrore \n");
								System.out.println("_______________________________________________");
								System.out.println(myReview.getPersonID() + "\t\t\t" + myReview.getDate() + "\t    "
										+ myReview.getScore() + "\n");
							});
						} else {
							System.out.println("No reviews");
						}
						System.out.println(
								"----------------------------------------------------------------------------");
					});
					break;
				case 4:
					try {
						System.out.println("Please inform the maximum of fiber content.");
						Double maxFiber = Double.parseDouble(sc.nextLine());
						service.filterByFiber(maxFiber).stream().forEach(myBar -> {
							System.out.print("Name \t\t Fett \t Fiber \t Kolhydrat \tProtein \t Energy \n");
							System.out.println(
									"___________________________________________________________________________");
							System.out.println(myBar.getSN() + "\t\t  " + myBar.getFett() + "\t  " + myBar.getFiber()
									+ "\t  " + myBar.getKolhydrat() + "\t\t " + myBar.getProtein() + "\t\t "
									+ myBar.getEnergy() + "\n");
							if (myBar.getReview() != null && myBar.getReview().getReviewer() != null) {
								myBar.getReview().getReviewer().forEach(myReview -> {
									System.out.print("Reviewer \t\t Date \t\t Scrore \n");
									System.out.println("_______________________________________________");
									System.out.println(myReview.getPersonID() + "\t\t\t" + myReview.getDate() + "\t    "
											+ myReview.getScore() + "\n");
								});
							} else {
								System.out.println("No reviews");
							}
							System.out.println(
									"----------------------------------------------------------------------------");
						});
					} catch (Exception e) {
						System.out.println("Input of the maximum of fiber must be a number. Please, try again.");
					}

					break;
				case 5:
					try {
						System.out.println("Please inform the minimum of protein content.");
						Double minProtein = Double.parseDouble(sc.nextLine());
						System.out.println("Please inform the name of the reviewer.");
						String reviewerFilter =  sc.nextLine();
						service.filterByProteinAndReviewer(minProtein, reviewerFilter).stream().forEach(myBar -> {
							System.out.print("Name \t\t Fett \t Fiber \t Kolhydrat \tProtein \t Energy \n");
							System.out.println(
									"___________________________________________________________________________");
							System.out.println(myBar.getSN() + "\t\t  " + myBar.getFett() + "\t  " + myBar.getFiber()
									+ "\t  " + myBar.getKolhydrat() + "\t\t " + myBar.getProtein() + "\t\t "
									+ myBar.getEnergy() + "\n");
							if (myBar.getReview() != null && myBar.getReview().getReviewer() != null) {
								myBar.getReview().getReviewer().forEach(myReview -> {
									System.out.print("Reviewer \t\t Date \t\t Scrore \n");
									System.out.println("_______________________________________________");
									System.out.println(myReview.getPersonID() + "\t\t\t" + myReview.getDate() + "\t    "
											+ myReview.getScore() + "\n");
								});
							} else {
								System.out.println("No reviews");
							}
							System.out.println(
									"----------------------------------------------------------------------------");
						});
					} catch (Exception e) {
						System.out.println("Input of minimum of protein must be a number. Please, try again.");
					}

					break;

				default:
					// TODO
				}
			} while (userOption != 6);

		} catch (Exception e) {
			System.out.println(e);

		} finally {

			System.out.println("Bye Bye");

		}

	}

}
