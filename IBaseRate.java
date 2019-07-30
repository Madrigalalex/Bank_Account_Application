public interface IBaseRate {

    //write a method that returns a method
    default double getBaseRate() {
        return 2.5;
    }
}
