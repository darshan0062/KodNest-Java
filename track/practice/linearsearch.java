class linearsearch{
    public static void main(String[] args){
        int[] a = {10,20,30,40,50};
        int search = 400;
        boolean found = false;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                found = true;
                System.out.println("Found   "+i);
                break;
            }
        }
        
        if(!found){
            
            System.out.println("Not Found"+ found);
        }
        
    }
}