package franco;

public class PersonNotAdmittedException extends RuntimeException {

    public PersonNotAdmittedException(String message) {
        super(message);
    }
}
