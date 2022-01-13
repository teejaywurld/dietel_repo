package chapterSix;

public class Human {
        private String name;
        private Gender gender;
        public Human(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public String toString(){
            String human = "";
            human = "Human Name: " + getName() + " Human Gender: " + getGender();
            return human;
        }
    }
