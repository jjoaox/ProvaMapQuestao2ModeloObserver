package accounttest.abc;

public interface Subject {
    public void registrarObserver(Observer o);
    public void removerObserver(Observer o);
    public void notificarObserver();
}
