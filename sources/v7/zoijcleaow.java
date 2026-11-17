package v7;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    private static float iobyxmoadg(float f13) {
        return f13 <= 0.04045f ? f13 / 12.92f : (float) Math.pow((f13 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int ppxfxbqfkf(float f13, int i13, int i14) {
        if (i13 == i14 || f13 <= 0.0f) {
            return i13;
        }
        if (f13 >= 1.0f) {
            return i14;
        }
        float f14 = ((i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f15 = ((i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f16 = ((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f17 = (i13 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f18 = ((i14 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f19 = ((i14 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f23 = ((i14 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f24 = (i14 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float fIobyxmoadg = iobyxmoadg(f15);
        float fIobyxmoadg2 = iobyxmoadg(f16);
        float fIobyxmoadg3 = iobyxmoadg(f17);
        float fIobyxmoadg4 = iobyxmoadg(f19);
        float f25 = f14 + ((f18 - f14) * f13);
        float fIobyxmoadg5 = fIobyxmoadg2 + ((iobyxmoadg(f23) - fIobyxmoadg2) * f13);
        float fIobyxmoadg6 = fIobyxmoadg3 + (f13 * (iobyxmoadg(f24) - fIobyxmoadg3));
        return (Math.round(zoijcleaow(fIobyxmoadg + ((fIobyxmoadg4 - fIobyxmoadg) * f13)) * 255.0f) << 16) | (Math.round(f25 * 255.0f) << 24) | (Math.round(zoijcleaow(fIobyxmoadg5) * 255.0f) << 8) | Math.round(zoijcleaow(fIobyxmoadg6) * 255.0f);
    }

    private static float zoijcleaow(float f13) {
        return f13 <= 0.0031308f ? f13 * 12.92f : (float) ((Math.pow(f13, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
