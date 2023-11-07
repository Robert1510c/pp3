import java.time.Year;

public class DrivingLicence {
    private String name;
    private String surname;
    private String adress;
    private String city;
    private String level;
    private int year;

    final int current_year = Year.now().getValue();
    
    public DrivingLicence(String name, String surname, String adress, String city, String level, int year) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.city = city;
        this.level = level;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    public String getLevel() {
        return level;
    }

    public int getYear(){
        return year;
    }

    public void setName(String name) {
        this.name = name.toUpperCase().substring(0,1)+name.toLowerCase().substring(1,name.length());
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setYear(int year) {
        if (year>=1980 && year<=current_year){
            this.year = year;
        }
    }


    public void display() {
        System.out.println("Driving Licence Information:\nname=" + getName() + ",\nsurname=" + getSurname() + ",\nadress=" + getAdress() + ",\ncity=" + getCity() + ",\nlevel="
                + getLevel() + "]");
    }

    @Override
    public String toString() {
        return "DrivingLicence [name=" + name + ", surname=" + surname + ", adress=" + adress + ", city=" + city + ", level="
                + level + "]";
    }

    
    

    
}
