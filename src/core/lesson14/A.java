package core.lesson14;


public class A {

    int i;

    A(int i) {
        this.i = i;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        return i == a.i;
    }

    @Override
    public int hashCode() {
        return i;
    }
}
