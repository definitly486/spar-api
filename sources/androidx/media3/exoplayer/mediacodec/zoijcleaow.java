package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import v2.iwizpuwonk;
import y2.jpowsppfya;
import y2.stevsuqkhv;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f10867eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f10868gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MediaCodec f10869iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dxjokdxxww f10870ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final k3.nufgyqmvbu f10871wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f10872zoijcleaow;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C0167zoijcleaow implements nufgyqmvbu.zoijcleaow {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final xa.vdvldrhtss f10873ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f10874wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final xa.vdvldrhtss f10875zoijcleaow;

        public C0167zoijcleaow(final int i13) {
            this(new xa.vdvldrhtss() { // from class: k3.zoijcleaow
                @Override // xa.vdvldrhtss
                public final Object get() {
                    return androidx.media3.exoplayer.mediacodec.zoijcleaow.C0167zoijcleaow.lqeggnwhkg(i13);
                }
            }, new xa.vdvldrhtss() { // from class: k3.ppxfxbqfkf
                @Override // xa.vdvldrhtss
                public final Object get() {
                    return androidx.media3.exoplayer.mediacodec.zoijcleaow.C0167zoijcleaow.nufgyqmvbu(i13);
                }
            });
        }

        private static boolean dxjokdxxww(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            int i13 = stevsuqkhv.f123602iobyxmoadg;
            if (i13 < 34) {
                return false;
            }
            return i13 >= 35 || iwizpuwonk.vdvldrhtss(iobyxmoadgVar.f9769ojitshcjhn);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread lqeggnwhkg(int i13) {
            return new HandlerThread(zoijcleaow.yggfygwlhe(i13));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread nufgyqmvbu(int i13) {
            return new HandlerThread(zoijcleaow.jyumaefscl(i13));
        }

        @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu.zoijcleaow
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public zoijcleaow zoijcleaow(nufgyqmvbu.iobyxmoadg iobyxmoadgVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            dxjokdxxww ppxfxbqfkfVar;
            int i13;
            String str = iobyxmoadgVar.f10842iobyxmoadg.f10806iobyxmoadg;
            zoijcleaow zoijcleaowVar = null;
            try {
                jpowsppfya.iobyxmoadg("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.f10874wkgbmnqykc && dxjokdxxww(iobyxmoadgVar.f10843ppxfxbqfkf)) {
                        ppxfxbqfkfVar = new oxmwwwfdhm(mediaCodecCreateByCodecName);
                        i13 = 4;
                    } else {
                        ppxfxbqfkfVar = new ppxfxbqfkf(mediaCodecCreateByCodecName, (HandlerThread) this.f10873ppxfxbqfkf.get());
                        i13 = 0;
                    }
                    dxjokdxxww dxjokdxxwwVar = ppxfxbqfkfVar;
                    int i14 = i13;
                    zoijcleaow zoijcleaowVar2 = new zoijcleaow(mediaCodecCreateByCodecName, (HandlerThread) this.f10875zoijcleaow.get(), dxjokdxxwwVar, iobyxmoadgVar.f10841gxszxtbevo);
                    try {
                        jpowsppfya.zoijcleaow();
                        Surface surface = iobyxmoadgVar.f10844wkgbmnqykc;
                        if (surface == null && iobyxmoadgVar.f10842iobyxmoadg.f10804gtknphoqwx && stevsuqkhv.f123602iobyxmoadg >= 35) {
                            i14 |= 8;
                        }
                        zoijcleaowVar2.cqumvgiudr(iobyxmoadgVar.f10845zoijcleaow, surface, iobyxmoadgVar.f10840eablkybsjg, i14);
                        return zoijcleaowVar2;
                    } catch (Exception e13) {
                        e = e13;
                        zoijcleaowVar = zoijcleaowVar2;
                        if (zoijcleaowVar != null) {
                            zoijcleaowVar.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e14) {
                    e = e14;
                }
            } catch (Exception e15) {
                e = e15;
                mediaCodecCreateByCodecName = null;
            }
        }

        public void gxszxtbevo(boolean z13) {
            this.f10874wkgbmnqykc = z13;
        }

        public C0167zoijcleaow(xa.vdvldrhtss vdvldrhtssVar, xa.vdvldrhtss vdvldrhtssVar2) {
            this.f10875zoijcleaow = vdvldrhtssVar;
            this.f10873ppxfxbqfkf = vdvldrhtssVar2;
            this.f10874wkgbmnqykc = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cqumvgiudr(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i13) {
        k3.nufgyqmvbu nufgyqmvbuVar;
        this.f10872zoijcleaow.nufgyqmvbu(this.f10869iobyxmoadg);
        jpowsppfya.iobyxmoadg("configureCodec");
        this.f10869iobyxmoadg.configure(mediaFormat, surface, mediaCrypto, i13);
        jpowsppfya.zoijcleaow();
        this.f10870ppxfxbqfkf.start();
        jpowsppfya.iobyxmoadg("startCodec");
        this.f10869iobyxmoadg.start();
        jpowsppfya.zoijcleaow();
        if (stevsuqkhv.f123602iobyxmoadg >= 35 && (nufgyqmvbuVar = this.f10871wkgbmnqykc) != null) {
            nufgyqmvbuVar.zoijcleaow(this.f10869iobyxmoadg);
        }
        this.f10868gxszxtbevo = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void esjtqupxsv(nufgyqmvbu.wkgbmnqykc wkgbmnqykcVar, MediaCodec mediaCodec, long j13, long j14) {
        wkgbmnqykcVar.iobyxmoadg(this, j13, j14);
    }

    private static String iwizpuwonk(int i13, String str) {
        StringBuilder sb3 = new StringBuilder(str);
        if (i13 == 1) {
            sb3.append("Audio");
        } else if (i13 == 2) {
            sb3.append("Video");
        } else {
            sb3.append("Unknown(");
            sb3.append(i13);
            sb3.append(")");
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String jyumaefscl(int i13) {
        return iwizpuwonk(i13, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String yggfygwlhe(int i13) {
        return iwizpuwonk(i13, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public int agtfadlqog(MediaCodec.BufferInfo bufferInfo) {
        this.f10870ppxfxbqfkf.wkgbmnqykc();
        return this.f10872zoijcleaow.wkgbmnqykc(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void btonecajqb(Surface surface) {
        this.f10869iobyxmoadg.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void draadjrbmk(int i13, long j13) {
        this.f10869iobyxmoadg.releaseOutputBuffer(i13, j13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public ByteBuffer dxjokdxxww(int i13) {
        return this.f10869iobyxmoadg.getInputBuffer(i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void eablkybsjg(final nufgyqmvbu.wkgbmnqykc wkgbmnqykcVar, Handler handler) {
        this.f10869iobyxmoadg.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.iobyxmoadg
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j13, long j14) {
                this.f10833iobyxmoadg.esjtqupxsv(wkgbmnqykcVar, mediaCodec, j13, j14);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void flush() {
        this.f10870ppxfxbqfkf.flush();
        this.f10869iobyxmoadg.flush();
        this.f10872zoijcleaow.eablkybsjg();
        this.f10869iobyxmoadg.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public boolean gtknphoqwx() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public MediaFormat gxszxtbevo() {
        return this.f10872zoijcleaow.lqeggnwhkg();
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void iobyxmoadg(int i13, int i14, e3.ppxfxbqfkf ppxfxbqfkfVar, long j13, int i15) {
        this.f10870ppxfxbqfkf.iobyxmoadg(i13, i14, ppxfxbqfkfVar, j13, i15);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void lqeggnwhkg() {
        this.f10869iobyxmoadg.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void nufgyqmvbu(int i13) {
        this.f10869iobyxmoadg.setVideoScalingMode(i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void ojitshcjhn(int i13, boolean z13) {
        this.f10869iobyxmoadg.releaseOutputBuffer(i13, z13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void ppxfxbqfkf(Bundle bundle) {
        this.f10870ppxfxbqfkf.ppxfxbqfkf(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void release() {
        k3.nufgyqmvbu nufgyqmvbuVar;
        k3.nufgyqmvbu nufgyqmvbuVar2;
        try {
            if (this.f10868gxszxtbevo == 1) {
                this.f10870ppxfxbqfkf.shutdown();
                this.f10872zoijcleaow.vdvldrhtss();
            }
            this.f10868gxszxtbevo = 2;
            if (this.f10867eablkybsjg) {
                return;
            }
            try {
                int i13 = stevsuqkhv.f123602iobyxmoadg;
                if (i13 >= 30 && i13 < 33) {
                    this.f10869iobyxmoadg.stop();
                }
            } finally {
                if (stevsuqkhv.f123602iobyxmoadg >= 35 && (nufgyqmvbuVar2 = this.f10871wkgbmnqykc) != null) {
                    nufgyqmvbuVar2.wkgbmnqykc(this.f10869iobyxmoadg);
                }
                this.f10869iobyxmoadg.release();
                this.f10867eablkybsjg = true;
            }
        } catch (Throwable th2) {
            if (!this.f10867eablkybsjg) {
                try {
                    int i14 = stevsuqkhv.f123602iobyxmoadg;
                    if (i14 >= 30 && i14 < 33) {
                        this.f10869iobyxmoadg.stop();
                    }
                } finally {
                    if (stevsuqkhv.f123602iobyxmoadg >= 35 && (nufgyqmvbuVar = this.f10871wkgbmnqykc) != null) {
                        nufgyqmvbuVar.wkgbmnqykc(this.f10869iobyxmoadg);
                    }
                    this.f10869iobyxmoadg.release();
                    this.f10867eablkybsjg = true;
                }
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public ByteBuffer rgvfuqvkyq(int i13) {
        return this.f10869iobyxmoadg.getOutputBuffer(i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public int wflxmlrfwp() {
        this.f10870ppxfxbqfkf.wkgbmnqykc();
        return this.f10872zoijcleaow.ppxfxbqfkf();
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public boolean wkgbmnqykc(nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f10872zoijcleaow.rgvfuqvkyq(ppxfxbqfkfVar);
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.nufgyqmvbu
    public void zoijcleaow(int i13, int i14, int i15, long j13, int i16) {
        this.f10870ppxfxbqfkf.zoijcleaow(i13, i14, i15, j13, i16);
    }

    private zoijcleaow(MediaCodec mediaCodec, HandlerThread handlerThread, dxjokdxxww dxjokdxxwwVar, k3.nufgyqmvbu nufgyqmvbuVar) {
        this.f10869iobyxmoadg = mediaCodec;
        this.f10872zoijcleaow = new eablkybsjg(handlerThread);
        this.f10870ppxfxbqfkf = dxjokdxxwwVar;
        this.f10871wkgbmnqykc = nufgyqmvbuVar;
        this.f10868gxszxtbevo = 0;
    }
}
