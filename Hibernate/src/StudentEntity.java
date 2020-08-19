import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class StudentEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Stud_id;
    private String Name,Address,Email,PhoneNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(Stud_id, that.Stud_id) &&
                Objects.equals(Name, that.Name) &&
                Objects.equals(Address, that.Address) &&
                Objects.equals(Email, that.Email) &&
                Objects.equals(PhoneNumber, that.PhoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Stud_id, Name, Address, Email, PhoneNumber);
    }

    public Long getStud_id() {
        return Stud_id;
    }

    public void setStud_id(Long stud_id) {
        Stud_id = stud_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
