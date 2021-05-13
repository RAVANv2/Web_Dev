package com.aws.aws_spring.bucket;

public enum BucketName {
    PROFILE_IMAGE("harsh-spring-image-upload");
    private String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    
    public String getBucketName() {
        return this.bucketName;
    }

}
