public class Park {
    private String addres;
    private Boolean isOpen;
    private Boolean isForChildren;

    public static class Attractions {
        private String nameAttr;
        private String timeWorkAttr;
        private int priseAttr;

        public Attractions(String nameAttr, String timeWorkAttr, int priseAttr) {
            this.nameAttr = nameAttr;
            this.timeWorkAttr = timeWorkAttr;
            this.priseAttr = priseAttr;
        }

        public String getNameAttr() {
            return nameAttr;
        }
        public String getTimeWorkAttr(){
            return  timeWorkAttr;
        }

        public int getPriseAttr() {
            return priseAttr;
        }

        public void setNameAttr(String nameAttr){
            this.nameAttr = nameAttr;
        }

        public void setPriseAttr(int priseAttr) {
            this.priseAttr = priseAttr;
        }

        public void setTimeWorkAttr(String timeWorkAttr) {
            this.timeWorkAttr = timeWorkAttr;
        }
    }

}
