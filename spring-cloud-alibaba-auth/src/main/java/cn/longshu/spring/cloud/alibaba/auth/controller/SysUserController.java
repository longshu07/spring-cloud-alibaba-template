package cn.longshu.spring.cloud.alibaba.auth.controller;

import cn.longshu.spring.cloud.alibaba.auth.entity.SysUser;
import cn.longshu.spring.cloud.alibaba.auth.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 系统用户(SysUser)表控制层
 *
 * @author makejava
 * @since 2024-03-16 16:02:14
 */
//@Slf4j
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
    Logger log = LoggerFactory.getLogger(SysUserController.class);
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/queryById")
    public ResponseEntity<SysUser> queryById(Long id) {

        log.debug("i am debug log");
        log.info("i am info log");
        log.warn("i am warn log");
        log.error("i am error log");
        return ResponseEntity.ok(this.sysUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param sysUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SysUser> add(SysUser sysUser) {
        return ResponseEntity.ok(this.sysUserService.insert(sysUser));
    }

    /**
     * 编辑数据
     *
     * @param sysUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SysUser> edit(SysUser sysUser) {
        return ResponseEntity.ok(this.sysUserService.update(sysUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.sysUserService.deleteById(id));
    }

}

