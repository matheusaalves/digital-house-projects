package exemploAulaGenerics;

public class MinhaClasseGenerica<T> {
    private T obj;

    public MinhaClasseGenerica(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

}
