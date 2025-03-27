package Inheritance2;

class University {
    Person[] people;
    int count = 0;

    University(int size) {
        people = new Person[size];
    }

    void addPerson(Person p) {
        if (count < people.length) {
            people[count++] = p;
        } else {
            System.out.println("University is full!");
        }
    }

    void showPeople() {
        for (int i = 0; i < count; i++) {
            people[i].displayInfo();
        }
    }
}