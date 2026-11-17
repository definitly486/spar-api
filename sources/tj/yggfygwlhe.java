package tj;

import gg.wwaezpbzkn;
import pj.dvvnrvtcbc;

/* JADX INFO: loaded from: classes3.dex */
public final class yggfygwlhe extends kotlin.coroutines.jvm.internal.wkgbmnqykc implements sj.nufgyqmvbu, kotlin.coroutines.jvm.internal.eablkybsjg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private lg.gxszxtbevo f110712cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private lg.btonecajqb f110713iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final int f110714jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final lg.btonecajqb f110715yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final sj.nufgyqmvbu f110716zdlpuopuiu;

    public yggfygwlhe(sj.nufgyqmvbu nufgyqmvbuVar, lg.btonecajqb btonecajqbVar) {
        super(vdvldrhtss.f110701zdlpuopuiu, lg.gtknphoqwx.f62507zdlpuopuiu);
        this.f110716zdlpuopuiu = nufgyqmvbuVar;
        this.f110715yggfygwlhe = btonecajqbVar;
        this.f110714jyumaefscl = ((Number) btonecajqbVar.fold(0, new tg.rgvfuqvkyq() { // from class: tj.zdlpuopuiu
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(yggfygwlhe.zdlpuopuiu(((Integer) obj).intValue(), (lg.btonecajqb.zoijcleaow) obj2));
            }
        })).intValue();
    }

    private final void jyumaefscl(draadjrbmk draadjrbmkVar, Object obj) {
        throw new IllegalStateException(mj.kcexrzcfyt.btonecajqb("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + draadjrbmkVar.f110584yggfygwlhe + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    private final void kcexrzcfyt(lg.btonecajqb btonecajqbVar, lg.btonecajqb btonecajqbVar2, Object obj) {
        if (btonecajqbVar2 instanceof draadjrbmk) {
            jyumaefscl((draadjrbmk) btonecajqbVar2, obj);
        }
        cqumvgiudr.zoijcleaow(this, btonecajqbVar);
    }

    private final Object yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar, Object obj) {
        lg.btonecajqb context = gxszxtbevoVar.getContext();
        dvvnrvtcbc.dxjokdxxww(context);
        lg.btonecajqb btonecajqbVar = this.f110713iwizpuwonk;
        if (btonecajqbVar != context) {
            kcexrzcfyt(context, btonecajqbVar, obj);
            this.f110713iwizpuwonk = context;
        }
        this.f110712cqumvgiudr = gxszxtbevoVar;
        tg.vdvldrhtss vdvldrhtssVar = jyumaefscl.f110688iobyxmoadg;
        sj.nufgyqmvbu nufgyqmvbuVar = this.f110716zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(nufgyqmvbuVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = vdvldrhtssVar.invoke(nufgyqmvbuVar, obj, this);
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objInvoke, mg.zoijcleaow.gxszxtbevo())) {
            this.f110712cqumvgiudr = null;
        }
        return objInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zdlpuopuiu(int i13, lg.btonecajqb.zoijcleaow zoijcleaowVar) {
        return i13 + 1;
    }

    @Override // sj.nufgyqmvbu
    public Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        try {
            Object objYggfygwlhe = yggfygwlhe(gxszxtbevoVar, obj);
            if (objYggfygwlhe == mg.zoijcleaow.gxszxtbevo()) {
                kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
            }
            return objYggfygwlhe == mg.zoijcleaow.gxszxtbevo() ? objYggfygwlhe : wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th2) {
            this.f110713iwizpuwonk = new draadjrbmk(th2, gxszxtbevoVar.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg, kotlin.coroutines.jvm.internal.eablkybsjg
    public kotlin.coroutines.jvm.internal.eablkybsjg getCallerFrame() {
        lg.gxszxtbevo gxszxtbevoVar = this.f110712cqumvgiudr;
        if (gxszxtbevoVar instanceof kotlin.coroutines.jvm.internal.eablkybsjg) {
            return (kotlin.coroutines.jvm.internal.eablkybsjg) gxszxtbevoVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.wkgbmnqykc, lg.gxszxtbevo
    public lg.btonecajqb getContext() {
        lg.btonecajqb btonecajqbVar = this.f110713iwizpuwonk;
        return btonecajqbVar == null ? lg.gtknphoqwx.f62507zdlpuopuiu : btonecajqbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    protected Object invokeSuspend(Object obj) {
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj);
        if (thDxjokdxxww != null) {
            this.f110713iwizpuwonk = new draadjrbmk(thDxjokdxxww, getContext());
        }
        lg.gxszxtbevo gxszxtbevoVar = this.f110712cqumvgiudr;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.resumeWith(obj);
        }
        return mg.zoijcleaow.gxszxtbevo();
    }

    @Override // kotlin.coroutines.jvm.internal.wkgbmnqykc, kotlin.coroutines.jvm.internal.iobyxmoadg
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
