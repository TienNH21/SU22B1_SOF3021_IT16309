package su22b1.sof3021.demo_config_bean;

public class UserDaoSqlServer implements UserDaoInterface {
	@Override
	public void insert() {
		System.out.println("Them SQL Server");
	}

	@Override
	public void update() {
		System.out.println("Cap nhat SQL Server");
	}

	@Override
	public void delete() {
		System.out.println("Xoa SQL Server");
	}

	@Override
	public void all() {
		System.out.println("Get All SQL Server");
	}

}
