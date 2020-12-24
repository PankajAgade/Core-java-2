package q_04;

public class StaffMember 
{
	String MemberName;
	String MemberQualification;
	
	public StaffMember(String memberName, String memberQualification)
	{
		super();
		MemberName = memberName;
		MemberQualification = memberQualification;
	}
	
	void showstaffMemberDetails() 
	{
		System.out.println("Member Name => "+MemberName);
		System.out.println("Member Qualification  => "+MemberQualification);
	}
}
