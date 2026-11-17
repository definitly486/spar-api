package androidx.compose.runtime.snapshots;

import androidx.collection.wypolnanlu;
import ezmngbhpjk.cqumvgiudr;
import ezmngbhpjk.rgvfuqvkyq;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.zdlpuopuiu;
import yzdjzghtvl.iwizpuwonk;
import yzdjzghtvl.lereixgezr;
import yzdjzghtvl.zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
public abstract class btonecajqb {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static List f5953btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final lqeggnwhkg f5954draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static List f5955dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static dxjokdxxww f5956eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final iobyxmoadg f5957gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static long f5958gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final yzdjzghtvl.gxszxtbevo f5960lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final iwizpuwonk f5961nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static ezmngbhpjk.iobyxmoadg f5963wflxmlrfwp;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final long f5965zoijcleaow = 0;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final tg.draadjrbmk f5959iobyxmoadg = new tg.draadjrbmk() { // from class: yzdjzghtvl.btonecajqb
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return androidx.compose.runtime.snapshots.btonecajqb.cllcsxoeiz((androidx.compose.runtime.snapshots.dxjokdxxww) obj);
        }
    };

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final rgvfuqvkyq f5962ppxfxbqfkf = new rgvfuqvkyq();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Object f5964wkgbmnqykc = new Object();

    static {
        dxjokdxxww.iobyxmoadg iobyxmoadgVar = dxjokdxxww.f5967cqumvgiudr;
        f5956eablkybsjg = iobyxmoadgVar.iobyxmoadg();
        long j13 = 1;
        f5958gxszxtbevo = yzdjzghtvl.nufgyqmvbu.ppxfxbqfkf(1) + j13;
        f5960lqeggnwhkg = new yzdjzghtvl.gxszxtbevo();
        f5961nufgyqmvbu = new iwizpuwonk();
        f5955dxjokdxxww = jyumaefscl.wflxmlrfwp();
        f5953btonecajqb = jyumaefscl.wflxmlrfwp();
        long j14 = f5958gxszxtbevo;
        f5958gxszxtbevo = j13 + j14;
        iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(j14, iobyxmoadgVar.iobyxmoadg());
        f5956eablkybsjg = f5956eablkybsjg.wflxmlrfwp(iobyxmoadgVar2.dxjokdxxww());
        f5957gtknphoqwx = iobyxmoadgVar2;
        f5954draadjrbmk = iobyxmoadgVar2;
        f5963wflxmlrfwp = new ezmngbhpjk.iobyxmoadg(0);
    }

    public static final zynmafqrjb bfopjjpdmp(zynmafqrjb zynmafqrjbVar, lereixgezr lereixgezrVar, lqeggnwhkg lqeggnwhkgVar) {
        zynmafqrjb zynmafqrjbVarOkpsazkaxt;
        if (lqeggnwhkgVar.nufgyqmvbu()) {
            lqeggnwhkgVar.rgvfuqvkyq(lereixgezrVar);
        }
        long jDxjokdxxww = lqeggnwhkgVar.dxjokdxxww();
        zynmafqrjb zynmafqrjbVarOkpsazkaxt2 = okpsazkaxt(zynmafqrjbVar, jDxjokdxxww, lqeggnwhkgVar.gxszxtbevo());
        if (zynmafqrjbVarOkpsazkaxt2 == null) {
            ikoacuggdj();
            throw new KotlinNothingValueException();
        }
        if (zynmafqrjbVarOkpsazkaxt2.gxszxtbevo() == lqeggnwhkgVar.dxjokdxxww()) {
            return zynmafqrjbVarOkpsazkaxt2;
        }
        synchronized (dsvhmnatus()) {
            zynmafqrjbVarOkpsazkaxt = okpsazkaxt(lereixgezrVar.getFirstStateRecord(), jDxjokdxxww, lqeggnwhkgVar.gxszxtbevo());
            if (zynmafqrjbVarOkpsazkaxt == null) {
                ikoacuggdj();
                throw new KotlinNothingValueException();
            }
            if (zynmafqrjbVarOkpsazkaxt.gxszxtbevo() != jDxjokdxxww) {
                zynmafqrjbVarOkpsazkaxt = sopmlzcsov(zynmafqrjbVarOkpsazkaxt, lereixgezrVar, lqeggnwhkgVar);
            }
        }
        zdlpuopuiu.nufgyqmvbu(zynmafqrjbVarOkpsazkaxt, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (zynmafqrjbVarOkpsazkaxt2.gxszxtbevo() != yzdjzghtvl.nufgyqmvbu.ppxfxbqfkf(1)) {
            lqeggnwhkgVar.rgvfuqvkyq(lereixgezrVar);
        }
        return zynmafqrjbVarOkpsazkaxt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cllcsxoeiz(dxjokdxxww dxjokdxxwwVar) {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void crxdokpmqz(lqeggnwhkg lqeggnwhkgVar, lereixgezr lereixgezrVar) {
        lqeggnwhkgVar.iwizpuwonk(lqeggnwhkgVar.btonecajqb() + 1);
        tg.draadjrbmk draadjrbmkVarGtknphoqwx = lqeggnwhkgVar.gtknphoqwx();
        if (draadjrbmkVarGtknphoqwx != null) {
            draadjrbmkVarGtknphoqwx.invoke(lereixgezrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg czzsidtyhn(final tg.draadjrbmk draadjrbmkVar) {
        return (lqeggnwhkg) iozdgvuglv(new tg.draadjrbmk() { // from class: yzdjzghtvl.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return androidx.compose.runtime.snapshots.btonecajqb.uwvvkdfqfp(draadjrbmkVar, (androidx.compose.runtime.snapshots.dxjokdxxww) obj);
            }
        });
    }

    public static final Object dsvhmnatus() {
        return f5964wkgbmnqykc;
    }

    public static final zynmafqrjb hcddaimhww(zynmafqrjb zynmafqrjbVar) {
        zynmafqrjb zynmafqrjbVarOkpsazkaxt;
        lqeggnwhkg.iobyxmoadg iobyxmoadgVar = lqeggnwhkg.f6010eablkybsjg;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        zynmafqrjb zynmafqrjbVarOkpsazkaxt2 = okpsazkaxt(zynmafqrjbVar, lqeggnwhkgVarPpxfxbqfkf.dxjokdxxww(), lqeggnwhkgVarPpxfxbqfkf.gxszxtbevo());
        if (zynmafqrjbVarOkpsazkaxt2 != null) {
            return zynmafqrjbVarOkpsazkaxt2;
        }
        synchronized (dsvhmnatus()) {
            lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf2 = iobyxmoadgVar.ppxfxbqfkf();
            zynmafqrjbVarOkpsazkaxt = okpsazkaxt(zynmafqrjbVar, lqeggnwhkgVarPpxfxbqfkf2.dxjokdxxww(), lqeggnwhkgVarPpxfxbqfkf2.gxszxtbevo());
        }
        if (zynmafqrjbVarOkpsazkaxt != null) {
            return zynmafqrjbVarOkpsazkaxt;
        }
        ikoacuggdj();
        throw new KotlinNothingValueException();
    }

    public static final lqeggnwhkg hkdspvbjdz() {
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) f5962ppxfxbqfkf.iobyxmoadg();
        return lqeggnwhkgVar == null ? f5957gtknphoqwx : lqeggnwhkgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void ikoacuggdj() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0095 A[Catch: all -> 0x008c, LOOP:1: B:31:0x005c->B:43:0x0095, LOOP_END, TryCatch #2 {all -> 0x008c, blocks: (B:26:0x004d, B:28:0x0052, B:31:0x005c, B:33:0x006c, B:35:0x0078, B:37:0x0081, B:40:0x008e, B:43:0x0095, B:44:0x0097), top: B:55:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0097 A[EDGE_INSN: B:59:0x0097->B:44:0x0097 BREAK  A[LOOP:1: B:31:0x005c->B:43:0x0095], SYNTHETIC] */
    public static final Object iozdgvuglv(tg.draadjrbmk draadjrbmkVar) {
        wypolnanlu wypolnanluVarYadqdtsiqt;
        Object objRlfsiqarku;
        iobyxmoadg iobyxmoadgVar = f5957gtknphoqwx;
        synchronized (dsvhmnatus()) {
            try {
                wypolnanluVarYadqdtsiqt = iobyxmoadgVar.yadqdtsiqt();
                if (wypolnanluVarYadqdtsiqt != null) {
                    f5963wflxmlrfwp.iobyxmoadg(1);
                }
                objRlfsiqarku = rlfsiqarku(iobyxmoadgVar, draadjrbmkVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (wypolnanluVarYadqdtsiqt != null) {
            try {
                List list = f5955dxjokdxxww;
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((tg.rgvfuqvkyq) list.get(i13)).invoke(ipoelvxyzq.gxszxtbevo.iobyxmoadg(wypolnanluVarYadqdtsiqt), iobyxmoadgVar);
                }
                f5963wflxmlrfwp.iobyxmoadg(-1);
            } catch (Throwable th3) {
                f5963wflxmlrfwp.iobyxmoadg(-1);
                throw th3;
            }
        }
        synchronized (dsvhmnatus()) {
            try {
                wwaezpbzkn();
                if (wypolnanluVarYadqdtsiqt != null) {
                    Object[] objArr = wypolnanluVarYadqdtsiqt.f4398zoijcleaow;
                    long[] jArr = wypolnanluVarYadqdtsiqt.f4395iobyxmoadg;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j13 = jArr[i14];
                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i14 != length) {
                                    break;
                                    break;
                                }
                                i14++;
                            } else {
                                int i15 = 8 - ((~(i14 - length)) >>> 31);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    if ((255 & j13) < 128) {
                                        jhduphickx((lereixgezr) objArr[(i14 << 3) + i16]);
                                    }
                                    j13 >>= 8;
                                }
                                if (i15 != 8) {
                                    break;
                                }
                                if (i14 != length) {
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return objRlfsiqarku;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jhduphickx(lereixgezr lereixgezrVar) {
        if (vipkmwdibw(lereixgezrVar)) {
            f5961nufgyqmvbu.iobyxmoadg(lereixgezrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map jlmebxxoox(long j13, zoijcleaow zoijcleaowVar, dxjokdxxww dxjokdxxwwVar) {
        long[] jArr;
        HashMap map;
        dxjokdxxww dxjokdxxwwVar2;
        long[] jArr2;
        HashMap map2;
        wypolnanlu wypolnanluVarYadqdtsiqt = zoijcleaowVar.yadqdtsiqt();
        HashMap map3 = null;
        if (wypolnanluVarYadqdtsiqt == null) {
            return null;
        }
        dxjokdxxww dxjokdxxwwVarDraadjrbmk = zoijcleaowVar.gxszxtbevo().wflxmlrfwp(zoijcleaowVar.dxjokdxxww()).draadjrbmk(zoijcleaowVar.iozdgvuglv());
        Object[] objArr = wypolnanluVarYadqdtsiqt.f4398zoijcleaow;
        long[] jArr3 = wypolnanluVarYadqdtsiqt.f4395iobyxmoadg;
        int length = jArr3.length - 2;
        if (length >= 0) {
            HashMap map4 = null;
            int i13 = 0;
            while (true) {
                long j14 = jArr3[i13];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j14) < 128) {
                            lereixgezr lereixgezrVar = (lereixgezr) objArr[(i13 << 3) + i16];
                            zynmafqrjb zynmafqrjbVarIozdgvuglv = lereixgezrVar.getFirstStateRecord();
                            zynmafqrjb zynmafqrjbVarOkpsazkaxt = okpsazkaxt(zynmafqrjbVarIozdgvuglv, j13, dxjokdxxwwVar);
                            if (zynmafqrjbVarOkpsazkaxt == null) {
                                jArr2 = jArr3;
                            } else {
                                jArr2 = jArr3;
                                zynmafqrjb zynmafqrjbVarOkpsazkaxt2 = okpsazkaxt(zynmafqrjbVarIozdgvuglv, j13, dxjokdxxwwVarDraadjrbmk);
                                if (zynmafqrjbVarOkpsazkaxt2 != null && !zdlpuopuiu.eablkybsjg(zynmafqrjbVarOkpsazkaxt, zynmafqrjbVarOkpsazkaxt2)) {
                                    zynmafqrjb zynmafqrjbVarOkpsazkaxt3 = okpsazkaxt(zynmafqrjbVarIozdgvuglv, zoijcleaowVar.dxjokdxxww(), zoijcleaowVar.gxszxtbevo());
                                    if (zynmafqrjbVarOkpsazkaxt3 == null) {
                                        ikoacuggdj();
                                        throw new KotlinNothingValueException();
                                    }
                                    zynmafqrjb zynmafqrjbVarYlkuphrtab = lereixgezrVar.ylkuphrtab(zynmafqrjbVarOkpsazkaxt2, zynmafqrjbVarOkpsazkaxt, zynmafqrjbVarOkpsazkaxt3);
                                    if (zynmafqrjbVarYlkuphrtab == null) {
                                        return null;
                                    }
                                    if (map4 == null) {
                                        map4 = new HashMap();
                                    }
                                    map4.put(zynmafqrjbVarOkpsazkaxt, zynmafqrjbVarYlkuphrtab);
                                    map4 = map4;
                                }
                                map2 = null;
                            }
                            map2 = null;
                        } else {
                            jArr2 = jArr3;
                            map2 = map3;
                            dxjokdxxwwVarDraadjrbmk = dxjokdxxwwVarDraadjrbmk;
                        }
                        j14 >>= 8;
                        i16++;
                        map3 = map2;
                        i14 = 8;
                        jArr3 = jArr2;
                        dxjokdxxwwVarDraadjrbmk = dxjokdxxwwVarDraadjrbmk;
                        j13 = j13;
                    }
                    jArr = jArr3;
                    map = map3;
                    dxjokdxxwwVar2 = dxjokdxxwwVarDraadjrbmk;
                    if (i15 != i14) {
                        return map4;
                    }
                } else {
                    jArr = jArr3;
                    map = map3;
                    dxjokdxxwwVar2 = dxjokdxxwwVarDraadjrbmk;
                }
                if (i13 != length) {
                    i13++;
                    map3 = map;
                    jArr3 = jArr;
                    dxjokdxxwwVarDraadjrbmk = dxjokdxxwwVar2;
                } else {
                    map3 = map4;
                }
            }
        }
        return map3;
    }

    public static final zynmafqrjb jpowsppfya(zynmafqrjb zynmafqrjbVar, lqeggnwhkg lqeggnwhkgVar) {
        zynmafqrjb zynmafqrjbVarOkpsazkaxt;
        zynmafqrjb zynmafqrjbVarOkpsazkaxt2 = okpsazkaxt(zynmafqrjbVar, lqeggnwhkgVar.dxjokdxxww(), lqeggnwhkgVar.gxszxtbevo());
        if (zynmafqrjbVarOkpsazkaxt2 != null) {
            return zynmafqrjbVarOkpsazkaxt2;
        }
        synchronized (dsvhmnatus()) {
            zynmafqrjbVarOkpsazkaxt = okpsazkaxt(zynmafqrjbVar, lqeggnwhkgVar.dxjokdxxww(), lqeggnwhkgVar.gxszxtbevo());
        }
        if (zynmafqrjbVarOkpsazkaxt != null) {
            return zynmafqrjbVarOkpsazkaxt;
        }
        ikoacuggdj();
        throw new KotlinNothingValueException();
    }

    public static final zynmafqrjb jztzpxfvev(zynmafqrjb zynmafqrjbVar, lereixgezr lereixgezrVar) {
        zynmafqrjb zynmafqrjbVarOkpsazkaxt;
        lqeggnwhkg.iobyxmoadg iobyxmoadgVar = lqeggnwhkg.f6010eablkybsjg;
        lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        tg.draadjrbmk draadjrbmkVarLqeggnwhkg = lqeggnwhkgVarPpxfxbqfkf.lqeggnwhkg();
        if (draadjrbmkVarLqeggnwhkg != null) {
            draadjrbmkVarLqeggnwhkg.invoke(lereixgezrVar);
        }
        zynmafqrjb zynmafqrjbVarOkpsazkaxt2 = okpsazkaxt(zynmafqrjbVar, lqeggnwhkgVarPpxfxbqfkf.dxjokdxxww(), lqeggnwhkgVarPpxfxbqfkf.gxszxtbevo());
        if (zynmafqrjbVarOkpsazkaxt2 != null) {
            return zynmafqrjbVarOkpsazkaxt2;
        }
        synchronized (dsvhmnatus()) {
            lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf2 = iobyxmoadgVar.ppxfxbqfkf();
            zynmafqrjb zynmafqrjbVarIozdgvuglv = lereixgezrVar.getFirstStateRecord();
            zdlpuopuiu.nufgyqmvbu(zynmafqrjbVarIozdgvuglv, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            zynmafqrjbVarOkpsazkaxt = okpsazkaxt(zynmafqrjbVarIozdgvuglv, lqeggnwhkgVarPpxfxbqfkf2.dxjokdxxww(), lqeggnwhkgVarPpxfxbqfkf2.gxszxtbevo());
            if (zynmafqrjbVarOkpsazkaxt == null) {
                ikoacuggdj();
                throw new KotlinNothingValueException();
            }
        }
        return zynmafqrjbVarOkpsazkaxt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kegysxyocb(tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, Object obj) {
        draadjrbmkVar.invoke(obj);
        draadjrbmkVar2.invoke(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lmojexxdyd() {
        iozdgvuglv(f5959iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn mbcevpiqjq(tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, Object obj) {
        draadjrbmkVar.invoke(obj);
        draadjrbmkVar2.invoke(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void metgxyhuhe() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public static final zynmafqrjb ntlheqmsrt(zynmafqrjb zynmafqrjbVar, lereixgezr lereixgezrVar) {
        zynmafqrjb zynmafqrjbVarYdmasvzmpa = ydmasvzmpa(lereixgezrVar);
        if (zynmafqrjbVarYdmasvzmpa != null) {
            zynmafqrjbVarYdmasvzmpa.nufgyqmvbu(Long.MAX_VALUE);
            return zynmafqrjbVarYdmasvzmpa;
        }
        zynmafqrjb zynmafqrjbVarWkgbmnqykc = zynmafqrjbVar.wkgbmnqykc(Long.MAX_VALUE);
        zynmafqrjbVarWkgbmnqykc.lqeggnwhkg(lereixgezrVar.getFirstStateRecord());
        zdlpuopuiu.nufgyqmvbu(zynmafqrjbVarWkgbmnqykc, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        lereixgezrVar.cllcsxoeiz(zynmafqrjbVarWkgbmnqykc);
        zdlpuopuiu.nufgyqmvbu(zynmafqrjbVarWkgbmnqykc, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return zynmafqrjbVarWkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oipsdeybqn(lqeggnwhkg lqeggnwhkgVar) {
        long jEablkybsjg;
        if (f5956eablkybsjg.btonecajqb(lqeggnwhkgVar.dxjokdxxww())) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Snapshot is not open: snapshotId=");
        sb3.append(lqeggnwhkgVar.dxjokdxxww());
        sb3.append(", disposed=");
        sb3.append(lqeggnwhkgVar.eablkybsjg());
        sb3.append(", applied=");
        zoijcleaow zoijcleaowVar = lqeggnwhkgVar instanceof zoijcleaow ? (zoijcleaow) lqeggnwhkgVar : null;
        sb3.append(zoijcleaowVar != null ? Boolean.valueOf(zoijcleaowVar.cdpycssgdh()) : "read-only");
        sb3.append(", lowestPin=");
        synchronized (dsvhmnatus()) {
            jEablkybsjg = f5960lqeggnwhkg.eablkybsjg(-1L);
        }
        sb3.append(jEablkybsjg);
        throw new IllegalStateException(sb3.toString().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zynmafqrjb okpsazkaxt(zynmafqrjb zynmafqrjbVar, long j13, dxjokdxxww dxjokdxxwwVar) {
        zynmafqrjb zynmafqrjbVar2 = null;
        while (zynmafqrjbVar != null) {
            if (zfvoamnweg(zynmafqrjbVar, j13, dxjokdxxwwVar) && (zynmafqrjbVar2 == null || zdlpuopuiu.wflxmlrfwp(zynmafqrjbVar2.gxszxtbevo(), zynmafqrjbVar.gxszxtbevo()) < 0)) {
                zynmafqrjbVar2 = zynmafqrjbVar;
            }
            zynmafqrjbVar = zynmafqrjbVar.eablkybsjg();
        }
        if (zynmafqrjbVar2 != null) {
            return zynmafqrjbVar2;
        }
        return null;
    }

    static /* synthetic */ lqeggnwhkg pkzmftpjix(lqeggnwhkg lqeggnwhkgVar, tg.draadjrbmk draadjrbmkVar, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            draadjrbmkVar = null;
        }
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        return ylkuphrtab(lqeggnwhkgVar, draadjrbmkVar, z13);
    }

    public static final zynmafqrjb ribwqtqdhb(zynmafqrjb zynmafqrjbVar, lereixgezr lereixgezrVar, lqeggnwhkg lqeggnwhkgVar, zynmafqrjb zynmafqrjbVar2) {
        zynmafqrjb zynmafqrjbVarNtlheqmsrt;
        if (lqeggnwhkgVar.nufgyqmvbu()) {
            lqeggnwhkgVar.rgvfuqvkyq(lereixgezrVar);
        }
        long jDxjokdxxww = lqeggnwhkgVar.dxjokdxxww();
        if (zynmafqrjbVar2.gxszxtbevo() == jDxjokdxxww) {
            return zynmafqrjbVar2;
        }
        synchronized (dsvhmnatus()) {
            zynmafqrjbVarNtlheqmsrt = ntlheqmsrt(zynmafqrjbVar, lereixgezrVar);
        }
        zynmafqrjbVarNtlheqmsrt.nufgyqmvbu(jDxjokdxxww);
        if (zynmafqrjbVar2.gxszxtbevo() != yzdjzghtvl.nufgyqmvbu.ppxfxbqfkf(1)) {
            lqeggnwhkgVar.rgvfuqvkyq(lereixgezrVar);
        }
        return zynmafqrjbVarNtlheqmsrt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object rlfsiqarku(iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar) {
        long jDxjokdxxww = iobyxmoadgVar.dxjokdxxww();
        Object objInvoke = draadjrbmkVar.invoke(f5956eablkybsjg.dxjokdxxww(jDxjokdxxww));
        long j13 = f5958gxszxtbevo;
        f5958gxszxtbevo = ((long) 1) + j13;
        f5956eablkybsjg = f5956eablkybsjg.dxjokdxxww(jDxjokdxxww);
        iobyxmoadgVar.jyumaefscl(j13);
        iobyxmoadgVar.yggfygwlhe(f5956eablkybsjg);
        iobyxmoadgVar.iwizpuwonk(0);
        iobyxmoadgVar.stevsuqkhv(null);
        iobyxmoadgVar.vdvldrhtss();
        f5956eablkybsjg = f5956eablkybsjg.wflxmlrfwp(j13);
        return objInvoke;
    }

    private static final boolean sflfametgt(long j13, long j14, dxjokdxxww dxjokdxxwwVar) {
        return (j14 == f5965zoijcleaow || zdlpuopuiu.wflxmlrfwp(j14, j13) > 0 || dxjokdxxwwVar.btonecajqb(j14)) ? false : true;
    }

    private static final zynmafqrjb sopmlzcsov(zynmafqrjb zynmafqrjbVar, lereixgezr lereixgezrVar, lqeggnwhkg lqeggnwhkgVar) {
        zynmafqrjb zynmafqrjbVarNtlheqmsrt = ntlheqmsrt(zynmafqrjbVar, lereixgezrVar);
        zynmafqrjbVarNtlheqmsrt.ppxfxbqfkf(zynmafqrjbVar);
        zynmafqrjbVarNtlheqmsrt.nufgyqmvbu(lqeggnwhkgVar.dxjokdxxww());
        return zynmafqrjbVarNtlheqmsrt;
    }

    static /* synthetic */ tg.draadjrbmk stevsuqkhv(tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        return wypolnanlu(draadjrbmkVar, draadjrbmkVar2, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tg.draadjrbmk tzroggbefp(final tg.draadjrbmk draadjrbmkVar, final tg.draadjrbmk draadjrbmkVar2) {
        if (draadjrbmkVar == null || draadjrbmkVar2 == null || draadjrbmkVar == draadjrbmkVar2) {
            return draadjrbmkVar == null ? draadjrbmkVar2 : draadjrbmkVar;
        }
        return new tg.draadjrbmk() { // from class: yzdjzghtvl.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return androidx.compose.runtime.snapshots.btonecajqb.mbcevpiqjq(draadjrbmkVar, draadjrbmkVar2, obj);
            }
        };
    }

    public static final zynmafqrjb ulzqkzuiru(zynmafqrjb zynmafqrjbVar, lereixgezr lereixgezrVar, lqeggnwhkg lqeggnwhkgVar) {
        zynmafqrjb zynmafqrjbVarSopmlzcsov;
        synchronized (dsvhmnatus()) {
            zynmafqrjbVarSopmlzcsov = sopmlzcsov(zynmafqrjbVar, lereixgezrVar, lqeggnwhkgVar);
        }
        return zynmafqrjbVarSopmlzcsov;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg uwvvkdfqfp(tg.draadjrbmk draadjrbmkVar, dxjokdxxww dxjokdxxwwVar) {
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) draadjrbmkVar.invoke(dxjokdxxwwVar);
        synchronized (dsvhmnatus()) {
            f5956eablkybsjg = f5956eablkybsjg.wflxmlrfwp(lqeggnwhkgVar.dxjokdxxww());
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
        return lqeggnwhkgVar;
    }

    private static final boolean vipkmwdibw(lereixgezr lereixgezrVar) {
        zynmafqrjb zynmafqrjbVar;
        long jEablkybsjg = f5960lqeggnwhkg.eablkybsjg(f5958gxszxtbevo);
        zynmafqrjb zynmafqrjbVar2 = null;
        zynmafqrjb zynmafqrjbVarIozdgvuglv = null;
        int i13 = 0;
        for (zynmafqrjb zynmafqrjbVarIozdgvuglv2 = lereixgezrVar.getFirstStateRecord(); zynmafqrjbVarIozdgvuglv2 != null; zynmafqrjbVarIozdgvuglv2 = zynmafqrjbVarIozdgvuglv2.eablkybsjg()) {
            long jGxszxtbevo = zynmafqrjbVarIozdgvuglv2.gxszxtbevo();
            if (jGxszxtbevo != f5965zoijcleaow) {
                if (zdlpuopuiu.wflxmlrfwp(jGxszxtbevo, jEablkybsjg) >= 0) {
                    i13++;
                } else if (zynmafqrjbVar2 == null) {
                    i13++;
                    zynmafqrjbVar2 = zynmafqrjbVarIozdgvuglv2;
                } else {
                    if (zdlpuopuiu.wflxmlrfwp(zynmafqrjbVarIozdgvuglv2.gxszxtbevo(), zynmafqrjbVar2.gxszxtbevo()) < 0) {
                        zynmafqrjbVar = zynmafqrjbVar2;
                        zynmafqrjbVar2 = zynmafqrjbVarIozdgvuglv2;
                    } else {
                        zynmafqrjbVar = zynmafqrjbVarIozdgvuglv2;
                    }
                    if (zynmafqrjbVarIozdgvuglv == null) {
                        zynmafqrjbVarIozdgvuglv = lereixgezrVar.getFirstStateRecord();
                        zynmafqrjb zynmafqrjbVar3 = zynmafqrjbVarIozdgvuglv;
                        while (true) {
                            if (zynmafqrjbVarIozdgvuglv == null) {
                                zynmafqrjbVarIozdgvuglv = zynmafqrjbVar3;
                                break;
                            }
                            if (zdlpuopuiu.wflxmlrfwp(zynmafqrjbVarIozdgvuglv.gxszxtbevo(), jEablkybsjg) >= 0) {
                                break;
                            }
                            if (zdlpuopuiu.wflxmlrfwp(zynmafqrjbVar3.gxszxtbevo(), zynmafqrjbVarIozdgvuglv.gxszxtbevo()) < 0) {
                                zynmafqrjbVar3 = zynmafqrjbVarIozdgvuglv;
                            }
                            zynmafqrjbVarIozdgvuglv = zynmafqrjbVarIozdgvuglv.eablkybsjg();
                        }
                    }
                    zynmafqrjbVar2.nufgyqmvbu(f5965zoijcleaow);
                    zynmafqrjbVar2.ppxfxbqfkf(zynmafqrjbVarIozdgvuglv);
                    zynmafqrjbVar2 = zynmafqrjbVar;
                }
            }
        }
        return i13 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wwaezpbzkn() {
        iwizpuwonk iwizpuwonkVar = f5961nufgyqmvbu;
        int iEablkybsjg = iwizpuwonkVar.eablkybsjg();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= iEablkybsjg) {
                break;
            }
            cqumvgiudr cqumvgiudrVar = iwizpuwonkVar.gxszxtbevo()[i13];
            Object obj = cqumvgiudrVar != null ? cqumvgiudrVar.get() : null;
            if (obj != null && vipkmwdibw((lereixgezr) obj)) {
                if (i14 != i13) {
                    iwizpuwonkVar.gxszxtbevo()[i14] = cqumvgiudrVar;
                    iwizpuwonkVar.wkgbmnqykc()[i14] = iwizpuwonkVar.wkgbmnqykc()[i13];
                }
                i14++;
            }
            i13++;
        }
        for (int i15 = i14; i15 < iEablkybsjg; i15++) {
            iwizpuwonkVar.gxszxtbevo()[i15] = null;
            iwizpuwonkVar.wkgbmnqykc()[i15] = 0;
        }
        if (i14 != iEablkybsjg) {
            iwizpuwonkVar.lqeggnwhkg(i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tg.draadjrbmk wypolnanlu(final tg.draadjrbmk draadjrbmkVar, final tg.draadjrbmk draadjrbmkVar2, boolean z13) {
        if (!z13) {
            draadjrbmkVar2 = null;
        }
        if (draadjrbmkVar == null || draadjrbmkVar2 == null || draadjrbmkVar == draadjrbmkVar2) {
            return draadjrbmkVar == null ? draadjrbmkVar2 : draadjrbmkVar;
        }
        return new tg.draadjrbmk() { // from class: yzdjzghtvl.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return androidx.compose.runtime.snapshots.btonecajqb.kegysxyocb(draadjrbmkVar, draadjrbmkVar2, obj);
            }
        };
    }

    public static final void xrmfcynszj(int i13) {
        f5960lqeggnwhkg.gxszxtbevo(i13);
    }

    public static final dxjokdxxww yadqdtsiqt(dxjokdxxww dxjokdxxwwVar, long j13, long j14) {
        while (zdlpuopuiu.wflxmlrfwp(j13, j14) < 0) {
            dxjokdxxwwVar = dxjokdxxwwVar.wflxmlrfwp(j13);
            j13 += (long) 1;
        }
        return dxjokdxxwwVar;
    }

    private static final zynmafqrjb ydmasvzmpa(lereixgezr lereixgezrVar) {
        long jEablkybsjg = f5960lqeggnwhkg.eablkybsjg(f5958gxszxtbevo) - ((long) 1);
        dxjokdxxww dxjokdxxwwVarIobyxmoadg = dxjokdxxww.f5967cqumvgiudr.iobyxmoadg();
        zynmafqrjb zynmafqrjbVar = null;
        for (zynmafqrjb zynmafqrjbVarIozdgvuglv = lereixgezrVar.getFirstStateRecord(); zynmafqrjbVarIozdgvuglv != null; zynmafqrjbVarIozdgvuglv = zynmafqrjbVarIozdgvuglv.eablkybsjg()) {
            if (zynmafqrjbVarIozdgvuglv.gxszxtbevo() == f5965zoijcleaow) {
                return zynmafqrjbVarIozdgvuglv;
            }
            if (zfvoamnweg(zynmafqrjbVarIozdgvuglv, jEablkybsjg, dxjokdxxwwVarIobyxmoadg)) {
                if (zynmafqrjbVar != null) {
                    return zdlpuopuiu.wflxmlrfwp(zynmafqrjbVarIozdgvuglv.gxszxtbevo(), zynmafqrjbVar.gxszxtbevo()) < 0 ? zynmafqrjbVarIozdgvuglv : zynmafqrjbVar;
                }
                zynmafqrjbVar = zynmafqrjbVarIozdgvuglv;
            }
        }
        return null;
    }

    public static final int yfnezrywwk(long j13, dxjokdxxww dxjokdxxwwVar) {
        int iIobyxmoadg;
        long jGtknphoqwx = dxjokdxxwwVar.gtknphoqwx(j13);
        synchronized (dsvhmnatus()) {
            iIobyxmoadg = f5960lqeggnwhkg.iobyxmoadg(jGtknphoqwx);
        }
        return iIobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lqeggnwhkg ylkuphrtab(lqeggnwhkg lqeggnwhkgVar, tg.draadjrbmk draadjrbmkVar, boolean z13) {
        boolean z14 = lqeggnwhkgVar instanceof zoijcleaow;
        if (z14 || lqeggnwhkgVar == null) {
            return new wflxmlrfwp(z14 ? (zoijcleaow) lqeggnwhkgVar : null, draadjrbmkVar, null, false, z13);
        }
        return new agtfadlqog(lqeggnwhkgVar, draadjrbmkVar, false, z13);
    }

    private static final boolean zfvoamnweg(zynmafqrjb zynmafqrjbVar, long j13, dxjokdxxww dxjokdxxwwVar) {
        return sflfametgt(j13, zynmafqrjbVar.gxszxtbevo(), dxjokdxxwwVar);
    }
}
