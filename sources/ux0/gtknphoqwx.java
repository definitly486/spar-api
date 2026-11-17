package ux0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gtknphoqwx {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f114612iobyxmoadg;

        static {
            int[] iArr = new int[d01.iobyxmoadg.values().length];
            try {
                iArr[d01.iobyxmoadg.PERSONAL_COMPOSITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d01.iobyxmoadg.ANALOGUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d01.iobyxmoadg.RELATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d01.iobyxmoadg.POPULAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f114612iobyxmoadg = iArr;
        }
    }

    public static final btonecajqb iobyxmoadg(d01.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        int i13 = iobyxmoadg.f114612iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return btonecajqb.PERSONAL_COMPOSITE;
        }
        if (i13 == 2) {
            return btonecajqb.ANALOGUE;
        }
        if (i13 == 3) {
            return btonecajqb.RELATED;
        }
        if (i13 == 4) {
            return btonecajqb.POPULAR;
        }
        throw new NoWhenBranchMatchedException();
    }
}
