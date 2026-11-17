package wg;

import ah.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
final class zoijcleaow implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Object f119569iobyxmoadg;

    @Override // wg.eablkybsjg, wg.wkgbmnqykc
    public Object iobyxmoadg(Object obj, gtknphoqwx property) {
        zdlpuopuiu.btonecajqb(property, "property");
        Object obj2 = this.f119569iobyxmoadg;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    public String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("NotNullProperty(");
        if (this.f119569iobyxmoadg != null) {
            str = "value=" + this.f119569iobyxmoadg;
        } else {
            str = "value not initialized yet";
        }
        sb3.append(str);
        sb3.append(')');
        return sb3.toString();
    }

    @Override // wg.eablkybsjg
    public void zoijcleaow(Object obj, gtknphoqwx property, Object value) {
        zdlpuopuiu.btonecajqb(property, "property");
        zdlpuopuiu.btonecajqb(value, "value");
        this.f119569iobyxmoadg = value;
    }
}
