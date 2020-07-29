[![GitHub license](https://img.shields.io/github/license/naveen364/VideoConverter)](https://github.com/naveen364/VideoConverter/blob/master/LICENSE)

https://img.shields.io/badge/AndroidSDK-4.0-orange

# VideoConverter
Video file conversion library based on <a href="https://android.googlesource.com/platform/cts/+/jb-mr2-release/tests/tests/media/src/android/media/cts/ExtractDecodeEditEncodeMuxTest.java">ExtractDecodeEditEncodeMuxTest.java</a> CTS test


## Usage
```java
MediaConverter converter = new MediaConverter();
converter.setInput(context, uri);
converter.setOutput(outputStream);
converter.setTimeRange(timeFrom, timeTo);
converter.setVideoResolution(360);
converter.setVideoBitrate(2000000);
converter.setAudioBitrate(128000);

converter.setListener(percent -> {
    publishProgress(percent);
    return isCancelled();
});

converter.convert();
```
