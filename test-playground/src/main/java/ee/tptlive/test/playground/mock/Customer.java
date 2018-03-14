package ee.tptlive.test.playground.mock;

public class Customer {

    private String name;
    private String email;
    private boolean prefersEmail;

    public Customer(String name, String email, boolean prefersEmail) {
        this.name = name;
        this.email = email;
        this.prefersEmail = prefersEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPrefersEmail() {
        return prefersEmail;
    }

    public void setPrefersEmail(boolean prefersEmail) {
        this.prefersEmail = prefersEmail;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", email=" + email + ", prefersEmail=" + prefersEmail + '}';
    }

}
