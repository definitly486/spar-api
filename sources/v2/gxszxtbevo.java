package v2;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f115358iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final float f115359zoijcleaow;

    public gxszxtbevo(int i13, float f13) {
        this.f115358iobyxmoadg = i13;
        this.f115359zoijcleaow = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gxszxtbevo.class != obj.getClass()) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f115358iobyxmoadg == gxszxtbevoVar.f115358iobyxmoadg && Float.compare(gxszxtbevoVar.f115359zoijcleaow, this.f115359zoijcleaow) == 0;
    }

    public int hashCode() {
        return ((527 + this.f115358iobyxmoadg) * 31) + Float.floatToIntBits(this.f115359zoijcleaow);
    }
}
