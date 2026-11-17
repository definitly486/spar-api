package t6;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f109798iobyxmoadg = iwizpuwonk.iobyxmoadg(new byte[]{-25, 87, -112, 16, -26, 36, -27, 17, 18, -105, -47, 112, -86, -104, -118, -94});

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static l1 f109799ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static hkdspvbjdz f109800zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f109801iobyxmoadg;

        static {
            int[] iArr = new int[ribwqtqdhb.values().length];
            f109801iobyxmoadg = iArr;
            try {
                iArr[ribwqtqdhb.GLOBAL_RAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f109801iobyxmoadg[ribwqtqdhb.GLOBAL_SHARED_PREFERENCES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static zdlpuopuiu iobyxmoadg(ribwqtqdhb ribwqtqdhbVar, Context context) {
        int i13 = iobyxmoadg.f109801iobyxmoadg[ribwqtqdhbVar.ordinal()];
        if (i13 == 1) {
            if (f109800zoijcleaow == null) {
                f109800zoijcleaow = new hkdspvbjdz();
            }
            return f109800zoijcleaow;
        }
        if (i13 == 2) {
            if (f109799ppxfxbqfkf == null) {
                f109799ppxfxbqfkf = new l1(context, f109798iobyxmoadg);
            }
            return f109799ppxfxbqfkf;
        }
        throw new IllegalArgumentException(iwizpuwonk.iobyxmoadg(new byte[]{47, 95, 47, -97, 29, 80, -53, -29, 96, -41, 118, 43, 32, -116, 62, 88, 83, 82, -2, -90, 18, -24, 50, -31, 82, 43, 92, -109, -96, -43, -27, 7}) + ribwqtqdhbVar + iwizpuwonk.iobyxmoadg(new byte[]{-62, 116, -30, -8, -9, -79, 9, 86, 70, -89, -64, 65, -66, 53, -106, 40}));
    }
}
