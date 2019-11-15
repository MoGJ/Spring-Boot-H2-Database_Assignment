package domains;

import org.springframework.stereotype.Component;


/**
 *
 * @author j713n
 */
@Component
public class User {
    private Integer id;
    private String name;
    private String email;

    public User() {
        
    }
    
    public User(int i, String john, String johngmailcom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    
    
}
