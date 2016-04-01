package jdbc;

public class AccountServiceImpl implements AccountService {
	private DaoSupport<Account> ds = new DaoSupport<Account>();
	/* (non-Javadoc)
	 * @see jdbc.AccountService#change(int, int, int)
	 */
	@Override
	public void change(int id1,int id2,int m){
		int n1 = ds.saveOrDelOrUpdate("update account set account = account - ? where id = ?", m,id1);
		int n2 = ds.saveOrDelOrUpdate("update account set account = account + ? where id = ?", m,id2);
		if(n1==0 || n2 == 0)
			throw new RuntimeException("в╙укспнС!");
	}
}
