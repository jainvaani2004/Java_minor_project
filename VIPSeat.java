public class VIPSeat extends Seat implements Bookable {

    public VIPSeat(int seatNumber) {
        super(seatNumber);
    }

    @Override
    public double getPrice() {
        return 300.0;
    }

    @Override
    public void book() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("✅ VIP Seat " + seatNumber + " booked successfully.");
        } else {
            System.out.println("❌ Seat already booked!");
        }
    }

    @Override
    public void cancel() {
        if (isBooked) {
            isBooked = false;
            System.out.println("⛔ Booking canceled for VIP Seat " + seatNumber);
        } else {
            System.out.println("⚠️ Seat not booked yet.");
        }
    }
}
