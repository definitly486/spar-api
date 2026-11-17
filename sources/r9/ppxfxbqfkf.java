package r9;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class ppxfxbqfkf extends nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f82207iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final aa.iobyxmoadg f82208ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f82209wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final aa.iobyxmoadg f82210zoijcleaow;

    ppxfxbqfkf(Context context, aa.iobyxmoadg iobyxmoadgVar, aa.iobyxmoadg iobyxmoadgVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f82207iobyxmoadg = context;
        if (iobyxmoadgVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f82210zoijcleaow = iobyxmoadgVar;
        if (iobyxmoadgVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f82208ppxfxbqfkf = iobyxmoadgVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f82209wkgbmnqykc = str;
    }

    @Override // r9.nufgyqmvbu
    public aa.iobyxmoadg eablkybsjg() {
        return this.f82210zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f82207iobyxmoadg.equals(nufgyqmvbuVar.zoijcleaow()) && this.f82210zoijcleaow.equals(nufgyqmvbuVar.eablkybsjg()) && this.f82208ppxfxbqfkf.equals(nufgyqmvbuVar.wkgbmnqykc()) && this.f82209wkgbmnqykc.equals(nufgyqmvbuVar.ppxfxbqfkf());
    }

    public int hashCode() {
        return ((((((this.f82207iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f82210zoijcleaow.hashCode()) * 1000003) ^ this.f82208ppxfxbqfkf.hashCode()) * 1000003) ^ this.f82209wkgbmnqykc.hashCode();
    }

    @Override // r9.nufgyqmvbu
    public String ppxfxbqfkf() {
        return this.f82209wkgbmnqykc;
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f82207iobyxmoadg + ", wallClock=" + this.f82210zoijcleaow + ", monotonicClock=" + this.f82208ppxfxbqfkf + ", backendName=" + this.f82209wkgbmnqykc + "}";
    }

    @Override // r9.nufgyqmvbu
    public aa.iobyxmoadg wkgbmnqykc() {
        return this.f82208ppxfxbqfkf;
    }

    @Override // r9.nufgyqmvbu
    public Context zoijcleaow() {
        return this.f82207iobyxmoadg;
    }
}
