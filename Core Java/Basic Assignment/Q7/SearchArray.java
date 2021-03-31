public class SearchArray {
    public boolean searchArray(int[] arr,int toCheckValue){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==toCheckValue){
                return true;
            }
        }
        return false;
    }
}
