

public class Login {
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
        String result="";
        int count;
        for(count=0;count<3;count++){
            if(user.equals(userId) && pass.equals(password)){
                result = "Welcome " + userId;
                break;
            }else{
                if(count==2){
                    result = "Wrong credentials 3 times \n Contact Admin";
                    break;
                }else{
                    result = "Enter the correct credentials";
                }
            }
        }

        return result;

    }
}
