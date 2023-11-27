package ro.siit.Proiect_Valentin_Proca;

public class Costs {
    public static BookFormat format;
    public static PrintType printTypeC;
    public static PrintType printTypeBW;

    public static double getCalculatePrice(BookFormat format, PaperType paperType) {
        double costPerType = 0.00;

        switch (format) {
            case A4:
                switch (paperType) {
                    case G70:
                        costPerType += 0.03;
                        break;
                    case G80:
                        costPerType += 0.04;
                        break;
                    case G70V:
                        costPerType += 0.05;
                        break;
                    case G90DCM:
                        costPerType += 0.06;
                        break;
                }
                break;

            case A5:
                switch (paperType) {
                    case G70:
                        costPerType += 0.01;
                        break;
                    case G80:
                        costPerType += 0.02;
                        break;
                    case G70V:
                        costPerType += 0.03;
                        break;
                    case G90DCM:
                        costPerType += 0.04;
                        break;
                }
                break;

            case B5:
                switch (paperType) {
                    case G70:
                        costPerType += 0.02;
                        break;
                    case G80:
                        costPerType += 0.03;
                        break;
                    case G70V:
                        costPerType += 0.04;
                        break;
                    case G90DCM:
                        costPerType += 0.05;
                        break;
                }

        }

        return costPerType;
    }
//    public static double getPrintPricePerPageBW(PrintType printTypeBW, BookFormat format) {
//        double printPageTypeBW = 0.00;
//
//        switch(printTypeBW) {
//            case BLACK_AND_WHITE:
//                switch (format) {
//                    case A4:
//                        printPageTypeBW += 0.04;
//                        break;
//                    case B5:
//                        printPageTypeBW += 0.03;
//                        break;
//                    case A5:
//                        printPageTypeBW += 0.02;
//                        break;
//                }
//        } return  printPageTypeBW;
//    }
//
//    public static double getPrintPricePerPageC(PrintType printTypeC, BookFormat format) {
//        double printPageTypeC = 0.00;
//        switch (printTypeC) {
//            case COLOR:
//                switch(format) {
//                    case A4:
//                        printPageTypeC += 0.40;
//                        break;
//                    case B5:
//                        printPageTypeC += 0.30;
//                        break;
//                    case A5:
//                        printPageTypeC += 0.20;
//                        break;}
//                }return printPageTypeC;
//
//        }
//    }
    public static double getPrintPricePerPageBW(BookFormat format, PrintType printTypeBW) {
        double printPageTypeBW = 0.00;
        {
            switch (format) {
                case A4:
                    printPageTypeBW += 0.04;
                    break;
                case B5:
                    printPageTypeBW += 0.03;
                    break;
                case A5:
                    printPageTypeBW += 0.02;
                    break;
            }

    }return printPageTypeBW;}
    public static double getPrintPricePerPageC(BookFormat format, PrintType printTypeC) {
        double printPageTypeC = 0;
        {
            switch (format) {
                case A4:
                    printPageTypeC += 0.40;
                    break;
                case B5:
                    printPageTypeC += 0.30;
                    break;
                case A5:
                    printPageTypeC += 0.20;
                    break;
            }
        }
        return printPageTypeC;
    }

    public static double getBasePriceIncreaseCoeficient(BookFormat format, BindingType bindingType) {
        double bindingPrice = 0;
        if(BindingType.CARTONAT == bindingType){
            switch (format){
                case A4:
                    bindingPrice += 9.00;
                    break;
                case B5:
                    bindingPrice += 7.00;
                    break;
                case A5:
                    bindingPrice += 5.00;
                    break;
            }
        }else if (BindingType.BROSAT == bindingType){
            switch (format){
                case A4:
                    bindingPrice += 2.00;
                    break;
                case B5:
                    bindingPrice += 1.50;
                    break;
                case A5:
                    bindingPrice += 1.00;
                    break;
            }
        }
        return bindingPrice;
    }
}