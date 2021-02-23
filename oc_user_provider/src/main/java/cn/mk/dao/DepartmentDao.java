package cn.mk.dao;

import cn.mk.base.pojo.vo.PageVO;
import cn.mk.pojo.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>智慧公务车信息平台-部门数据持久层接口</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository("DepartmentDao")
public interface DepartmentDao {
	/**
	 * <b>按照查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Department> findListByQuery(Department query)throws Exception;

	/**
	 * 保存对象信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(Department entity)throws Exception;

	/**
	 * 修改对象信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(Department entity)throws Exception;
}
