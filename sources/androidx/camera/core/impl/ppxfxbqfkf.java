package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf extends btonecajqb.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f3846iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f3847ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Class f3848zoijcleaow;

    ppxfxbqfkf(String str, Class cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f3846iobyxmoadg = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f3848zoijcleaow = cls;
        this.f3847ppxfxbqfkf = obj;
    }

    @Override // androidx.camera.core.impl.btonecajqb.iobyxmoadg
    public Class eablkybsjg() {
        return this.f3848zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btonecajqb.iobyxmoadg)) {
            return false;
        }
        btonecajqb.iobyxmoadg iobyxmoadgVar = (btonecajqb.iobyxmoadg) obj;
        if (this.f3846iobyxmoadg.equals(iobyxmoadgVar.ppxfxbqfkf()) && this.f3848zoijcleaow.equals(iobyxmoadgVar.eablkybsjg())) {
            Object obj2 = this.f3847ppxfxbqfkf;
            if (obj2 == null) {
                if (iobyxmoadgVar.wkgbmnqykc() == null) {
                    return true;
                }
            } else if (obj2.equals(iobyxmoadgVar.wkgbmnqykc())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f3846iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f3848zoijcleaow.hashCode()) * 1000003;
        Object obj = this.f3847ppxfxbqfkf;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    @Override // androidx.camera.core.impl.btonecajqb.iobyxmoadg
    public String ppxfxbqfkf() {
        return this.f3846iobyxmoadg;
    }

    public String toString() {
        return "Option{id=" + this.f3846iobyxmoadg + ", valueClass=" + this.f3848zoijcleaow + ", token=" + this.f3847ppxfxbqfkf + "}";
    }

    @Override // androidx.camera.core.impl.btonecajqb.iobyxmoadg
    public Object wkgbmnqykc() {
        return this.f3847ppxfxbqfkf;
    }
}
