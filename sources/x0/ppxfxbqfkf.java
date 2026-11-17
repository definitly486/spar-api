package x0;

import java.util.Arrays;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf implements x0.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f120881ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f120882wkgbmnqykc = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float[] f120883iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float[] f120884zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float zoijcleaow(float f13, float[] fArr, float[] fArr2) {
            float f14;
            float f15;
            float f16;
            float fIobyxmoadg;
            float fAbs = Math.abs(f13);
            float fSignum = Math.signum(f13);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fIobyxmoadg = fArr2[iBinarySearch];
            } else {
                int i13 = -(iBinarySearch + 1);
                int i14 = i13 - 1;
                float f17 = 0.0f;
                if (i14 >= fArr.length - 1) {
                    float f18 = fArr[fArr.length - 1];
                    float f19 = fArr2[fArr.length - 1];
                    if (f18 == 0.0f) {
                        return 0.0f;
                    }
                    return f13 * (f19 / f18);
                }
                if (i14 == -1) {
                    float f23 = fArr[0];
                    f16 = fArr2[0];
                    f15 = f23;
                    f14 = 0.0f;
                } else {
                    float f24 = fArr[i14];
                    float f25 = fArr[i13];
                    f14 = fArr2[i14];
                    f17 = f24;
                    f15 = f25;
                    f16 = fArr2[i13];
                }
                fIobyxmoadg = wkgbmnqykc.f120885iobyxmoadg.iobyxmoadg(f14, f16, f17, f15, fAbs);
            }
            return fSignum * fIobyxmoadg;
        }

        private iobyxmoadg() {
        }
    }

    public ppxfxbqfkf(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f120883iobyxmoadg = fArr;
        this.f120884zoijcleaow = fArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return Arrays.equals(this.f120883iobyxmoadg, ppxfxbqfkfVar.f120883iobyxmoadg) && Arrays.equals(this.f120884zoijcleaow, ppxfxbqfkfVar.f120884zoijcleaow);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f120883iobyxmoadg) * 31) + Arrays.hashCode(this.f120884zoijcleaow);
    }

    @Override // x0.iobyxmoadg
    public float iobyxmoadg(float f13) {
        return f120881ppxfxbqfkf.zoijcleaow(f13, this.f120884zoijcleaow, this.f120883iobyxmoadg);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f120883iobyxmoadg);
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        sb3.append(string);
        sb3.append(", toDpValues=");
        String string2 = Arrays.toString(this.f120884zoijcleaow);
        zdlpuopuiu.dxjokdxxww(string2, "toString(...)");
        sb3.append(string2);
        sb3.append('}');
        return sb3.toString();
    }

    @Override // x0.iobyxmoadg
    public float zoijcleaow(float f13) {
        return f120881ppxfxbqfkf.zoijcleaow(f13, this.f120883iobyxmoadg, this.f120884zoijcleaow);
    }
}
