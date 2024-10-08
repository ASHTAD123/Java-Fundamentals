public abstract class GoogleLogin {

    public void secureLogin() {
        System.out.println("Google login successful.");
    }

        public abstract void passwordAuthentication();

        public abstract void passwordEncoder();
}
 class MicrosoftLogin extends GoogleLogin{
   
    
    @Override
    public void passwordAuthentication() {
        System.out.println("Microsoft Password Authentication Successful.");
    }

    @Override
    public void passwordEncoder() {
        System.out.println("Microsoft Password Encoder");
    }   

    public static void main(String[] args) {
      
        MicrosoftLogin microsoftLogin = new MicrosoftLogin();
        microsoftLogin.secureLogin();
        microsoftLogin.passwordAuthentication();
        microsoftLogin.passwordEncoder();
    }
 }
    class GithubLogin extends GoogleLogin{
   
    
        @Override
        public void passwordAuthentication() {
            System.out.println("Github Login Password Authentication Successful.");
        }
    
        @Override
        public void passwordEncoder() {
            System.out.println("Github Login  Password Encoder");
        }   
    
        public static void main(String[] args) {
          
            GithubLogin githubLogin = new GithubLogin();
            githubLogin.secureLogin();
            githubLogin.passwordAuthentication();
            githubLogin.passwordEncoder();
        }
}
