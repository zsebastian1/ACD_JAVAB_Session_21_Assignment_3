package HibernatePractice;
import java.sql.Date;

public class StudentClient {

	private int STUD_ID;
	private String STUD_NAME;
	private int STUD_MARKS;
	private Date STUD_JOIN_DATE;

	public StudentClient() {
		
	}

	public int getSTUD_ID() {
		return STUD_ID;
	}

	public void setSTUD_ID(int STUD_ID) {
		this.STUD_ID = STUD_ID;
	}

	public String getSTUD_NAME() {
		return STUD_NAME;
	}

	public void setSTUD_NAME(String STUD_NAME) {
		this.STUD_NAME = STUD_NAME;
	}

	public int getSTUD_MARKS() {
		return STUD_MARKS;
	}

	public void setSTUD_MARKS(int STUD_MARKS) {
		this.STUD_MARKS = STUD_MARKS;
	}

	public Date getSTUD_JOIN_DATE() {
		return STUD_JOIN_DATE;
	}

	public void setSTUD_JOIN_DATE(Date STUD_JOIN_DATE) {
		this.STUD_JOIN_DATE = STUD_JOIN_DATE;
	}

	@Override
	public String toString() {
		return "StudentClient [STUD_ID=" + STUD_ID + ", STUD_NAME=" + STUD_NAME + ", STUD_MARKS=" + STUD_MARKS
				+ ", STUD_JOIN_DATE=" + STUD_JOIN_DATE + "]";
	}

}

