package lereixgezr;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg extends tbqsvytpvh.lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f62321iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Surface f62322zoijcleaow;

    lqeggnwhkg(int i13, Surface surface) {
        this.f62321iobyxmoadg = i13;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f62322zoijcleaow = surface;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tbqsvytpvh.lqeggnwhkg)) {
            return false;
        }
        tbqsvytpvh.lqeggnwhkg lqeggnwhkgVar = (tbqsvytpvh.lqeggnwhkg) obj;
        return this.f62321iobyxmoadg == lqeggnwhkgVar.iobyxmoadg() && this.f62322zoijcleaow.equals(lqeggnwhkgVar.zoijcleaow());
    }

    public int hashCode() {
        return ((this.f62321iobyxmoadg ^ 1000003) * 1000003) ^ this.f62322zoijcleaow.hashCode();
    }

    @Override // lereixgezr.tbqsvytpvh.lqeggnwhkg
    public int iobyxmoadg() {
        return this.f62321iobyxmoadg;
    }

    public String toString() {
        return "Result{resultCode=" + this.f62321iobyxmoadg + ", surface=" + this.f62322zoijcleaow + "}";
    }

    @Override // lereixgezr.tbqsvytpvh.lqeggnwhkg
    public Surface zoijcleaow() {
        return this.f62322zoijcleaow;
    }
}
