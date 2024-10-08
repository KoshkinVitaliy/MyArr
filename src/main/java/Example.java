public class Example {
    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public Example(int length) {
        this.arr = new int[length];
    }

    public void add(int element, int index) {
        try {
            arr[index] = element;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);

            var previousArr = arr;
            var diff = index - (arr.length - 1);
            arr = new int[arr.length + diff];

            for (var i = 0; i < previousArr.length; i++) {
                arr[i] = previousArr[i];
            }

            arr[index] = element;
        }
    }

    public void delete(int index) {
        var previousArr = arr;
        arr = new int[arr.length - 1];


        System.out.println();
        var flag = false;

        for (int k = 0; k < arr.length; k++) {
            if (k == index && k < arr.length - 1) {
                arr[k] = previousArr[k+1];
                flag = true;
            }
            else {
                if (flag) {
                    arr[k] = previousArr[k+1];
                }
                else arr[k] = previousArr[k];
            }
        }
    }

    public void update(int element, int index) {
        try {
            arr[index] = element;
        }
        catch (IndexOutOfBoundsException e) {
            add(element, index);
        }

    }

    public void showArr() {
        for (var element : arr) {
            System.out.print(element + " ");
        }
    }
}
