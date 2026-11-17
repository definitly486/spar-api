package f6;

import androidx.window.core.WindowStrictModeException;
import hg.agtfadlqog;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
final class wkgbmnqykc extends gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final eablkybsjg f32935eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gxszxtbevo.zoijcleaow f32936gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final WindowStrictModeException f32937lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f32938ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f32939wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f32940zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f32941iobyxmoadg;

        static {
            int[] iArr = new int[gxszxtbevo.zoijcleaow.values().length];
            iArr[gxszxtbevo.zoijcleaow.STRICT.ordinal()] = 1;
            iArr[gxszxtbevo.zoijcleaow.LOG.ordinal()] = 2;
            iArr[gxszxtbevo.zoijcleaow.QUIET.ordinal()] = 3;
            f32941iobyxmoadg = iArr;
        }
    }

    public wkgbmnqykc(Object value, String tag, String message, eablkybsjg logger, gxszxtbevo.zoijcleaow verificationMode) {
        zdlpuopuiu.btonecajqb(value, "value");
        zdlpuopuiu.btonecajqb(tag, "tag");
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(logger, "logger");
        zdlpuopuiu.btonecajqb(verificationMode, "verificationMode");
        this.f32940zoijcleaow = value;
        this.f32938ppxfxbqfkf = tag;
        this.f32939wkgbmnqykc = message;
        this.f32935eablkybsjg = logger;
        this.f32936gxszxtbevo = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(zoijcleaow(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        zdlpuopuiu.dxjokdxxww(stackTrace, "stackTrace");
        Object[] array = agtfadlqog.xrmfcynszj(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) array);
        this.f32937lqeggnwhkg = windowStrictModeException;
    }

    @Override // f6.gxszxtbevo
    public Object iobyxmoadg() throws WindowStrictModeException {
        int i13 = iobyxmoadg.f32941iobyxmoadg[this.f32936gxszxtbevo.ordinal()];
        if (i13 == 1) {
            throw this.f32937lqeggnwhkg;
        }
        if (i13 == 2) {
            this.f32935eablkybsjg.iobyxmoadg(this.f32938ppxfxbqfkf, zoijcleaow(this.f32940zoijcleaow, this.f32939wkgbmnqykc));
            return null;
        }
        if (i13 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // f6.gxszxtbevo
    public gxszxtbevo ppxfxbqfkf(String message, draadjrbmk condition) {
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(condition, "condition");
        return this;
    }
}
