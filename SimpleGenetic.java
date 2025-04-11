public class SimpleGenetic {
    
    /*
        f(x)=x^2e^-x 
Program ini mencoba mencari nilai x yang menghasilkan nilai fitness tertinggi dalam rentang 1 hingga 15.
*/
    public static void main(String[] args) {
        Population population = new Population();
        population.initializePopulation();
        population.startGeneric();
    }
    
}
