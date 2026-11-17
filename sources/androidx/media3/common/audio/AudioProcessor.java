package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ByteBuffer f9649iobyxmoadg = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final iobyxmoadg f9650zdlpuopuiu;

        public UnhandledAudioFormatException(iobyxmoadg iobyxmoadgVar) {
            this("Unhandled input format:", iobyxmoadgVar);
        }

        public UnhandledAudioFormatException(String str, iobyxmoadg iobyxmoadgVar) {
            super(str + " " + iobyxmoadgVar);
            this.f9650zdlpuopuiu = iobyxmoadgVar;
        }
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final iobyxmoadg f9651eablkybsjg = new iobyxmoadg(-1, -1, -1);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f9652iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f9653ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f9654wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f9655zoijcleaow;

        public iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            this(iobyxmoadgVar.f9759iozdgvuglv, iobyxmoadgVar.f9779yadqdtsiqt, iobyxmoadgVar.f9766lmojexxdyd);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f9652iobyxmoadg == iobyxmoadgVar.f9652iobyxmoadg && this.f9655zoijcleaow == iobyxmoadgVar.f9655zoijcleaow && this.f9653ppxfxbqfkf == iobyxmoadgVar.f9653ppxfxbqfkf;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f9652iobyxmoadg), Integer.valueOf(this.f9655zoijcleaow), Integer.valueOf(this.f9653ppxfxbqfkf));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f9652iobyxmoadg + ", channelCount=" + this.f9655zoijcleaow + ", encoding=" + this.f9653ppxfxbqfkf + ']';
        }

        public iobyxmoadg(int i13, int i14, int i15) {
            this.f9652iobyxmoadg = i13;
            this.f9655zoijcleaow = i14;
            this.f9653ppxfxbqfkf = i15;
            this.f9654wkgbmnqykc = stevsuqkhv.skhdrjzrfn(i15) ? stevsuqkhv.metgxyhuhe(i15, i14) : -1;
        }
    }

    ByteBuffer eablkybsjg();

    void flush();

    void gxszxtbevo(ByteBuffer byteBuffer);

    boolean isActive();

    void lqeggnwhkg();

    iobyxmoadg nufgyqmvbu(iobyxmoadg iobyxmoadgVar);

    boolean wkgbmnqykc();

    void zoijcleaow();
}
