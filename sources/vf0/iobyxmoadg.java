package vf0;

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

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f116673dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final wypolnanlu f116674eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private auzgnhcxok f116675gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz f116676iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private auzgnhcxok f116677lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private auzgnhcxok f116678nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wypolnanlu f116679ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zynmafqrjb f116680wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zynmafqrjb f116681zoijcleaow;

    /* JADX INFO: renamed from: vf0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2911iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f116682jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f116683yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116684zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2911iobyxmoadg(tg.draadjrbmk draadjrbmkVar, String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f116683yggfygwlhe = draadjrbmkVar;
            this.f116682jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2911iobyxmoadg(this.f116683yggfygwlhe, this.f116682jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f116684zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f116684zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(1000L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            tg.draadjrbmk draadjrbmkVar = this.f116683yggfygwlhe;
            if (draadjrbmkVar != null) {
                draadjrbmkVar.invoke(this.f116682jyumaefscl);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2911iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f116686zdlpuopuiu;

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
            int i13 = this.f116686zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f116686zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(3000L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            zynmafqrjb zynmafqrjbVar = iobyxmoadg.this.f116680wkgbmnqykc;
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

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f116688jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        long f116689yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        long f116690zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            long jCurrentTimeMillis;
            long jCurrentTimeMillis2;
            Object value;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f116688jyumaefscl;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                jCurrentTimeMillis = 0;
                jCurrentTimeMillis2 = System.currentTimeMillis();
            } else if (i13 == 1) {
                long j13 = this.f116690zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                jCurrentTimeMillis2 = j13;
                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jCurrentTimeMillis = this.f116689yggfygwlhe;
                jCurrentTimeMillis2 = this.f116690zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            }
            while (jCurrentTimeMillis < 3000) {
                if (iobyxmoadg.this.f116673dxjokdxxww) {
                    this.f116690zdlpuopuiu = jCurrentTimeMillis2;
                    this.f116689yggfygwlhe = jCurrentTimeMillis;
                    this.f116688jyumaefscl = 2;
                    if (crxdokpmqz.zoijcleaow(50L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    this.f116690zdlpuopuiu = jCurrentTimeMillis2;
                    this.f116688jyumaefscl = 1;
                    if (crxdokpmqz.zoijcleaow(1000L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                }
            }
            zynmafqrjb zynmafqrjbVar = iobyxmoadg.this.f116681zoijcleaow;
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
        this.f116676iobyxmoadg = scope;
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(null);
        this.f116681zoijcleaow = zynmafqrjbVarIobyxmoadg;
        this.f116679ppxfxbqfkf = zynmafqrjbVarIobyxmoadg;
        zynmafqrjb zynmafqrjbVarIobyxmoadg2 = kegysxyocb.iobyxmoadg(null);
        this.f116680wkgbmnqykc = zynmafqrjbVarIobyxmoadg2;
        this.f116674eablkybsjg = zynmafqrjbVarIobyxmoadg2;
    }

    public static /* synthetic */ void dxjokdxxww(iobyxmoadg iobyxmoadgVar, boolean z13, tg.draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            draadjrbmkVar = null;
        }
        iobyxmoadgVar.nufgyqmvbu(z13, draadjrbmkVar);
    }

    public final void btonecajqb(ss.wkgbmnqykc message) {
        Object value;
        Object value2;
        Object value3;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        if ((message instanceof ss.wkgbmnqykc.eablkybsjg) || (message instanceof ss.wkgbmnqykc.lqeggnwhkg)) {
            if (this.f116681zoijcleaow.getValue() instanceof ss.wkgbmnqykc.ppxfxbqfkf) {
                return;
            }
            ms.iobyxmoadg.iobyxmoadg(this.f116675gxszxtbevo);
            zynmafqrjb zynmafqrjbVar = this.f116681zoijcleaow;
            do {
                value = zynmafqrjbVar.getValue();
            } while (!zynmafqrjbVar.compareAndSet(value, message));
            this.f116675gxszxtbevo = gtknphoqwx.wkgbmnqykc(this.f116676iobyxmoadg, null, null, new zoijcleaow(null), 3, null);
            return;
        }
        if (message instanceof ss.wkgbmnqykc.dxjokdxxww) {
            ms.iobyxmoadg.iobyxmoadg(this.f116677lqeggnwhkg);
            zynmafqrjb zynmafqrjbVar2 = this.f116680wkgbmnqykc;
            do {
                value3 = zynmafqrjbVar2.getValue();
            } while (!zynmafqrjbVar2.compareAndSet(value3, message));
            this.f116677lqeggnwhkg = gtknphoqwx.wkgbmnqykc(this.f116676iobyxmoadg, null, null, new ppxfxbqfkf(null), 3, null);
            return;
        }
        if (!(message instanceof ss.wkgbmnqykc.ppxfxbqfkf)) {
            throw new NoWhenBranchMatchedException();
        }
        ms.iobyxmoadg.iobyxmoadg(this.f116675gxszxtbevo);
        zynmafqrjb zynmafqrjbVar3 = this.f116681zoijcleaow;
        do {
            value2 = zynmafqrjbVar3.getValue();
        } while (!zynmafqrjbVar3.compareAndSet(value2, message));
    }

    public final wypolnanlu eablkybsjg() {
        return this.f116679ppxfxbqfkf;
    }

    public final void gxszxtbevo() {
        Object value;
        ms.iobyxmoadg.iobyxmoadg(this.f116677lqeggnwhkg);
        zynmafqrjb zynmafqrjbVar = this.f116680wkgbmnqykc;
        do {
            value = zynmafqrjbVar.getValue();
        } while (!zynmafqrjbVar.compareAndSet(value, null));
    }

    public final void lqeggnwhkg() {
        Object value;
        ms.iobyxmoadg.iobyxmoadg(this.f116675gxszxtbevo);
        zynmafqrjb zynmafqrjbVar = this.f116681zoijcleaow;
        do {
            value = zynmafqrjbVar.getValue();
        } while (!zynmafqrjbVar.compareAndSet(value, null));
    }

    public final void nufgyqmvbu(boolean z13, tg.draadjrbmk draadjrbmkVar) {
        ss.wkgbmnqykc.AbstractC2665wkgbmnqykc abstractC2665wkgbmnqykcIobyxmoadg;
        if (!z13) {
            ms.iobyxmoadg.iobyxmoadg(this.f116678nufgyqmvbu);
            this.f116673dxjokdxxww = false;
            return;
        }
        ss.wkgbmnqykc wkgbmnqykcVar = (ss.wkgbmnqykc) this.f116681zoijcleaow.getValue();
        String strIobyxmoadg = (wkgbmnqykcVar == null || (abstractC2665wkgbmnqykcIobyxmoadg = wkgbmnqykcVar.iobyxmoadg()) == null) ? null : abstractC2665wkgbmnqykcIobyxmoadg.iobyxmoadg();
        if (strIobyxmoadg != null && strIobyxmoadg.length() != 0) {
            this.f116678nufgyqmvbu = gtknphoqwx.wkgbmnqykc(this.f116676iobyxmoadg, null, null, new C2911iobyxmoadg(draadjrbmkVar, strIobyxmoadg, null), 3, null);
        }
        this.f116673dxjokdxxww = true;
    }

    public final wypolnanlu wkgbmnqykc() {
        return this.f116674eablkybsjg;
    }
}
