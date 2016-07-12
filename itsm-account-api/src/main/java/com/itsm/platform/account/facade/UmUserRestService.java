package com.itsm.platform.account.facade;

import org.dubbo.x.facade.CURDRestService;
import org.dubbo.x.facade.RestResult;
import org.dubbo.x.util.ConstantVariable;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.itsm.platform.account.entity.UmUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * 用户 接口
 *
 * @author baiqw
 */

@Path("umusers")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
@Api(value="umusers", description = "用户接口")
public interface UmUserRestService extends CURDRestService<UmUser>{
    /**
     * 用户
     * @return
     */
    @GET
    @Path("")
    @ApiOperation(value = "用户",
            notes = "用户列表.")
    RestResult<List<UmUser>> list(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token);

    /**
     * 用户 详细信息
     *
     * @return
     */
    @GET
    @Path("/{id}")
    @ApiOperation(value = "详细信息",
            notes = "用户详细信息.")
    RestResult<UmUser> detail(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token, @ApiParam("id") @PathParam("id") String uuid);

    @POST
    @Path("")
    @ApiOperation(value = "添加/修改用户", notes = "添加/修改用户")
    RestResult<UmUser> create(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token,UmUser umUser);

    @DELETE
    @Path("/{id}")
    @ApiOperation(value = "删除用户", notes = "删除用户")
    RestResult<String> delete(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token, @ApiParam("id") @PathParam("id") String uuid);
}
