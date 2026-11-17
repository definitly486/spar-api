package sj;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class tzroggbefp extends tj.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicReference f107051iobyxmoadg = new AtomicReference(null);

    public final Object eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        if (!mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f107051iobyxmoadg, kegysxyocb.f106966iobyxmoadg, rgvfuqvkyqVar)) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            rgvfuqvkyqVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
        }
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo() ? objZdlpuopuiu : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tj.ppxfxbqfkf
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public lg.gxszxtbevo[] zoijcleaow(stevsuqkhv stevsuqkhvVar) {
        uj.ppxfxbqfkf.zoijcleaow(this.f107051iobyxmoadg, null);
        return tj.zoijcleaow.f110717iobyxmoadg;
    }

    public final void lqeggnwhkg() {
        AtomicReference atomicReference = this.f107051iobyxmoadg;
        while (true) {
            Object objIobyxmoadg = uj.ppxfxbqfkf.iobyxmoadg(atomicReference);
            if (objIobyxmoadg == null || objIobyxmoadg == kegysxyocb.f106967zoijcleaow) {
                return;
            }
            if (objIobyxmoadg == kegysxyocb.f106966iobyxmoadg) {
                if (mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f107051iobyxmoadg, objIobyxmoadg, kegysxyocb.f106967zoijcleaow)) {
                    return;
                }
            } else if (mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f107051iobyxmoadg, objIobyxmoadg, kegysxyocb.f106966iobyxmoadg)) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                ((pj.rgvfuqvkyq) objIobyxmoadg).resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
                return;
            }
        }
    }

    public final boolean nufgyqmvbu() {
        Object andSet = this.f107051iobyxmoadg.getAndSet(kegysxyocb.f106966iobyxmoadg);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(andSet);
        return andSet == kegysxyocb.f106967zoijcleaow;
    }

    @Override // tj.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(stevsuqkhv stevsuqkhvVar) {
        if (uj.ppxfxbqfkf.iobyxmoadg(this.f107051iobyxmoadg) != null) {
            return false;
        }
        uj.ppxfxbqfkf.zoijcleaow(this.f107051iobyxmoadg, kegysxyocb.f106966iobyxmoadg);
        return true;
    }
}
