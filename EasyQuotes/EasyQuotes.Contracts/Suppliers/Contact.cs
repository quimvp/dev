namespace EasyQuotes.Contracts.Suppliers
{
    public class Contact(string telNumber)
    {
        public string Tel {get; init;} = telNumber;
        public static readonly Contact None = new("78234567");
        
    }
}