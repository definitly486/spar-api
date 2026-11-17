package z6;

import kotlin.jvm.internal.zdlpuopuiu;
import x6.agtfadlqog;

/* JADX INFO: loaded from: classes2.dex */
public final class wflxmlrfwp extends nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f129212iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final x6.wkgbmnqykc f129213ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f129214zoijcleaow;

    public wflxmlrfwp(agtfadlqog agtfadlqogVar, String str, x6.wkgbmnqykc wkgbmnqykcVar) {
        super(null);
        this.f129212iobyxmoadg = agtfadlqogVar;
        this.f129214zoijcleaow = str;
        this.f129213ppxfxbqfkf = wkgbmnqykcVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wflxmlrfwp) {
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            if (zdlpuopuiu.eablkybsjg(this.f129212iobyxmoadg, wflxmlrfwpVar.f129212iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f129214zoijcleaow, wflxmlrfwpVar.f129214zoijcleaow) && this.f129213ppxfxbqfkf == wflxmlrfwpVar.f129213ppxfxbqfkf) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f129212iobyxmoadg.hashCode() * 31;
        String str = this.f129214zoijcleaow;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f129213ppxfxbqfkf.hashCode();
    }

    public final x6.wkgbmnqykc iobyxmoadg() {
        return this.f129213ppxfxbqfkf;
    }

    public final agtfadlqog ppxfxbqfkf() {
        return this.f129212iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f129214zoijcleaow;
    }
}
