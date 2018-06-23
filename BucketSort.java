public class BucketSort {

    public static void sort(int[] data, int maxVal) {
        int [] bucket=new int[maxVal+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<data.length; i++) {
            bucket[data[i]]++;
        }

        System.out.println(Arrays.toString(bucket));
        int outPos=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                System.out.println(Arrays.toString(data));
                data[outPos++]=i;
            }
        }
    }

    public static void main(String[] args) {
        int maxVal=10;
        int [] data= {10,8,6,4,2,0};

        System.out.println("Before: " + Arrays.toString(data));
        sort(data,maxVal);
        System.out.println("After:  " + Arrays.toString(data));
        System.out.println(data[0]);
        }
}
