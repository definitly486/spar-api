package a7;

import e7.btonecajqb;
import e7.nufgyqmvbu;
import f7.dxjokdxxww;
import gg.zdlpuopuiu;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements zoijcleaow.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final dxjokdxxww f1029eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final v6.zoijcleaow f1030gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f1031iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f1032lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f1033ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final nufgyqmvbu f1034wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f1035zoijcleaow;

    static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f1036cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f1038jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f1039yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f1040zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f1038jyumaefscl = obj;
            this.f1036cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.lqeggnwhkg(null, this);
        }
    }

    public ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar, List list, int i13, nufgyqmvbu nufgyqmvbuVar2, dxjokdxxww dxjokdxxwwVar, v6.zoijcleaow zoijcleaowVar, boolean z13) {
        this.f1031iobyxmoadg = nufgyqmvbuVar;
        this.f1035zoijcleaow = list;
        this.f1033ppxfxbqfkf = i13;
        this.f1034wkgbmnqykc = nufgyqmvbuVar2;
        this.f1029eablkybsjg = dxjokdxxwwVar;
        this.f1030gxszxtbevo = zoijcleaowVar;
        this.f1032lqeggnwhkg = z13;
    }

    private final ppxfxbqfkf ppxfxbqfkf(int i13, nufgyqmvbu nufgyqmvbuVar, dxjokdxxww dxjokdxxwwVar) {
        return new ppxfxbqfkf(this.f1031iobyxmoadg, this.f1035zoijcleaow, i13, nufgyqmvbuVar, dxjokdxxwwVar, this.f1030gxszxtbevo, this.f1032lqeggnwhkg);
    }

    static /* synthetic */ ppxfxbqfkf wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, int i13, nufgyqmvbu nufgyqmvbuVar, dxjokdxxww dxjokdxxwwVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = ppxfxbqfkfVar.f1033ppxfxbqfkf;
        }
        if ((i14 & 2) != 0) {
            nufgyqmvbuVar = ppxfxbqfkfVar.iobyxmoadg();
        }
        if ((i14 & 4) != 0) {
            dxjokdxxwwVar = ppxfxbqfkfVar.getSize();
        }
        return ppxfxbqfkfVar.ppxfxbqfkf(i13, nufgyqmvbuVar, dxjokdxxwwVar);
    }

    private final void zoijcleaow(nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
        if (nufgyqmvbuVar.draadjrbmk() != this.f1031iobyxmoadg.draadjrbmk()) {
            throw new IllegalStateException(("Interceptor '" + zoijcleaowVar + "' cannot modify the request's context.").toString());
        }
        if (nufgyqmvbuVar.wflxmlrfwp() == btonecajqb.f30633iobyxmoadg) {
            throw new IllegalStateException(("Interceptor '" + zoijcleaowVar + "' cannot set the request's data to null.").toString());
        }
        if (nufgyqmvbuVar.hkdspvbjdz() != this.f1031iobyxmoadg.hkdspvbjdz()) {
            throw new IllegalStateException(("Interceptor '" + zoijcleaowVar + "' cannot modify the request's target.").toString());
        }
        if (nufgyqmvbuVar.lereixgezr() != this.f1031iobyxmoadg.lereixgezr()) {
            throw new IllegalStateException(("Interceptor '" + zoijcleaowVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (nufgyqmvbuVar.hcddaimhww() == this.f1031iobyxmoadg.hcddaimhww()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + zoijcleaowVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    public final v6.zoijcleaow eablkybsjg() {
        return this.f1030gxszxtbevo;
    }

    @Override // a7.zoijcleaow.iobyxmoadg
    public dxjokdxxww getSize() {
        return this.f1029eablkybsjg;
    }

    public final boolean gxszxtbevo() {
        return this.f1032lqeggnwhkg;
    }

    @Override // a7.zoijcleaow.iobyxmoadg
    public nufgyqmvbu iobyxmoadg() {
        return this.f1034wkgbmnqykc;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object lqeggnwhkg(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f1036cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f1036cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f1038jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f1036cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            int i15 = this.f1033ppxfxbqfkf;
            if (i15 > 0) {
                zoijcleaow(nufgyqmvbuVar, (zoijcleaow) this.f1035zoijcleaow.get(i15 - 1));
            }
            zoijcleaow zoijcleaowVar2 = (zoijcleaow) this.f1035zoijcleaow.get(this.f1033ppxfxbqfkf);
            ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = wkgbmnqykc(this, this.f1033ppxfxbqfkf + 1, nufgyqmvbuVar, null, 4, null);
            iobyxmoadgVar.f1040zdlpuopuiu = this;
            iobyxmoadgVar.f1039yggfygwlhe = zoijcleaowVar2;
            iobyxmoadgVar.f1036cqumvgiudr = 1;
            Object objIobyxmoadg = zoijcleaowVar2.iobyxmoadg(ppxfxbqfkfVarWkgbmnqykc, iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
            obj = objIobyxmoadg;
            zoijcleaowVar = zoijcleaowVar2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f1039yggfygwlhe;
            ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f1040zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        e7.dxjokdxxww dxjokdxxwwVar = (e7.dxjokdxxww) obj;
        ppxfxbqfkfVar.zoijcleaow(dxjokdxxwwVar.zoijcleaow(), zoijcleaowVar);
        return dxjokdxxwwVar;
    }
}
