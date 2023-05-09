
public class File implements Data {
	private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

	@Override
	public void doubleClick() {
		// TODO Auto-generated method stub
		 System.out.println(this.getName()+" file is Opened in a Program ");
		
	}

}
