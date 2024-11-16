namespace EasyQuotes.Contracts.Suppliers
{
    public class Supplier(SupplierId supplierId, string nameOfSupplier, Contact phoneNumber)
    {
        public static readonly Supplier Null = new(SupplierId.Default, "Default or stub supplier", Contact.None);

        public SupplierId Id {get; init;} = supplierId;

        public string Name {get; init;} = nameOfSupplier;

        public Contact PhoneNumber {get; init;} = phoneNumber;

        
    }
}