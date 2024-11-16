using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


namespace EasyQuotes.Contracts.Shared
{
    public interface IRepository<TEntity, TID> where TEntity:class
    {
        Task AddNewAsync(TEntity newItem);

        Task UpdateAsync(TEntity updatedItem);

        Task DeleteAsync(TID itemId);

        Task<ICollection<TEntity>> FindAllAsync();

        Task<TEntity> FindByIdAsync(TID itemId);

        Task<TEntity> FindSingleAsync(Func<TEntity, bool> predicate);

        Task<ICollection<TEntity>> FindByAsync(Func<TEntity, bool> predicate);

        Task<int> CountAsync();

        Task<int> CountAsync(Func<TEntity, bool> predicate);

        Task<bool> ExistsAsync(Func<TEntity, bool> predicate);

        Task<bool> ExistsByIdAsync(TID itemId);
    }
}