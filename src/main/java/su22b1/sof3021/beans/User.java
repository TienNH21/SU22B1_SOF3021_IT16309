package su22b1.sof3021.beans;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@NotBlank
	private String hoTen;

	@NotBlank
	private String diaChi;
	
	@NotNull
	private int gioiTinh;
	
	@NotBlank
	// Email: @fpt.edu.vn
	private String email;
	
	@NotBlank
	// Min: 6 kí tự
	private String password;
	
	@NotBlank
	// 10 số hoặc 11 số: 0[23789]...
	private String sdt;
	
	@NotBlank
	private String avatar;
}
