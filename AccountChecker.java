/*  ================ AccountChecker ===================
 *  =  =
 *  =  = 
 *  ===============================================
 */

//package
package accountchecker;
/**
 *
 * @author Hoda
 */

//Class
public class AccountChecker {
    public AccountChecker (String email, String password)
    {StringTokenizer St = new StringTokenizer (email,"@");
      String Token1 = St.nextToken();
      Character Firstchar = email.charAt (0);
      
      if(email.endsWith("@helwan.edu.eg")&&Character.isLetter(FirstChar)&&token1.Length()<12)
          {System.out.println("Email is valid");
              int counter=0; lower=0; upper=0; digit=0;
              Char []arr= password.toCharArray();
              for (int i=0; i<password.length(); i++)
              { if(character.isLetter(arr[i]))
                  counter++;
                if (character.isLowerCase(arr[i]))
                  lower++;
                if (character.isUpperCase(arr[i]))
                  upper++;
                if (character.isDigit(arr[i]))
                  digit++;
              }
              if (counter>5&&lower>0&&upper>0&&digit>0
                      {System.out.println("Account is successfully created");
                      }
              else 
                  System.out.println("Not valid");
          }
      else 
      System.out.println("Not valid");
    }
}
          }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
