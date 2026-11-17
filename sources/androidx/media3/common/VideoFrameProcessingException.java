package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class VideoFrameProcessingException extends Exception {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final long f9648zdlpuopuiu;

    public VideoFrameProcessingException(Throwable th2, long j13) {
        super(th2);
        this.f9648zdlpuopuiu = j13;
    }

    public static VideoFrameProcessingException iobyxmoadg(Exception exc) {
        return wkgbmnqykc(exc, -9223372036854775807L);
    }

    public static VideoFrameProcessingException wkgbmnqykc(Exception exc, long j13) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j13);
    }
}
