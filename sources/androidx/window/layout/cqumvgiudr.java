package androidx.window.layout;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final f6.zoijcleaow f13819iobyxmoadg;

    public cqumvgiudr(f6.zoijcleaow _bounds) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(_bounds, "_bounds");
        this.f13819iobyxmoadg = _bounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cqumvgiudr.class, obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f13819iobyxmoadg, ((cqumvgiudr) obj).f13819iobyxmoadg);
    }

    public int hashCode() {
        return this.f13819iobyxmoadg.hashCode();
    }

    public final Rect iobyxmoadg() {
        return this.f13819iobyxmoadg.gxszxtbevo();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + iobyxmoadg() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cqumvgiudr(Rect bounds) {
        this(new f6.zoijcleaow(bounds));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bounds, "bounds");
    }
}
