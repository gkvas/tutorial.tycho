package at.kvas.tutorial.tycho.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictionaryServiceImpl implements DictionaryService {

	private List fDictionaries = new ArrayList();
	
    public void registerDictionary(Dictionary dictionary) {
    	fDictionaries.add(dictionary);
    }
    
    public void unregisterDictionary(Dictionary dictionary) {
    	fDictionaries.remove(dictionary);
    }

	public boolean check(String word) {
		for (int i = 0; i < fDictionaries.size(); i++ ) {
			Dictionary dictionary = (Dictionary) fDictionaries.get(i);
			if(dictionary.check(word)) {
				System.out.println("Huh");
				return true;
			}
		}
		return false;
	}

}
