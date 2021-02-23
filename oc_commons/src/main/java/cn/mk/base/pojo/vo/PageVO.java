package cn.mk.base.pojo.vo;

import cn.mk.util.ConstantUtil;

import java.io.Serializable;
import java.util.List;
/**
 * <b>智慧公务车信息平台-分页视图信息</b>
 * @author  MK
 * @version 1.0.0
 * @since 1.0.0
 */
public class PageVO<E> implements Serializable {
	private static final long serialVersionUID = 6131155636530053768L;
	private Integer pageNum;            //当前页码
	private Integer pageSize;           //每页显示数量
	private Integer draw;               // DataTables 分页信息
	private List<E> list;               //分页信息列表
	private Long totalCount;            //总条数
	private Integer totalPage;          //总页数

	public PageVO() {}

	public PageVO(Integer pageNum,Integer pageSize,Integer draw){
		if (pageNum!=null || pageNum >0){
			this.pageNum = pageNum;
		}else {
			this.pageNum = ConstantUtil.PAGE_NUM;
		}
		if (pageSize!=null || pageSize >0){
			this.pageSize = pageSize;
		}else {
			this.pageSize = ConstantUtil.PAGE_SIZE;
		}

		this.draw =draw;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}
