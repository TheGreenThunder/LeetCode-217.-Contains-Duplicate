import java.util.HashSet;
import java.util.Set;
class Solution {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> found = new HashSet<Integer>();
		int a;
		for(int i : nums){
			a = found.size();
			found.add(i);
			if(found.size() == a){
				return true;
			}
		}
		return false;
	}
}