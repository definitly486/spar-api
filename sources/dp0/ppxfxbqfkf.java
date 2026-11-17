package dp0;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f29292iobyxmoadg;

        static {
            int[] iArr = new int[mz0.ppxfxbqfkf.values().length];
            try {
                iArr[mz0.ppxfxbqfkf.POPULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mz0.ppxfxbqfkf.PRICE_ASC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mz0.ppxfxbqfkf.PRICE_DESC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mz0.ppxfxbqfkf.RATING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mz0.ppxfxbqfkf.VIVINO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f29292iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zoijcleaow(mz0.ppxfxbqfkf ppxfxbqfkfVar) {
        int i13 = iobyxmoadg.f29292iobyxmoadg[ppxfxbqfkfVar.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        int i14 = 2;
        if (i13 == 2) {
            return 1;
        }
        if (i13 != 3) {
            i14 = 4;
            if (i13 == 4) {
                return 3;
            }
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i14;
    }
}
