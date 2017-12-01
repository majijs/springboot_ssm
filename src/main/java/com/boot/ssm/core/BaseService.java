package com.boot.ssm.core;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public abstract class BaseService<T extends BaseEntity>{
    protected abstract BaseMapper<T> getDao();

    @Transactional(readOnly = true,timeout=30)
    public T get(Object id) {
        //model 需添加主键注解
        return getDao().selectByPrimaryKey(id);
    }

    @Transactional(timeout=30)
    public void save(T entity) {
        getDao().insert(entity);
    }
    
    @Transactional(timeout=60)
    public void save(List<T> entitys) {
    	if(entitys != null && entitys.size() > 0){
    		BaseMapper<T> dao = getDao();
            for(T entity : entitys){
                dao.insert(entity);
            }
        }
    }

    @Transactional(timeout=30)
    public void updateSelective(T entity) {
    	getDao().updateByPrimaryKeySelective(entity);
    }
    
    @Transactional(timeout=30)
    public void update(T entity) {
        getDao().updateByPrimaryKey(entity);
    }

    @Transactional(timeout=30)
    public void delete(T id) {
        getDao().deleteByPrimaryKey(id);
    }


    @Transactional(timeout=30)
    public void delete(List<T> ids) {
        if(ids != null && ids.size() > 0){
            BaseMapper<T> dao = getDao();
            for(T id : ids){
                dao.deleteByPrimaryKey(id);
            }
        }
    }

    @Transactional(readOnly = true,timeout=60)
    public List<T> getAll() {
        return getDao().selectAll();
    }
    
    @Transactional(readOnly = true,timeout=60)
    public Page<T> getAll(Page<T> page) {
    	page = PageHelper.startPage(page.getPageNum(), page.getPageSize());
    	getDao().selectAll();
        return page;
    }
}
