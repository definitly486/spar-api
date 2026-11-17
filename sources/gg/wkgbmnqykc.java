package gg;

import kotlin.jvm.internal.mbcevpiqjq;

/* JADX INFO: loaded from: classes3.dex */
final class wkgbmnqykc extends ppxfxbqfkf implements lg.gxszxtbevo {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Object f37136iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private lg.gxszxtbevo f37137jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f37138yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private tg.vdvldrhtss f37139zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.vdvldrhtss block, Object obj) {
        super(null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        this.f37139zdlpuopuiu = block;
        this.f37138yggfygwlhe = obj;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f37137jyumaefscl = this;
        this.f37136iwizpuwonk = zoijcleaow.f37149iobyxmoadg;
    }

    @Override // lg.gxszxtbevo
    public lg.btonecajqb getContext() {
        return lg.gtknphoqwx.f62507zdlpuopuiu;
    }

    @Override // gg.ppxfxbqfkf
    public Object iobyxmoadg(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(gxszxtbevoVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f37137jyumaefscl = gxszxtbevoVar;
        this.f37138yggfygwlhe = obj;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        if (objGxszxtbevo == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objGxszxtbevo;
    }

    @Override // lg.gxszxtbevo
    public void resumeWith(Object obj) {
        this.f37137jyumaefscl = null;
        this.f37136iwizpuwonk = obj;
    }

    public final Object zoijcleaow() {
        while (true) {
            Object obj = this.f37136iwizpuwonk;
            lg.gxszxtbevo gxszxtbevoVar = this.f37137jyumaefscl;
            if (gxszxtbevoVar == null) {
                zdlpuopuiu.zoijcleaow(obj);
                return obj;
            }
            if (kcexrzcfyt.nufgyqmvbu(zoijcleaow.f37149iobyxmoadg, obj)) {
                try {
                    tg.vdvldrhtss vdvldrhtssVar = this.f37139zdlpuopuiu;
                    Object obj2 = this.f37138yggfygwlhe;
                    Object objEablkybsjg = !(vdvldrhtssVar instanceof kotlin.coroutines.jvm.internal.iobyxmoadg) ? mg.zoijcleaow.eablkybsjg(vdvldrhtssVar, this, obj2, gxszxtbevoVar) : ((tg.vdvldrhtss) mbcevpiqjq.eablkybsjg(vdvldrhtssVar, 3)).invoke(this, obj2, gxszxtbevoVar);
                    if (objEablkybsjg != mg.zoijcleaow.gxszxtbevo()) {
                        gxszxtbevoVar.resumeWith(kcexrzcfyt.wkgbmnqykc(objEablkybsjg));
                    }
                } catch (Throwable th2) {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    gxszxtbevoVar.resumeWith(kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2)));
                }
            } else {
                this.f37136iwizpuwonk = zoijcleaow.f37149iobyxmoadg;
                gxszxtbevoVar.resumeWith(obj);
            }
        }
    }
}
