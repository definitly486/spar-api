package r10;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f81466iobyxmoadg;

    public iobyxmoadg(String query) {
        zdlpuopuiu.btonecajqb(query, "query");
        this.f81466iobyxmoadg = query;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f81466iobyxmoadg, ((iobyxmoadg) obj).f81466iobyxmoadg);
    }

    public int hashCode() {
        return this.f81466iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f81466iobyxmoadg;
    }

    public String toString() {
        return "HistoryItemModel(query=" + this.f81466iobyxmoadg + ")";
    }
}
