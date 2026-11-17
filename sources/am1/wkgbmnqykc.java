package am1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f2259iobyxmoadg;

    public wkgbmnqykc(String title) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f2259iobyxmoadg = title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f2259iobyxmoadg, ((wkgbmnqykc) obj).f2259iobyxmoadg);
    }

    public int hashCode() {
        return this.f2259iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f2259iobyxmoadg;
    }

    public String toString() {
        return "RateOrderSuccessUiModel(title=" + this.f2259iobyxmoadg + ")";
    }
}
