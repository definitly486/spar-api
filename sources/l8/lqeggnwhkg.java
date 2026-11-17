package l8;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg implements eablkybsjg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.collection.iobyxmoadg f61841zoijcleaow = new g9.zoijcleaow();

    private static void lqeggnwhkg(gxszxtbevo gxszxtbevoVar, Object obj, MessageDigest messageDigest) {
        gxszxtbevoVar.lqeggnwhkg(obj, messageDigest);
    }

    public lqeggnwhkg eablkybsjg(gxszxtbevo gxszxtbevoVar) {
        this.f61841zoijcleaow.remove(gxszxtbevoVar);
        return this;
    }

    @Override // l8.eablkybsjg
    public boolean equals(Object obj) {
        if (obj instanceof lqeggnwhkg) {
            return this.f61841zoijcleaow.equals(((lqeggnwhkg) obj).f61841zoijcleaow);
        }
        return false;
    }

    public lqeggnwhkg gxszxtbevo(gxszxtbevo gxszxtbevoVar, Object obj) {
        this.f61841zoijcleaow.put(gxszxtbevoVar, obj);
        return this;
    }

    @Override // l8.eablkybsjg
    public int hashCode() {
        return this.f61841zoijcleaow.hashCode();
    }

    public Object ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
        return this.f61841zoijcleaow.containsKey(gxszxtbevoVar) ? this.f61841zoijcleaow.get(gxszxtbevoVar) : gxszxtbevoVar.ppxfxbqfkf();
    }

    public String toString() {
        return "Options{values=" + this.f61841zoijcleaow + '}';
    }

    public void wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
        this.f61841zoijcleaow.lqeggnwhkg(lqeggnwhkgVar.f61841zoijcleaow);
    }

    @Override // l8.eablkybsjg
    public void zoijcleaow(MessageDigest messageDigest) {
        for (int i13 = 0; i13 < this.f61841zoijcleaow.size(); i13++) {
            lqeggnwhkg((gxszxtbevo) this.f61841zoijcleaow.gxszxtbevo(i13), this.f61841zoijcleaow.gtknphoqwx(i13), messageDigest);
        }
    }
}
