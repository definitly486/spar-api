package wo0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f120285iobyxmoadg;

    public agtfadlqog(List content) {
        zdlpuopuiu.btonecajqb(content, "content");
        this.f120285iobyxmoadg = content;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agtfadlqog) && zdlpuopuiu.eablkybsjg(this.f120285iobyxmoadg, ((agtfadlqog) obj).f120285iobyxmoadg);
    }

    public int hashCode() {
        return this.f120285iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f120285iobyxmoadg;
    }

    public String toString() {
        return "EmptyCartStateUiModel(content=" + this.f120285iobyxmoadg + ")";
    }
}
