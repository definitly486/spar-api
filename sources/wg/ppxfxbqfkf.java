package wg;

import ah.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Object f119568iobyxmoadg;

    public ppxfxbqfkf(Object obj) {
        this.f119568iobyxmoadg = obj;
    }

    @Override // wg.eablkybsjg, wg.wkgbmnqykc
    public Object iobyxmoadg(Object obj, gtknphoqwx property) {
        zdlpuopuiu.btonecajqb(property, "property");
        return this.f119568iobyxmoadg;
    }

    protected void ppxfxbqfkf(gtknphoqwx property, Object obj, Object obj2) {
        zdlpuopuiu.btonecajqb(property, "property");
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f119568iobyxmoadg + ')';
    }

    protected abstract boolean wkgbmnqykc(gtknphoqwx gtknphoqwxVar, Object obj, Object obj2);

    @Override // wg.eablkybsjg
    public void zoijcleaow(Object obj, gtknphoqwx property, Object obj2) {
        zdlpuopuiu.btonecajqb(property, "property");
        Object obj3 = this.f119568iobyxmoadg;
        if (wkgbmnqykc(property, obj3, obj2)) {
            this.f119568iobyxmoadg = obj2;
            ppxfxbqfkf(property, obj3, obj2);
        }
    }
}
