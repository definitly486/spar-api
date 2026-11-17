package kk;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class vw implements dy {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Uri f59063iobyxmoadg;

    public vw() {
        this.f59063iobyxmoadg = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59063iobyxmoadg, ((vw) obj).f59063iobyxmoadg);
    }

    public final int hashCode() {
        Uri uri = this.f59063iobyxmoadg;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "OnProcessAuthSdk(url=" + this.f59063iobyxmoadg + ")";
    }

    public vw(Uri uri) {
        this.f59063iobyxmoadg = uri;
    }
}
