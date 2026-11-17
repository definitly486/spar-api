package a8;

import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object[] f1102iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final c8.eablkybsjg f1103zoijcleaow;

    public wkgbmnqykc(Object... actions) {
        zdlpuopuiu.btonecajqb(actions, "actions");
        this.f1102iobyxmoadg = actions;
        this.f1103zoijcleaow = c8.ppxfxbqfkf.iobyxmoadg();
    }

    @Override // a8.iobyxmoadg
    public void invoke() {
        Object[] objArr = this.f1102iobyxmoadg;
        draadjrbmk draadjrbmkVar = (draadjrbmk) c8.zoijcleaow.zoijcleaow(this.f1103zoijcleaow);
        for (Object obj : objArr) {
            draadjrbmkVar.invoke(obj);
        }
    }

    @Override // a8.iobyxmoadg
    public void iobyxmoadg() {
    }

    @Override // a8.iobyxmoadg
    public void zoijcleaow(draadjrbmk actionConsumer) {
        zdlpuopuiu.btonecajqb(actionConsumer, "actionConsumer");
        c8.zoijcleaow.iobyxmoadg(this.f1103zoijcleaow, actionConsumer);
    }
}
