package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class x extends View implements z.bfopjjpdmp {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static boolean f7131esjtqupxsv;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final d f7135zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final ppxfxbqfkf f7134yggfygwlhe = new ppxfxbqfkf(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final int f7133jyumaefscl = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final tg.rgvfuqvkyq f7132iwizpuwonk = zoijcleaow.f7136zdlpuopuiu;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final ViewOutlineProvider f7130cqumvgiudr = new iobyxmoadg();

    public static final class iobyxmoadg extends ViewOutlineProvider {
        iobyxmoadg() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineIobyxmoadg = ((x) view).f7135zdlpuopuiu.iobyxmoadg();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(outlineIobyxmoadg);
            outline.set(outlineIobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf {
        public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final boolean iobyxmoadg() {
            return x.f7131esjtqupxsv;
        }

        private ppxfxbqfkf() {
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f7136zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(2);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((View) obj, (Matrix) obj2);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }
    }
}
