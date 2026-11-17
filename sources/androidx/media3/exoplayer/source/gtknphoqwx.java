package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.uwvvkdfqfp;
import f3.hkdspvbjdz;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class gtknphoqwx implements vdvldrhtss {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private com.google.common.util.concurrent.wkgbmnqykc f11146esjtqupxsv;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final byte[] f11148jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final m3.iwizpuwonk f11149yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Uri f11150zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final AtomicBoolean f11147iwizpuwonk = new AtomicBoolean();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final AtomicReference f11145cqumvgiudr = new AtomicReference();

    private final class iobyxmoadg implements m3.oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f11151iobyxmoadg = 0;

        public iobyxmoadg() {
        }

        @Override // m3.oxmwwwfdhm
        public void iobyxmoadg() throws IOException {
            Throwable th2 = (Throwable) gtknphoqwx.this.f11145cqumvgiudr.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        @Override // m3.oxmwwwfdhm
        public boolean ppxfxbqfkf() {
            return gtknphoqwx.this.f11147iwizpuwonk.get();
        }

        @Override // m3.oxmwwwfdhm
        public int wkgbmnqykc(long j13) {
            return 0;
        }

        @Override // m3.oxmwwwfdhm
        public int zoijcleaow(f3.lmojexxdyd lmojexxdydVar, DecoderInputBuffer decoderInputBuffer, int i13) {
            int i14 = this.f11151iobyxmoadg;
            if (i14 == 2) {
                decoderInputBuffer.eablkybsjg(4);
                return -4;
            }
            if ((i13 & 2) != 0 || i14 == 0) {
                lmojexxdydVar.f32682zoijcleaow = gtknphoqwx.this.f11149yggfygwlhe.zoijcleaow(0).iobyxmoadg(0);
                this.f11151iobyxmoadg = 1;
                return -5;
            }
            if (!gtknphoqwx.this.f11147iwizpuwonk.get()) {
                return -3;
            }
            int length = gtknphoqwx.this.f11148jyumaefscl.length;
            decoderInputBuffer.eablkybsjg(1);
            decoderInputBuffer.f10020esjtqupxsv = 0L;
            if ((i13 & 4) == 0) {
                decoderInputBuffer.rgvfuqvkyq(length);
                decoderInputBuffer.f10021iwizpuwonk.put(gtknphoqwx.this.f11148jyumaefscl, 0, length);
            }
            if ((i13 & 1) == 0) {
                this.f11151iobyxmoadg = 2;
            }
            return -4;
        }
    }

    public gtknphoqwx(Uri uri, String str, btonecajqb btonecajqbVar) {
        this.f11150zdlpuopuiu = uri;
        this.f11149yggfygwlhe = new m3.iwizpuwonk(new v2.yadqdtsiqt(new androidx.media3.common.iobyxmoadg.zoijcleaow().zeieaojujs(str).cllcsxoeiz()));
        this.f11148jyumaefscl = uri.toString().getBytes(StandardCharsets.UTF_8);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long btonecajqb() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void draadjrbmk() {
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long dxjokdxxww(long j13) {
        return j13;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public void eablkybsjg(long j13) {
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean iobyxmoadg(uwvvkdfqfp uwvvkdfqfpVar) {
        return !this.f11147iwizpuwonk.get();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long ojitshcjhn(o3.esjtqupxsv[] esjtqupxsvVarArr, boolean[] zArr, m3.oxmwwwfdhm[] oxmwwwfdhmVarArr, boolean[] zArr2, long j13) {
        for (int i13 = 0; i13 < esjtqupxsvVarArr.length; i13++) {
            if (oxmwwwfdhmVarArr[i13] != null && (esjtqupxsvVarArr[i13] == null || !zArr[i13])) {
                oxmwwwfdhmVarArr[i13] = null;
            }
            if (oxmwwwfdhmVarArr[i13] == null && esjtqupxsvVarArr[i13] != null) {
                oxmwwwfdhmVarArr[i13] = new iobyxmoadg();
                zArr2[i13] = true;
            }
        }
        return j13;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean ppxfxbqfkf() {
        return !this.f11147iwizpuwonk.get();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void rgvfuqvkyq(vdvldrhtss.iobyxmoadg iobyxmoadgVar, long j13) {
        iobyxmoadgVar.gxszxtbevo(this);
        new btonecajqb.iobyxmoadg(this.f11150zdlpuopuiu);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public m3.iwizpuwonk vdvldrhtss() {
        return this.f11149yggfygwlhe;
    }

    public void wflxmlrfwp() {
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar = this.f11146esjtqupxsv;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.cancel(false);
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long wkgbmnqykc() {
        return this.f11147iwizpuwonk.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long yggfygwlhe(long j13, hkdspvbjdz hkdspvbjdzVar) {
        return j13;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void zdlpuopuiu(long j13, boolean z13) {
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long zoijcleaow() {
        return this.f11147iwizpuwonk.get() ? Long.MIN_VALUE : 0L;
    }
}
