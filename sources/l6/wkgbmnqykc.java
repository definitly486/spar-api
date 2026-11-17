package l6;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f61686iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f61687ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f61688wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f61689zoijcleaow;

    public wkgbmnqykc(boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f61686iobyxmoadg = z13;
        this.f61689zoijcleaow = z14;
        this.f61687ppxfxbqfkf = z15;
        this.f61688wkgbmnqykc = z16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f61686iobyxmoadg == wkgbmnqykcVar.f61686iobyxmoadg && this.f61689zoijcleaow == wkgbmnqykcVar.f61689zoijcleaow && this.f61687ppxfxbqfkf == wkgbmnqykcVar.f61687ppxfxbqfkf && this.f61688wkgbmnqykc == wkgbmnqykcVar.f61688wkgbmnqykc;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f61686iobyxmoadg) * 31) + Boolean.hashCode(this.f61689zoijcleaow)) * 31) + Boolean.hashCode(this.f61687ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f61688wkgbmnqykc);
    }

    public final boolean iobyxmoadg() {
        return this.f61686iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f61688wkgbmnqykc;
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f61686iobyxmoadg + ", isValidated=" + this.f61689zoijcleaow + ", isMetered=" + this.f61687ppxfxbqfkf + ", isNotRoaming=" + this.f61688wkgbmnqykc + ')';
    }

    public final boolean wkgbmnqykc() {
        return this.f61689zoijcleaow;
    }

    public final boolean zoijcleaow() {
        return this.f61687ppxfxbqfkf;
    }
}
