package Class27;

public interface CanFly {
    public interface CaFly {

        void fly();

    }

    interface HasWings {

        public abstract Object getWindSpan();

    }

    abstract class Falcon implements CanFly, HasWings {

    }
}
