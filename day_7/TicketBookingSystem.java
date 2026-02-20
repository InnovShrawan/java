
class SeatNotAvailableException extends Exception {

    public SeatNotAvailableException(String message) {
        super(message);
    }
}

class Movie {

    private String name;
    private int availableSeats;

    public Movie(String name, int availableSeats) {
        this.name = name;
        this.availableSeats = availableSeats;
    }

    public void bookTicket(int seats) throws SeatNotAvailableException {
        if (seats <= 0) {
            throw new IllegalArgumentException("Number of seats must be positive.");
        }
        if (seats > availableSeats) {
            throw new SeatNotAvailableException("Not enough seats available for " + name);
        }
        availableSeats -= seats;
        System.out.println(seats + " seat(s) booked successfully for " + name);
        System.out.println("Remaining seats: " + availableSeats);
    }

    public String getName() {
        return name;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}

public class TicketBookingSystem {

    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 5);

        try {
            movie.bookTicket(2);
            movie.bookTicket(3);
            movie.bookTicket(1);
        } catch (SeatNotAvailableException e) {
            System.out.println("Booking failed: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
