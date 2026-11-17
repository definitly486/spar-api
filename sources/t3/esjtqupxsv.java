package t3;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class esjtqupxsv {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final long f109417btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final v2.jyumaefscl f109418draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final int f109419dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f109420eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final iobyxmoadg f109421gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final int f109422gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f109423iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final int f109424lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final int f109425nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f109426ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f109427wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f109428zoijcleaow;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long[] f109429iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long[] f109430zoijcleaow;

        public iobyxmoadg(long[] jArr, long[] jArr2) {
            this.f109429iobyxmoadg = jArr;
            this.f109430zoijcleaow = jArr2;
        }
    }

    public esjtqupxsv(byte[] bArr, int i13) {
        y2.cdpycssgdh cdpycssgdhVar = new y2.cdpycssgdh(bArr);
        cdpycssgdhVar.rgvfuqvkyq(i13 * 8);
        this.f109423iobyxmoadg = cdpycssgdhVar.nufgyqmvbu(16);
        this.f109428zoijcleaow = cdpycssgdhVar.nufgyqmvbu(16);
        this.f109426ppxfxbqfkf = cdpycssgdhVar.nufgyqmvbu(24);
        this.f109427wkgbmnqykc = cdpycssgdhVar.nufgyqmvbu(24);
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(20);
        this.f109420eablkybsjg = iNufgyqmvbu;
        this.f109422gxszxtbevo = btonecajqb(iNufgyqmvbu);
        this.f109424lqeggnwhkg = cdpycssgdhVar.nufgyqmvbu(3) + 1;
        int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(5) + 1;
        this.f109425nufgyqmvbu = iNufgyqmvbu2;
        this.f109419dxjokdxxww = eablkybsjg(iNufgyqmvbu2);
        this.f109417btonecajqb = cdpycssgdhVar.btonecajqb(36);
        this.f109421gtknphoqwx = null;
        this.f109418draadjrbmk = null;
    }

    private static int btonecajqb(int i13) {
        switch (i13) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int eablkybsjg(int i13) {
        if (i13 == 8) {
            return 1;
        }
        if (i13 == 12) {
            return 2;
        }
        if (i13 == 16) {
            return 4;
        }
        if (i13 == 20) {
            return 5;
        }
        if (i13 != 24) {
            return i13 != 32 ? -1 : 7;
        }
        return 6;
    }

    public long dxjokdxxww(long j13) {
        return y2.stevsuqkhv.rgvfuqvkyq((j13 * ((long) this.f109420eablkybsjg)) / 1000000, 0L, this.f109417btonecajqb - 1);
    }

    public long gxszxtbevo() {
        long j13 = this.f109417btonecajqb;
        if (j13 == 0) {
            return -9223372036854775807L;
        }
        return (j13 * 1000000) / ((long) this.f109420eablkybsjg);
    }

    public esjtqupxsv iobyxmoadg(List list) {
        return new esjtqupxsv(this.f109423iobyxmoadg, this.f109428zoijcleaow, this.f109426ppxfxbqfkf, this.f109427wkgbmnqykc, this.f109420eablkybsjg, this.f109424lqeggnwhkg, this.f109425nufgyqmvbu, this.f109417btonecajqb, this.f109421gtknphoqwx, nufgyqmvbu(new v2.jyumaefscl(list)));
    }

    public androidx.media3.common.iobyxmoadg lqeggnwhkg(byte[] bArr, v2.jyumaefscl jyumaefsclVar) {
        bArr[4] = -128;
        int i13 = this.f109427wkgbmnqykc;
        if (i13 <= 0) {
            i13 = -1;
        }
        return new androidx.media3.common.iobyxmoadg.zoijcleaow().zeieaojujs("audio/flac").yfnezrywwk(i13).kegysxyocb(this.f109424lqeggnwhkg).nuxfzjnpeb(this.f109420eablkybsjg).oipsdeybqn(y2.stevsuqkhv.jztzpxfvev(this.f109425nufgyqmvbu)).metgxyhuhe(Collections.singletonList(bArr)).zfvoamnweg(nufgyqmvbu(jyumaefsclVar)).cllcsxoeiz();
    }

    public v2.jyumaefscl nufgyqmvbu(v2.jyumaefscl jyumaefsclVar) {
        v2.jyumaefscl jyumaefsclVar2 = this.f109418draadjrbmk;
        return jyumaefsclVar2 == null ? jyumaefsclVar : jyumaefsclVar2.zoijcleaow(jyumaefsclVar);
    }

    public esjtqupxsv ppxfxbqfkf(List list) {
        return new esjtqupxsv(this.f109423iobyxmoadg, this.f109428zoijcleaow, this.f109426ppxfxbqfkf, this.f109427wkgbmnqykc, this.f109420eablkybsjg, this.f109424lqeggnwhkg, this.f109425nufgyqmvbu, this.f109417btonecajqb, this.f109421gtknphoqwx, nufgyqmvbu(kegysxyocb.wkgbmnqykc(list)));
    }

    public long wkgbmnqykc() {
        long j13;
        long j14;
        int i13 = this.f109427wkgbmnqykc;
        if (i13 > 0) {
            j13 = (((long) i13) + ((long) this.f109426ppxfxbqfkf)) / 2;
            j14 = 1;
        } else {
            int i14 = this.f109423iobyxmoadg;
            j13 = ((((i14 != this.f109428zoijcleaow || i14 <= 0) ? 4096L : i14) * ((long) this.f109424lqeggnwhkg)) * ((long) this.f109425nufgyqmvbu)) / 8;
            j14 = 64;
        }
        return j13 + j14;
    }

    public esjtqupxsv zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        return new esjtqupxsv(this.f109423iobyxmoadg, this.f109428zoijcleaow, this.f109426ppxfxbqfkf, this.f109427wkgbmnqykc, this.f109420eablkybsjg, this.f109424lqeggnwhkg, this.f109425nufgyqmvbu, this.f109417btonecajqb, iobyxmoadgVar, this.f109418draadjrbmk);
    }

    private esjtqupxsv(int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j13, iobyxmoadg iobyxmoadgVar, v2.jyumaefscl jyumaefsclVar) {
        this.f109423iobyxmoadg = i13;
        this.f109428zoijcleaow = i14;
        this.f109426ppxfxbqfkf = i15;
        this.f109427wkgbmnqykc = i16;
        this.f109420eablkybsjg = i17;
        this.f109422gxszxtbevo = btonecajqb(i17);
        this.f109424lqeggnwhkg = i18;
        this.f109425nufgyqmvbu = i19;
        this.f109419dxjokdxxww = eablkybsjg(i19);
        this.f109417btonecajqb = j13;
        this.f109421gtknphoqwx = iobyxmoadgVar;
        this.f109418draadjrbmk = jyumaefsclVar;
    }
}
