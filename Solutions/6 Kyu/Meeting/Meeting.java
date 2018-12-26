import java.util.*;


class Meeting {

    public static String meeting(String s) {
        s = s.toUpperCase();
        List<Person> persons = new ArrayList<>();
        for (String person : s.split(";")) {
            String[] names = person.split(":");
            persons.add(new Person(names[0], names[1]));
        }
        persons.sort((o1, o2) -> {
            String x1 = o1.lastName;
            String x2 = o2.lastName;
            int sComp = x1.compareTo(x2);

            if (sComp != 0) {
                return sComp;
            }

            x1 = (o1).firstName;
            x2 = (o2).firstName;
            return x1.compareTo(x2);
        });
        StringBuilder x = new StringBuilder();
        for (Person person : persons
        ) {
            x.append(person.toString());
        }
        return x.toString();
    }

    private static class Person {
        private final String firstName;
        private final String lastName;

        Person(final String fname, final String lname) {
            firstName = fname;
            lastName = lname;
        }

        @Override
        String toString() {
            return "(" + lastName + ", " + firstName + ")";
        }
    }
}
