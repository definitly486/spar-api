package oh;

import bi.cqumvgiudr;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo implements cqumvgiudr {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f72850ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Class f72851iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ci.iobyxmoadg f72852zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final gxszxtbevo iobyxmoadg(Class klass) {
            zdlpuopuiu.btonecajqb(klass, "klass");
            ci.zoijcleaow zoijcleaowVar = new ci.zoijcleaow();
            ppxfxbqfkf.f72858iobyxmoadg.zoijcleaow(klass, zoijcleaowVar);
            ci.iobyxmoadg iobyxmoadgVarAgtfadlqog = zoijcleaowVar.agtfadlqog();
            kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
            if (iobyxmoadgVarAgtfadlqog == null) {
                return null;
            }
            return new gxszxtbevo(klass, iobyxmoadgVarAgtfadlqog, gtknphoqwxVar);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ gxszxtbevo(Class cls, ci.iobyxmoadg iobyxmoadgVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(cls, iobyxmoadgVar);
    }

    @Override // bi.cqumvgiudr
    public void eablkybsjg(cqumvgiudr.ppxfxbqfkf visitor, byte[] bArr) {
        zdlpuopuiu.btonecajqb(visitor, "visitor");
        ppxfxbqfkf.f72858iobyxmoadg.zoijcleaow(this.f72851iobyxmoadg, visitor);
    }

    public boolean equals(Object obj) {
        return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f72851iobyxmoadg, ((gxszxtbevo) obj).f72851iobyxmoadg);
    }

    @Override // bi.cqumvgiudr
    public ci.iobyxmoadg gxszxtbevo() {
        return this.f72852zoijcleaow;
    }

    public int hashCode() {
        return this.f72851iobyxmoadg.hashCode();
    }

    @Override // bi.cqumvgiudr
    public String iobyxmoadg() {
        StringBuilder sb3 = new StringBuilder();
        String name = this.f72851iobyxmoadg.getName();
        zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        sb3.append(kcexrzcfyt.pkzmftpjix(name, '.', '/', false, 4, null));
        sb3.append(".class");
        return sb3.toString();
    }

    @Override // bi.cqumvgiudr
    public ii.zoijcleaow ppxfxbqfkf() {
        return ph.gxszxtbevo.eablkybsjg(this.f72851iobyxmoadg);
    }

    public String toString() {
        return gxszxtbevo.class.getName() + ": " + this.f72851iobyxmoadg;
    }

    @Override // bi.cqumvgiudr
    public void wkgbmnqykc(cqumvgiudr.wkgbmnqykc visitor, byte[] bArr) {
        zdlpuopuiu.btonecajqb(visitor, "visitor");
        ppxfxbqfkf.f72858iobyxmoadg.dxjokdxxww(this.f72851iobyxmoadg, visitor);
    }

    public final Class zoijcleaow() {
        return this.f72851iobyxmoadg;
    }

    private gxszxtbevo(Class cls, ci.iobyxmoadg iobyxmoadgVar) {
        this.f72851iobyxmoadg = cls;
        this.f72852zoijcleaow = iobyxmoadgVar;
    }
}
