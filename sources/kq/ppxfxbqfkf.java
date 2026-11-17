package kq;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f60381iobyxmoadg;

    public ppxfxbqfkf(List comments) {
        zdlpuopuiu.btonecajqb(comments, "comments");
        this.f60381iobyxmoadg = comments;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f60381iobyxmoadg, ((ppxfxbqfkf) obj).f60381iobyxmoadg);
    }

    @Override // kq.btonecajqb
    public Object getId() {
        return "CartOrderCommentsUiModel";
    }

    @Override // kq.btonecajqb
    public gtknphoqwx getType() {
        return gtknphoqwx.COMMENTS;
    }

    public int hashCode() {
        return this.f60381iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f60381iobyxmoadg;
    }

    public String toString() {
        return "CartOrderCommentsUiModel(comments=" + this.f60381iobyxmoadg + ")";
    }
}
