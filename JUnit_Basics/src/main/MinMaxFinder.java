public class MinMaxFinder 
{
	public int[] findMinMax(int arr[])
	{
		int min=arr[0];
		int max=arr[0];
		int index;
		int MinMax[]= new int[2];
		for (index=0;index<arr.length;index++)
		{
			if (min>arr[index])
			{
				min=arr[index];
			}
			else if (max<arr[index])
			{
				max=arr[index];
			}
		}
		MinMax[0]=min;
		MinMax[1]=max;
		return MinMax;
	}
}
