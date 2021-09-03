package uke34;

public class Min_Value {
    public static void main(String[] args) {

        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 20, 18, 9, 2, 7, 19};

        int min_index = min(a);
        System.out.println(min_index);
        System.out.println(a[min_index]);

    }

    static int min(int[] a) {
        //initialiserer med førtste element.
        int min_value = a[0];
        int min_index = 0;

        for(int i = 1; i<a.length; i++){
            int value = a[i];
            int index = i;

            //sjekk om verdien er mindre enn den vi har sett tidligere.
            if (value < min_value){
                min_value = value;
                min_index = index;

            }
        }

        //returnerer indexen til den minste verdien. 
        return min_index;
    }

}
