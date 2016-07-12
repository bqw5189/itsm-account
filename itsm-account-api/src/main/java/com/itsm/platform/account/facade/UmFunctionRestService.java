package com.itsm.platform.account.facade;

import org.dubbo.x.facade.CURDRestService;
import org.dubbo.x.facade.RestResult;
import org.dubbo.x.util.ConstantVariable;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.itsm.platform.account.entity.UmFunction;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * 功能 接口
 *
 * @author baiqw
 */

@Path("umfunctions")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
@Api(value="umfunctions", description = "功能接口")
public interface UmFunctionRestService extends CURDRestService<UmFunction>{
    /**
     * 功能
     * @return
     */
    @GET
    @Path("")
    @ApiOperation(value = "功能",
            notes = "功能列表.")
    RestResult<List<UmFunction>> list(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token);

    /**
     * 功能 详细信息
     *
     * @return
     */
    @GET
    @Path("/{id}")
    @ApiOperation(value = "详细信息",
            notes = "功能详细信息.")
    RestResult<UmFunction> detail(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token, @ApiParam("id") @PathParam("id") String uuid);

    @POST
    @Path("")
    @ApiOperation(value = "添加/修改功能", notes = "添加/修改功能")
    RestResult<UmFunction> create(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token,UmFunction umFunction);

    @DELETE
    @Path("/{id}")
    @ApiOperation(value = "删除功能", notes = "删除功能")
    RestResult<String> delete(@HeaderParam(ConstantVariable.HEADER_AUTHORIZATION_KEY) String token, @ApiParam("id") @PathParam("id") String uuid);
}
