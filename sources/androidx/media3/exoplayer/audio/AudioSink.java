package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import g3.h0;
import java.nio.ByteBuffer;
import v2.cqumvgiudr;

/* JADX INFO: loaded from: classes.dex */
public interface AudioSink {

    public static final class UnexpectedDiscontinuityException extends Exception {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final long f10080yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final long f10081zdlpuopuiu;

        public UnexpectedDiscontinuityException(long j13, long j14) {
            super("Unexpected audio track timestamp discontinuity: expected " + j14 + ", got " + j13);
            this.f10081zdlpuopuiu = j13;
            this.f10080yggfygwlhe = j14;
        }
    }

    public static final class WriteException extends Exception {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public final androidx.media3.common.iobyxmoadg f10082jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final boolean f10083yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final int f10084zdlpuopuiu;

        public WriteException(int i13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, boolean z13) {
            super("AudioTrack write failed: " + i13);
            this.f10083yggfygwlhe = z13;
            this.f10084zdlpuopuiu = i13;
            this.f10082jyumaefscl = iobyxmoadgVar;
        }
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final boolean f10085eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final int f10086gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f10087iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f10088ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final boolean f10089wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f10090zoijcleaow;

        public iobyxmoadg(int i13, int i14, int i15, boolean z13, boolean z14, int i16) {
            this.f10087iobyxmoadg = i13;
            this.f10090zoijcleaow = i14;
            this.f10088ppxfxbqfkf = i15;
            this.f10089wkgbmnqykc = z13;
            this.f10085eablkybsjg = z14;
            this.f10086gxszxtbevo = i16;
        }
    }

    public interface zoijcleaow {
        void btonecajqb();

        void dxjokdxxww();

        void eablkybsjg(Exception exc);

        void gtknphoqwx();

        void gxszxtbevo();

        void iobyxmoadg(iobyxmoadg iobyxmoadgVar);

        void lqeggnwhkg();

        void nufgyqmvbu(int i13, long j13, long j14);

        void ppxfxbqfkf(iobyxmoadg iobyxmoadgVar);

        void wkgbmnqykc(boolean z13);

        void zoijcleaow(long j13);
    }

    void agtfadlqog(int i13);

    boolean btonecajqb();

    void cdpycssgdh(boolean z13);

    default void cqumvgiudr(long j13) {
    }

    long draadjrbmk();

    void dxjokdxxww(AudioDeviceInfo audioDeviceInfo);

    void eablkybsjg(cqumvgiudr cqumvgiudrVar);

    void esjtqupxsv();

    void flush();

    void gtknphoqwx(int i13);

    boolean iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar);

    int istkbnxepw(androidx.media3.common.iobyxmoadg iobyxmoadgVar);

    long iwizpuwonk(boolean z13);

    void jyumaefscl(v2.ppxfxbqfkf ppxfxbqfkfVar);

    void kcexrzcfyt(androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i13, int[] iArr);

    void lereixgezr(float f13);

    cqumvgiudr lqeggnwhkg();

    wkgbmnqykc nufgyqmvbu(androidx.media3.common.iobyxmoadg iobyxmoadgVar);

    void ojitshcjhn();

    void oxmwwwfdhm(h0 h0Var);

    void pause();

    void play();

    void pmvmpeiblj();

    void release();

    void rgvfuqvkyq(y2.dxjokdxxww dxjokdxxwwVar);

    boolean vdvldrhtss(ByteBuffer byteBuffer, long j13, int i13);

    void wflxmlrfwp(zoijcleaow zoijcleaowVar);

    boolean wkgbmnqykc();

    void yggfygwlhe(int i13, int i14);

    void zdlpuopuiu();

    void zoijcleaow();

    void zynmafqrjb(v2.gxszxtbevo gxszxtbevoVar);

    public static final class ConfigurationException extends Exception {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final androidx.media3.common.iobyxmoadg f10076zdlpuopuiu;

        public ConfigurationException(Throwable th2, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            super(th2);
            this.f10076zdlpuopuiu = iobyxmoadgVar;
        }

        public ConfigurationException(String str, androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            super(str);
            this.f10076zdlpuopuiu = iobyxmoadgVar;
        }
    }

    public static final class InitializationException extends Exception {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public final androidx.media3.common.iobyxmoadg f10077jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final boolean f10078yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final int f10079zdlpuopuiu;

        public InitializationException(String str, int i13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, boolean z13, Throwable th2) {
            super(str, th2);
            this.f10079zdlpuopuiu = i13;
            this.f10078yggfygwlhe = z13;
            this.f10077jyumaefscl = iobyxmoadgVar;
        }

        public InitializationException(int i13, int i14, int i15, int i16, androidx.media3.common.iobyxmoadg iobyxmoadgVar, boolean z13, Exception exc) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("AudioTrack init failed ");
            sb3.append(i13);
            sb3.append(" ");
            sb3.append("Config(");
            sb3.append(i14);
            sb3.append(", ");
            sb3.append(i15);
            sb3.append(", ");
            sb3.append(i16);
            sb3.append(")");
            sb3.append(" ");
            sb3.append(iobyxmoadgVar);
            sb3.append(z13 ? " (recoverable)" : "");
            this(sb3.toString(), i13, iobyxmoadgVar, z13, exc);
        }
    }
}
