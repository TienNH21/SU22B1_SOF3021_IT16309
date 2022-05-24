package su22b1.sof3021.demo_config_bean;

public class UserDaoMySql implements UserDaoInterface {
	@Override
	public void insert() {
		System.out.println("Them MySQL");
	}

	@Override
	public void update() {
		System.out.println("Cap nhat MySQL");
	}

	@Override
	public void delete() {
		System.out.println("Xoa MySQL");
	}

	@Override
	public void all() {
		System.out.println("Get all MySQL");
	}

}
