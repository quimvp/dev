using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using EasyQuotes.Contracts.Suppliers;

namespace EasyQuotes.Contracts.Clients
{
    public class ClientBuilder(ClientId id, string name, Contact telNumber)
    {
        private ClientId clientId = id;

        private string nameOfClient = name;

        private Contact telephoneNumber = telNumber;

        private ClientType clientType = ClientType.Business;

        private decimal clientRating = 0;        

        private string optionalNotes = string.Empty;

        private string emailAddress = string.Empty;

        public ClientBuilder WithClientType(ClientType type)
        {
            clientType = type;
            return this;
        }

        public ClientBuilder WithRating(decimal rating)
        {
            clientRating = rating;
            return this;
        }

        public ClientBuilder WithNotes(string notes)
        {
            optionalNotes = notes;
            return this;
        }

        public Client TryBuild()
        {
            if (string.IsNullOrWhiteSpace(nameOfClient))
            {
                throw new ArgumentException("Client name cannot be empty.");
            }
            if (telephoneNumber == Contact.None)
            {
                throw new ArgumentException("Client must have a valid contact number");
            }
            return new Client(clientId, nameOfClient, telephoneNumber, clientType);
        }
    }
}