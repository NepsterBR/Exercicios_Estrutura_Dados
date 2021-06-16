package ex6;

public class BubbleSort {
    int[] array = {23, 53, 934, 34 , 1, 30, 84, 12, 3, 109};

    public void organizar(){
        for (int i = 0; i < this.array.length - 1; i++){
            for (int x = 0; x < this.array.length - i - 1; x++) {
                if (this.array[x] > this.array[x+1]) {
                    int temp = this.array[x];
                    this.array[x] = this.array[x+1];
                    this.array[x+1] = temp;
                }
            }
        }
    }

    public void printar(){
        for (int i = 0; i < this.array.length; i++){
            System.out.println(this.array[i] + " ");
        }
    }
}
