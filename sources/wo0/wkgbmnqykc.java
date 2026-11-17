package wo0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f120335iobyxmoadg;

    public wkgbmnqykc(List comments) {
        zdlpuopuiu.btonecajqb(comments, "comments");
        this.f120335iobyxmoadg = comments;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f120335iobyxmoadg, ((wkgbmnqykc) obj).f120335iobyxmoadg);
    }

    @Override // wo0.gtknphoqwx
    public Object getId() {
        return "CartOrderCommentsUiModel";
    }

    @Override // wo0.gtknphoqwx
    public draadjrbmk getType() {
        return draadjrbmk.COMMENTS;
    }

    public int hashCode() {
        return this.f120335iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f120335iobyxmoadg;
    }

    public String toString() {
        return "CartOrderCommentsUiModel(comments=" + this.f120335iobyxmoadg + ")";
    }
}
