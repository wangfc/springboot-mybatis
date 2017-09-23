package com.wfc.boot.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

@Intercepts(@Signature(type = Executor.class ,method = "query",args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class }))
public class PageIntercept implements Interceptor {


    public Object intercept(Invocation invocation) throws Throwable {

        Object[] args = invocation.getArgs();
        MappedStatement mappedStatement = (MappedStatement)  args[0];
        SqlSource sqlSource = mappedStatement.getSqlSource();
        RowBounds rowBounds = (RowBounds) args[2];
        args[2] = new RowBounds(1,3);
        BoundSql boundSql = sqlSource.getBoundSql(args[1]);
        String sql1 = boundSql.getSql();
        String sql = sql1 + " limit 1,3 ";
        boundSql = new BoundSql(mappedStatement.getConfiguration(),sql,boundSql.getParameterMappings(),boundSql.getParameterObject());
        sql1 = boundSql.getSql();
        System.out.println(" ============================================================== 前面   ");
        System.out.println(11);
        BoundSql boundSql1 = mappedStatement.getBoundSql(args[1]);
        boundSql1 = boundSql;
        Object proceed = invocation.proceed();
        System.out.printf("");
        System.out.printf("");
        System.out.println(" ============================================================== 后面   ");

        return proceed;
    }

    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }

    public void setProperties(Properties properties) {

    }
}
