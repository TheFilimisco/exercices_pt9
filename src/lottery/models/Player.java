package lottery.models;

import java.util.Objects;

public class Player {
    private String DNI;
    private String ticket;

    public Player(String DNI, String ticket) {
        this.DNI = DNI;
        this.ticket = ticket;
    }

    public Player() {
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(ticket, player.ticket);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ticket);
    }

    @Override
    public String toString() {
        return "Player{" +
                "DNI='" + DNI + '\'' +
                ", ticket='" + ticket + '\'' +
                '}';
    }
}
