package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import t3.dsvhmnatus;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
class cdpycssgdh {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private iobyxmoadg f11106eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private iobyxmoadg f11107gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final p3.zoijcleaow f11108iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f11109lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y2.yadqdtsiqt f11110ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private iobyxmoadg f11111wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f11112zoijcleaow;

    private static final class iobyxmoadg implements p3.zoijcleaow.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public long f11113iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public p3.iobyxmoadg f11114ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public iobyxmoadg f11115wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public long f11116zoijcleaow;

        public iobyxmoadg(long j13, int i13) {
            wkgbmnqykc(j13, i13);
        }

        public int eablkybsjg(long j13) {
            return ((int) (j13 - this.f11113iobyxmoadg)) + this.f11114ppxfxbqfkf.f75476zoijcleaow;
        }

        @Override // p3.zoijcleaow.iobyxmoadg
        public p3.iobyxmoadg iobyxmoadg() {
            return (p3.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11114ppxfxbqfkf);
        }

        @Override // p3.zoijcleaow.iobyxmoadg
        public p3.zoijcleaow.iobyxmoadg next() {
            iobyxmoadg iobyxmoadgVar = this.f11115wkgbmnqykc;
            if (iobyxmoadgVar == null || iobyxmoadgVar.f11114ppxfxbqfkf == null) {
                return null;
            }
            return iobyxmoadgVar;
        }

        public void ppxfxbqfkf(p3.iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
            this.f11114ppxfxbqfkf = iobyxmoadgVar;
            this.f11115wkgbmnqykc = iobyxmoadgVar2;
        }

        public void wkgbmnqykc(long j13, int i13) {
            y2.iobyxmoadg.lqeggnwhkg(this.f11114ppxfxbqfkf == null);
            this.f11113iobyxmoadg = j13;
            this.f11116zoijcleaow = j13 + ((long) i13);
        }

        public iobyxmoadg zoijcleaow() {
            this.f11114ppxfxbqfkf = null;
            iobyxmoadg iobyxmoadgVar = this.f11115wkgbmnqykc;
            this.f11115wkgbmnqykc = null;
            return iobyxmoadgVar;
        }
    }

    public cdpycssgdh(p3.zoijcleaow zoijcleaowVar) {
        this.f11108iobyxmoadg = zoijcleaowVar;
        int iEablkybsjg = zoijcleaowVar.eablkybsjg();
        this.f11112zoijcleaow = iEablkybsjg;
        this.f11110ppxfxbqfkf = new y2.yadqdtsiqt(32);
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(0L, iEablkybsjg);
        this.f11111wkgbmnqykc = iobyxmoadgVar;
        this.f11106eablkybsjg = iobyxmoadgVar;
        this.f11107gxszxtbevo = iobyxmoadgVar;
    }

    private static iobyxmoadg btonecajqb(iobyxmoadg iobyxmoadgVar, DecoderInputBuffer decoderInputBuffer, iozdgvuglv.zoijcleaow zoijcleaowVar, y2.yadqdtsiqt yadqdtsiqtVar) {
        long j13 = zoijcleaowVar.f11204zoijcleaow;
        int iWypolnanlu = 1;
        yadqdtsiqtVar.tzroggbefp(1);
        iobyxmoadg iobyxmoadgVarDxjokdxxww = dxjokdxxww(iobyxmoadgVar, j13, yadqdtsiqtVar.eablkybsjg(), 1);
        long j14 = j13 + 1;
        byte b13 = yadqdtsiqtVar.eablkybsjg()[0];
        boolean z13 = (b13 & 128) != 0;
        int i13 = b13 & 127;
        e3.ppxfxbqfkf ppxfxbqfkfVar = decoderInputBuffer.f10022jyumaefscl;
        byte[] bArr = ppxfxbqfkfVar.f30260iobyxmoadg;
        if (bArr == null) {
            ppxfxbqfkfVar.f30260iobyxmoadg = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        iobyxmoadg iobyxmoadgVarDxjokdxxww2 = dxjokdxxww(iobyxmoadgVarDxjokdxxww, j14, ppxfxbqfkfVar.f30260iobyxmoadg, i13);
        long j15 = j14 + ((long) i13);
        if (z13) {
            yadqdtsiqtVar.tzroggbefp(2);
            iobyxmoadgVarDxjokdxxww2 = dxjokdxxww(iobyxmoadgVarDxjokdxxww2, j15, yadqdtsiqtVar.eablkybsjg(), 2);
            j15 += 2;
            iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        }
        int i14 = iWypolnanlu;
        int[] iArr = ppxfxbqfkfVar.f30264wkgbmnqykc;
        if (iArr == null || iArr.length < i14) {
            iArr = new int[i14];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = ppxfxbqfkfVar.f30258eablkybsjg;
        if (iArr3 == null || iArr3.length < i14) {
            iArr3 = new int[i14];
        }
        int[] iArr4 = iArr3;
        if (z13) {
            int i15 = i14 * 6;
            yadqdtsiqtVar.tzroggbefp(i15);
            iobyxmoadgVarDxjokdxxww2 = dxjokdxxww(iobyxmoadgVarDxjokdxxww2, j15, yadqdtsiqtVar.eablkybsjg(), i15);
            j15 += (long) i15;
            yadqdtsiqtVar.sopmlzcsov(0);
            for (int i16 = 0; i16 < i14; i16++) {
                iArr2[i16] = yadqdtsiqtVar.wypolnanlu();
                iArr4[i16] = yadqdtsiqtVar.jpowsppfya();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = zoijcleaowVar.f11202iobyxmoadg - ((int) (j15 - zoijcleaowVar.f11204zoijcleaow));
        }
        dsvhmnatus.iobyxmoadg iobyxmoadgVar2 = (dsvhmnatus.iobyxmoadg) stevsuqkhv.nufgyqmvbu(zoijcleaowVar.f11203ppxfxbqfkf);
        ppxfxbqfkfVar.ppxfxbqfkf(i14, iArr2, iArr4, iobyxmoadgVar2.f109386zoijcleaow, ppxfxbqfkfVar.f30260iobyxmoadg, iobyxmoadgVar2.f109383iobyxmoadg, iobyxmoadgVar2.f109384ppxfxbqfkf, iobyxmoadgVar2.f109385wkgbmnqykc);
        long j16 = zoijcleaowVar.f11204zoijcleaow;
        int i17 = (int) (j15 - j16);
        zoijcleaowVar.f11204zoijcleaow = j16 + ((long) i17);
        zoijcleaowVar.f11202iobyxmoadg -= i17;
        return iobyxmoadgVarDxjokdxxww2;
    }

    private static iobyxmoadg dxjokdxxww(iobyxmoadg iobyxmoadgVar, long j13, byte[] bArr, int i13) {
        iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf(iobyxmoadgVar, j13);
        int i14 = i13;
        while (i14 > 0) {
            int iMin = Math.min(i14, (int) (iobyxmoadgVarPpxfxbqfkf.f11116zoijcleaow - j13));
            System.arraycopy(iobyxmoadgVarPpxfxbqfkf.f11114ppxfxbqfkf.f75475iobyxmoadg, iobyxmoadgVarPpxfxbqfkf.eablkybsjg(j13), bArr, i13 - i14, iMin);
            i14 -= iMin;
            j13 += (long) iMin;
            if (j13 == iobyxmoadgVarPpxfxbqfkf.f11116zoijcleaow) {
                iobyxmoadgVarPpxfxbqfkf = iobyxmoadgVarPpxfxbqfkf.f11115wkgbmnqykc;
            }
        }
        return iobyxmoadgVarPpxfxbqfkf;
    }

    private static iobyxmoadg gtknphoqwx(iobyxmoadg iobyxmoadgVar, DecoderInputBuffer decoderInputBuffer, iozdgvuglv.zoijcleaow zoijcleaowVar, y2.yadqdtsiqt yadqdtsiqtVar) {
        if (decoderInputBuffer.oxmwwwfdhm()) {
            iobyxmoadgVar = btonecajqb(iobyxmoadgVar, decoderInputBuffer, zoijcleaowVar, yadqdtsiqtVar);
        }
        if (!decoderInputBuffer.nufgyqmvbu()) {
            decoderInputBuffer.rgvfuqvkyq(zoijcleaowVar.f11202iobyxmoadg);
            return nufgyqmvbu(iobyxmoadgVar, zoijcleaowVar.f11204zoijcleaow, decoderInputBuffer.f10021iwizpuwonk, zoijcleaowVar.f11202iobyxmoadg);
        }
        yadqdtsiqtVar.tzroggbefp(4);
        iobyxmoadg iobyxmoadgVarDxjokdxxww = dxjokdxxww(iobyxmoadgVar, zoijcleaowVar.f11204zoijcleaow, yadqdtsiqtVar.eablkybsjg(), 4);
        int iJpowsppfya = yadqdtsiqtVar.jpowsppfya();
        zoijcleaowVar.f11204zoijcleaow += 4;
        zoijcleaowVar.f11202iobyxmoadg -= 4;
        decoderInputBuffer.rgvfuqvkyq(iJpowsppfya);
        iobyxmoadg iobyxmoadgVarNufgyqmvbu = nufgyqmvbu(iobyxmoadgVarDxjokdxxww, zoijcleaowVar.f11204zoijcleaow, decoderInputBuffer.f10021iwizpuwonk, iJpowsppfya);
        zoijcleaowVar.f11204zoijcleaow += (long) iJpowsppfya;
        int i13 = zoijcleaowVar.f11202iobyxmoadg - iJpowsppfya;
        zoijcleaowVar.f11202iobyxmoadg = i13;
        decoderInputBuffer.zdlpuopuiu(i13);
        return nufgyqmvbu(iobyxmoadgVarNufgyqmvbu, zoijcleaowVar.f11204zoijcleaow, decoderInputBuffer.f10023lereixgezr, zoijcleaowVar.f11202iobyxmoadg);
    }

    private void gxszxtbevo(int i13) {
        long j13 = this.f11109lqeggnwhkg + ((long) i13);
        this.f11109lqeggnwhkg = j13;
        iobyxmoadg iobyxmoadgVar = this.f11107gxszxtbevo;
        if (j13 == iobyxmoadgVar.f11116zoijcleaow) {
            this.f11107gxszxtbevo = iobyxmoadgVar.f11115wkgbmnqykc;
        }
    }

    private void iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.f11114ppxfxbqfkf == null) {
            return;
        }
        this.f11108iobyxmoadg.ppxfxbqfkf(iobyxmoadgVar);
        iobyxmoadgVar.zoijcleaow();
    }

    private int lqeggnwhkg(int i13) {
        iobyxmoadg iobyxmoadgVar = this.f11107gxszxtbevo;
        if (iobyxmoadgVar.f11114ppxfxbqfkf == null) {
            iobyxmoadgVar.ppxfxbqfkf(this.f11108iobyxmoadg.iobyxmoadg(), new iobyxmoadg(this.f11107gxszxtbevo.f11116zoijcleaow, this.f11112zoijcleaow));
        }
        return Math.min(i13, (int) (this.f11107gxszxtbevo.f11116zoijcleaow - this.f11109lqeggnwhkg));
    }

    private static iobyxmoadg nufgyqmvbu(iobyxmoadg iobyxmoadgVar, long j13, ByteBuffer byteBuffer, int i13) {
        iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf(iobyxmoadgVar, j13);
        while (i13 > 0) {
            int iMin = Math.min(i13, (int) (iobyxmoadgVarPpxfxbqfkf.f11116zoijcleaow - j13));
            byteBuffer.put(iobyxmoadgVarPpxfxbqfkf.f11114ppxfxbqfkf.f75475iobyxmoadg, iobyxmoadgVarPpxfxbqfkf.eablkybsjg(j13), iMin);
            i13 -= iMin;
            j13 += (long) iMin;
            if (j13 == iobyxmoadgVarPpxfxbqfkf.f11116zoijcleaow) {
                iobyxmoadgVarPpxfxbqfkf = iobyxmoadgVarPpxfxbqfkf.f11115wkgbmnqykc;
            }
        }
        return iobyxmoadgVarPpxfxbqfkf;
    }

    private static iobyxmoadg ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, long j13) {
        while (j13 >= iobyxmoadgVar.f11116zoijcleaow) {
            iobyxmoadgVar = iobyxmoadgVar.f11115wkgbmnqykc;
        }
        return iobyxmoadgVar;
    }

    public void agtfadlqog() {
        this.f11106eablkybsjg = this.f11111wkgbmnqykc;
    }

    public void draadjrbmk(DecoderInputBuffer decoderInputBuffer, iozdgvuglv.zoijcleaow zoijcleaowVar) {
        this.f11106eablkybsjg = gtknphoqwx(this.f11106eablkybsjg, decoderInputBuffer, zoijcleaowVar, this.f11110ppxfxbqfkf);
    }

    public void eablkybsjg(DecoderInputBuffer decoderInputBuffer, iozdgvuglv.zoijcleaow zoijcleaowVar) {
        gtknphoqwx(this.f11106eablkybsjg, decoderInputBuffer, zoijcleaowVar, this.f11110ppxfxbqfkf);
    }

    public int ojitshcjhn(v2.btonecajqb btonecajqbVar, int i13, boolean z13) throws EOFException {
        int iLqeggnwhkg = lqeggnwhkg(i13);
        iobyxmoadg iobyxmoadgVar = this.f11107gxszxtbevo;
        int iZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar.f11114ppxfxbqfkf.f75475iobyxmoadg, iobyxmoadgVar.eablkybsjg(this.f11109lqeggnwhkg), iLqeggnwhkg);
        if (iZoijcleaow != -1) {
            gxszxtbevo(iZoijcleaow);
            return iZoijcleaow;
        }
        if (z13) {
            return -1;
        }
        throw new EOFException();
    }

    public void rgvfuqvkyq(y2.yadqdtsiqt yadqdtsiqtVar, int i13) {
        while (i13 > 0) {
            int iLqeggnwhkg = lqeggnwhkg(i13);
            iobyxmoadg iobyxmoadgVar = this.f11107gxszxtbevo;
            yadqdtsiqtVar.draadjrbmk(iobyxmoadgVar.f11114ppxfxbqfkf.f75475iobyxmoadg, iobyxmoadgVar.eablkybsjg(this.f11109lqeggnwhkg), iLqeggnwhkg);
            i13 -= iLqeggnwhkg;
            gxszxtbevo(iLqeggnwhkg);
        }
    }

    public void wflxmlrfwp() {
        iobyxmoadg(this.f11111wkgbmnqykc);
        this.f11111wkgbmnqykc.wkgbmnqykc(0L, this.f11112zoijcleaow);
        iobyxmoadg iobyxmoadgVar = this.f11111wkgbmnqykc;
        this.f11106eablkybsjg = iobyxmoadgVar;
        this.f11107gxszxtbevo = iobyxmoadgVar;
        this.f11109lqeggnwhkg = 0L;
        this.f11108iobyxmoadg.zoijcleaow();
    }

    public long wkgbmnqykc() {
        return this.f11109lqeggnwhkg;
    }

    public void zoijcleaow(long j13) {
        iobyxmoadg iobyxmoadgVar;
        if (j13 == -1) {
            return;
        }
        while (true) {
            iobyxmoadgVar = this.f11111wkgbmnqykc;
            if (j13 < iobyxmoadgVar.f11116zoijcleaow) {
                break;
            }
            this.f11108iobyxmoadg.wkgbmnqykc(iobyxmoadgVar.f11114ppxfxbqfkf);
            this.f11111wkgbmnqykc = this.f11111wkgbmnqykc.zoijcleaow();
        }
        if (this.f11106eablkybsjg.f11113iobyxmoadg < iobyxmoadgVar.f11113iobyxmoadg) {
            this.f11106eablkybsjg = iobyxmoadgVar;
        }
    }
}
