
class NoSeatsAvailableException extends Exception {

    public NoSeatsAvailableException(String message) {
        super(message);
    }
}

class Flight {

    String flightName;
    int availableSeats;

    Flight(String flightName, int availableSeats) {
        this.flightName = flightName;
        this.availableSeats = availableSeats;
    }

    void bookSeat(int seats) throws NoSeatsAvailableException {
        if (seats > availableSeats) {
            throw new NoSeatsAvailableException("No enough seats available on " + flightName);
        }
        availableSeats -= seats;
        System.out.println(seats + " seat(s) booked successfully on " + flightName);
        System.out.println("Remaining seats: " + availableSeats);
    }
}

public class FlightBookingSystem {

    public static void main(String[] args) {
        Flight flight = new Flight("AI-202", 3);

        try {
            flight.bookSeat(2);
            flight.bookSeat(2);
        } catch (NoSeatsAvailableException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}
