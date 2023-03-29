package ExceptionHandling.CustomException;

public class OutputVote {
    public static void main(String[] args) {
        Vote vote = new Vote();
        try{
            vote.eligibilityToVote(15);
        }catch(InvalidAgeException e){
            System.out.println("eligible");
        }
    }
}
