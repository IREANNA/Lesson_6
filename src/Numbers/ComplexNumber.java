package Numbers;

import Service.ValidationControl;

public class ComplexNumber implements ValidationControl {
    private double real;
    private double imaginary;


    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if ((this.real == 0) && (this.imaginary == 0)){
            return "0";
        } else
            if ((real == 0) && (imaginary != 0)) {
                return this.imaginary + "i,";
            } else if ((real != 0) && (imaginary == 0)) {
                    return this.real+",";
                } else if (imaginary > 0) {
                        return getReal() + "+" + getImaginary() + "i";
                    } else {
                        return String.format("%1$.2f%2$.2fi",getReal(),getImaginary());
                    }
    }


    @Override
    public void validation(String str){
        String stringReal;
        String stringImaginary;

        if (str.contains("i")) {
            if (str.indexOf("i") != str.length() - 1) {
                if (str.contains("-")) {
                    if (str.lastIndexOf("-") == 0) {
                        stringImaginary = str.substring(0, str.indexOf("i"));
                        stringReal = str.substring(str.indexOf("+"));                        // -bi+a
                    } else {
                        stringImaginary = str.substring(0, str.indexOf("i"));
                        stringReal = str.substring(str.lastIndexOf("-"));                // -bi-a or bi-a
                    }
                } else {
                    stringImaginary = str.substring(0, str.indexOf("i"));
                    stringReal = str.substring(str.indexOf("+"));                            // bi+a
                }
            } else if (str.contains("-")) {
                if (str.lastIndexOf("-") == 0) {
                    stringReal = str.substring(0, str.indexOf("+"));
                    stringImaginary = str.substring(str.indexOf("+"), str.indexOf("i"));     // -a+bi
                } else {
                    stringReal = str.substring(0, str.lastIndexOf("-"));
                    stringImaginary = str.substring(str.lastIndexOf("-"), str.indexOf("i"));   // -a-bi or a-bi
                }
            } else {
                stringReal = str.substring(0, str.indexOf("+"));
                stringImaginary = str.substring(str.indexOf("+"), str.indexOf("i"));        // a+bi
            }
        } else {                                                                            // не комплексное
            stringImaginary = "0";
            stringReal = str;
        }
        try {this.setReal(Double.parseDouble(stringReal));
            this.setImaginary(Double.parseDouble((stringImaginary)));
        }catch (Exception e){
                System.out.println();
                System.out.println("Введено некорректное значение!");
                System.out.println();
        }
    }
}
