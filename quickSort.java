    public static int[] sort(int[] array,int low,int high){
        if (low<high){
            int abslocation=depart(array,low,high);
            sort(array,low,abslocation-1);
            sort(array,abslocation+1,high);
        }
        return array;
    }
    public static int depart(int[] array,int low,int high){
        int container=array[low];
        while (low<high){

            while (low<high&&array[high]>=container){
                high--;
            }
            array[low]=array[high];
            while (low<high&&array[low]<=container){
                low++;
            }
            array[high]=array[low];
        }
        array[low]=container;
        return low;
    }
