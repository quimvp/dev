namespace EasyQuotes.Contracts.Suppliers
{
    public class Contact(string telNumber)
    {
        public string Tel {get; init;} = telNumber;

        public static readonly Contact None = new("78234567");
        
    }

    public class ContactInfo(TelNumber phone, EmailAddress email = EmailAddress.None, HomeAddress homeAddress = HomeAddress.None)
    {

    }

    public class HomeAddress(string streetName, string townName, string countryName="Eswatini")
    {
        public static readonly HomeAddress None = new("Street1", "Town Stub");
    }

    public class TelNumber(string phoneNumber, int countryCode = 268)
    {
        public int CountryCode {get; init;} = countryCode;

        private bool IsValidNumberString(string theNumber)
        {
            theNumber.All(c=> char.IsDigit(c));
        }
    }

    public class EmailAddress(string userName, string host="gmail.com")
    {
        private static readonly string stubName = "stub_user1";

        public static readonly EmailAddress None = new(stubName);

        public string User {get; init;} = string.IsNullOrWhiteSpace(userName) ? throw new ArgumentException("Username part of email cannot be empty", nameof(userName)) : userName.Trim();

        public string HostingService {get; init;} = string.IsNullOrWhiteSpace(host) ? throw new ArgumentException("Email provider[gmail.com, yahoo.com, etc.] cannot be empty.", nameof(host)) : host.Trim();

        public bool IsValid()
        {
            if (User.Contains("@")) return false;
            if (HostingService.Contains("@")) return false;
            if (HostingService.IndexOf(".") < 0) return false; //
            if (HostingService.Contains("@")) return false;

            return true;
        }

        public bool IsDefault() => string.Equals(stubName, User, StringComparisonOrdinalIgnoreCase);

        public override string ToString()
        {
            return $"{User}@{HostingService}";
        }
    }
}