package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import y2.jpowsppfya;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss implements nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MediaCodec f10864iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k3.nufgyqmvbu f10865zoijcleaow;

    public static class zoijcleaow implements nufgyqmvbu.zoijcleaow {
        protected MediaCodec ppxfxbqfkf(nufgyqmvbu.iobyxmoadg iobyxmoadgVar) throws IOException {
            y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar.f10842iobyxmoadg);
            String str = iobyxmoadgVar.f10842iobyxmoadg.f10806iobyxmoadg;
            jpowsppfya.iobyxmoadg("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            jpowsppfya.zoijcleaow();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0045  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.vdvldrhtss$iobyxmoadg] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu.zoijcleaow
        public nufgyqmvbu zoijcleaow(nufgyqmvbu.iobyxmoadg iobyxmoadgVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecPpxfxbqfkf = ppxfxbqfkf(iobyxmoadgVar);
                try {
                    jpowsppfya.iobyxmoadg("configureCodec");
                    Surface surface = iobyxmoadgVar.f10844wkgbmnqykc;
                    mediaCodecPpxfxbqfkf.configure(iobyxmoadgVar.f10845zoijcleaow, surface, iobyxmoadgVar.f10840eablkybsjg, (surface == null && iobyxmoadgVar.f10842iobyxmoadg.f10804gtknphoqwx && stevsuqkhv.f123602iobyxmoadg >= 35) ? 8 : 0);
                    jpowsppfya.zoijcleaow();
                    jpowsppfya.iobyxmoadg("startCodec");
                    mediaCodecPpxfxbqfkf.start();
                    jpowsppfya.zoijcleaow();
                    return new vdvldrhtss(mediaCodecPpxfxbqfkf, iobyxmoadgVar.f10841gxszxtbevo);
                } catch (IOException e13) {
                    e = e13;
                    mediaCodec = mediaCodecPpxfxbqfkf;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e14) {
                    e = e14;
                    mediaCodec = mediaCodecPpxfxbqfkf;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e15) {
                e = e15;
            } catch (RuntimeException e16) {
                e = e16;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oxmwwwfdhm(nufgyqmvbu.wkgbmnqykc wkgbmnqykcVar, MediaCodec mediaCodec, long j13, long j14) {
        wkgbmnqykcVar.iobyxmoadg(this, j13, j14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public int agtfadlqog(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f10864iobyxmoadg.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void btonecajqb(Surface surface) {
        this.f10864iobyxmoadg.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void draadjrbmk(int i13, long j13) {
        this.f10864iobyxmoadg.releaseOutputBuffer(i13, j13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public ByteBuffer dxjokdxxww(int i13) {
        return this.f10864iobyxmoadg.getInputBuffer(i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void eablkybsjg(final nufgyqmvbu.wkgbmnqykc wkgbmnqykcVar, Handler handler) {
        this.f10864iobyxmoadg.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: k3.jyumaefscl
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j13, long j14) {
                this.f53662iobyxmoadg.oxmwwwfdhm(wkgbmnqykcVar, mediaCodec, j13, j14);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void flush() {
        this.f10864iobyxmoadg.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public boolean gtknphoqwx() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public MediaFormat gxszxtbevo() {
        return this.f10864iobyxmoadg.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void iobyxmoadg(int i13, int i14, e3.ppxfxbqfkf ppxfxbqfkfVar, long j13, int i15) {
        this.f10864iobyxmoadg.queueSecureInputBuffer(i13, i14, ppxfxbqfkfVar.iobyxmoadg(), j13, i15);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void lqeggnwhkg() {
        this.f10864iobyxmoadg.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void nufgyqmvbu(int i13) {
        this.f10864iobyxmoadg.setVideoScalingMode(i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void ojitshcjhn(int i13, boolean z13) {
        this.f10864iobyxmoadg.releaseOutputBuffer(i13, z13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void ppxfxbqfkf(Bundle bundle) {
        this.f10864iobyxmoadg.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void release() {
        k3.nufgyqmvbu nufgyqmvbuVar;
        try {
            int i13 = stevsuqkhv.f123602iobyxmoadg;
            if (i13 >= 30 && i13 < 33) {
                this.f10864iobyxmoadg.stop();
            }
        } finally {
            if (stevsuqkhv.f123602iobyxmoadg >= 35 && (nufgyqmvbuVar = this.f10865zoijcleaow) != null) {
                nufgyqmvbuVar.wkgbmnqykc(this.f10864iobyxmoadg);
            }
            this.f10864iobyxmoadg.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public ByteBuffer rgvfuqvkyq(int i13) {
        return this.f10864iobyxmoadg.getOutputBuffer(i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public int wflxmlrfwp() {
        return this.f10864iobyxmoadg.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void zoijcleaow(int i13, int i14, int i15, long j13, int i16) {
        this.f10864iobyxmoadg.queueInputBuffer(i13, i14, i15, j13, i16);
    }

    private vdvldrhtss(MediaCodec mediaCodec, k3.nufgyqmvbu nufgyqmvbuVar) {
        this.f10864iobyxmoadg = mediaCodec;
        this.f10865zoijcleaow = nufgyqmvbuVar;
        if (stevsuqkhv.f123602iobyxmoadg < 35 || nufgyqmvbuVar == null) {
            return;
        }
        nufgyqmvbuVar.zoijcleaow(mediaCodec);
    }
}
