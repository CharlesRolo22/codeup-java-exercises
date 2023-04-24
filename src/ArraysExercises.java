import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("Josh");
        people[1] = new Person("Mina");
        people[2] = new Person("Ro");

        Person essence = new Person("essence");
        people = addPerson(people, essence);

        for (Person person : people) {
            System.out.println(person.getName());
        }

        public static Person[] addPerson (Person[]array, Person newPerson){
            Person[] newPeople = Arrays.copyOf(array, array.length + 1);
            newPeople[newPeople.length - 1] = newPerson;
            return newPeople;
        }

    }

}