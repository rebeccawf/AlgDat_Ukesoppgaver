package uke34;

public class Max_Value {
    public static void main(String[] args) {

        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 20, 18, 9, 2, 7, 19};

        int max_index = max(a);
        System.out.println("Indexen til største verdien er " + max_index);
        System.out.println("Største verdien er : "+a[max_index]);

    }

    static int max(int[] a) {
        //initialiserer med førtste element.
        int max_value = a[0];
        int max_index = 0;

        for(int i = 1; i<a.length; i++){
            int value = a[i];
            int index = i;

            //sjekk om verdien er mindre enn den vi har sett tidligere.
            if (value > max_value){
                max_value = value;
                max_index = index;

            }
        }

        //returnerer indexen til den minste verdien.
        return max_index;
    }



}

