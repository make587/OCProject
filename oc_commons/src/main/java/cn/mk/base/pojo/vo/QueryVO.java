package cn.mk.base.pojo.vo;

import java.io.Serializable;
/**
 * <b>智慧公务车信息平台-查询视图信息</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
public class QueryVO<E> implements Serializable {
	private static final long serialVersionUID = -8737321816324144581L;
	private E query;                    //查询对象
	private PageVO<E> pageVO;           //分页对象

	public QueryVO(){}

	public QueryVO(E query, PageVO<E> pageVO) {
		this.query = query;
		this.pageVO = pageVO;
	}

	public E getQuery() {
		return query;
	}

	public void setQuery(E query) {
		this.query = query;
	}

	public PageVO<E> getPageVO() {
		return pageVO;
	}

	public void setPageVO(PageVO<E> pageVO) {
		this.pageVO = pageVO;
	}
}
