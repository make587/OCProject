package cn.mk.service.impl;

import cn.mk.base.pojo.vo.PageVO;
import cn.mk.dao.UserDao;
import cn.mk.pojo.entity.User;
import cn.mk.service.UserService;
import cn.mk.util.IdGenerator;
import cn.mk.util.PageUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>智慧公务车信息平台-用户业务逻辑层接口实现类</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;

	@Autowired
	private IdGenerator idGenerator;

	/**
	 * <b>根据查询对象进行分页查询</b>
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageVO<User> getPageVOByQuery(User query, PageVO pageVO) throws Exception {
		// 打开 PageHelper 分页过滤器
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		// 进行列表查询
		List<User> list = dao.findListByQuery(query);
		new PageUtil<User>().parseFromPageInfoToPageVO(list,pageVO);
		return pageVO;
	}

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<User> getListByQuery(User query) throws Exception {
		return dao.findListByQuery(query);
	}

	/**
	 * <b>根据 id 查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public User getById(String id) throws Exception {
		//创建查询对象
		User query = new User();
		query.setId(id);

		//进行列表查询
		List<User> list = dao.findListByQuery(query);
		if (list !=null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(User entity) throws Exception {
		//记得设置雪花算法进行主键转换
		entity.setId(idGenerator.createId());
		//保存数据
		if(dao.save(entity)>0){
			return true;
		}
		return false;
	}

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(User entity) throws Exception {
		if(dao.save(entity)>0){
			return true;
		}
		return false;
	}
}
