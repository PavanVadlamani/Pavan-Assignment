import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class AssignmentQ1 extends contact {

	public static void main(String[] args) {
		contact c1 = new contact(7995978421L,"Venky","venky292@gmail.com",Gender.MALE);
		contact c2 = new contact(8894561233L,"Bokka rao","bokkarao292@gmail.com",Gender.MALE);
		contact c3 = new contact(6305214897L,"Gajala","gajalaFromWashingtonDC@gmail.com",Gender.MALE);
		contact c4 = new contact(9959784123L,"JD chowdary","goppaSiddanthai@gmail.com",Gender.MALE);
		contact c5 = new contact(7995978422L,"Sravani","Sravani@gmail.com",Gender.FEMALE);
		TreeMap<Long,contact> TM = new TreeMap<Long, contact>(Collections.reverseOrder());
		TM.put(c1.Phonenumber, c1);
		TM.put(c2.Phonenumber, c2);
		TM.put(c3.Phonenumber, c3);
		TM.put(c4.Phonenumber, c4);
		TM.put(c5.Phonenumber, c5);
		Set<Map.Entry<Long,contact>> entries= TM.entrySet();
		entries.forEach(entry ->
		{System.out.println(entry.getKey()+":"+entry.getValue());
		});
	}

}
class contact
{
	long Phonenumber;
	String Name;
	String Email;
	enum Gender{
		MALE,
		FEMALE;
	}
	public Gender gender;
	public contact()
	{
		System.out.println("Default constructor");
	}
	public contact(long Phonenumber,String Name,String Email,Gender gender)
	{
		this.Phonenumber=Phonenumber;
		this.Name=Name;
		this.Email=Email;
		this.gender=gender;
	}
	public String toString()
	{
		return "["+this.Name+","+this.Email+","+this.gender+"]";
	}
	
}
