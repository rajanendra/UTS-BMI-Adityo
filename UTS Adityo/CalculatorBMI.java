//author @adityo

import java.util.Scanner;

public class CalculatorBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input berat badan
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();

        // input tinggi badan dalam centimeter
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiBadanCm = scanner.nextDouble();

        // Mengonversi tinggi badan dari cm ke m
        double tinggiBadanM = tinggiBadanCm / 100;

        // Menghitung BMI
        double bmi = beratBadan / (tinggiBadanM * tinggiBadanM);

        // Menampilkan hasil BMI
        System.out.printf("BMI Anda adalah: %.2f%n", bmi);
        System.out.println("Kategori berat badan Anda: " + kategoriBMI(bmi));

        scanner.close();
    }

    // Fungsi menentukan kategori BMI
    public static String kategoriBMI(double bmi) {
        if (bmi < 18.5) {
            return "Kekurangan berat badan";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Berat badan normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Kelebihan berat badan";
        } else {
            return "Kegemukan (Obesitas)";
        }
    }
}