package chapterFour;

    public class Native {
        private int scvId;
        private String name;

        public Native(String name, int scvId){
            this.name = name;
            this.scvId = scvId;
        }

        public String getScvId() {
            String myScvId = "";
            myScvId = "SCV900" + scvId;
            return myScvId;
            // return "SCV900" + scvId;
        }

        public void setScvId(int scvId) {
            this.scvId = scvId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
