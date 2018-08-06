package com.golden.seed.dao;

import com.golden.seed.pojo.CompanyTable;
import com.golden.seed.pojo.CompanyTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyCompanyTableMapper {

    CompanyTable selectCompanyByCompanyName(@Param("companyName") String companyName);

	CompanyTable getCompanyInfo(@Param("companyId") String companyId);

	CompanyTable getCompanyByCompanyIdAndPssword(@Param("companyId") String companyId, @Param("password") String password);
}