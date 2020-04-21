package com.ego.manager.service;

import com.ego.common.result.FileResult;

import java.io.InputStream;

/**
 * 上传
 *
 */
public interface UploadService {
    FileResult upload(InputStream inputStream, String fileName);
}
