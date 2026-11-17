package androidx.compose.runtime.snapshots;

import androidx.collection.jhduphickx;
import androidx.collection.wypolnanlu;
import androidx.compose.runtime.fmlbqenlif;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import yzdjzghtvl.lereixgezr;
import yzdjzghtvl.zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
public class zoijcleaow extends lqeggnwhkg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f6031agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private wypolnanlu f6032btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private dxjokdxxww f6033draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f6034dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private List f6035gtknphoqwx;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final tg.draadjrbmk f6036lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final tg.draadjrbmk f6037nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f6038ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int[] f6039wflxmlrfwp;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final iobyxmoadg f6029rgvfuqvkyq = new iobyxmoadg(null);

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final int f6030vdvldrhtss = 8;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private static final int[] f6028oxmwwwfdhm = new int[0];

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public zoijcleaow(long j13, dxjokdxxww dxjokdxxwwVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        super(j13, dxjokdxxwwVar, null);
        this.f6036lqeggnwhkg = draadjrbmkVar;
        this.f6037nufgyqmvbu = draadjrbmkVar2;
        this.f6033draadjrbmk = dxjokdxxww.f5967cqumvgiudr.iobyxmoadg();
        this.f6039wflxmlrfwp = f6028oxmwwwfdhm;
        this.f6031agtfadlqog = 1;
    }

    private final void dsvhmnatus() {
        int length = this.f6039wflxmlrfwp.length;
        for (int i13 = 0; i13 < length; i13++) {
            btonecajqb.xrmfcynszj(this.f6039wflxmlrfwp[i13]);
        }
    }

    private final void mbcevpiqjq() {
        if (!this.f6038ojitshcjhn || ((lqeggnwhkg) this).f6014wkgbmnqykc >= 0) {
            return;
        }
        fmlbqenlif.zoijcleaow("Unsupported operation on a disposed or applied snapshot");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[LOOP:0: B:7:0x001e->B:24:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[EDGE_INSN: B:28:0x007f->B:25:0x007f BREAK  A[LOOP:0: B:7:0x001e->B:24:0x007c], SYNTHETIC] */
    private final void pmvmpeiblj() {
        wypolnanlu wypolnanluVarYadqdtsiqt = yadqdtsiqt();
        if (wypolnanluVarYadqdtsiqt != null) {
            tzroggbefp();
            stevsuqkhv(null);
            long jDxjokdxxww = dxjokdxxww();
            Object[] objArr = wypolnanluVarYadqdtsiqt.f4398zoijcleaow;
            long[] jArr = wypolnanluVarYadqdtsiqt.f4395iobyxmoadg;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j13 = jArr[i13];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i13 != length) {
                            break;
                            break;
                        }
                        i13++;
                    } else {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j13) < 128) {
                                for (zynmafqrjb firstStateRecord = ((lereixgezr) objArr[(i13 << 3) + i15]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.eablkybsjg()) {
                                    if (firstStateRecord.gxszxtbevo() == jDxjokdxxww || jyumaefscl.xrmfcynszj(this.f6033draadjrbmk, Long.valueOf(firstStateRecord.gxszxtbevo()))) {
                                        firstStateRecord.nufgyqmvbu(btonecajqb.f5965zoijcleaow);
                                    }
                                }
                            }
                            j13 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        } else if (i13 != length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
        }
        zoijcleaow();
    }

    private final void tzroggbefp() {
        if (this.f6038ojitshcjhn) {
            fmlbqenlif.zoijcleaow("Unsupported operation on a snapshot that has been applied");
        }
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void agtfadlqog(lqeggnwhkg lqeggnwhkgVar) {
        if (!(this.f6031agtfadlqog > 0)) {
            fmlbqenlif.iobyxmoadg("no pending nested snapshots");
        }
        int i13 = this.f6031agtfadlqog - 1;
        this.f6031agtfadlqog = i13;
        if (i13 != 0 || this.f6038ojitshcjhn) {
            return;
        }
        pmvmpeiblj();
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public int btonecajqb() {
        return this.f6034dxjokdxxww;
    }

    public final boolean cdpycssgdh() {
        return this.f6038ojitshcjhn;
    }

    public final void cllcsxoeiz(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.f6039wflxmlrfwp;
        if (iArr2.length != 0) {
            iArr = hg.agtfadlqog.lmojexxdyd(iArr2, iArr);
        }
        this.f6039wflxmlrfwp = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public lqeggnwhkg cqumvgiudr(tg.draadjrbmk draadjrbmkVar) {
        Map map;
        long j13;
        wkgbmnqykc wkgbmnqykcVar;
        lereixgezr();
        mbcevpiqjq();
        long jDxjokdxxww = dxjokdxxww();
        zoijcleaow zoijcleaowVar = this instanceof androidx.compose.runtime.snapshots.iobyxmoadg ? null : this;
        grlcpdaxtj.eablkybsjg eablkybsjgVar = eslsurpljm.zoijcleaow.f31923iobyxmoadg;
        tg.draadjrbmk draadjrbmkVar2 = draadjrbmkVar;
        if (eablkybsjgVar != null) {
            vdvldrhtss vdvldrhtssVarEablkybsjg = eslsurpljm.zoijcleaow.eablkybsjg(eablkybsjgVar, zoijcleaowVar, true, draadjrbmkVar2, null);
            eslsurpljm.iobyxmoadg iobyxmoadgVar = (eslsurpljm.iobyxmoadg) vdvldrhtssVarEablkybsjg.lqeggnwhkg();
            tg.draadjrbmk draadjrbmkVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            iobyxmoadgVar.zoijcleaow();
            map = (Map) vdvldrhtssVarEablkybsjg.nufgyqmvbu();
            draadjrbmkVar2 = draadjrbmkVarIobyxmoadg;
        } else {
            map = null;
        }
        hcddaimhww(dxjokdxxww());
        synchronized (btonecajqb.dsvhmnatus()) {
            long j14 = btonecajqb.f5958gxszxtbevo;
            j13 = 1;
            btonecajqb.f5958gxszxtbevo += j13;
            btonecajqb.f5956eablkybsjg = btonecajqb.f5956eablkybsjg.wflxmlrfwp(j14);
            wkgbmnqykcVar = new wkgbmnqykc(j14, btonecajqb.yadqdtsiqt(gxszxtbevo(), jDxjokdxxww + j13, j14), btonecajqb.stevsuqkhv(draadjrbmkVar2, lqeggnwhkg(), false, 4, null), this);
        }
        if (!cdpycssgdh() && !eablkybsjg()) {
            long jDxjokdxxww2 = dxjokdxxww();
            synchronized (btonecajqb.dsvhmnatus()) {
                long j15 = btonecajqb.f5958gxszxtbevo;
                btonecajqb.f5958gxszxtbevo += j13;
                jyumaefscl(j15);
                btonecajqb.f5956eablkybsjg = btonecajqb.f5956eablkybsjg.wflxmlrfwp(dxjokdxxww());
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            yggfygwlhe(btonecajqb.yadqdtsiqt(gxszxtbevo(), jDxjokdxxww2 + j13, dxjokdxxww()));
        }
        if (eablkybsjgVar != null) {
            eslsurpljm.zoijcleaow.zoijcleaow(eablkybsjgVar, zoijcleaowVar, wkgbmnqykcVar, map);
        }
        return wkgbmnqykcVar;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public tg.draadjrbmk gtknphoqwx() {
        return this.f6037nufgyqmvbu;
    }

    public final void hcddaimhww(long j13) {
        synchronized (btonecajqb.dsvhmnatus()) {
            this.f6033draadjrbmk = this.f6033draadjrbmk.wflxmlrfwp(j13);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public final void hkdspvbjdz(int i13) {
        if (i13 >= 0) {
            this.f6039wflxmlrfwp = hg.agtfadlqog.iozdgvuglv(this.f6039wflxmlrfwp, i13);
        }
    }

    public final dxjokdxxww iozdgvuglv() {
        return this.f6033draadjrbmk;
    }

    public nufgyqmvbu istkbnxepw() {
        Map mapJlmebxxoox;
        List list;
        wypolnanlu wypolnanluVarYadqdtsiqt;
        int i13;
        long j13;
        wypolnanlu wypolnanluVarYadqdtsiqt2 = yadqdtsiqt();
        if (wypolnanluVarYadqdtsiqt2 != null) {
            androidx.compose.runtime.snapshots.iobyxmoadg iobyxmoadgVar = btonecajqb.f5957gtknphoqwx;
            mapJlmebxxoox = btonecajqb.jlmebxxoox(iobyxmoadgVar.dxjokdxxww(), this, btonecajqb.f5956eablkybsjg.dxjokdxxww(iobyxmoadgVar.dxjokdxxww()));
        } else {
            mapJlmebxxoox = null;
        }
        List listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        synchronized (btonecajqb.dsvhmnatus()) {
            try {
                btonecajqb.oipsdeybqn(this);
                if (wypolnanluVarYadqdtsiqt2 == null || wypolnanluVarYadqdtsiqt2.ppxfxbqfkf() == 0) {
                    ppxfxbqfkf();
                    androidx.compose.runtime.snapshots.iobyxmoadg iobyxmoadgVar2 = btonecajqb.f5957gtknphoqwx;
                    wypolnanlu wypolnanluVarYadqdtsiqt3 = iobyxmoadgVar2.yadqdtsiqt();
                    btonecajqb.rlfsiqarku(iobyxmoadgVar2, btonecajqb.f5959iobyxmoadg);
                    if (wypolnanluVarYadqdtsiqt3 == null || !wypolnanluVarYadqdtsiqt3.eablkybsjg()) {
                        list = listWflxmlrfwp;
                        wypolnanluVarYadqdtsiqt = null;
                    } else {
                        list = btonecajqb.f5955dxjokdxxww;
                        wypolnanluVarYadqdtsiqt = wypolnanluVarYadqdtsiqt3;
                    }
                } else {
                    androidx.compose.runtime.snapshots.iobyxmoadg iobyxmoadgVar3 = btonecajqb.f5957gtknphoqwx;
                    nufgyqmvbu nufgyqmvbuVarPkzmftpjix = pkzmftpjix(btonecajqb.f5958gxszxtbevo, wypolnanluVarYadqdtsiqt2, mapJlmebxxoox, btonecajqb.f5956eablkybsjg.dxjokdxxww(iobyxmoadgVar3.dxjokdxxww()));
                    if (!zdlpuopuiu.eablkybsjg(nufgyqmvbuVarPkzmftpjix, nufgyqmvbu.zoijcleaow.f6017iobyxmoadg)) {
                        return nufgyqmvbuVarPkzmftpjix;
                    }
                    ppxfxbqfkf();
                    wypolnanluVarYadqdtsiqt = iobyxmoadgVar3.yadqdtsiqt();
                    btonecajqb.rlfsiqarku(iobyxmoadgVar3, btonecajqb.f5959iobyxmoadg);
                    stevsuqkhv(null);
                    iobyxmoadgVar3.stevsuqkhv(null);
                    list = btonecajqb.f5955dxjokdxxww;
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f6038ojitshcjhn = true;
                if (wypolnanluVarYadqdtsiqt != null) {
                    Set setIobyxmoadg = ipoelvxyzq.gxszxtbevo.iobyxmoadg(wypolnanluVarYadqdtsiqt);
                    if (!setIobyxmoadg.isEmpty()) {
                        int size = list.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            ((rgvfuqvkyq) list.get(i14)).invoke(setIobyxmoadg, this);
                        }
                    }
                }
                if (wypolnanluVarYadqdtsiqt2 != null && wypolnanluVarYadqdtsiqt2.eablkybsjg()) {
                    Set setIobyxmoadg2 = ipoelvxyzq.gxszxtbevo.iobyxmoadg(wypolnanluVarYadqdtsiqt2);
                    int size2 = list.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        ((rgvfuqvkyq) list.get(i15)).invoke(setIobyxmoadg2, this);
                    }
                }
                eslsurpljm.zoijcleaow.ppxfxbqfkf(this, wypolnanluVarYadqdtsiqt2);
                synchronized (btonecajqb.dsvhmnatus()) {
                    try {
                        oxmwwwfdhm();
                        btonecajqb.wwaezpbzkn();
                        if (wypolnanluVarYadqdtsiqt != null) {
                            Object[] objArr = wypolnanluVarYadqdtsiqt.f4398zoijcleaow;
                            long[] jArr = wypolnanluVarYadqdtsiqt.f4395iobyxmoadg;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j14 = jArr[i16];
                                    long[] jArr2 = jArr;
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j14 & 255) < 128) {
                                                btonecajqb.jhduphickx((lereixgezr) objArr[(i16 << 3) + i18]);
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i17 != 8) {
                                            break;
                                        }
                                    }
                                    if (i16 == length) {
                                        break;
                                    }
                                    i16++;
                                    jArr = jArr2;
                                }
                            }
                        }
                        if (wypolnanluVarYadqdtsiqt2 != null) {
                            Object[] objArr2 = wypolnanluVarYadqdtsiqt2.f4398zoijcleaow;
                            long[] jArr3 = wypolnanluVarYadqdtsiqt2.f4395iobyxmoadg;
                            int length2 = jArr3.length - 2;
                            if (length2 >= 0) {
                                int i19 = 0;
                                while (true) {
                                    long j15 = jArr3[i19];
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i19 - length2)) >>> 31);
                                        for (int i24 = 0; i24 < i23; i24++) {
                                            if ((j15 & 255) < 128) {
                                                btonecajqb.jhduphickx((lereixgezr) objArr2[(i19 << 3) + i24]);
                                            }
                                            j15 >>= 8;
                                        }
                                        i13 = 1;
                                        j13 = 255;
                                        if (i23 != 8) {
                                            break;
                                        }
                                    } else {
                                        i13 = 1;
                                        j13 = 255;
                                    }
                                    if (i19 == length2) {
                                        break;
                                    }
                                    i19 += i13;
                                }
                            }
                        }
                        List list2 = this.f6035gtknphoqwx;
                        if (list2 != null) {
                            int size3 = list2.size();
                            for (int i25 = 0; i25 < size3; i25++) {
                                btonecajqb.jhduphickx((lereixgezr) list2.get(i25));
                            }
                        }
                        this.f6035gtknphoqwx = null;
                        wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return nufgyqmvbu.zoijcleaow.f6017iobyxmoadg;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void iwizpuwonk(int i13) {
        this.f6034dxjokdxxww = i13;
    }

    public final void jpowsppfya(dxjokdxxww dxjokdxxwwVar) {
        synchronized (btonecajqb.dsvhmnatus()) {
            this.f6033draadjrbmk = this.f6033draadjrbmk.draadjrbmk(dxjokdxxwwVar);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public zoijcleaow kegysxyocb(tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        Map map;
        long j13;
        ppxfxbqfkf ppxfxbqfkfVar;
        lereixgezr();
        mbcevpiqjq();
        grlcpdaxtj.eablkybsjg eablkybsjgVar = eslsurpljm.zoijcleaow.f31923iobyxmoadg;
        tg.draadjrbmk draadjrbmkVar3 = draadjrbmkVar;
        tg.draadjrbmk draadjrbmkVarZoijcleaow = draadjrbmkVar2;
        if (eablkybsjgVar != null) {
            vdvldrhtss vdvldrhtssVarEablkybsjg = eslsurpljm.zoijcleaow.eablkybsjg(eablkybsjgVar, this, false, draadjrbmkVar3, draadjrbmkVarZoijcleaow);
            eslsurpljm.iobyxmoadg iobyxmoadgVar = (eslsurpljm.iobyxmoadg) vdvldrhtssVarEablkybsjg.lqeggnwhkg();
            tg.draadjrbmk draadjrbmkVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            draadjrbmkVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            map = (Map) vdvldrhtssVarEablkybsjg.nufgyqmvbu();
            draadjrbmkVar3 = draadjrbmkVarIobyxmoadg;
        } else {
            map = null;
        }
        hcddaimhww(dxjokdxxww());
        synchronized (btonecajqb.dsvhmnatus()) {
            long j14 = btonecajqb.f5958gxszxtbevo;
            j13 = 1;
            btonecajqb.f5958gxszxtbevo += j13;
            btonecajqb.f5956eablkybsjg = btonecajqb.f5956eablkybsjg.wflxmlrfwp(j14);
            dxjokdxxww dxjokdxxwwVarGxszxtbevo = gxszxtbevo();
            yggfygwlhe(dxjokdxxwwVarGxszxtbevo.wflxmlrfwp(j14));
            ppxfxbqfkfVar = new ppxfxbqfkf(j14, btonecajqb.yadqdtsiqt(dxjokdxxwwVarGxszxtbevo, dxjokdxxww() + j13, j14), btonecajqb.stevsuqkhv(draadjrbmkVar3, lqeggnwhkg(), false, 4, null), btonecajqb.tzroggbefp(draadjrbmkVarZoijcleaow, gtknphoqwx()), this);
        }
        if (!cdpycssgdh() && !eablkybsjg()) {
            long jDxjokdxxww = dxjokdxxww();
            synchronized (btonecajqb.dsvhmnatus()) {
                long j15 = btonecajqb.f5958gxszxtbevo;
                btonecajqb.f5958gxszxtbevo += j13;
                jyumaefscl(j15);
                btonecajqb.f5956eablkybsjg = btonecajqb.f5956eablkybsjg.wflxmlrfwp(dxjokdxxww());
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            yggfygwlhe(btonecajqb.yadqdtsiqt(gxszxtbevo(), jDxjokdxxww + j13, dxjokdxxww()));
        }
        if (eablkybsjgVar != null) {
            eslsurpljm.zoijcleaow.zoijcleaow(eablkybsjgVar, this, ppxfxbqfkfVar, map);
        }
        return ppxfxbqfkfVar;
    }

    public final int[] lmojexxdyd() {
        return this.f6039wflxmlrfwp;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public boolean nufgyqmvbu() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void ojitshcjhn() {
        if (this.f6038ojitshcjhn || eablkybsjg()) {
            return;
        }
        zynmafqrjb();
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void oxmwwwfdhm() {
        dsvhmnatus();
        super.oxmwwwfdhm();
    }

    public final nufgyqmvbu pkzmftpjix(long j13, wypolnanlu wypolnanluVar, Map map, dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxww dxjokdxxwwVar2;
        Object[] objArr;
        long[] jArr;
        int i13;
        int i14;
        Object[] objArr2;
        long[] jArr2;
        int i15;
        zynmafqrjb zynmafqrjbVarOkpsazkaxt;
        zynmafqrjb zynmafqrjbVarYlkuphrtab;
        dxjokdxxww dxjokdxxwwVarDraadjrbmk = gxszxtbevo().wflxmlrfwp(dxjokdxxww()).draadjrbmk(this.f6033draadjrbmk);
        Object[] objArr3 = wypolnanluVar.f4398zoijcleaow;
        long[] jArr3 = wypolnanluVar.f4395iobyxmoadg;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List listIxidwrxhsl = null;
        if (length >= 0) {
            int i16 = 0;
            while (true) {
                long j14 = jArr3[i16];
                List arrayList2 = listIxidwrxhsl;
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j14 & 255) < 128) {
                            lereixgezr lereixgezrVar = (lereixgezr) objArr3[(i16 << 3) + i18];
                            objArr2 = objArr3;
                            zynmafqrjb firstStateRecord = lereixgezrVar.getFirstStateRecord();
                            jArr2 = jArr3;
                            zynmafqrjb zynmafqrjbVarOkpsazkaxt2 = btonecajqb.okpsazkaxt(firstStateRecord, j13, dxjokdxxwwVar);
                            if (zynmafqrjbVarOkpsazkaxt2 != null && (zynmafqrjbVarOkpsazkaxt = btonecajqb.okpsazkaxt(firstStateRecord, dxjokdxxww(), dxjokdxxwwVarDraadjrbmk)) != null && zynmafqrjbVarOkpsazkaxt.gxszxtbevo() != yzdjzghtvl.nufgyqmvbu.ppxfxbqfkf(1) && !zdlpuopuiu.eablkybsjg(zynmafqrjbVarOkpsazkaxt2, zynmafqrjbVarOkpsazkaxt)) {
                                i15 = length;
                                dxjokdxxwwVarDraadjrbmk = dxjokdxxwwVarDraadjrbmk;
                                zynmafqrjb zynmafqrjbVarOkpsazkaxt3 = btonecajqb.okpsazkaxt(firstStateRecord, dxjokdxxww(), gxszxtbevo());
                                if (zynmafqrjbVarOkpsazkaxt3 == null) {
                                    btonecajqb.ikoacuggdj();
                                    throw new KotlinNothingValueException();
                                }
                                if (map == null || (zynmafqrjbVarYlkuphrtab = (zynmafqrjb) map.get(zynmafqrjbVarOkpsazkaxt2)) == null) {
                                    zynmafqrjbVarYlkuphrtab = lereixgezrVar.ylkuphrtab(zynmafqrjbVarOkpsazkaxt, zynmafqrjbVarOkpsazkaxt2, zynmafqrjbVarOkpsazkaxt3);
                                }
                                if (zynmafqrjbVarYlkuphrtab == null) {
                                    return new nufgyqmvbu.iobyxmoadg(this);
                                }
                                if (!zdlpuopuiu.eablkybsjg(zynmafqrjbVarYlkuphrtab, zynmafqrjbVarOkpsazkaxt3)) {
                                    if (zdlpuopuiu.eablkybsjg(zynmafqrjbVarYlkuphrtab, zynmafqrjbVarOkpsazkaxt2)) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(cqumvgiudr.iobyxmoadg(lereixgezrVar, zynmafqrjbVarOkpsazkaxt2.wkgbmnqykc(dxjokdxxww())));
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        List list = arrayList2;
                                        list.add(lereixgezrVar);
                                        arrayList2 = list;
                                    } else {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(!zdlpuopuiu.eablkybsjg(zynmafqrjbVarYlkuphrtab, zynmafqrjbVarOkpsazkaxt) ? cqumvgiudr.iobyxmoadg(lereixgezrVar, zynmafqrjbVarYlkuphrtab) : cqumvgiudr.iobyxmoadg(lereixgezrVar, zynmafqrjbVarOkpsazkaxt.wkgbmnqykc(dxjokdxxww())));
                                    }
                                }
                            }
                            j14 >>= 8;
                            i18++;
                            length = i15;
                            objArr3 = objArr2;
                            jArr3 = jArr2;
                            dxjokdxxwwVarDraadjrbmk = dxjokdxxwwVarDraadjrbmk;
                            j13 = j13;
                        } else {
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                        }
                        i15 = length;
                        j14 >>= 8;
                        i18++;
                        length = i15;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        dxjokdxxwwVarDraadjrbmk = dxjokdxxwwVarDraadjrbmk;
                        j13 = j13;
                    }
                    dxjokdxxwwVar2 = dxjokdxxwwVarDraadjrbmk;
                    objArr = objArr3;
                    jArr = jArr3;
                    i13 = length;
                    i14 = 1;
                    listIxidwrxhsl = arrayList2;
                    if (i17 != 8) {
                        break;
                    }
                } else {
                    dxjokdxxwwVar2 = dxjokdxxwwVarDraadjrbmk;
                    objArr = objArr3;
                    jArr = jArr3;
                    i13 = length;
                    i14 = 1;
                    listIxidwrxhsl = arrayList2;
                }
                if (i16 == i13) {
                    break;
                }
                i16 += i14;
                length = i13;
                objArr3 = objArr;
                jArr3 = jArr;
                dxjokdxxwwVarDraadjrbmk = dxjokdxxwwVar2;
            }
        }
        if (arrayList != null) {
            zynmafqrjb();
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                vdvldrhtss vdvldrhtssVar = (vdvldrhtss) arrayList.get(i19);
                lereixgezr lereixgezrVar2 = (lereixgezr) vdvldrhtssVar.iobyxmoadg();
                zynmafqrjb zynmafqrjbVar = (zynmafqrjb) vdvldrhtssVar.wkgbmnqykc();
                zynmafqrjbVar.nufgyqmvbu(j13);
                synchronized (btonecajqb.dsvhmnatus()) {
                    zynmafqrjbVar.lqeggnwhkg(lereixgezrVar2.getFirstStateRecord());
                    lereixgezrVar2.cllcsxoeiz(zynmafqrjbVar);
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                }
            }
        }
        if (listIxidwrxhsl != null) {
            int size2 = listIxidwrxhsl.size();
            for (int i23 = 0; i23 < size2; i23++) {
                wypolnanluVar.esjtqupxsv((lereixgezr) listIxidwrxhsl.get(i23));
            }
            List list2 = this.f6035gtknphoqwx;
            if (list2 != null) {
                listIxidwrxhsl = jyumaefscl.ixidwrxhsl(list2, listIxidwrxhsl);
            }
            this.f6035gtknphoqwx = listIxidwrxhsl;
        }
        return nufgyqmvbu.zoijcleaow.f6017iobyxmoadg;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void ppxfxbqfkf() {
        btonecajqb.f5956eablkybsjg = btonecajqb.f5956eablkybsjg.dxjokdxxww(dxjokdxxww()).gxszxtbevo(this.f6033draadjrbmk);
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void rgvfuqvkyq(lereixgezr lereixgezrVar) {
        wypolnanlu wypolnanluVarYadqdtsiqt = yadqdtsiqt();
        if (wypolnanluVarYadqdtsiqt == null) {
            wypolnanluVarYadqdtsiqt = jhduphickx.zoijcleaow();
            stevsuqkhv(wypolnanluVarYadqdtsiqt);
        }
        wypolnanluVarYadqdtsiqt.nufgyqmvbu(lereixgezrVar);
    }

    public void stevsuqkhv(wypolnanlu wypolnanluVar) {
        this.f6032btonecajqb = wypolnanluVar;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void wflxmlrfwp(lqeggnwhkg lqeggnwhkgVar) {
        this.f6031agtfadlqog++;
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    public void wkgbmnqykc() {
        if (eablkybsjg()) {
            return;
        }
        super.wkgbmnqykc();
        agtfadlqog(this);
        eslsurpljm.zoijcleaow.wkgbmnqykc(this);
    }

    @Override // androidx.compose.runtime.snapshots.lqeggnwhkg
    /* JADX INFO: renamed from: wwaezpbzkn */
    public tg.draadjrbmk lqeggnwhkg() {
        return this.f6036lqeggnwhkg;
    }

    public final void wypolnanlu(boolean z13) {
        this.f6038ojitshcjhn = z13;
    }

    public wypolnanlu yadqdtsiqt() {
        return this.f6032btonecajqb;
    }

    public boolean ylkuphrtab() {
        wypolnanlu wypolnanluVarYadqdtsiqt = yadqdtsiqt();
        return wypolnanluVarYadqdtsiqt != null && wypolnanluVarYadqdtsiqt.eablkybsjg();
    }

    public final void zynmafqrjb() {
        long j13;
        hcddaimhww(dxjokdxxww());
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        if (cdpycssgdh() || eablkybsjg()) {
            return;
        }
        long jDxjokdxxww = dxjokdxxww();
        synchronized (btonecajqb.dsvhmnatus()) {
            long j14 = btonecajqb.f5958gxszxtbevo;
            j13 = 1;
            btonecajqb.f5958gxszxtbevo += j13;
            jyumaefscl(j14);
            btonecajqb.f5956eablkybsjg = btonecajqb.f5956eablkybsjg.wflxmlrfwp(dxjokdxxww());
        }
        yggfygwlhe(btonecajqb.yadqdtsiqt(gxszxtbevo(), jDxjokdxxww + j13, dxjokdxxww()));
    }
}
