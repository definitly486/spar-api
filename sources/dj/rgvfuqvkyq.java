package dj;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import zi.mhtqkkgtqm;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rgvfuqvkyq {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f29019iobyxmoadg;

        static {
            int[] iArr = new int[mhtqkkgtqm.values().length];
            try {
                iArr[mhtqkkgtqm.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mhtqkkgtqm.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mhtqkkgtqm.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29019iobyxmoadg = iArr;
        }
    }

    public static final kcexrzcfyt iobyxmoadg(mhtqkkgtqm mhtqkkgtqmVar) {
        zdlpuopuiu.btonecajqb(mhtqkkgtqmVar, "<this>");
        int i13 = iobyxmoadg.f29019iobyxmoadg[mhtqkkgtqmVar.ordinal()];
        if (i13 == 1) {
            return kcexrzcfyt.INV;
        }
        if (i13 == 2) {
            return kcexrzcfyt.IN;
        }
        if (i13 == 3) {
            return kcexrzcfyt.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
