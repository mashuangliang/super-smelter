package com.smelter.service.impl.common;


import com.smelter.dao.common.BaseMapper;
import com.smelter.model.common.BaseModel;
import com.smelter.model.page.PageList;
import com.smelter.model.page.PaginatedList;
import com.smelter.service.common.IBaseService;
import com.smelter.util.common.ReflectUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional
public class BaseService<T extends Serializable, E extends BaseModel> implements IBaseService<T, E>, ApplicationContextAware, InitializingBean {
    private ApplicationContext applicationContext;
    protected BaseMapper<T, E> mapper;

    public BaseService() {
    }

    @Transactional(
            readOnly = true
    )
    public int countByExample(E E) {
        return this.mapper.countByExample(E);
    }

    public int deleteByExample(E E) {
        return this.mapper.deleteByExample(E);
    }

    public int deleteByPrimaryKey(Object id) {
        return this.mapper.deleteByPrimaryKey(id);
    }

    public int insert(T record) {
        return this.mapper.insert(record);
    }

    public int insertSelective(T record) {
        return this.mapper.insertSelective(record);
    }

    @Transactional(
            readOnly = true
    )
    public List<T> selectByExample(E E) {
        return this.mapper.selectByExample(E);
    }

    @Transactional(
            readOnly = true
    )
    public T selectByPrimaryKey(Object id) {
        return this.mapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(T record, E E) {
        return this.mapper.updateByExampleSelective(record, E);
    }

    public int updateByExample(T record, E E) {
        return this.mapper.updateByExample(record, E);
    }

    public int updateByPrimaryKeySelective(T record) {
        return this.mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(T record) {
        return this.mapper.updateByPrimaryKey(record);
    }

    @Transactional(
            readOnly = true
    )
    public PageList<T> getPageList(E example) {
        PaginatedList list = new PaginatedList(example.getPageIndex(), example.getPageSize());
        list.setTotalItem(this.countByExample(example));
        list.addAll(this.mapper.getPageList(example));
        return list;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void afterPropertiesSet() throws Exception {
        String className = ReflectUtils.getSuperClassGenricType(this.getClass()).getSimpleName();
        className = className.substring(0, 1).toLowerCase() + className.substring(1);
        if (this.applicationContext.containsBean(className + "Mapper")) {
            this.mapper = (BaseMapper) this.applicationContext.getBean(className + "Mapper");
        }
    }

    public BaseMapper<T, E> getMapper() {
        return this.mapper;
    }

    public void setMapper(BaseMapper<T, E> mapper) {
        this.mapper = mapper;
    }
}
