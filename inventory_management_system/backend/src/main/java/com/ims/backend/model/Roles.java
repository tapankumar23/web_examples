package com.ims.backend.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Roles {

	@Id
	@Column(name="R_ID")
	private String roleId;

	@Column(name="R_NAME")
	private String roleName;

	@Column(name="R_PERMISSION")
	private Integer rolePermission;

	public String getRoleId(){return roleId;}
	public void setRoleId(String roleId){this.roleId=roleId;}
	public String getRoleName(){return roleName;}
	public void setRoleName(String roleName){this.roleName=roleName;}
	public Integer getRolePermission(){return rolePermission;}
	public void setRolePermission(Integer rolePermission){this.rolePermission=rolePermission;}
	
	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", roleName=" + roleName + ", rolePermission=" + rolePermission + "]";
	}
}
