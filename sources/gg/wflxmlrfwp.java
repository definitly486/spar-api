package gg;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wflxmlrfwp {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f37135iobyxmoadg;

        static {
            int[] iArr = new int[ojitshcjhn.values().length];
            try {
                iArr[ojitshcjhn.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ojitshcjhn.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ojitshcjhn.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37135iobyxmoadg = iArr;
        }
    }

    public static gtknphoqwx iobyxmoadg(ojitshcjhn mode, tg.iobyxmoadg initializer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(initializer, "initializer");
        int i13 = iobyxmoadg.f37135iobyxmoadg[mode.ordinal()];
        int i14 = 2;
        if (i13 == 1) {
            kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
            return new jyumaefscl(initializer, gtknphoqwxVar, i14, gtknphoqwxVar);
        }
        if (i13 == 2) {
            return new yggfygwlhe(initializer);
        }
        if (i13 == 3) {
            return new ylkuphrtab(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static gtknphoqwx zoijcleaow(tg.iobyxmoadg initializer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(initializer, "initializer");
        kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
        return new jyumaefscl(initializer, gtknphoqwxVar, 2, gtknphoqwxVar);
    }
}
