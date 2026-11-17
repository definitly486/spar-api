package cm;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk extends dm.ppxfxbqfkf implements Serializable {
    private static final long serialVersionUID = -8290556941213247973L;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f20074jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f20075yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f20076zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final draadjrbmk f20073iwizpuwonk = new draadjrbmk(0, 0, 0);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final Pattern f20072cqumvgiudr = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    private draadjrbmk(int i13, int i14, int i15) {
        this.f20076zdlpuopuiu = i13;
        this.f20075yggfygwlhe = i14;
        this.f20074jyumaefscl = i15;
    }

    private Object readResolve() {
        return ((this.f20076zdlpuopuiu | this.f20075yggfygwlhe) | this.f20074jyumaefscl) == 0 ? f20073iwizpuwonk : this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f20076zdlpuopuiu == draadjrbmkVar.f20076zdlpuopuiu && this.f20075yggfygwlhe == draadjrbmkVar.f20075yggfygwlhe && this.f20074jyumaefscl == draadjrbmkVar.f20074jyumaefscl;
    }

    public int hashCode() {
        return this.f20076zdlpuopuiu + Integer.rotateLeft(this.f20075yggfygwlhe, 8) + Integer.rotateLeft(this.f20074jyumaefscl, 16);
    }

    public String toString() {
        if (this == f20073iwizpuwonk) {
            return "P0D";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append('P');
        int i13 = this.f20076zdlpuopuiu;
        if (i13 != 0) {
            sb3.append(i13);
            sb3.append('Y');
        }
        int i14 = this.f20075yggfygwlhe;
        if (i14 != 0) {
            sb3.append(i14);
            sb3.append('M');
        }
        int i15 = this.f20074jyumaefscl;
        if (i15 != 0) {
            sb3.append(i15);
            sb3.append('D');
        }
        return sb3.toString();
    }
}
