import java.util.HashMap;
import java.util.Map;

public class GeneratorTest{
	public static void main(String[] args) {
		Map<CRITERIA, Boolean> pmap = new HashMap<CRITERIA, Boolean>();
		pmap.put(CRITERIA.UPPERCASE, true);
		pmap.put(CRITERIA.LOWERCASE, true);
		pmap.put(CRITERIA.NUMBER, true);
		pmap.put(CRITERIA.SYMBOL, true);
		
		Generator gtor = new Generator(10,pmap);
		gtor.generatePassword();
	}
}