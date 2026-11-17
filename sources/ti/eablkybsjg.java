package ti;

import kotlin.jvm.internal.zdlpuopuiu;
import zi.ikoacuggdj;

/* JADX INFO: loaded from: classes3.dex */
public class eablkybsjg implements lqeggnwhkg, nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jh.eablkybsjg f110548iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jh.eablkybsjg f110549ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f110550zoijcleaow;

    public eablkybsjg(jh.eablkybsjg classDescriptor, eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(classDescriptor, "classDescriptor");
        this.f110548iobyxmoadg = classDescriptor;
        this.f110550zoijcleaow = eablkybsjgVar == null ? this : eablkybsjgVar;
        this.f110549ppxfxbqfkf = classDescriptor;
    }

    public boolean equals(Object obj) {
        jh.eablkybsjg eablkybsjgVar = this.f110548iobyxmoadg;
        eablkybsjg eablkybsjgVar2 = obj instanceof eablkybsjg ? (eablkybsjg) obj : null;
        return zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjgVar2 != null ? eablkybsjgVar2.f110548iobyxmoadg : null);
    }

    public int hashCode() {
        return this.f110548iobyxmoadg.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }

    @Override // ti.nufgyqmvbu
    public final jh.eablkybsjg zdlpuopuiu() {
        return this.f110548iobyxmoadg;
    }

    @Override // ti.lqeggnwhkg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ikoacuggdj getType() {
        ikoacuggdj ikoacuggdjVarOjitshcjhn = this.f110548iobyxmoadg.ojitshcjhn();
        zdlpuopuiu.dxjokdxxww(ikoacuggdjVarOjitshcjhn, "getDefaultType(...)");
        return ikoacuggdjVarOjitshcjhn;
    }
}
