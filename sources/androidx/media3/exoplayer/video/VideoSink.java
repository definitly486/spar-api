package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.wizcaqwiak;
import java.util.List;
import java.util.concurrent.Executor;
import v2.jpowsppfya;
import y2.lmojexxdyd;

/* JADX INFO: loaded from: classes.dex */
public interface VideoSink {

    public static final class VideoSinkException extends Exception {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final androidx.media3.common.iobyxmoadg f11465zdlpuopuiu;

        public VideoSinkException(Throwable th2, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            super(th2);
            this.f11465zdlpuopuiu = iobyxmoadgVar;
        }
    }

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f11466iobyxmoadg = new C0169iobyxmoadg();

        /* JADX INFO: renamed from: androidx.media3.exoplayer.video.VideoSink$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C0169iobyxmoadg implements iobyxmoadg {
            C0169iobyxmoadg() {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.iobyxmoadg
            public void iobyxmoadg(VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.iobyxmoadg
            public void ppxfxbqfkf(VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.iobyxmoadg
            public void zoijcleaow(VideoSink videoSink, jpowsppfya jpowsppfyaVar) {
            }
        }

        void iobyxmoadg(VideoSink videoSink);

        void ppxfxbqfkf(VideoSink videoSink);

        void zoijcleaow(VideoSink videoSink, jpowsppfya jpowsppfyaVar);
    }

    public interface zoijcleaow {
        void iobyxmoadg(long j13);

        void zoijcleaow();
    }

    void agtfadlqog(Surface surface, lmojexxdyd lmojexxdydVar);

    void btonecajqb(long j13, long j14);

    void cqumvgiudr(iobyxmoadg iobyxmoadgVar, Executor executor);

    boolean draadjrbmk(androidx.media3.common.iobyxmoadg iobyxmoadgVar);

    void dxjokdxxww(List list);

    void eablkybsjg(long j13, long j14);

    boolean gtknphoqwx(boolean z13);

    void gxszxtbevo();

    boolean iobyxmoadg(long j13, boolean z13, zoijcleaow zoijcleaowVar);

    boolean isInitialized();

    void iwizpuwonk(boolean z13);

    void jyumaefscl(boolean z13);

    void kcexrzcfyt(int i13);

    void lqeggnwhkg(wizcaqwiak.iobyxmoadg iobyxmoadgVar);

    void nufgyqmvbu();

    Surface ojitshcjhn();

    void oxmwwwfdhm();

    void ppxfxbqfkf();

    void release();

    void rgvfuqvkyq();

    void vdvldrhtss(int i13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, List list);

    void wflxmlrfwp(boolean z13);

    boolean wkgbmnqykc();

    void yggfygwlhe();

    void zdlpuopuiu(float f13);

    void zoijcleaow(r3.lqeggnwhkg lqeggnwhkgVar);
}
