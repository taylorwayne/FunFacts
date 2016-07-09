package taylorpresley.funfacts;

import java.util.Random;

/**
 * Created by Taylor Presley on 05-Jun-16.
 */
public class FactBook {
    // Fields (Member Variables) - Propertis about the object
    private final String[] mFacts = {
            "Lena likes it in the butt.",
            "Trey drinks Smirnoff Ice.",
            "Taylor's dick is mildly interesting.",
            "It's storming.",
            "Shoes smell like shoes.",
            "Uncooperative crates are wooden.",
            "Everyone needs a Yeti cooler so we can do Yeti Butts.",
            "Lana, Lana,   LANA! Dangerzone!",
            "Sterling likes the rain, but hates baths.",
            "George Crum invented the potato chip."};
    // Methods - Actions the object can take
    public String getFact(){
        // The button was clicked, so update the factTextView with a new fact
        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    };
}
