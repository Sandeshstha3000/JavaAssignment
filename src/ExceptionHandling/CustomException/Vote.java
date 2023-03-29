package ExceptionHandling.CustomException;

public class Vote {
    public void eligibilityToVote(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("cannot vote");
        }else{
            System.out.println("can vote");
        }
    }
}
