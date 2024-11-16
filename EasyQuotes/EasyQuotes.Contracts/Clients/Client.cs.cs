using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using EasyQuotes.Contracts.Suppliers;

namespace EasyQuotes.Contracts.Clients
{
    public class Client(ClientId id, string nameOfClient, Contact contact, ClientType clientType = ClientType.Business)
    {
        public ClientId Id {get; init;} = id;

        public string Name {get; init;} = nameOfClient;

        public Contact Contact {get; init;} = contact;

        public ClientType Type {get; init;} = clientType;
        
    }

    public sealed class ClientId(long id)
    {
        public long Value {get; init;} = id;

        private static readonly long MinIdValue = 202411001;

        public static readonly ClientId None = new(MinIdValue);
    }

    public class ClientIdException():ArgumentException(message:"Client id is not valid format.");

    public enum ClientType:ushort
    {
        Business = 0,

        Individual =1 
    }
}
