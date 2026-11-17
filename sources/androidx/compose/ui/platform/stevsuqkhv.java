package androidx.compose.ui.platform;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class stevsuqkhv implements androidx.compose.runtime.opjhrmiecq {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final dsvhmnatus f7080yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Choreographer f7081zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f7082yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ dsvhmnatus f7083zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(dsvhmnatus dsvhmnatusVar, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f7083zdlpuopuiu = dsvhmnatusVar;
            this.f7082yggfygwlhe = frameCallback;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            this.f7083zdlpuopuiu.ageimvtcrz(this.f7082yggfygwlhe);
        }
    }

    static final class ppxfxbqfkf implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f7084jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ stevsuqkhv f7085yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ pj.agtfadlqog f7086zdlpuopuiu;

        ppxfxbqfkf(pj.agtfadlqog agtfadlqogVar, stevsuqkhv stevsuqkhvVar, tg.draadjrbmk draadjrbmkVar) {
            this.f7086zdlpuopuiu = agtfadlqogVar;
            this.f7085yggfygwlhe = stevsuqkhvVar;
            this.f7084jyumaefscl = draadjrbmkVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j13) {
            Object objWkgbmnqykc;
            pj.agtfadlqog agtfadlqogVar = this.f7086zdlpuopuiu;
            tg.draadjrbmk draadjrbmkVar = this.f7084jyumaefscl;
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(draadjrbmkVar.invoke(Long.valueOf(j13)));
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            agtfadlqogVar.resumeWith(objWkgbmnqykc);
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f7087yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f7087yggfygwlhe = frameCallback;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            stevsuqkhv.this.zoijcleaow().removeFrameCallback(this.f7087yggfygwlhe);
        }
    }

    public stevsuqkhv(Choreographer choreographer, dsvhmnatus dsvhmnatusVar) {
        this.f7081zdlpuopuiu = choreographer;
        this.f7080yggfygwlhe = dsvhmnatusVar;
    }

    @Override // lg.btonecajqb
    public Object fold(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return androidx.compose.runtime.opjhrmiecq.iobyxmoadg.iobyxmoadg(this, obj, rgvfuqvkyqVar);
    }

    @Override // lg.btonecajqb.zoijcleaow, lg.btonecajqb
    public lg.btonecajqb.zoijcleaow get(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return androidx.compose.runtime.opjhrmiecq.iobyxmoadg.zoijcleaow(this, ppxfxbqfkfVar);
    }

    @Override // androidx.compose.runtime.opjhrmiecq
    public Object mbcevpiqjq(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        dsvhmnatus dsvhmnatusVar = this.f7080yggfygwlhe;
        if (dsvhmnatusVar == null) {
            lg.btonecajqb.zoijcleaow zoijcleaowVar = gxszxtbevoVar.getContext().get(lg.lqeggnwhkg.f62508dxjokdxxww);
            dsvhmnatusVar = zoijcleaowVar instanceof dsvhmnatus ? (dsvhmnatus) zoijcleaowVar : null;
        }
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(rgvfuqvkyqVar, this, draadjrbmkVar);
        if (dsvhmnatusVar == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dsvhmnatusVar.nuxfzjnpeb(), zoijcleaow())) {
            zoijcleaow().postFrameCallback(ppxfxbqfkfVar);
            rgvfuqvkyqVar.stevsuqkhv(new zoijcleaow(ppxfxbqfkfVar));
        } else {
            dsvhmnatusVar.hszhottldk(ppxfxbqfkfVar);
            rgvfuqvkyqVar.stevsuqkhv(new iobyxmoadg(dsvhmnatusVar, ppxfxbqfkfVar));
        }
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb minusKey(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return androidx.compose.runtime.opjhrmiecq.iobyxmoadg.ppxfxbqfkf(this, ppxfxbqfkfVar);
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb plus(lg.btonecajqb btonecajqbVar) {
        return androidx.compose.runtime.opjhrmiecq.iobyxmoadg.wkgbmnqykc(this, btonecajqbVar);
    }

    public final Choreographer zoijcleaow() {
        return this.f7081zdlpuopuiu;
    }
}
