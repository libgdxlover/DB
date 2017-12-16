package db.domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the SYS_USER database table.
 */
@Entity
@Table(name = "TB_USER")
@NamedQuery(name = "SysUser.findAll",query = "SELECT s FROM SysUser s")
public class SysUser implements Serializable
{
	private static final long	serialVersionUID	= 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "uuid-hex")
	private String				id;

	private String				name;

	private String				passwd;

	private String				phone;

	

	public SysUser()
	{
	}

	public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}