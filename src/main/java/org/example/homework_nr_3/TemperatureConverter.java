package org.example.homework_nr_3;

 class TemperatureConverter {
     int Celsium;
     int Fahrenheit;

     public TemperatureConverter(int celsium, int fahrenheit) {
         this.Celsium = celsium;
         this.Fahrenheit = fahrenheit;
     }
     public double toCelsium(){
         return (Fahrenheit-32)*5/9;


     }
     public double toFahrenheit(){
         return Celsium*9/5+32;
}



     public static void main(String[] args) {
         TemperatureConverter a = new TemperatureConverter(30, 50);
         double Cel = a.toCelsium();
         double Far = a.toFahrenheit();
         System.out.println("Celsium: " + Cel);
         System.out.println("Far: " + Far);
         }


    }

