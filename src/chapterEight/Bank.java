package chapterEight;

// Ctrl + Alt + Shift + U for diagram
import java.util.ArrayList;

    public class Bank {

        private String bankName;
        private String sortCode;
        private ArrayList<Customer> customer;

        Bank(String bankName, String sortCode, ArrayList<Customer> customer){
            this.bankName = bankName;
            this.sortCode = sortCode;
            this.customer = customer;
        }
        public String getBankName() {
            return bankName;
        }
        public void setBankName(String bankName) {
            this.bankName = bankName;
        }
        public String getSortCode() {
            return sortCode;
        }
        public void setSortCode(String sortCode) {
            this.sortCode = sortCode;
        }
        public ArrayList<Customer> getCustomer() {
            return customer;
        }
        public void setCustomer(ArrayList<Customer> customer) {
            this.customer = customer;
        }
    }