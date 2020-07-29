package com.codewithnaveen.videoconverter;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;

import androidx.annotation.NonNull;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;

public class AndroidMuxer implements Muxer {

    private MediaMuxer muxer;

    AndroidMuxer(final @NonNull File file) throws IOException {
        muxer = new MediaMuxer(file.getAbsolutePath(), MediaMuxer.OutputFormat.MUXER_OUTPUT_MPEG_4);
    }

    @TargetApi(26)
    AndroidMuxer(final @NonNull FileDescriptor fileDescriptor) throws IOException {
        muxer = new MediaMuxer(fileDescriptor, MediaMuxer.OutputFormat.MUXER_OUTPUT_MPEG_4);
    }


    @Override
    public void start() {
        muxer.start();
    }

    @Override
    public void stop() {
        muxer.stop();
    }

    @Override
    public int addTrack(final @NonNull MediaFormat format) {
        return muxer.addTrack(format);
    }

    @Override
    public void writeSampleData(final int trackIndex, final @NonNull ByteBuffer byteBuf, final @NonNull MediaCodec.BufferInfo bufferInfo) {
        muxer.writeSampleData(trackIndex, byteBuf, bufferInfo);
    }

    @Override
    public void release() {
        muxer.release();
    }
}
