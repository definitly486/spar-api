package ki0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dxjokdxxww {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f55684iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f55685zoijcleaow;

        static {
            int[] iArr = new int[ei0.zoijcleaow.values().length];
            try {
                iArr[ei0.zoijcleaow.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ei0.zoijcleaow.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55684iobyxmoadg = iArr;
            int[] iArr2 = new int[nufgyqmvbu.values().length];
            try {
                iArr2[nufgyqmvbu.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[nufgyqmvbu.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f55685zoijcleaow = iArr2;
        }
    }

    public static final ei0.zoijcleaow iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        int i13 = iobyxmoadg.f55685zoijcleaow[nufgyqmvbuVar.ordinal()];
        if (i13 == 1) {
            return ei0.zoijcleaow.REQUEST;
        }
        if (i13 == 2) {
            return ei0.zoijcleaow.RESPONSE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final nufgyqmvbu zoijcleaow(ei0.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        int i13 = iobyxmoadg.f55684iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return nufgyqmvbu.REQUEST;
        }
        if (i13 == 2) {
            return nufgyqmvbu.RESPONSE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
