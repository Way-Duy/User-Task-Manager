package com.company;
public class Member 
{
    private String username, password; //immutable
    Member(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername() 
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public boolean testPassword(String attempt)
    {
        if (attempt == password)
            return true;
        return false;
    }
    public void changeUsername(String username)
    {

      this.username = username;
    }
    public void changePassword(String password)
    {

      this.password = password;
      
      }    
}
