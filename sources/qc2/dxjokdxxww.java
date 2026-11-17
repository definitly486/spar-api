package qc2;

import android.content.Context;
import java.util.Collections;
import t6.btonecajqb;
import t6.jhduphickx;
import t6.roivzttewh;

/* JADX INFO: loaded from: classes6.dex */
final class dxjokdxxww extends lqeggnwhkg implements zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final wkgbmnqykc f78575eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ag.ppxfxbqfkf f78576gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo f78577wkgbmnqykc;

    dxjokdxxww(Context context, gxszxtbevo gxszxtbevoVar, wkgbmnqykc wkgbmnqykcVar) {
        super(context);
        this.f78576gxszxtbevo = (ag.ppxfxbqfkf) ag.ppxfxbqfkf.zoijcleaow(new fg.iobyxmoadg() { // from class: qc2.nufgyqmvbu
            @Override // fg.iobyxmoadg
            public final Object get() {
                return this.f78581iobyxmoadg.dxjokdxxww();
            }
        });
        this.f78577wkgbmnqykc = gxszxtbevoVar;
        this.f78575eablkybsjg = wkgbmnqykcVar;
    }

    private void btonecajqb() {
        ((roivzttewh) gxszxtbevo().wkgbmnqykc(roivzttewh.class)).zoijcleaow().gxszxtbevo(Collections.singletonMap(iobyxmoadg.class, (jhduphickx) this.f78576gxszxtbevo.get()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public btonecajqb dxjokdxxww() {
        roivzttewh roivzttewhVar = (roivzttewh) gxszxtbevo().wkgbmnqykc(roivzttewh.class);
        return new btonecajqb(roivzttewhVar.zoijcleaow(), roivzttewhVar.ppxfxbqfkf(), this.f78577wkgbmnqykc, this.f78575eablkybsjg);
    }

    @Override // qc2.lqeggnwhkg
    protected void eablkybsjg() {
        btonecajqb();
    }

    @Override // qc2.zoijcleaow
    public iobyxmoadg iobyxmoadg() {
        return (iobyxmoadg) gxszxtbevo().wkgbmnqykc(iobyxmoadg.class);
    }
}
