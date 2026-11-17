package b0;

import a.draadjrbmk;
import android.R;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public enum zoijcleaow {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3),
    Autofill(4);


    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f14912zynmafqrjb = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f14913yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f14914zdlpuopuiu;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f14915iobyxmoadg;

        static {
            int[] iArr = new int[zoijcleaow.values().length];
            try {
                iArr[zoijcleaow.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zoijcleaow.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zoijcleaow.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zoijcleaow.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[zoijcleaow.Autofill.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f14915iobyxmoadg = iArr;
        }
    }

    zoijcleaow(int i13) {
        this.f14914zdlpuopuiu = i13;
        this.f14913yggfygwlhe = i13;
    }

    public final int lqeggnwhkg() {
        return this.f14913yggfygwlhe;
    }

    public final int nufgyqmvbu() {
        int i13 = iobyxmoadg.f14915iobyxmoadg[ordinal()];
        if (i13 == 1) {
            return R.string.copy;
        }
        if (i13 == 2) {
            return R.string.paste;
        }
        if (i13 == 3) {
            return R.string.cut;
        }
        if (i13 == 4) {
            return R.string.selectAll;
        }
        if (i13 == 5) {
            return Build.VERSION.SDK_INT <= 26 ? draadjrbmk.autofill : R.string.autofill;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int wkgbmnqykc() {
        return this.f14914zdlpuopuiu;
    }
}
