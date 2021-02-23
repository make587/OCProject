package cn.mk.transport;

import cn.mk.base.pojo.vo.PageVO;
import cn.mk.base.pojo.vo.QueryVO;
import cn.mk.pojo.entity.User;
import cn.mk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <b>智慧公务车信息平台-用户传输层接口实现类</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("userTransport")
@RequestMapping("user/transport")
public class UserTransportImpl implements UserTransport {
	@Autowired
	private UserService service;
	/**
	 * <b>根据查询对象进行分页查询</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	@Override
	public PageVO<User> getPageVOByQuery(@RequestBody QueryVO<User> queryVO)throws Exception{
		//从查询视图中获得分页视图和查询对象
		User query = queryVO.getQuery();
		PageVO<User> pageVO = queryVO.getPageVO();
		return service.getPageVOByQuery(query,pageVO);
	}

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	@Override
	public List<User> getListByQuery(@RequestBody User query)throws Exception{
		return service.getListByQuery(query);
	}

	/**
	 * <b>根据 id 查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	@Override
	public User getById(@RequestParam String id)throws Exception{
		return service.getById(id);
	}

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	@Override
	public boolean save(@RequestBody User entity)throws Exception{
		return service.save(entity);
	}

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	@Override
	public boolean update(@RequestBody User entity)throws Exception{
		return service.update(entity);
	}
}
