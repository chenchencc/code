package com.jason.sort;

public class Sort {

    /**
     * 冒泡
     */
    public void bubble(){
        int[] a = new int[]{2,6,2,8,74};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }

    /**
     * 选择
     * /**
     * 选择排序的思想：遍历第一轮时找出最小的数字并与第一个位置的数字进行交换，然后遍历第二次找出最小的元素与第二个位置的元素进行交换，依次这样下去
     */
    public void select(){
        int[] a = new int[]{2,6,2,8,74};
        for(int i=0;i<a.length;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            int t = a[i];
            a[i] = a[min];
            a[min] = t;
        }
    }

    /**
     * 插入排序
     */
    public void insert(){
        int[] arr = new int[]{2,6,2,8,74};
        if(arr!=null){
            for(int i=1;i<arr.length;i++){
                int temp = arr[i];
                int j=0;
                for(j=i;j>0&&arr[j-1]>temp;j--){
                    arr[j] = arr[j-1];
                }
                arr[j] = temp;
            }



        }
    }

    /**
     * 插入排序将右边的元素与左边的比较，然后交换  左边有序，右边无序
     */
    public static void insert(int[] a){
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0&&a[j]<a[j-1];j--){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }
    }

    /**
     * 希尔排序
     */
    public void shell(){
        int[] a = new int[]{2,6,2,8,74};
        int h = 1;
        while(h<a.length/3)
            h = 3*h+1;
        while(h>=1){
            for(int i=h;i<a.length;i++){
                for(int j=i;j>=h&&a[j]>a[j-h];j-=h){
                    int t = a[j];
                    a[j] = a[j-h];
                    a[j-h] = t;
                }
            }
            h = h/3;
        }
    }

    /**
     * 快速排序
     * @param a
     * @param left
     * @param right
     */
    public void quicksort(int[] a,int left,int right) {
        int i, j, t, temp;
        if (left > right)
            return;
        temp = a[left]; //temp中存的就是基准数
        i = left;
        j = right;
        while (i != j) {//顺序很重要,要先从右往左找
            while (a[j] >= temp && i < j)
                j--;//再从左往右找
            while (a[i] <= temp && i < j)
                i++;//交换两个数在数组中的位置
            if (i < j)//当哨兵i和哨兵j没有相遇时
            {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }//最终将基准数归位
        a[left] = a[i];
        a[i] = temp;
        quicksort(a, left, i - 1);//继续处理左边的,这里是一个递归的过程
        quicksort(a, i + 1, right);//继续处理右边的,这里是一个递归的过程
    }

    /**
     * 归并排序
     */
    public void sort(int[] a,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            sort(a,low,mid);
            sort(a,mid+1,high);
            //左右归并
            merge(a,low,mid,high);
        }
    }

    private void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i= low;
        int j = mid+1;
        int k=0;
        // 把较小的数先移到新数组中
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while(i<=mid){
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while(j<=high){
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for(int x=0;x<temp.length;x++){
            a[x+low] = temp[x];
        }
    }
}
