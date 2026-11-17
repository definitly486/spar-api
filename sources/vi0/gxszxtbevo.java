package vi0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final x00.iobyxmoadg f117008iobyxmoadg;

    public gxszxtbevo(x00.iobyxmoadg darkModeState) {
        zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
        this.f117008iobyxmoadg = darkModeState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxszxtbevo) && this.f117008iobyxmoadg == ((gxszxtbevo) obj).f117008iobyxmoadg;
    }

    public int hashCode() {
        return this.f117008iobyxmoadg.hashCode();
    }

    public final x00.iobyxmoadg iobyxmoadg() {
        return this.f117008iobyxmoadg;
    }

    public String toString() {
        return "Model(darkModeState=" + this.f117008iobyxmoadg + ")";
    }
}
