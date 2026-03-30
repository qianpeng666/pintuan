package com.example.myapp.domain.tag.service;


import com.example.myapp.domain.tag.adapter.repository.ITagRepository;
import com.example.myapp.domain.tag.model.entity.CrowdTagsJobEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class TagService implements ITagService{

    @Resource
    private ITagRepository repository;

    @Override
    public void execTagBatchJob(String tagId, String batchId) {
        //1.查询任务
        CrowdTagsJobEntity crowdTagsJobEntity = repository.queryTagsJobEntity(tagId,batchId);

        //2.根据任务去采集用户数据
        List<String> userIdList = new ArrayList<String>(){{
            add("xiaofuge");
            add("liergou");
        }};
        for(String userId:userIdList){
            repository.addCrowdTagsUserId(tagId,userId);
        }

        repository.updateCrowdTagsStatistics(tagId,userIdList.size());
    }
}
