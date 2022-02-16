import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.function.Predicate;
public class AssignmentQ4 {
	
	public String name;
	public static  ArrayList<String> removeOddLength(ArrayList<String> employeeList)
	{
		ArrayList<String> employeeList_filtered = employeeList.stream()
				.filter(p->p.length()%2==0)
				.collect(Collectors.toCollection(ArrayList::new));
		return employeeList_filtered;
	}

	public static void main(String[] args)
	{
		ArrayList<String> employeeList = new ArrayList<String>();
		employeeList.add("Pavan kumar");
		employeeList.add("upendra");
		employeeList.add("amit");
		employeeList.add("onkar");
		ArrayList<String> employeeList2=removeOddLength(employeeList);
		for(String a: employeeList2 )
		{
			System.out.println(a);
		}

	}

}
