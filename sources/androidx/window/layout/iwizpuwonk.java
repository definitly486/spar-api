package androidx.window.layout;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f13824iobyxmoadg;

    public iwizpuwonk(List displayFeatures) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(displayFeatures, "displayFeatures");
        this.f13824iobyxmoadg = displayFeatures;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iwizpuwonk.class, obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f13824iobyxmoadg, ((iwizpuwonk) obj).f13824iobyxmoadg);
    }

    public int hashCode() {
        return this.f13824iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f13824iobyxmoadg;
    }

    public String toString() {
        return hg.jyumaefscl.iwxlajgraz(this.f13824iobyxmoadg, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
