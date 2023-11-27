package ro.siit.Proiect_Valentin_Proca;

import java.util.Scanner;

import static ro.siit.Proiect_Valentin_Proca.Costs.*;

public class BookCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Formatul hartiei
        System.out.println("Selectati formatul cartii (A5, A4, B5):");
        String formatInput = scanner.nextLine();
        BookFormat format = BookFormat.valueOf(formatInput.toUpperCase());

        // Tipul de hartie
        System.out.println("Alegeti tipul de hartie (G70 (70gr offset), G80 (80gr offset), G70V (70gr volumetric), G90DCM (90gr dublu cretat mat):");
        String paperInput = scanner.nextLine();
        PaperType paperType = PaperType.valueOf(paperInput.toUpperCase().replace(" ", "_"));

        // tipul de legare
        System.out.println("Alegeti tipul de legare (cartonat, brosat):");
        String bindingInput = scanner.nextLine();
        BindingType bindingType = BindingType.valueOf(bindingInput.toUpperCase().replace(" ", "_"));

        // Numarul de pagini alb-negru
        System.out.print("Introdu numarul de pagini alb-negru: ");
        int bwPages = scanner.nextInt();

        // Numarul de pagini color
        System.out.print("Introdu numarul de pagini color: ");
        int colorPages = scanner.nextInt();

        int pageNumber = bwPages + colorPages;

        double printTypePrice = getCalculatePrice(format, paperType) * pageNumber;
        double bindingPrice = getBasePriceIncreaseCoeficient(format, bindingType);
        double printPriceBW = getPrintPricePerPageBW(format, printTypeBW) * bwPages;
        double printPriceC = getPrintPricePerPageC(format, printTypeC) * colorPages;

        double totalPrice = printTypePrice + bindingPrice + printPriceBW + printPriceC;
//        System.out.println("Pag An " + bwPages1);
//        System.out.println("Pag Color " + colorPages);
        System.out.println("Pretul cartii este de " + totalPrice + "Ron");
//        System.out.println("Hartie " + printTypePrice);
//        System.out.println("Legare " + bindingPrice);
//        System.out.println("Preti AN " + printPriceBW);
//        System.out.println("Pret C " + printPriceC);

        }
}