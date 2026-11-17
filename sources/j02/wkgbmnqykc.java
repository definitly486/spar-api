package j02;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f50448iobyxmoadg;

    public wkgbmnqykc(String title) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f50448iobyxmoadg = title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f50448iobyxmoadg, ((wkgbmnqykc) obj).f50448iobyxmoadg);
    }

    public int hashCode() {
        return this.f50448iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f50448iobyxmoadg;
    }

    public String toString() {
        return "RateOrderSuccessUiModel(title=" + this.f50448iobyxmoadg + ")";
    }
}
