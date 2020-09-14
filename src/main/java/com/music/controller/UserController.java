package com.music.controller;

import com.laoxuai.beans.annotation.Autowired;
import com.laoxuai.beans.annotation.Controller;
import com.laoxuai.ibatis.util.PageInfo;
import com.laoxuai.web.mvc.annotation.RequestMapping;
import com.music.pojo.User;
import com.music.service.UserService;
import com.music.util.Result;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userServiceImpl;

	/***
	 * 新增
	 * @param user
	 * @return
	 */
	@RequestMapping("/insert")
	public Result insert(User user) {
		int result = userServiceImpl.insert(user);
		return Result.success("添加成功", result);
	}

	/***
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/delete")
	public Result delete(Long id) {
		int result = userServiceImpl.delete(id);
		return Result.success("删除成功", result);
	}

	/***
	 * 修改
	 * @param user
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/update")
	public Result update(User user, Long id) {
		user.setId(id);
		int result = userServiceImpl.update(user);
		return Result.success("修改成功");
	}

	/***
	 * 主键查询
	 * @param id
	 * @return
	 */
	@RequestMapping("/get")
	public Result getByPrimaryKey(Long id) {
		User user = userServiceImpl.getByPrimaryKey(id);
		return Result.success("查询成功", user);
	}

	@RequestMapping(value = "/page")
	public Result page(User user, int page, int size) {
		PageInfo<User> pageInfo = userServiceImpl.listPageInfo(user, page, size);
		return Result.success("查询成功", pageInfo);
	}

	@RequestMapping(value = "/list")
	public Result list(User user, int page, int size) {
		List<User> list = userServiceImpl.listPage(user, page, size);
		return Result.success("查询成功", list);
	}

}
