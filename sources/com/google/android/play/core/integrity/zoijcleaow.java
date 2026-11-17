package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends ua.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f23595iobyxmoadg;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ua.wkgbmnqykc) {
            return this.f23595iobyxmoadg.equals(((ua.wkgbmnqykc) obj).iobyxmoadg());
        }
        return false;
    }

    public final int hashCode() {
        return this.f23595iobyxmoadg.hashCode() ^ 1000003;
    }

    @Override // ua.wkgbmnqykc
    public final String iobyxmoadg() {
        return this.f23595iobyxmoadg;
    }

    public final String toString() {
        return "IntegrityTokenResponse{token=" + this.f23595iobyxmoadg + "}";
    }
}
