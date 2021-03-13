package ir.javacup;

public class RepeatInString {

	public static void main(String[] args) {
		System.out.println(StringInString("The microstructure, morphology, and magnetic properties" +
				" of FeAlN films deposited by reactive rf magnetron sputtering with subsequent treatment " +
				"by three techniques, namely, in situ, ex situ (with the sputtering and annealing processes " +
				"separated), and thermal crystallization of amorphous alloys, have been studied. FeAlN films" +
				" prepared by the ex situ technique exhibit the best soft magnetic characteristics. Thermal " +
				"crystallization of amorphous alloys produced films with properties having the highest thermal" +
				" stability. Films 800-to 1000-nm thick were found to have the best soft magnetic properties. " +
				"The dependences of the properties of FeAlN films on nitrogen content and annealing temperature " +
				"were established. The conditions favoring the preparation of thin nanostructured FeAlN films " +
				"featuring the best soft magnetic characteristicsof", "of"));
	}

	public static int StringInString(String one, String two) {
		int n = 0;
		if (one == null || two == null ||
				two.length() > one.length() || one.isEmpty() || two.isEmpty())
			return n;

		for (int i = 0; i <= one.length() - two.length(); i++) {
			boolean isEqual = true;
			for (int j = 0; j < two.length(); j++) {
				if (one.charAt(i + j) != two.charAt(j)) {
					isEqual = false;
					break;
				}
			}
			if (isEqual) n++;
		}
		return n;
	}
}