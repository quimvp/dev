using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace EasyQuotes.Data.Clients
{
    public class ClientEntity
    {
        public ClientId Id {get; set;}

        public string Name {get; set;}

        public Contact Telephone {get; set;}

        public ClientType Type {get; set;}
    }
}