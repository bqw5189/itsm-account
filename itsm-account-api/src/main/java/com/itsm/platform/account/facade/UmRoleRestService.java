package com.itsm.platform.account.facade;

import org.dubbo.x.facade.CURDRestService;
import org.dubbo.x.facade.RestResult;
import org.dubbo.x.util.ConstantVariable;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.itsm.platform.account.entity.UmRole;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * 角色表 接口
 *
* Created by tom on 2016-07-13 16:11:45.
 */

@Path("umroles")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
@Api(value="umroles", description = "角色表接口")
public interface UmRoleRestService extends CURDRestService<UmRole>{
    /**
     * 角色表
     * @return
     */
    @GET
    @Path("")
    @ApiOperation(value = "角色表",
            notes = "角色表列表.")
    RestResult<List<UmRole>> list(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token);

    /**
     * 角色表 详细信息
     *
     * @return
     */
    @GET
    @Path("/{id}")
    @ApiOperation(value = "详细信息",
            notes = "角色表详细信息.")
    RestResult<UmRole> detail(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token, @ApiParam("id") @PathParam("id") String uuid);

    @POST
    @Path("")
    @ApiOperation(value = "添加/修改角色表", notes = "添加/修改角色表")
    RestResult<UmRole> create(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token,UmRole umRole);

    @DELETE
    @Path("/{id}")
    @ApiOperation(value = "删除角色表", notes = "删除角色表")
    RestResult<String> delete(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token, @ApiParam("id") @PathParam("id") String uuid);
}
