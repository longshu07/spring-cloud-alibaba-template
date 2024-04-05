package cn.longshu.spring.cloud.alibaba.auth.service.impl;


import cn.longshu.spring.cloud.alibaba.auth.dao.SysUserDao;
import cn.longshu.spring.cloud.alibaba.auth.entity.SysUser;
import cn.longshu.spring.cloud.alibaba.auth.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 系统用户(SysUser)表服务实现类
 *
 * @author makejava
 * @since 2024-03-16 16:02:21
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserDao sysUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public SysUser queryById(Long userId) {
        return this.sysUserDao.queryById(userId);
    }


    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser insert(SysUser sysUser) {
        this.sysUserDao.insert(sysUser);
        return sysUser;
    }

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser update(SysUser sysUser) {
        this.sysUserDao.update(sysUser);
        return this.queryById(sysUser.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long userId) {
        return this.sysUserDao.deleteById(userId) > 0;
    }
}
