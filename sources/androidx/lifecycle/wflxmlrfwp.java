package androidx.lifecycle;

import pj.ikoacuggdj;
import pj.skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp extends draadjrbmk implements agtfadlqog {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lg.btonecajqb f9562yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final gtknphoqwx f9563zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f9565yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f9566zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = wflxmlrfwp.this.new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f9565yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f9566zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f9565yggfygwlhe;
            if (wflxmlrfwp.this.iobyxmoadg().zoijcleaow().compareTo(gtknphoqwx.zoijcleaow.INITIALIZED) >= 0) {
                wflxmlrfwp.this.iobyxmoadg().iobyxmoadg(wflxmlrfwp.this);
            } else {
                skhdrjzrfn.eablkybsjg(cllcsxoeizVar.getCoroutineContext(), null, 1, null);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public wflxmlrfwp(gtknphoqwx lifecycle, lg.btonecajqb coroutineContext) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lifecycle, "lifecycle");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineContext, "coroutineContext");
        this.f9563zdlpuopuiu = lifecycle;
        this.f9562yggfygwlhe = coroutineContext;
        if (iobyxmoadg().zoijcleaow() == gtknphoqwx.zoijcleaow.DESTROYED) {
            skhdrjzrfn.eablkybsjg(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // pj.cllcsxoeiz
    public lg.btonecajqb getCoroutineContext() {
        return this.f9562yggfygwlhe;
    }

    public gtknphoqwx iobyxmoadg() {
        return this.f9563zdlpuopuiu;
    }

    @Override // androidx.lifecycle.agtfadlqog
    public void nufgyqmvbu(vdvldrhtss source, gtknphoqwx.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (iobyxmoadg().zoijcleaow().compareTo(gtknphoqwx.zoijcleaow.DESTROYED) <= 0) {
            iobyxmoadg().wkgbmnqykc(this);
            skhdrjzrfn.eablkybsjg(getCoroutineContext(), null, 1, null);
        }
    }

    public final void zoijcleaow() {
        pj.gtknphoqwx.wkgbmnqykc(this, ikoacuggdj.ppxfxbqfkf().xrmfcynszj(), null, new iobyxmoadg(null), 2, null);
    }
}
