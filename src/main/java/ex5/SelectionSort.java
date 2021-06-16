package ex5;

public class SelectionSort {
    int[] array = {23, 53, 934, 34 , 1, 30, 84, 12, 3, 109};

    public void organizar() {
        for (int i = 0; i < this.array.length - 1; i++) {
            int numMin = i;
            for (int x = i + 1; x < this.array.length; x++) {
                if (this.array[x] < this.array[numMin]) {
                    numMin = x;
                }
            }
            int temp = this.array[numMin];
            this.array[numMin] = this.array[i];
            this.array[i] = temp;
        }

    }

    public void printar(){
        for (int i = 0; i < this.array.length; i++){
            System.out.println(this.array[i] + " ");
        }
    }
}
