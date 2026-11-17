package zc1;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.gtknphoqwx;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f129601dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final wypolnanlu f129602eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private auzgnhcxok f129603gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz f129604iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private auzgnhcxok f129605lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private auzgnhcxok f129606nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wypolnanlu f129607ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zynmafqrjb f129608wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zynmafqrjb f129609zoijcleaow;

    /* JADX INFO: renamed from: zc1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3297iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f129610jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f129611yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f129612zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3297iobyxmoadg(tg.draadjrbmk draadjrbmkVar, String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f129611yggfygwlhe = draadjrbmkVar;
            this.f129610jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C3297iobyxmoadg(this.f129611yggfygwlhe, this.f129610jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f129612zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f129612zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(1000L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            tg.draadjrbmk draadjrbmkVar = this.f129611yggfygwlhe;
            if (draadjrbmkVar != null) {
                draadjrbmkVar.invoke(this.f129610jyumaefscl);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C3297iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f129614zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f129614zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f129614zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(3000L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            zynmafqrjb zynmafqrjbVar = iobyxmoadg.this.f129608wkgbmnqykc;
            do {
                value = zynmafqrjbVar.getValue();
            } while (!zynmafqrjbVar.compareAndSet(value, null));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ lr0.eablkybsjg f129615cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f129616esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f129617iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        long f129618jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        long f129619yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        long f129620zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(lr0.eablkybsjg eablkybsjgVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f129615cqumvgiudr = eablkybsjgVar;
            this.f129616esjtqupxsv = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f129615cqumvgiudr, this.f129616esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            long jLongValue;
            long jCurrentTimeMillis;
            long j13;
            Long lPpxfxbqfkf;
            Object value;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f129617iwizpuwonk;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                lr0.eablkybsjg eablkybsjgVar = this.f129615cqumvgiudr;
                jLongValue = 3000;
                if ((eablkybsjgVar instanceof lr0.eablkybsjg.btonecajqb) && (lPpxfxbqfkf = ((lr0.eablkybsjg.btonecajqb) eablkybsjgVar).ppxfxbqfkf()) != null) {
                    jLongValue = lPpxfxbqfkf.longValue();
                }
                jCurrentTimeMillis = 0;
                j13 = jCurrentTimeMillis2;
            } else if (i13 == 1) {
                long j14 = this.f129619yggfygwlhe;
                long j15 = this.f129620zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                j13 = j15;
                jLongValue = j14;
                jCurrentTimeMillis = System.currentTimeMillis() - j13;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jCurrentTimeMillis = this.f129618jyumaefscl;
                jLongValue = this.f129619yggfygwlhe;
                j13 = this.f129620zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            }
            while (jCurrentTimeMillis < jLongValue) {
                if (this.f129616esjtqupxsv.f129601dxjokdxxww) {
                    this.f129620zdlpuopuiu = j13;
                    this.f129619yggfygwlhe = jLongValue;
                    this.f129618jyumaefscl = jCurrentTimeMillis;
                    this.f129617iwizpuwonk = 2;
                    if (crxdokpmqz.zoijcleaow(50L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    this.f129620zdlpuopuiu = j13;
                    this.f129619yggfygwlhe = jLongValue;
                    this.f129617iwizpuwonk = 1;
                    if (crxdokpmqz.zoijcleaow(1000L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    jCurrentTimeMillis = System.currentTimeMillis() - j13;
                }
            }
            zynmafqrjb zynmafqrjbVar = this.f129616esjtqupxsv.f129609zoijcleaow;
            do {
                value = zynmafqrjbVar.getValue();
            } while (!zynmafqrjbVar.compareAndSet(value, null));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public iobyxmoadg(cllcsxoeiz scope) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scope, "scope");
        this.f129604iobyxmoadg = scope;
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(null);
        this.f129609zoijcleaow = zynmafqrjbVarIobyxmoadg;
        this.f129607ppxfxbqfkf = zynmafqrjbVarIobyxmoadg;
        zynmafqrjb zynmafqrjbVarIobyxmoadg2 = kegysxyocb.iobyxmoadg(null);
        this.f129608wkgbmnqykc = zynmafqrjbVarIobyxmoadg2;
        this.f129602eablkybsjg = zynmafqrjbVarIobyxmoadg2;
    }

    public static /* synthetic */ void dxjokdxxww(iobyxmoadg iobyxmoadgVar, boolean z13, tg.draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            draadjrbmkVar = null;
        }
        iobyxmoadgVar.nufgyqmvbu(z13, draadjrbmkVar);
    }

    public final void btonecajqb(lr0.eablkybsjg message) {
        Object value;
        Object value2;
        Object value3;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        if ((message instanceof lr0.eablkybsjg.btonecajqb) || (message instanceof lr0.eablkybsjg.C1313eablkybsjg) || (message instanceof lr0.eablkybsjg.lqeggnwhkg)) {
            if (this.f129609zoijcleaow.getValue() instanceof lr0.eablkybsjg.ppxfxbqfkf) {
                return;
            }
            cr0.iobyxmoadg.iobyxmoadg(this.f129603gxszxtbevo);
            zynmafqrjb zynmafqrjbVar = this.f129609zoijcleaow;
            do {
                value = zynmafqrjbVar.getValue();
            } while (!zynmafqrjbVar.compareAndSet(value, message));
            this.f129603gxszxtbevo = gtknphoqwx.wkgbmnqykc(this.f129604iobyxmoadg, null, null, new zoijcleaow(message, this, null), 3, null);
            return;
        }
        if (message instanceof lr0.eablkybsjg.dxjokdxxww) {
            cr0.iobyxmoadg.iobyxmoadg(this.f129605lqeggnwhkg);
            zynmafqrjb zynmafqrjbVar2 = this.f129608wkgbmnqykc;
            do {
                value3 = zynmafqrjbVar2.getValue();
            } while (!zynmafqrjbVar2.compareAndSet(value3, message));
            this.f129605lqeggnwhkg = gtknphoqwx.wkgbmnqykc(this.f129604iobyxmoadg, null, null, new ppxfxbqfkf(null), 3, null);
            return;
        }
        if (!(message instanceof lr0.eablkybsjg.ppxfxbqfkf)) {
            throw new NoWhenBranchMatchedException();
        }
        cr0.iobyxmoadg.iobyxmoadg(this.f129603gxszxtbevo);
        zynmafqrjb zynmafqrjbVar3 = this.f129609zoijcleaow;
        do {
            value2 = zynmafqrjbVar3.getValue();
        } while (!zynmafqrjbVar3.compareAndSet(value2, message));
    }

    public final wypolnanlu eablkybsjg() {
        return this.f129607ppxfxbqfkf;
    }

    public final void gxszxtbevo() {
        Object value;
        cr0.iobyxmoadg.iobyxmoadg(this.f129605lqeggnwhkg);
        zynmafqrjb zynmafqrjbVar = this.f129608wkgbmnqykc;
        do {
            value = zynmafqrjbVar.getValue();
        } while (!zynmafqrjbVar.compareAndSet(value, null));
    }

    public final void lqeggnwhkg() {
        Object value;
        cr0.iobyxmoadg.iobyxmoadg(this.f129603gxszxtbevo);
        zynmafqrjb zynmafqrjbVar = this.f129609zoijcleaow;
        do {
            value = zynmafqrjbVar.getValue();
        } while (!zynmafqrjbVar.compareAndSet(value, null));
    }

    public final void nufgyqmvbu(boolean z13, tg.draadjrbmk draadjrbmkVar) {
        lr0.eablkybsjg.wkgbmnqykc wkgbmnqykcVarIobyxmoadg;
        if (!z13) {
            cr0.iobyxmoadg.iobyxmoadg(this.f129606nufgyqmvbu);
            this.f129601dxjokdxxww = false;
            return;
        }
        lr0.eablkybsjg eablkybsjgVar = (lr0.eablkybsjg) this.f129609zoijcleaow.getValue();
        String strIobyxmoadg = (eablkybsjgVar == null || (wkgbmnqykcVarIobyxmoadg = eablkybsjgVar.iobyxmoadg()) == null) ? null : wkgbmnqykcVarIobyxmoadg.iobyxmoadg();
        if (strIobyxmoadg != null && strIobyxmoadg.length() != 0) {
            this.f129606nufgyqmvbu = gtknphoqwx.wkgbmnqykc(this.f129604iobyxmoadg, null, null, new C3297iobyxmoadg(draadjrbmkVar, strIobyxmoadg, null), 3, null);
        }
        this.f129601dxjokdxxww = true;
    }

    public final wypolnanlu wkgbmnqykc() {
        return this.f129602eablkybsjg;
    }
}
