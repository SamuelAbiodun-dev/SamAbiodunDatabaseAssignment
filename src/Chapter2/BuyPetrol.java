package Chapter2;

public class BuyPetrol {



        private String stationLocation;
        private String petrolType;
        private int quantity;
        private double price;
        private double percentageDiscount;

        public BuyPetrol(String stationLocation, int petrolType, int quantity, double price, double percentageDiscount) {
            this.stationLocation = stationLocation;
            this.petrolType = String.valueOf(petrolType);
            this.quantity = quantity;
            this.price = price;
            this.percentageDiscount = percentageDiscount;
        }
        public void setStationLocation(String stationLocation) {
            this.stationLocation = stationLocation;
        }
        public String getStationLocation() {
            return stationLocation;
        }
        public void setPetrolType(String petrolType) {
            this.petrolType = petrolType;
        }
        public String getPetrolType() {
            return petrolType;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        public int getQuantity() {
            return quantity;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public double getPrice() {
            return price;
        }
        public void setPercentageDiscount(double percentageDiscount) {
            this.percentageDiscount = percentageDiscount;
        }
        public double getPercentageDiscount() {
            return percentageDiscount;
        }
        public double getPurchaseAmount() {
            return quantity * price * (1 - percentageDiscount / 100);
        }
    }



