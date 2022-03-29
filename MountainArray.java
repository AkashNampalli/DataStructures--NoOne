class Mountain {
    public boolean validMountainArray(int arr[]){
        int index = 0;
        int n = arr.length;
        //walk up
        while(index<n-1){
            if( arr[index] >= arr[index+1]){
                break;
            }
            index++;
        }
        //Base Check
        while(index==n-1 || index == 0){
            return false;
        }
        //walk down
        while(index<n-1){
            if(arr[index] <= arr[index+1]){
                break;
            }
            index++;
        }
        return index == n-1;
    }

}
public class MountainArray{
    public static void main(String[] args) {
        Mountain m = new Mountain();
        int arr1[] = {5,6,2,1};
        boolean result = m.validMountainArray(arr1);
        System.out.println("Mountain Array Result "+result);

        int arr2[] = {3,2,2};
        boolean result1 = m.validMountainArray(arr2);
        System.out.println("Mountain Array Result "+result1);

    }
}

