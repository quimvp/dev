namespace EasyQuotes.Contracts.Suppliers
{
    public class Supplier(SupplierId supplierId, string nameOfSupplier, Contact phoneNumber)
    {
        public static readonly Supplier Null = new(SupplierId.Null);


        public SupplierId Id {get; init;} = supplierId;

        public string Name {get; init;} = nameOfSupplier;

        public Contact PhoneNumber {get; init;} = phoneNumber;

    }
}