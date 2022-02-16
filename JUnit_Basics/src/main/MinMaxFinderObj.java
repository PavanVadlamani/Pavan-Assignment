import java.util.Objects;

public class MinMaxFinderObj 
{
	public myclass findMinMax2(int arr[])
	{
		myclass m = new myclass();
		int min=arr[0];
		int max=arr[0];
		int index;
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
		m.minimum=min;
		m.maximum=max;
		return m;
	}
	
}

class myclass
{
	int minimum;
	int maximum;
	@Override
	public String toString()
	{
		return "["+this.minimum+","+this.maximum+"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(maximum, minimum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		myclass other = (myclass) obj;
		return maximum == other.maximum && minimum == other.minimum;
	}
	
	
}
