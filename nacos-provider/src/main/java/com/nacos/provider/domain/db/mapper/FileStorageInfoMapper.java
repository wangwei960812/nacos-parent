package com.nacos.provider.domain.db.mapper;

import com.nacos.provider.domain.db.entities.FileStorageInfo;
import com.nacos.provider.domain.db.entities.FileStorageInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileStorageInfoMapper {
    int countByExample(FileStorageInfoExample example);

    int deleteByExample(FileStorageInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FileStorageInfo record);

    int insertSelective(FileStorageInfo record);

    List<FileStorageInfo> selectByExample(FileStorageInfoExample example);

    FileStorageInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FileStorageInfo record, @Param("example") FileStorageInfoExample example);

    int updateByExample(@Param("record") FileStorageInfo record, @Param("example") FileStorageInfoExample example);

    int updateByPrimaryKeySelective(FileStorageInfo record);

    int updateByPrimaryKey(FileStorageInfo record);
}