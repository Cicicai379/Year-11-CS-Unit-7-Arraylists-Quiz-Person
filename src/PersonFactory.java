import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        int i=0;//start comparing here
        while(allPersons.get(i).getLastName().compareTo(person.getLastName())<0){
            i++; // move on is the string is smaller than the new one
        }
        allPersons.add(i, person);
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> ans = new ArrayList<Person>();
        for(int i=0; i<allPersons.size();i++){
            if(allPersons.get(i).getAge()<18){ // check if smaller than 18 age
                ans.add(allPersons.get(i));
            }
        }
        return ans; // arraylist of ans
    }

    public boolean checkLastName(String lastName) {
        for(int i=0; i<allPersons.size();i++){
            if(allPersons.get(i).getLastName().equals(lastName)){ // compare two strings
                return true;
            }
        }
        return false;
    }
}
