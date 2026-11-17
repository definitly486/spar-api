package t10;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f109297iobyxmoadg;

    public wkgbmnqykc(String str) {
        this.f109297iobyxmoadg = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f109297iobyxmoadg, ((wkgbmnqykc) obj).f109297iobyxmoadg);
    }

    public int hashCode() {
        String str = this.f109297iobyxmoadg;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f109297iobyxmoadg;
    }

    public String toString() {
        return "FetchSmsModel(token=" + this.f109297iobyxmoadg + ")";
    }
}
