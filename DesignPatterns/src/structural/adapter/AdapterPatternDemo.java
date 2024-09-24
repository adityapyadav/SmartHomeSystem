package structural.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Using the old printer with an adapter
        OldPrinter oldPrinter = new OldPrinter();
        Printer adapter = new PrinterAdapter(oldPrinter);
        
        adapter.print("Adapter pattern demonstration.");
    }
}
