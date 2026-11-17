package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.ylkuphrtab;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.w;
import androidx.compose.ui.platform.zeieaojujs;
import g0.yadqdtsiqt;
import g0.zynmafqrjb;
import gg.wwaezpbzkn;
import ikoacuggdj.tzroggbefp;
import jztzpxfvev.nuxfzjnpeb;
import jztzpxfvev.ribwqtqdhb;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import t.ntlheqmsrt;
import z.dvvnrvtcbc;

/* JADX INFO: loaded from: classes.dex */
final class dxjokdxxww extends androidx.compose.foundation.iobyxmoadg implements z.nufgyqmvbu {

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private tg.iobyxmoadg f4584czzsidtyhn;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private String f4585metgxyhuhe;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private tg.iobyxmoadg f4586rlfsiqarku;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private boolean f4587uwvvkdfqfp;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private final ylkuphrtab f4588ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private final ylkuphrtab f4589yfnezrywwk;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final auzgnhcxok f4590iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f4591zoijcleaow;

        public iobyxmoadg(auzgnhcxok auzgnhcxokVar) {
            this.f4590iobyxmoadg = auzgnhcxokVar;
        }

        public final boolean iobyxmoadg() {
            return this.f4591zoijcleaow;
        }

        public final void ppxfxbqfkf(boolean z13) {
            this.f4591zoijcleaow = z13;
        }

        public final auzgnhcxok zoijcleaow() {
            return this.f4590iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f4593zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return dxjokdxxww.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f4593zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                long jPpxfxbqfkf = ((w) z.dxjokdxxww.iobyxmoadg(dxjokdxxww.this, zeieaojujs.kcexrzcfyt())).ppxfxbqfkf();
                this.f4593zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(jPpxfxbqfkf, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            tg.iobyxmoadg iobyxmoadgVar = dxjokdxxww.this.f4586rlfsiqarku;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ long f4594cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f4596jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        long f4597yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        long f4598zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(long j13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f4594cqumvgiudr = j13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return dxjokdxxww.this.new wkgbmnqykc(this.f4594cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            long jZoijcleaow;
            long jIobyxmoadg;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f4596jyumaefscl;
            if (i13 != 0) {
                if (i13 == 1) {
                    jIobyxmoadg = this.f4597yggfygwlhe;
                    jZoijcleaow = this.f4598zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                dxjokdxxww.this.f1().invoke();
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            w wVar = (w) z.dxjokdxxww.iobyxmoadg(dxjokdxxww.this, zeieaojujs.kcexrzcfyt());
            jZoijcleaow = wVar.zoijcleaow();
            jIobyxmoadg = wVar.iobyxmoadg();
            this.f4598zdlpuopuiu = jZoijcleaow;
            this.f4597yggfygwlhe = jIobyxmoadg;
            this.f4596jyumaefscl = 1;
            if (crxdokpmqz.zoijcleaow(jZoijcleaow, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) dxjokdxxww.this.f4588ydmasvzmpa.zoijcleaow(this.f4594cqumvgiudr);
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.ppxfxbqfkf(true);
            }
            this.f4596jyumaefscl = 2;
            if (crxdokpmqz.zoijcleaow(jIobyxmoadg - jZoijcleaow, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            dxjokdxxww.this.f1().invoke();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow implements PointerInputEventHandler {

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ dxjokdxxww f4600iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ long f4601jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f4602yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f4603zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f4600iwizpuwonk = dxjokdxxwwVar;
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return ojitshcjhn((ribwqtqdhb) obj, ((g.eablkybsjg) obj2).zdlpuopuiu(), (lg.gxszxtbevo) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f4603zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ribwqtqdhb ribwqtqdhbVar = (ribwqtqdhb) this.f4602yggfygwlhe;
                    long j13 = this.f4601jyumaefscl;
                    if (this.f4600iwizpuwonk.e1()) {
                        dxjokdxxww dxjokdxxwwVar = this.f4600iwizpuwonk;
                        this.f4603zdlpuopuiu = 1;
                        if (dxjokdxxwwVar.g1(ribwqtqdhbVar, j13, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final Object ojitshcjhn(ribwqtqdhb ribwqtqdhbVar, long j13, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f4600iwizpuwonk, gxszxtbevoVar);
                iobyxmoadgVar.f4602yggfygwlhe = ribwqtqdhbVar;
                iobyxmoadgVar.f4601jyumaefscl = j13;
                return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        zoijcleaow() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn eablkybsjg(dxjokdxxww dxjokdxxwwVar, g.eablkybsjg eablkybsjgVar) {
            tg.iobyxmoadg iobyxmoadgVar = dxjokdxxwwVar.f4586rlfsiqarku;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
            if (dxjokdxxwwVar.z1()) {
                ((o.iobyxmoadg) z.dxjokdxxww.iobyxmoadg(dxjokdxxwwVar, zeieaojujs.btonecajqb())).iobyxmoadg(o.zoijcleaow.f71488iobyxmoadg.gxszxtbevo());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn gxszxtbevo(dxjokdxxww dxjokdxxwwVar, g.eablkybsjg eablkybsjgVar) {
            if (dxjokdxxwwVar.e1()) {
                dxjokdxxwwVar.f1().invoke();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn wkgbmnqykc(dxjokdxxww dxjokdxxwwVar, g.eablkybsjg eablkybsjgVar) {
            tg.iobyxmoadg iobyxmoadgVar = dxjokdxxwwVar.f4584czzsidtyhn;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(t.ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
            tg.draadjrbmk draadjrbmkVar;
            tg.draadjrbmk draadjrbmkVar2;
            if (!dxjokdxxww.this.e1() || dxjokdxxww.this.f4584czzsidtyhn == null) {
                draadjrbmkVar = null;
            } else {
                final dxjokdxxww dxjokdxxwwVar = dxjokdxxww.this;
                draadjrbmkVar = new tg.draadjrbmk() { // from class: androidx.compose.foundation.btonecajqb
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return dxjokdxxww.zoijcleaow.wkgbmnqykc(dxjokdxxwwVar, (g.eablkybsjg) obj);
                    }
                };
            }
            if (!dxjokdxxww.this.e1() || dxjokdxxww.this.f4586rlfsiqarku == null) {
                draadjrbmkVar2 = null;
            } else {
                final dxjokdxxww dxjokdxxwwVar2 = dxjokdxxww.this;
                draadjrbmkVar2 = new tg.draadjrbmk() { // from class: androidx.compose.foundation.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return dxjokdxxww.zoijcleaow.eablkybsjg(dxjokdxxwwVar2, (g.eablkybsjg) obj);
                    }
                };
            }
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(dxjokdxxww.this, null);
            final dxjokdxxww dxjokdxxwwVar3 = dxjokdxxww.this;
            Object objBtonecajqb = nuxfzjnpeb.btonecajqb(ylkuphrtabVar, draadjrbmkVar, draadjrbmkVar2, iobyxmoadgVar, new tg.draadjrbmk() { // from class: androidx.compose.foundation.draadjrbmk
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return dxjokdxxww.zoijcleaow.gxszxtbevo(dxjokdxxwwVar3, (g.eablkybsjg) obj);
                }
            }, gxszxtbevoVar);
            return objBtonecajqb == mg.zoijcleaow.gxszxtbevo() ? objBtonecajqb : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public /* synthetic */ dxjokdxxww(tg.iobyxmoadg iobyxmoadgVar, String str, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z14, boolean z15, String str2, g0.nufgyqmvbu nufgyqmvbuVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(iobyxmoadgVar, str, iobyxmoadgVar2, iobyxmoadgVar3, z13, draadjrbmkVar, tzroggbefpVar, z14, z15, str2, nufgyqmvbuVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0050 A[LOOP:0: B:5:0x0018->B:15:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0058 A[EDGE_INSN: B:36:0x0058->B:16:0x0058 BREAK  A[LOOP:0: B:5:0x0018->B:15:0x0050], SYNTHETIC] */
    private final void A1() {
        ylkuphrtab ylkuphrtabVar = this.f4589yfnezrywwk;
        Object[] objArr = ylkuphrtabVar.f4409ppxfxbqfkf;
        long[] jArr = ylkuphrtabVar.f4408iobyxmoadg;
        int length = jArr.length - 2;
        long j13 = -9187201950435737472L;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j14 = jArr[i13];
                if ((((~j14) << 7) & j14 & j13) != j13) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j14 & 255) < 128) {
                            auzgnhcxok.iobyxmoadg.iobyxmoadg((auzgnhcxok) objArr[(i13 << 3) + i15], null, 1, null);
                        }
                        j14 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                    j13 = -9187201950435737472L;
                } else if (i13 != length) {
                    break;
                    break;
                } else {
                    i13++;
                    j13 = -9187201950435737472L;
                }
            }
        }
        ylkuphrtabVar.lqeggnwhkg();
        ylkuphrtab ylkuphrtabVar2 = this.f4588ydmasvzmpa;
        Object[] objArr2 = ylkuphrtabVar2.f4409ppxfxbqfkf;
        long[] jArr2 = ylkuphrtabVar2.f4408iobyxmoadg;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j15 = jArr2[i16];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j15 & 255) < 128) {
                            auzgnhcxok.iobyxmoadg.iobyxmoadg(((iobyxmoadg) objArr2[(i16 << 3) + i18]).zoijcleaow(), null, 1, null);
                        }
                        j15 >>= 8;
                    }
                    if (i17 != 8) {
                        break;
                    }
                }
                if (i16 == length2) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        ylkuphrtabVar2.lqeggnwhkg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y1(dxjokdxxww dxjokdxxwwVar) {
        tg.iobyxmoadg iobyxmoadgVar = dxjokdxxwwVar.f4586rlfsiqarku;
        if (iobyxmoadgVar == null) {
            return true;
        }
        iobyxmoadgVar.invoke();
        return true;
    }

    public final void B1(boolean z13) {
        this.f4587uwvvkdfqfp = z13;
    }

    public final void C1(tg.iobyxmoadg iobyxmoadgVar, String str, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z13, boolean z14, String str2, g0.nufgyqmvbu nufgyqmvbuVar) {
        boolean z15;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4585metgxyhuhe, str)) {
            this.f4585metgxyhuhe = str;
            dvvnrvtcbc.zoijcleaow(this);
        }
        if ((this.f4586rlfsiqarku == null) != (iobyxmoadgVar2 == null)) {
            b1();
            dvvnrvtcbc.zoijcleaow(this);
            z15 = true;
        } else {
            z15 = false;
        }
        this.f4586rlfsiqarku = iobyxmoadgVar2;
        if ((this.f4584czzsidtyhn == null) != (iobyxmoadgVar3 == null)) {
            z15 = true;
        }
        this.f4584czzsidtyhn = iobyxmoadgVar3;
        boolean z16 = e1() != z14 ? true : z15;
        t1(draadjrbmkVar, tzroggbefpVar, z13, z14, str2, nufgyqmvbuVar, iobyxmoadgVar);
        if (z16) {
            r1();
        }
    }

    @Override // androidx.compose.foundation.iobyxmoadg
    public void X0(yadqdtsiqt yadqdtsiqtVar) {
        if (this.f4586rlfsiqarku != null) {
            zynmafqrjb.istkbnxepw(yadqdtsiqtVar, this.f4585metgxyhuhe, new tg.iobyxmoadg() { // from class: androidx.compose.foundation.nufgyqmvbu
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return Boolean.valueOf(dxjokdxxww.y1(this.f5271zdlpuopuiu));
                }
            });
        }
    }

    @Override // androidx.compose.foundation.iobyxmoadg
    public ntlheqmsrt Z0() {
        return t.tzroggbefp.iobyxmoadg(new zoijcleaow());
    }

    @Override // androidx.compose.foundation.iobyxmoadg
    protected void l1() {
        A1();
    }

    @Override // androidx.compose.foundation.iobyxmoadg
    protected boolean m1(KeyEvent keyEvent) {
        boolean z13;
        long jIobyxmoadg = r.wkgbmnqykc.iobyxmoadg(keyEvent);
        if (this.f4586rlfsiqarku == null || this.f4589yfnezrywwk.zoijcleaow(jIobyxmoadg) != null) {
            z13 = false;
        } else {
            this.f4589yfnezrywwk.vdvldrhtss(jIobyxmoadg, pj.gtknphoqwx.wkgbmnqykc(g0(), null, null, new ppxfxbqfkf(null), 3, null));
            z13 = true;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f4588ydmasvzmpa.zoijcleaow(jIobyxmoadg);
        if (iobyxmoadgVar != null) {
            if (iobyxmoadgVar.zoijcleaow().isActive()) {
                auzgnhcxok.iobyxmoadg.iobyxmoadg(iobyxmoadgVar.zoijcleaow(), null, 1, null);
                if (!iobyxmoadgVar.iobyxmoadg()) {
                    f1().invoke();
                    this.f4588ydmasvzmpa.agtfadlqog(jIobyxmoadg);
                }
            } else {
                this.f4588ydmasvzmpa.agtfadlqog(jIobyxmoadg);
            }
        }
        return z13;
    }

    @Override // androidx.compose.foundation.iobyxmoadg
    protected boolean n1(KeyEvent keyEvent) {
        tg.iobyxmoadg iobyxmoadgVar;
        long jIobyxmoadg = r.wkgbmnqykc.iobyxmoadg(keyEvent);
        boolean z13 = false;
        if (this.f4589yfnezrywwk.zoijcleaow(jIobyxmoadg) != null) {
            auzgnhcxok auzgnhcxokVar = (auzgnhcxok) this.f4589yfnezrywwk.zoijcleaow(jIobyxmoadg);
            if (auzgnhcxokVar != null) {
                if (auzgnhcxokVar.isActive()) {
                    auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
                } else {
                    z13 = true;
                }
            }
            this.f4589yfnezrywwk.agtfadlqog(jIobyxmoadg);
        }
        if (this.f4584czzsidtyhn != null) {
            if (this.f4588ydmasvzmpa.zoijcleaow(jIobyxmoadg) != null) {
                if (!z13 && (iobyxmoadgVar = this.f4584czzsidtyhn) != null) {
                    iobyxmoadgVar.invoke();
                }
                this.f4588ydmasvzmpa.agtfadlqog(jIobyxmoadg);
            } else if (!z13) {
                this.f4588ydmasvzmpa.vdvldrhtss(jIobyxmoadg, new iobyxmoadg(pj.gtknphoqwx.wkgbmnqykc(g0(), null, null, new wkgbmnqykc(jIobyxmoadg, null), 3, null)));
            }
        } else if (!z13) {
            f1().invoke();
        }
        return true;
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void s0() {
        super.s0();
        A1();
    }

    public final boolean z1() {
        return this.f4587uwvvkdfqfp;
    }

    private dxjokdxxww(tg.iobyxmoadg iobyxmoadgVar, String str, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, tzroggbefp tzroggbefpVar, boolean z14, boolean z15, String str2, g0.nufgyqmvbu nufgyqmvbuVar) {
        super(draadjrbmkVar, tzroggbefpVar, z14, z15, str2, nufgyqmvbuVar, iobyxmoadgVar, null);
        this.f4585metgxyhuhe = str;
        this.f4586rlfsiqarku = iobyxmoadgVar2;
        this.f4584czzsidtyhn = iobyxmoadgVar3;
        this.f4587uwvvkdfqfp = z13;
        this.f4589yfnezrywwk = androidx.collection.jyumaefscl.iobyxmoadg();
        this.f4588ydmasvzmpa = androidx.collection.jyumaefscl.iobyxmoadg();
    }
}
