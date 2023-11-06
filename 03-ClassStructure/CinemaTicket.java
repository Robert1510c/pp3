    public class CinemaTicket {
        private static String cinemaName = "Morning Star Cinema";
        private String filmTitle;
        private int row;
        private int seat;
        private double price;
    
        public CinemaTicket(String filmTitle, int row, int seat) {
            this.filmTitle = filmTitle;
            this.row = row;
            this.seat = seat;
            this.price = (row <=2) ? 10.0 : 25.0;
        }
    
        @Override
        public String toString() {
            return "Cinema Name: " + cinemaName + "\n" +
                   "Film Title: " + filmTitle + "\n" +
                   "Row: " + row + "\n" +
                   "Seat: " + seat + "\n" +
                   "Price: PLN" + price;
        }
    
        public static void main(String[] args) {
            CinemaTicket ticket1 = new CinemaTicket("Gladiator", 1, 2);
            CinemaTicket ticket2 = new CinemaTicket("Gladiator", 3, 4);
    
            System.out.println("Ticket 1 Details:\n" + ticket1);
            System.out.println("\nTicket 2 Details:\n" + ticket2);
        }
    }
    