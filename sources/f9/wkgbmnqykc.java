package f9;

import g9.gtknphoqwx;
import java.security.MessageDigest;
import l8.eablkybsjg;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements eablkybsjg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f33332zoijcleaow;

    public wkgbmnqykc(Object obj) {
        this.f33332zoijcleaow = gtknphoqwx.eablkybsjg(obj);
    }

    @Override // l8.eablkybsjg
    public boolean equals(Object obj) {
        if (obj instanceof wkgbmnqykc) {
            return this.f33332zoijcleaow.equals(((wkgbmnqykc) obj).f33332zoijcleaow);
        }
        return false;
    }

    @Override // l8.eablkybsjg
    public int hashCode() {
        return this.f33332zoijcleaow.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f33332zoijcleaow + '}';
    }

    @Override // l8.eablkybsjg
    public void zoijcleaow(MessageDigest messageDigest) {
        messageDigest.update(this.f33332zoijcleaow.toString().getBytes(eablkybsjg.f61829iobyxmoadg));
    }
}
