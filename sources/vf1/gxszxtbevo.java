package vf1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oz0.iobyxmoadg f116727iobyxmoadg;

    public gxszxtbevo(oz0.iobyxmoadg darkModeState) {
        zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
        this.f116727iobyxmoadg = darkModeState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxszxtbevo) && this.f116727iobyxmoadg == ((gxszxtbevo) obj).f116727iobyxmoadg;
    }

    public int hashCode() {
        return this.f116727iobyxmoadg.hashCode();
    }

    public final oz0.iobyxmoadg iobyxmoadg() {
        return this.f116727iobyxmoadg;
    }

    public String toString() {
        return "Model(darkModeState=" + this.f116727iobyxmoadg + ")";
    }
}
