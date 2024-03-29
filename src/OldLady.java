/***
 * Grading Comments:  Good stuff - Definitely used methods   
 *  to get rid of duplication.  
 *  Compiles/runs 15/15
 *  Correct output 6/6
 *  Consistency:   2/2 - overall, very good, but:
 * Try to name your methods using the same convention of capitalization.
 * SwallowedFly() if 'WriggledJiggled'.  
 * Make sure indentation is the same (last } is off).  
 *  Economy:  1/2   You definitely got the idea - but you could go further
 *   in a couple directions in reducing duplication - you could 'nest' the methods 
 *   by having one method call another.  eg. you could have 
 *     System.out.print("There was an old lady who swallowed a");
 *   as a method that each of your other methods calls. 
 */  
public class OldLady {

	public static void main(String[] args) {
		Swallowedfly();
		Nocluewhyfly();
		Perhapsshedie();
		
		SwallowedSpider();
		WriggledJiggled();
		CatchFly();
		Nocluewhyfly();
		Perhapsshedie();
		
		SwallowedBird();
		Absured();
		Catchspider();
		CatchFly();
		Nocluewhyfly();
		Perhapsshedie();
		
		Swallowedcat();
		Imagineswallowcat();
		Catchbird();
		Catchspider();
		CatchFly();
		Nocluewhyfly();
		Perhapsshedie();
		
		SwallowedDog();
		Hogswallow();
		CatchCat();
		Catchbird();
		Catchspider();
		CatchFly();
		Nocluewhyfly();
		Perhapsshedie();
		
		SwallowedHorse();
		Died();
	}
	public static void Swallowedfly(){
		System.out.println("There was an old lady who swallowed a fly.");
	}
	public static void Nocluewhyfly() {
		System.out.println("I don't know why she swallowed that fly,");
	}
	public static void Perhapsshedie() {
		System.out.println("Perhaps she'll die.");
	}
	public static void SwallowedSpider() {
		System.out.println("There was an old lady who swallowed a spider,");
	}
	public static void WriggledJiggled() {
		System.out.println("That wriggled and iggled and jiggled inside her.");
	}
	public static void CatchFly(){
		System.out.println("She swallowed the spider to catch the fly,");
	}
	public static void SwallowedBird() {
		System.out.println("There was an old lady who swallowed a bird,");
	}
	public static void Absured() {
		System.out.println("How absured to swallow a bird.");
	}
	public static void Catchspider() {
		System.out.println("She swallowed the bird to catch the spider,");
	}
	public static void Swallowedcat() {
		System.out.println("There was an old lady who swallowed a cat,");
	}
	public static void Imagineswallowcat() {
		System.out.println("Imagine that to swallow a cat.");
	}
	public static void Catchbird() {
		System.out.println("She swallowed the cat to catch the bird,");
	}
	public static void SwallowedDog() {
		System.out.println("There was an old lady who swallowed a dog,");
	}
	public static void Hogswallow() {
		System.out.println("What a hog to swallow a dog.");
	}
	public static void CatchCat() {
		System.out.println("She swallowed the dog to catch the cat,");
	}
	public static void SwallowedHorse() {
		System.out.println("There was an old lady who swallowed a horse,");
	}
	public static void Died() {
		System.out.println("She died of course.");
	}
		
	}


