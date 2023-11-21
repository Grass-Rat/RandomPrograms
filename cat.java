public class cat {
    String catBreed;
    int catAge;
    boolean isChonky;
    String catTempermant;

public cat(String breed, int age, boolean chonker, String personality) {
    catBreed = breed;
    //just the type lol
    catAge = age;
    //in human years
    isChonky = chonker;
    //ARE THEY MORBIDLY OBESE????
    catTempermant = personality;
    //mbti moment lol
}
 public static void main(String[] args) {
    cat Shady = new cat("Russian Blue", 2, false, "very social");
    //Shady is a social, skinny, 2 year old russian blue cat
    cat Winnie = new cat("Tortoiseshell", 1, true, "very shy");
    // Winnie is a shy, chonky, 1 yeaer old tortoiseshell cat
    boolean isShadyOlder = Shady.age > Winnie.age;
    //Asks if it is true that Shady is older, which it is
    string winniePersonality = Winnie.personality;
    //Has the value of Winnie's personality, which is shy
    System.out.println("It is " + isShadyOlder + " that Shady is older than Winnie.");
    //gives the value of boolean isShadyOlder
    System.out.println("Winnie is " + Winnie.personality + ".");
 }
}
