//Search in Rotated Sorted Array
class Solution {
	public int search(int[] nums, int target) {
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==target)
			{
				return(i);
			}
		}
		return(-1);
    }
	public static void main(String args[])
	{
		int a[]=new int[]{0,1,2,4,5,6,7};
		int p_index=3,s;
		int target=0;
		for(int i=0;i<p_index;i++)
		{
			s=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=s;
		}
		Solution obj=new Solution();
		System.out.println(obj.search(a,target));
	}
}
