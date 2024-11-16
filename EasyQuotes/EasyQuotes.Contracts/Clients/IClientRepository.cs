using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using EasyQuotes.Contracts.Shared;

namespace EasyQuotes.Contracts.Clients
{
    public interface IClientRepository : IRepository<Client, ClientId>
    {
        
    }
}