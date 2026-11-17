package t10;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f109298iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f109299zoijcleaow;

    public zoijcleaow(boolean z13, boolean z14) {
        this.f109298iobyxmoadg = z13;
        this.f109299zoijcleaow = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f109298iobyxmoadg == zoijcleaowVar.f109298iobyxmoadg && this.f109299zoijcleaow == zoijcleaowVar.f109299zoijcleaow;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f109298iobyxmoadg) * 31) + Boolean.hashCode(this.f109299zoijcleaow);
    }

    public final boolean iobyxmoadg() {
        return this.f109299zoijcleaow;
    }

    public String toString() {
        return "CheckRegistrationModel(isOnSite=" + this.f109298iobyxmoadg + ", haveCard=" + this.f109299zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f109298iobyxmoadg;
    }
}
