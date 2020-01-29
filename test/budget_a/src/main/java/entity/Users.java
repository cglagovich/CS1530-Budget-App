package entity;


@Table(name = "users")
public class Users
{
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String password;
	private String email;
	private String userName;
	
	
	public String getpassword() 
	{
		return password;
	}
	public void setpassword(String password) 
	{
		this.password = password;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return userName;
	}
	public void setName(String name) 
	{
		this.userName = name;
	}
	public String getEmail()
	{
        return this.email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
}