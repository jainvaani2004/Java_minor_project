public class NormalSeat extends Seat implements Bookable {

    public NormalSeat(int seatNumber) {
        super(seatNumber);
    }

    @Override
    public double getPrice() {
        return 150.0;
    }

    @Override
    public void book() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("✅ Normal Seat " + seatNumber + " booked successfully.");
        } else {
            System.out.println("❌ Seat already booked!");
        }
    }

    @Override
    public void cancel() {
        if (isBooked) {
            isBooked = false;
            System.out.println("⛔ Booking canceled for Normal Seat " + seatNumber);
        } else {
            System.out.println("⚠️ Seat not booked yet.");
        }
    }
}
