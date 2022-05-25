import java.util.HashSet;

public class OpenSource extends Project {

	private String mailingList;

	public OpenSource(Member manager, HashSet<Member> members, String title, double fund) {
		super(manager, members, title, fund);
		// TODO Auto-generated constructor stub
	}

	public String getMailingList() {
		return mailingList;
	}

	public void setMailingList(String mailingList) {
		this.mailingList = mailingList;
	}

	@Override
	public double getRisk() {

		return this.getMembers().size() / this.getFund();
	}
	
}
