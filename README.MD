## 🎬 Cinema Ticket Booking System (Java Mini Project)

A beginner-friendly **console-based Java application** to simulate a simple cinema ticket booking system.
This project demonstrates key **Java fundamentals** such as classes, objects, inheritance, interfaces, arrays, loops, and switch statements.

---

### 📌 Features

✅ **Movie Listing** – Displays a list of available movies with their durations
✅ **Seat Booking** – Book either a **Normal Seat** or a **VIP Seat**
✅ **Ticket Generation** – Shows ticket details (movie name, seat number, seat type) after booking
✅ **Interface Implementation** – Uses a `Bookable` interface for booking/canceling seats
✅ **Object-Oriented Design** – Demonstrates classes, inheritance, and encapsulation

---

### 🏗️ Project Structure

```
cinema/
 ┣ Bookable.java        # Interface for booking/canceling seats
 ┣ Movie.java           # Represents a movie with name and duration
 ┣ Seat.java            # Abstract seat class (parent)
 ┣ NormalSeat.java      # Normal seat (inherits Seat, implements Bookable)
 ┣ VIPSeat.java         # VIP seat (inherits Seat, implements Bookable)
 ┣ Ticket.java          # Represents a booked ticket
 ┣ Theatre.java         # Handles movie list and theatre operations
 ┗ Main.java            # Entry point with menu-driven logic
```

---

### 🖥️ Prerequisites

Make sure you have:

* **Java JDK 17+** (or higher) installed
* A terminal/command prompt or an IDE (VS Code, IntelliJ, Eclipse)

---

### ⚡ How to Run

#### 1️⃣ Clone or Download

Download the project or clone it:

```bash
git clone https://github.com/your-username/cinema-ticket-booking.git
cd cinema-ticket-booking
```

#### 2️⃣ Compile the Project

Navigate to the project folder where `cinema` package exists:

```bash
javac cinema/*.java
```

#### 3️⃣ Run the Application

```bash
java cinema.Main
```

---

### 🕹️ Usage

Once the program starts, you’ll see a menu:

```
--------- MAIN MENU ---------
1. Show Movies
2. Book Normal Seat
3. Book VIP Seat
4. Exit
```

* **Option 1** → Lists all available movies
* **Option 2** → Books a Normal seat for a selected movie
* **Option 3** → Books a VIP seat for a selected movie
* **Option 4** → Exits the program

---

### 📚 Concepts Covered

This mini-project helps you practice:

* **Unit I (Basics of Java)**: JVM, JRE, classpath, classes, fields, access control, methods, overloading, loops, operators, etc.
* **Unit II (OOP Advanced)**: Inheritance, constructors in extended classes, type conversion, `protected`/`final`, abstract classes, interfaces, and packages.

---

### 🚀 Future Enhancements

💡 Possible improvements:

* 🎟️ **Ticket Cancellation** option
* 💾 **File or Database Storage** for booking records
* 💡 **Dynamic Seat Availability** (track multiple seats per movie)
* 🌐 GUI or Web-based front end

---

### 👨‍💻 Author

**Vishal Singh**
📧 [connectvishalsingh27@gmail.com](mailto:connectvishalsingh27@gmail.com)
💼 [LinkedIn](https://www.linkedin.com/in/vishal-04-singh)

---

Would you like me to also create a **`LICENSE` file** or a **GitHub-style banner** for the README?



