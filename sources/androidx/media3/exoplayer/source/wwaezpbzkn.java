package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.uwvvkdfqfp;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f3.hkdspvbjdz;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class wwaezpbzkn implements vdvldrhtss, Loader.zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    final boolean f11296cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final kcexrzcfyt.iobyxmoadg f11297cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final m3.iwizpuwonk f11298esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    byte[] f11299iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    final androidx.media3.common.iobyxmoadg f11300istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.zoijcleaow f11301iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final b3.wflxmlrfwp f11302jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ArrayList f11303lereixgezr = new ArrayList();

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    int f11304lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final long f11305pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    boolean f11306yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg f11307yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final b3.lqeggnwhkg f11308zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    final Loader f11309zynmafqrjb;

    static final class ppxfxbqfkf implements Loader.eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long f11310iobyxmoadg = m3.dxjokdxxww.iobyxmoadg();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final b3.gtknphoqwx f11311ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private byte[] f11312wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final b3.lqeggnwhkg f11313zoijcleaow;

        public ppxfxbqfkf(b3.lqeggnwhkg lqeggnwhkgVar, androidx.media3.datasource.iobyxmoadg iobyxmoadgVar) {
            this.f11313zoijcleaow = lqeggnwhkgVar;
            this.f11311ppxfxbqfkf = new b3.gtknphoqwx(iobyxmoadgVar);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.eablkybsjg
        public void load() {
            this.f11311ppxfxbqfkf.kcexrzcfyt();
            try {
                this.f11311ppxfxbqfkf.iobyxmoadg(this.f11313zoijcleaow);
                int iZoijcleaow = 0;
                while (iZoijcleaow != -1) {
                    int iRgvfuqvkyq = (int) this.f11311ppxfxbqfkf.rgvfuqvkyq();
                    byte[] bArr = this.f11312wkgbmnqykc;
                    if (bArr == null) {
                        this.f11312wkgbmnqykc = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                    } else if (iRgvfuqvkyq == bArr.length) {
                        this.f11312wkgbmnqykc = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    b3.gtknphoqwx gtknphoqwxVar = this.f11311ppxfxbqfkf;
                    byte[] bArr2 = this.f11312wkgbmnqykc;
                    iZoijcleaow = gtknphoqwxVar.zoijcleaow(bArr2, iRgvfuqvkyq, bArr2.length - iRgvfuqvkyq);
                }
            } finally {
                b3.gxszxtbevo.iobyxmoadg(this.f11311ppxfxbqfkf);
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.eablkybsjg
        public void zoijcleaow() {
        }
    }

    private final class zoijcleaow implements m3.oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f11314iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f11316zoijcleaow;

        private zoijcleaow() {
        }

        private void eablkybsjg() {
            if (this.f11316zoijcleaow) {
                return;
            }
            wwaezpbzkn.this.f11297cqumvgiudr.dxjokdxxww(v2.iwizpuwonk.gtknphoqwx(wwaezpbzkn.this.f11300istkbnxepw.f9769ojitshcjhn), wwaezpbzkn.this.f11300istkbnxepw, 0, null, 0L);
            this.f11316zoijcleaow = true;
        }

        public void gxszxtbevo() {
            if (this.f11314iobyxmoadg == 2) {
                this.f11314iobyxmoadg = 1;
            }
        }

        @Override // m3.oxmwwwfdhm
        public void iobyxmoadg() throws IOException {
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.this;
            if (wwaezpbzknVar.f11296cdpycssgdh) {
                return;
            }
            wwaezpbzknVar.f11309zynmafqrjb.btonecajqb();
        }

        @Override // m3.oxmwwwfdhm
        public boolean ppxfxbqfkf() {
            return wwaezpbzkn.this.f11306yadqdtsiqt;
        }

        @Override // m3.oxmwwwfdhm
        public int wkgbmnqykc(long j13) {
            eablkybsjg();
            if (j13 <= 0 || this.f11314iobyxmoadg == 2) {
                return 0;
            }
            this.f11314iobyxmoadg = 2;
            return 1;
        }

        @Override // m3.oxmwwwfdhm
        public int zoijcleaow(f3.lmojexxdyd lmojexxdydVar, DecoderInputBuffer decoderInputBuffer, int i13) {
            eablkybsjg();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.this;
            boolean z13 = wwaezpbzknVar.f11306yadqdtsiqt;
            if (z13 && wwaezpbzknVar.f11299iozdgvuglv == null) {
                this.f11314iobyxmoadg = 2;
            }
            int i14 = this.f11314iobyxmoadg;
            if (i14 == 2) {
                decoderInputBuffer.eablkybsjg(4);
                return -4;
            }
            if ((i13 & 2) != 0 || i14 == 0) {
                lmojexxdydVar.f32682zoijcleaow = wwaezpbzknVar.f11300istkbnxepw;
                this.f11314iobyxmoadg = 1;
                return -5;
            }
            if (!z13) {
                return -3;
            }
            y2.iobyxmoadg.eablkybsjg(wwaezpbzknVar.f11299iozdgvuglv);
            decoderInputBuffer.eablkybsjg(1);
            decoderInputBuffer.f10020esjtqupxsv = 0L;
            if ((i13 & 4) == 0) {
                decoderInputBuffer.rgvfuqvkyq(wwaezpbzkn.this.f11304lmojexxdyd);
                ByteBuffer byteBuffer = decoderInputBuffer.f10021iwizpuwonk;
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.this;
                byteBuffer.put(wwaezpbzknVar2.f11299iozdgvuglv, 0, wwaezpbzknVar2.f11304lmojexxdyd);
            }
            if ((i13 & 1) == 0) {
                this.f11314iobyxmoadg = 2;
            }
            return -4;
        }
    }

    public wwaezpbzkn(b3.lqeggnwhkg lqeggnwhkgVar, androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadg, b3.wflxmlrfwp wflxmlrfwpVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, long j13, androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar, kcexrzcfyt.iobyxmoadg iobyxmoadgVar2, boolean z13, q3.iobyxmoadg iobyxmoadgVar3) {
        this.f11308zdlpuopuiu = lqeggnwhkgVar;
        this.f11307yggfygwlhe = interfaceC0162iobyxmoadg;
        this.f11302jyumaefscl = wflxmlrfwpVar;
        this.f11300istkbnxepw = iobyxmoadgVar;
        this.f11305pmvmpeiblj = j13;
        this.f11301iwizpuwonk = zoijcleaowVar;
        this.f11297cqumvgiudr = iobyxmoadgVar2;
        this.f11296cdpycssgdh = z13;
        this.f11298esjtqupxsv = new m3.iwizpuwonk(new v2.yadqdtsiqt(iobyxmoadgVar));
        this.f11309zynmafqrjb = iobyxmoadgVar3 != null ? new Loader(iobyxmoadgVar3) : new Loader("SingleSampleMediaPeriod");
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.zoijcleaow
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public Loader.ppxfxbqfkf lqeggnwhkg(ppxfxbqfkf ppxfxbqfkfVar, long j13, long j14, IOException iOException, int i13) {
        Loader.ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg;
        b3.gtknphoqwx gtknphoqwxVar = ppxfxbqfkfVar.f11311ppxfxbqfkf;
        m3.dxjokdxxww dxjokdxxwwVar = new m3.dxjokdxxww(ppxfxbqfkfVar.f11310iobyxmoadg, ppxfxbqfkfVar.f11313zoijcleaow, gtknphoqwxVar.vdvldrhtss(), gtknphoqwxVar.oxmwwwfdhm(), j13, j14, gtknphoqwxVar.rgvfuqvkyq());
        long jIobyxmoadg = this.f11301iwizpuwonk.iobyxmoadg(new androidx.media3.exoplayer.upstream.zoijcleaow.iobyxmoadg(dxjokdxxwwVar, new m3.btonecajqb(1, -1, this.f11300istkbnxepw, 0, null, 0L, stevsuqkhv.t(this.f11305pmvmpeiblj)), iOException, i13));
        boolean z13 = jIobyxmoadg == -9223372036854775807L || i13 >= this.f11301iwizpuwonk.zoijcleaow(1);
        if (this.f11296cdpycssgdh && z13) {
            y2.kcexrzcfyt.dxjokdxxww("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f11306yadqdtsiqt = true;
            ppxfxbqfkfVarLqeggnwhkg = Loader.f11422gxszxtbevo;
        } else {
            ppxfxbqfkfVarLqeggnwhkg = jIobyxmoadg != -9223372036854775807L ? Loader.lqeggnwhkg(false, jIobyxmoadg) : Loader.f11423lqeggnwhkg;
        }
        Loader.ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVarLqeggnwhkg;
        boolean zPpxfxbqfkf = ppxfxbqfkfVar2.ppxfxbqfkf();
        this.f11297cqumvgiudr.yggfygwlhe(dxjokdxxwwVar, 1, -1, this.f11300istkbnxepw, 0, null, 0L, this.f11305pmvmpeiblj, iOException, !zPpxfxbqfkf);
        if (!zPpxfxbqfkf) {
            this.f11301iwizpuwonk.ppxfxbqfkf(ppxfxbqfkfVar.f11310iobyxmoadg);
        }
        return ppxfxbqfkfVar2;
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
        for (int i13 = 0; i13 < this.f11303lereixgezr.size(); i13++) {
            ((zoijcleaow) this.f11303lereixgezr.get(i13)).gxszxtbevo();
        }
        return j13;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public void eablkybsjg(long j13) {
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.zoijcleaow
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void oxmwwwfdhm(ppxfxbqfkf ppxfxbqfkfVar, long j13, long j14) {
        this.f11304lmojexxdyd = (int) ppxfxbqfkfVar.f11311ppxfxbqfkf.rgvfuqvkyq();
        this.f11299iozdgvuglv = (byte[]) y2.iobyxmoadg.eablkybsjg(ppxfxbqfkfVar.f11312wkgbmnqykc);
        this.f11306yadqdtsiqt = true;
        b3.gtknphoqwx gtknphoqwxVar = ppxfxbqfkfVar.f11311ppxfxbqfkf;
        m3.dxjokdxxww dxjokdxxwwVar = new m3.dxjokdxxww(ppxfxbqfkfVar.f11310iobyxmoadg, ppxfxbqfkfVar.f11313zoijcleaow, gtknphoqwxVar.vdvldrhtss(), gtknphoqwxVar.oxmwwwfdhm(), j13, j14, this.f11304lmojexxdyd);
        this.f11301iwizpuwonk.ppxfxbqfkf(ppxfxbqfkfVar.f11310iobyxmoadg);
        this.f11297cqumvgiudr.kcexrzcfyt(dxjokdxxwwVar, 1, -1, this.f11300istkbnxepw, 0, null, 0L, this.f11305pmvmpeiblj);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean iobyxmoadg(uwvvkdfqfp uwvvkdfqfpVar) {
        if (this.f11306yadqdtsiqt || this.f11309zynmafqrjb.dxjokdxxww() || this.f11309zynmafqrjb.nufgyqmvbu()) {
            return false;
        }
        androidx.media3.datasource.iobyxmoadg iobyxmoadgVarIobyxmoadg = this.f11307yggfygwlhe.iobyxmoadg();
        b3.wflxmlrfwp wflxmlrfwpVar = this.f11302jyumaefscl;
        if (wflxmlrfwpVar != null) {
            iobyxmoadgVarIobyxmoadg.eablkybsjg(wflxmlrfwpVar);
        }
        this.f11309zynmafqrjb.agtfadlqog(new ppxfxbqfkf(this.f11308zdlpuopuiu, iobyxmoadgVarIobyxmoadg), this, this.f11301iwizpuwonk.zoijcleaow(1));
        return true;
    }

    public void iwizpuwonk() {
        this.f11309zynmafqrjb.draadjrbmk();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.zoijcleaow
    /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
    public void wflxmlrfwp(ppxfxbqfkf ppxfxbqfkfVar, long j13, long j14, int i13) {
        b3.gtknphoqwx gtknphoqwxVar = ppxfxbqfkfVar.f11311ppxfxbqfkf;
        this.f11297cqumvgiudr.iwizpuwonk(i13 == 0 ? new m3.dxjokdxxww(ppxfxbqfkfVar.f11310iobyxmoadg, ppxfxbqfkfVar.f11313zoijcleaow, j13) : new m3.dxjokdxxww(ppxfxbqfkfVar.f11310iobyxmoadg, ppxfxbqfkfVar.f11313zoijcleaow, gtknphoqwxVar.vdvldrhtss(), gtknphoqwxVar.oxmwwwfdhm(), j13, j14, gtknphoqwxVar.rgvfuqvkyq()), 1, -1, this.f11300istkbnxepw, 0, null, 0L, this.f11305pmvmpeiblj, i13);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.zoijcleaow
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public void jyumaefscl(ppxfxbqfkf ppxfxbqfkfVar, long j13, long j14, boolean z13) {
        b3.gtknphoqwx gtknphoqwxVar = ppxfxbqfkfVar.f11311ppxfxbqfkf;
        m3.dxjokdxxww dxjokdxxwwVar = new m3.dxjokdxxww(ppxfxbqfkfVar.f11310iobyxmoadg, ppxfxbqfkfVar.f11313zoijcleaow, gtknphoqwxVar.vdvldrhtss(), gtknphoqwxVar.oxmwwwfdhm(), j13, j14, gtknphoqwxVar.rgvfuqvkyq());
        this.f11301iwizpuwonk.ppxfxbqfkf(ppxfxbqfkfVar.f11310iobyxmoadg);
        this.f11297cqumvgiudr.vdvldrhtss(dxjokdxxwwVar, 1, -1, null, 0, null, 0L, this.f11305pmvmpeiblj);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long ojitshcjhn(o3.esjtqupxsv[] esjtqupxsvVarArr, boolean[] zArr, m3.oxmwwwfdhm[] oxmwwwfdhmVarArr, boolean[] zArr2, long j13) {
        for (int i13 = 0; i13 < esjtqupxsvVarArr.length; i13++) {
            m3.oxmwwwfdhm oxmwwwfdhmVar = oxmwwwfdhmVarArr[i13];
            if (oxmwwwfdhmVar != null && (esjtqupxsvVarArr[i13] == null || !zArr[i13])) {
                this.f11303lereixgezr.remove(oxmwwwfdhmVar);
                oxmwwwfdhmVarArr[i13] = null;
            }
            if (oxmwwwfdhmVarArr[i13] == null && esjtqupxsvVarArr[i13] != null) {
                zoijcleaow zoijcleaowVar = new zoijcleaow();
                this.f11303lereixgezr.add(zoijcleaowVar);
                oxmwwwfdhmVarArr[i13] = zoijcleaowVar;
                zArr2[i13] = true;
            }
        }
        return j13;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean ppxfxbqfkf() {
        return this.f11309zynmafqrjb.dxjokdxxww();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void rgvfuqvkyq(vdvldrhtss.iobyxmoadg iobyxmoadgVar, long j13) {
        iobyxmoadgVar.gxszxtbevo(this);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public m3.iwizpuwonk vdvldrhtss() {
        return this.f11298esjtqupxsv;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long wkgbmnqykc() {
        return this.f11306yadqdtsiqt ? Long.MIN_VALUE : 0L;
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
        return (this.f11306yadqdtsiqt || this.f11309zynmafqrjb.dxjokdxxww()) ? Long.MIN_VALUE : 0L;
    }
}
