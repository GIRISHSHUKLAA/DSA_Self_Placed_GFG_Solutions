class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> li=new ArrayList<>();
        int d=b*b-4*a*c;
        
        if(d>0){
            double sq=Math.sqrt(d);
            if((int)Math.floor((-b+sq)/(2*a))>(int)Math.floor((-b-sq)/(2*a))){
                li.add((int)Math.floor((-b+sq)/(2*a)));
                li.add((int)Math.floor((-b-sq)/(2*a)));
            }
            else{
                li.add((int)Math.floor((-b-sq)/(2*a)));
                li.add((int)Math.floor((-b+sq)/(2*a)));
            }
            
            
        }
        else if(d==0){
           li.add((int)(-b/(2*a)));
            li.add((int)(-b/(2*a)));
            
            
        }
        else{
            li.add(-1);
          
        }
        return li;
    }
}
