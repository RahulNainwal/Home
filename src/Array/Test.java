package Array;

class Test 
{
    public static void main(String args[]) 
        {
        int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 6;
        System.out.println(++n);
            n = arr[arr[n] / 2];
        System.out.println(arr[n] / 2);
        } 
}
