package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface nufgyqmvbu {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final MediaCrypto f10840eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final k3.nufgyqmvbu f10841gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final btonecajqb f10842iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final androidx.media3.common.iobyxmoadg f10843ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final Surface f10844wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final MediaFormat f10845zoijcleaow;

        private iobyxmoadg(btonecajqb btonecajqbVar, MediaFormat mediaFormat, androidx.media3.common.iobyxmoadg iobyxmoadgVar, Surface surface, MediaCrypto mediaCrypto, k3.nufgyqmvbu nufgyqmvbuVar) {
            this.f10842iobyxmoadg = btonecajqbVar;
            this.f10845zoijcleaow = mediaFormat;
            this.f10843ppxfxbqfkf = iobyxmoadgVar;
            this.f10844wkgbmnqykc = surface;
            this.f10840eablkybsjg = mediaCrypto;
            this.f10841gxszxtbevo = nufgyqmvbuVar;
        }

        public static iobyxmoadg iobyxmoadg(btonecajqb btonecajqbVar, MediaFormat mediaFormat, androidx.media3.common.iobyxmoadg iobyxmoadgVar, MediaCrypto mediaCrypto, k3.nufgyqmvbu nufgyqmvbuVar) {
            return new iobyxmoadg(btonecajqbVar, mediaFormat, iobyxmoadgVar, null, mediaCrypto, nufgyqmvbuVar);
        }

        public static iobyxmoadg zoijcleaow(btonecajqb btonecajqbVar, MediaFormat mediaFormat, androidx.media3.common.iobyxmoadg iobyxmoadgVar, Surface surface, MediaCrypto mediaCrypto) {
            return new iobyxmoadg(btonecajqbVar, mediaFormat, iobyxmoadgVar, surface, mediaCrypto, null);
        }
    }

    public interface ppxfxbqfkf {
        void iobyxmoadg();

        void zoijcleaow();
    }

    public interface wkgbmnqykc {
        void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, long j13, long j14);
    }

    public interface zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f10846iobyxmoadg = new lqeggnwhkg();

        static zoijcleaow iobyxmoadg(Context context) {
            return new lqeggnwhkg(context);
        }

        nufgyqmvbu zoijcleaow(iobyxmoadg iobyxmoadgVar);
    }

    int agtfadlqog(MediaCodec.BufferInfo bufferInfo);

    void btonecajqb(Surface surface);

    void draadjrbmk(int i13, long j13);

    ByteBuffer dxjokdxxww(int i13);

    void eablkybsjg(wkgbmnqykc wkgbmnqykcVar, Handler handler);

    void flush();

    boolean gtknphoqwx();

    MediaFormat gxszxtbevo();

    void iobyxmoadg(int i13, int i14, e3.ppxfxbqfkf ppxfxbqfkfVar, long j13, int i15);

    void lqeggnwhkg();

    void nufgyqmvbu(int i13);

    void ojitshcjhn(int i13, boolean z13);

    void ppxfxbqfkf(Bundle bundle);

    void release();

    ByteBuffer rgvfuqvkyq(int i13);

    int wflxmlrfwp();

    default boolean wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
        return false;
    }

    void zoijcleaow(int i13, int i14, int i15, long j13, int i16);
}
