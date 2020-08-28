public class Equals {
    public static void main(String[] args){

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1.equals(animal2));

        String str1 = "Ok";
        String str2 = "Ok";

        System.out.println(str1.equals(str2));
    }
}

class Animal{
        public int id;

        public Animal(int id){
            this.id = id;
        }

        public boolean equals(Object obj){
            Animal otherAnimal = (Animal) obj;
            return this.id == otherAnimal.id;
        }
}
