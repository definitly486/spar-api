package q4;

import java.io.EOFException;
import t3.dsvhmnatus;
import v2.iwizpuwonk;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class yggfygwlhe implements dsvhmnatus {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f77839btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f77840dxjokdxxww;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dsvhmnatus f77843iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private oxmwwwfdhm f77845nufgyqmvbu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final oxmwwwfdhm.iobyxmoadg f77848zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f77846ppxfxbqfkf = new wkgbmnqykc();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f77841eablkybsjg = 0;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f77842gxszxtbevo = 0;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private byte[] f77844lqeggnwhkg = stevsuqkhv.f123601gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yadqdtsiqt f77847wkgbmnqykc = new yadqdtsiqt();

    public yggfygwlhe(dsvhmnatus dsvhmnatusVar, oxmwwwfdhm.iobyxmoadg iobyxmoadgVar) {
        this.f77843iobyxmoadg = dsvhmnatusVar;
        this.f77848zoijcleaow = iobyxmoadgVar;
    }

    private void dxjokdxxww(int i13) {
        int length = this.f77844lqeggnwhkg.length;
        int i14 = this.f77842gxszxtbevo;
        if (length - i14 >= i13) {
            return;
        }
        int i15 = i14 - this.f77841eablkybsjg;
        int iMax = Math.max(i15 * 2, i13 + i15);
        byte[] bArr = this.f77844lqeggnwhkg;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f77841eablkybsjg, bArr2, 0, i15);
        this.f77841eablkybsjg = 0;
        this.f77842gxszxtbevo = i15;
        this.f77844lqeggnwhkg = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(eablkybsjg eablkybsjgVar, long j13, int i13) {
        y2.iobyxmoadg.dxjokdxxww(this.f77840dxjokdxxww);
        byte[] bArrIobyxmoadg = this.f77846ppxfxbqfkf.iobyxmoadg(eablkybsjgVar.f77819iobyxmoadg, eablkybsjgVar.f77820ppxfxbqfkf);
        this.f77847wkgbmnqykc.mbcevpiqjq(bArrIobyxmoadg);
        this.f77843iobyxmoadg.lqeggnwhkg(this.f77847wkgbmnqykc, bArrIobyxmoadg.length);
        long j14 = eablkybsjgVar.f77822zoijcleaow;
        if (j14 == -9223372036854775807L) {
            y2.iobyxmoadg.lqeggnwhkg(this.f77840dxjokdxxww.f9782zdlpuopuiu == Long.MAX_VALUE);
        } else {
            long j15 = this.f77840dxjokdxxww.f9782zdlpuopuiu;
            j13 = j15 == Long.MAX_VALUE ? j13 + j14 : j14 + j15;
        }
        this.f77843iobyxmoadg.zoijcleaow(j13, i13 | 1, bArrIobyxmoadg.length, 0, null);
    }

    public void draadjrbmk(boolean z13) {
        this.f77839btonecajqb = z13;
    }

    @Override // t3.dsvhmnatus
    public void iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar.f9769ojitshcjhn);
        y2.iobyxmoadg.iobyxmoadg(iwizpuwonk.gtknphoqwx(iobyxmoadgVar.f9769ojitshcjhn) == 3);
        if (!iobyxmoadgVar.equals(this.f77840dxjokdxxww)) {
            this.f77840dxjokdxxww = iobyxmoadgVar;
            this.f77845nufgyqmvbu = this.f77848zoijcleaow.iobyxmoadg(iobyxmoadgVar) ? this.f77848zoijcleaow.ppxfxbqfkf(iobyxmoadgVar) : null;
        }
        if (this.f77845nufgyqmvbu == null) {
            this.f77843iobyxmoadg.iobyxmoadg(iobyxmoadgVar);
        } else {
            this.f77843iobyxmoadg.iobyxmoadg(iobyxmoadgVar.zoijcleaow().zeieaojujs("application/x-media3-cues").tzroggbefp(iobyxmoadgVar.f9769ojitshcjhn).uawqvzlxes(Long.MAX_VALUE).sopmlzcsov(this.f77848zoijcleaow.zoijcleaow(iobyxmoadgVar)).cllcsxoeiz());
        }
    }

    @Override // t3.dsvhmnatus
    public int ppxfxbqfkf(v2.btonecajqb btonecajqbVar, int i13, boolean z13, int i14) throws EOFException {
        if (this.f77845nufgyqmvbu == null) {
            return this.f77843iobyxmoadg.ppxfxbqfkf(btonecajqbVar, i13, z13, i14);
        }
        dxjokdxxww(i13);
        int iZoijcleaow = btonecajqbVar.zoijcleaow(this.f77844lqeggnwhkg, this.f77842gxszxtbevo, i13);
        if (iZoijcleaow != -1) {
            this.f77842gxszxtbevo += iZoijcleaow;
            return iZoijcleaow;
        }
        if (z13) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // t3.dsvhmnatus
    public void wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar, int i13, int i14) {
        if (this.f77845nufgyqmvbu == null) {
            this.f77843iobyxmoadg.wkgbmnqykc(yadqdtsiqtVar, i13, i14);
            return;
        }
        dxjokdxxww(i13);
        yadqdtsiqtVar.draadjrbmk(this.f77844lqeggnwhkg, this.f77842gxszxtbevo, i13);
        this.f77842gxszxtbevo += i13;
    }

    @Override // t3.dsvhmnatus
    public void zoijcleaow(final long j13, final int i13, int i14, int i15, dsvhmnatus.iobyxmoadg iobyxmoadgVar) {
        if (this.f77845nufgyqmvbu == null) {
            this.f77843iobyxmoadg.zoijcleaow(j13, i13, i14, i15, iobyxmoadgVar);
            return;
        }
        y2.iobyxmoadg.zoijcleaow(iobyxmoadgVar == null, "DRM on subtitles is not supported");
        int i16 = (this.f77842gxszxtbevo - i15) - i14;
        try {
            this.f77845nufgyqmvbu.ppxfxbqfkf(this.f77844lqeggnwhkg, i16, i14, oxmwwwfdhm.zoijcleaow.zoijcleaow(), new y2.wflxmlrfwp() { // from class: q4.zdlpuopuiu
                @Override // y2.wflxmlrfwp
                public final void accept(Object obj) {
                    this.f77849iobyxmoadg.btonecajqb(j13, i13, (eablkybsjg) obj);
                }
            });
        } catch (RuntimeException e13) {
            if (!this.f77839btonecajqb) {
                throw e13;
            }
            y2.kcexrzcfyt.dxjokdxxww("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e13);
        }
        int i17 = i16 + i14;
        this.f77841eablkybsjg = i17;
        if (i17 == this.f77842gxszxtbevo) {
            this.f77841eablkybsjg = 0;
            this.f77842gxszxtbevo = 0;
        }
    }
}
