public class PasswordValidator {
    public static String changePassword(String username, String oldPassword, String newPassword) {

        boolean isValid = validatePassword(username, oldPassword, newPassword);
        if(isValid){
            System.out.println("Changed your password!");
            return newPassword;
        }
        else{
            //can ask if you want to retry with a new input
            System.out.println("Invalid password.");
            System.out.println("""
                - Password must be:
                - at least 8 char long
                - at least 1 uppercase
                - at least 1 special char
                - different from username
                - different from old password
                    """);
            return oldPassword;
        }
    }

    private static boolean validatePassword(String username, String oldPass, String newPass) {
        /* 
         * at least 8 char long
         * at least 1 uppercase
         * at least 1 special char
         * does not contain username
         * not the same as old password
         */
        if( newPass.length() >= 8 && hasUppercase(newPass) && hasSpecialChar(newPass) && !(newPass.equals(oldPass)) && !(newPass.equals(username)) ){
            return true;
        }
        else{
            return false;
        }
    }

    private static boolean hasUppercase(String password){
        char[] passArr = password.toCharArray();
        for(int i = 0; i < passArr.length ; i++){
            if(Character.isUpperCase(passArr[i])){
                //found uppercase character
                return true;
            }
        }
        //did not find an uppercase character
        return false;

    }

    private static boolean hasSpecialChar(String password){
        char[] passArr = password.toCharArray();
        for(int i = 0; i < passArr.length ; i++){
            if(Character.isLetter(passArr[i])){
                //found special character
                return true;
            }
        }
        //did not find a special character
        return false;
    }

}
