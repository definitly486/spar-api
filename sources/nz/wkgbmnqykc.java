package nz;

import dk.eablkybsjg;
import dk.gxszxtbevo;
import dk.wflxmlrfwp;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
final class wkgbmnqykc implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f71457iobyxmoadg = wflxmlrfwp.ppxfxbqfkf("ColorThemeTypeDto", eablkybsjg.dxjokdxxww.f29077iobyxmoadg);

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf zoijcleaow(ek.eablkybsjg decoder) {
        Object next;
        zdlpuopuiu.btonecajqb(decoder, "decoder");
        String strPmvmpeiblj = decoder.pmvmpeiblj();
        Iterator<E> it = ppxfxbqfkf.dxjokdxxww().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zdlpuopuiu.eablkybsjg(((ppxfxbqfkf) next).getJson(), strPmvmpeiblj));
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) next;
        return ppxfxbqfkfVar == null ? ppxfxbqfkf.BASE : ppxfxbqfkfVar;
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public gxszxtbevo iobyxmoadg() {
        return this.f71457iobyxmoadg;
    }

    @Override // bk.agtfadlqog
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ek.gxszxtbevo encoder, ppxfxbqfkf value) {
        zdlpuopuiu.btonecajqb(encoder, "encoder");
        zdlpuopuiu.btonecajqb(value, "value");
        encoder.lmojexxdyd(value.getJson());
    }
}
