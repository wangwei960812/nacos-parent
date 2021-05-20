package com.nacos.provider.service.service;

import com.nacos.provider.domain.db.entities.FileStorageInfo;
import com.nacos.provider.domain.db.entities.FileStorageInfoExample;
import com.nacos.provider.domain.db.mapper.FileStorageInfoMapper;
import com.nacos.provider.service.FileStorageInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：黑洞里的光
 * @date ：Created in 2021/5/20 14:38
 * @description：实现类
 */
@Slf4j
@Service
public class FileStorageInfoImpl implements FileStorageInfoService {

    @Resource
    private FileStorageInfoMapper fileStorageInfoMapper;

    @Override
    public String queryPathByName(String fileName) {
        FileStorageInfoExample fileStorageInfoExample = new FileStorageInfoExample();
        FileStorageInfoExample.Criteria criteria = fileStorageInfoExample.createCriteria();
        criteria.andFilenameEqualTo(fileName);
        List<FileStorageInfo> fileStorageInfos = fileStorageInfoMapper.selectByExample(fileStorageInfoExample);
        return fileStorageInfos!=null&&fileStorageInfos.size()>=1?fileStorageInfos.get(0).getLocation():"";
    }
}
