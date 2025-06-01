// find the com of any array 
// which we can take the sam element more than one 
// the recursion method is used 
// leetcode problem no :39
class Solution {
    public void comSum(int index,int []can,int t,List<Integer> list,List<List<Integer>>ans){
       if(index == can.length){
         if(t == 0){
            ans.add(new ArrayList<>(list));
            return;
         }else{
            return;
         }
       }
       if(can[index] <= t){
        list.add(can[index]);
        comSum(index ,can,t - can[index],list,ans);
        list.remove(list.size()-1);
       }
       comSum(index+1,can,t,list, ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>> ans  = new ArrayList<>();
     comSum(0,candidates,target,new ArrayList<>(),ans);
     return ans ; 
    }
}
 
