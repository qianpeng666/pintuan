package com.example.myapp.domain.tag.adapter.repository;

import com.example.myapp.domain.tag.model.entity.CrowdTagsJobEntity;
import org.springframework.stereotype.Repository;


public interface ITagRepository {
    CrowdTagsJobEntity queryTagsJobEntity(String tagId, String batchId);

    void addCrowdTagsUserId(String tagId, String userId);

    void updateCrowdTagsStatistics(String tagId, int size);
}
