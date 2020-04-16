package addressbook;
//address class

public class Address {

    public Address() {
    }
    private String ID;
    private String Name;
    private String Street;
    private String City;
    private String Gender;
    private String ZIP;
    
    
	public Address(String ID,String Name,String Street,String City,String Gender,String Zip) {
		this.Name=Name;
		this.ID=ID;
		this.Street=Street;
		this.City=City;
		this.Gender=Gender;
		this.ZIP=Zip;
	}

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getStreet() {
        return Street;
    }

    public String getCity() {
        return City;
    }

    public String getGender() {
        return Gender;
    }

    public String getZIP() {
        return ZIP;
    }

    public int setID(String id) {
    	if(id.length()>4) {
			return 1;
		}else {
		ID = id;
		return 0;
		}
    }

    public int setName(String name) {
    	if(name.length()>32) {
			return 1;	
		}
		else {
			
			Name = name;
			return 0;
		}
    }

    public int setStreet(String Street) {
    	if(Street.length()>32) {
			return 1;
		}else {
		this.Street = Street;
		return 0;
		}
    }

    public int setCity(String City) {
    	if(City.length()>20) {
			return 1;
		}else {
		this.City= City;
		return 0;
		}
    }

    public int setGender(String Gender) {
    	if(Gender.length()>2) {
			return 1;
		}else {
		this.Gender = Gender;
		return 0;
		}
    }

    public int setZIP(String ZIP) {
    	if(ZIP.length()>5) {
			return 1;
		}else {
		this.ZIP=ZIP;
		return 0;
		}
    }

    @Override
    public String toString() {
        return this.ID+","+this.Name+","+this.Street+","+this.City+","+this.Gender+","+this.ZIP+",";
    }
    
}
