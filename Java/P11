package searching.arrays;


public class SearchingArrays {
    
    public static int[] eliminateDuplicates(int[] oldList){
        
        int countUnique = 0;
        int nullNumber = 0;
        
        for(int i = 0; i < oldList.length; i++){
            if(oldList[i] != nullNumber){
                
                int uniqueNum = oldList[i];
                countUnique++;
                
                for(int j = i+1; j < oldList.length; j++){
                    if(oldList[j] == uniqueNum){
                        oldList[j] = nullNumber;
                    }
                }
            }
        }
        
        int[] newList = new int[countUnique];
        
        int index = 0;
        
        for(int i = 0; i < oldList.length; i++){
            if(oldList[i] != nullNumber){
                newList[index] = oldList[i];
                index++;
            }
        }
        
        return newList;
    }
    
    public static void main(String[] args) {
        
        int[] intList = {2,7,7,5,1,3,1,5,6,1,2,2,4};
        
        for(int i = 0; i < intList.length; i++){
            System.out.print(intList[i]);
        }
        System.out.println();
        
        intList = eliminateDuplicates(intList);
        
        for(int i = 0; i < intList.length; i++){
            System.out.print(intList[i]);
        }
        System.out.println();
    }
    
}
