package Class24;
class Cat {
     String name;
     String breed;
     int age;
     double weight;
    public Cat(String name, String breed, int age, double weigth) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weigth);}

    void setName(String name){
        if(name.length()>10){
            System.out.println("Please name should be less then 10 tetters");
        }
        else if(name.isEmpty()){
            System.out.println("Name field should not be empty");
        } else if (name.length()<0) {
            System.out.println("Name field should not be less then 0");


        }
        else {this.name=name; }
    }

    void setAge(int age){
        if(age>15) {
            System.out.println("age should not be more than 15 ");

        } else if (age<0) {
            System.out.println("age should not be negative value");

        }
        else {this.age=age;}
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }




    public void setBreed(String breed) {
        this.breed = breed;
    }



    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        Cat cat= new Cat("fleshka668787769tiutuytytyjjhfhgdghdgh", "persian", 16, 45);
        System.out.println(cat.age);
        System.out.println(cat.name);
    }


    }

