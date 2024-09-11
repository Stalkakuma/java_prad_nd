package lt.techin.praktinis;


import java.util.Arrays;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        int[] arrWithRemovedElement = removeElementAndReturnNewArray(arr, 1);
        System.out.println(Arrays.toString(arrWithRemovedElement));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(removeElementAndReturnNewArray(arr, 5)));
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    // Parašykite metodą, kuris sukuria nustatyto dydžio sveikųjų skaičių masyvą
    // ir užpildo jį atsitiktinai sugeneruotais skaičiais iš nurodyto intervalo.
    public static int[] generateRandomArray(int size, int min, int max) {
        //TODO
        int[] random = new int[size];
        for (int i = 0; i < size; i++) {
            random[i] = getRandomNumber(min, max);
        }
        return random;
    }

    
    //Parašykite metodą, kuris pašalintų masyvo arr[n] k-tąjį elementą (su indeksu k),
    //surašant reikiamus elementus į naują masyvą b[n-1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] removeElementAndReturnNewArray(int[] arr, int k) {
            if (arr == null || arr.length == 0 || k < 0 || k >= arr.length) {
                return null;
            }
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != k) {
                    newArr[j++] = arr[i];
                }
            }
            return newArr;
        }


        //Parašykite metodą, kuris įterptų į masyvą arr[n] prieš k-tąjį elementą reikšmę x,
    //surašant reikiamus elementus į naują masyvą b[n+1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] insertElementAndReturnNewArray(int[] arr, int k, int x) {
        //TODO
        if (arr == null || arr.length == 0 || k < 0 || k >= arr.length) {
            return null;
        }
        int[] newArr = new int[arr.length + 1];
        int temp = arr[k];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != k) {
                newArr[j++] = arr[i];
            }
            else  {
                newArr[j++] = x;
                newArr[j++] = temp;
            }
        }
        return newArr;
    }

    //Parašykite metodą, kuris grąžintų duoto masyvo apverstą kopija.
    public static int[] reverseArray(int[] arr) {
        //TODO
        int [] inverted = new int[arr.length];
        int inversionPoint = arr.length;
        for (int i = 0; i < inverted.length; i++) {
            inverted[inversionPoint-1] = arr[i];
            inversionPoint--;
        }
        return inverted;
    }

    //Parašykite metodą, kuris apverstu duotą masyvą (nekuriant naujo masyvo)
    public static void reverseInPlace(int[] arr) {
        //TODO
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }


}
