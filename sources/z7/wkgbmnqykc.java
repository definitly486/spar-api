package z7;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
final class wkgbmnqykc extends zoijcleaow implements ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private volatile Object f129240ppxfxbqfkf;

    public wkgbmnqykc(Object obj) {
        this.f129240ppxfxbqfkf = obj;
    }

    @Override // z7.zoijcleaow
    protected void eablkybsjg(y7.ppxfxbqfkf observer) {
        zdlpuopuiu.btonecajqb(observer, "observer");
        super.eablkybsjg(observer);
        observer.iobyxmoadg(getValue());
    }

    @Override // z7.ppxfxbqfkf
    public Object getValue() {
        return this.f129240ppxfxbqfkf;
    }

    @Override // z7.zoijcleaow
    protected void gxszxtbevo(Object obj) {
        super.gxszxtbevo(obj);
        this.f129240ppxfxbqfkf = obj;
    }
}
