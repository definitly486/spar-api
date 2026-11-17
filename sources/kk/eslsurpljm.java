package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class eslsurpljm extends jd {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f56462ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final vu f56463zoijcleaow;

    public eslsurpljm(vu description, String phone) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(description, "description");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phone, "phone");
        this.f56463zoijcleaow = description;
        this.f56462ppxfxbqfkf = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eslsurpljm)) {
            return false;
        }
        eslsurpljm eslsurpljmVar = (eslsurpljm) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56463zoijcleaow, eslsurpljmVar.f56463zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56462ppxfxbqfkf, eslsurpljmVar.f56462ppxfxbqfkf);
    }

    public final int hashCode() {
        return this.f56462ppxfxbqfkf.hashCode() + (this.f56463zoijcleaow.hashCode() * 31);
    }

    public final String toString() {
        return "ConfirmCodeLifetimeExpired(description=" + this.f56463zoijcleaow + ", phone=" + this.f56462ppxfxbqfkf + ")";
    }
}
