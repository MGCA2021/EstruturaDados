package exception;

@SuppressWarnings("serial")
public class EmptyFilaException 
    extends RuntimeException {
    public EmptyFilaException(String erro) {
        super(erro);
    }
}
