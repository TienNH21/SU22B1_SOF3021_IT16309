package su22b1.sof3021.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountModel {
	private String fullname;
	private String email;
	private String username;
	private String password;
	private String photo;
	private int admin;
}
