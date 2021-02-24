package cn.mk.transport;

import cn.mk.base.pojo.vo.PageVO;
import cn.mk.base.pojo.vo.QueryVO;
import cn.mk.pojo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <b>智慧公务车信息平台-用户传输层接口</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "oc_user_provider")
@RequestMapping("/user/transport")
public interface UserTransport {
	/**
	 * <b>根据查询对象进行分页查询</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<User> getPageVOByQuery(@RequestBody QueryVO<User> queryVO)throws Exception;

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	List<User> getListByQuery(@RequestBody User query)throws Exception;

	/**
	 * <b>根据 id 查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	User getById(@RequestParam String id)throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody User entity)throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody User entity)throws Exception;
}
