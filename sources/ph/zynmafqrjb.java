package ph;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zynmafqrjb extends yggfygwlhe implements zh.yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ii.ppxfxbqfkf f76625iobyxmoadg;

    public zynmafqrjb(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        this.f76625iobyxmoadg = fqName;
    }

    @Override // zh.wkgbmnqykc
    public boolean cdpycssgdh() {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof zynmafqrjb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevo(), ((zynmafqrjb) obj).gxszxtbevo());
    }

    @Override // zh.yggfygwlhe
    public ii.ppxfxbqfkf gxszxtbevo() {
        return this.f76625iobyxmoadg;
    }

    public int hashCode() {
        return gxszxtbevo().hashCode();
    }

    @Override // zh.yggfygwlhe
    public Collection jyumaefscl() {
        return hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // zh.wkgbmnqykc
    public zh.iobyxmoadg lqeggnwhkg(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        return null;
    }

    public String toString() {
        return zynmafqrjb.class.getName() + ": " + gxszxtbevo();
    }

    @Override // zh.yggfygwlhe
    public Collection wwaezpbzkn(tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        return hg.jyumaefscl.wflxmlrfwp();
    }

    @Override // zh.wkgbmnqykc
    public List getAnnotations() {
        return hg.jyumaefscl.wflxmlrfwp();
    }
}
