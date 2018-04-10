package courses.abstractbanking;

import java.util.Date;

public final class Contacts {

    private final String firstName;
    private final String lastName;
    private final String mobileNo;
    private final Date startDate;

    public Contacts(String firstName, String lastName, String mobileNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.startDate = new Date();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public Date getStartDate() {
        return  new Date(startDate.getTime());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + mobileNo + " " + startDate;
    }

}
