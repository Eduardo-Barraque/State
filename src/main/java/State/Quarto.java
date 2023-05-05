package State;

public class Quarto {private String numero;
    private QuartoState state;

    public Quarto() {
        this.state = QuartoStateDisponivel.getInstance();
    }

    public void setState(QuartoState state) {
        this.state = state;
    }

    public boolean disponibilizar() {
        return state.disponibilizar(this);
    }

    public boolean ocupar() {
        return state.ocupar(this);
    }

    public boolean manutenir() {
        return state.manutenir(this);
    }

    public boolean reservar() {
        return state.reservar(this);
    }

    public String getNumerostate() {
        return state.getState();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public QuartoState getState() {
        return state;
    }
}
