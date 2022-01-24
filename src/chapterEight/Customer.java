package chapterEight;

public class Customer {

        private String name;
        private Account hisAccount;

        Customer(String name, Account hisAccount){
            this.name = name;
            this.hisAccount = hisAccount;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Account getHisAccount() {
            return hisAccount;
        }
        public void setHisAccount(Account hisAccount) {
            this.hisAccount = hisAccount;
        }
    }
