package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.cllcsxoeiz;

/* JADX INFO: loaded from: classes2.dex */
public interface zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f13844iobyxmoadg = iobyxmoadg.f13845iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f13845iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final String f13846ppxfxbqfkf = cllcsxoeiz.zoijcleaow(zdlpuopuiu.class).jyumaefscl();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static yggfygwlhe f13847wkgbmnqykc = wflxmlrfwp.f13843iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final boolean f13848zoijcleaow = false;

        private iobyxmoadg() {
        }

        public final zdlpuopuiu iobyxmoadg(Context context) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            return f13847wkgbmnqykc.iobyxmoadg(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, zoijcleaow(context)));
        }

        public final kcexrzcfyt zoijcleaow(Context context) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = null;
            try {
                WindowLayoutComponent windowLayoutComponentWflxmlrfwp = rgvfuqvkyq.f13829iobyxmoadg.wflxmlrfwp();
                if (windowLayoutComponentWflxmlrfwp != null) {
                    extensionWindowLayoutInfoBackend = new ExtensionWindowLayoutInfoBackend(windowLayoutComponentWflxmlrfwp);
                }
            } catch (Throwable unused) {
                if (f13848zoijcleaow) {
                    Log.d(f13846ppxfxbqfkf, "Failed to load WindowExtensions");
                }
            }
            return extensionWindowLayoutInfoBackend == null ? SidecarWindowBackend.INSTANCE.iobyxmoadg(context) : extensionWindowLayoutInfoBackend;
        }
    }

    static zdlpuopuiu iobyxmoadg(Context context) {
        return f13844iobyxmoadg.iobyxmoadg(context);
    }

    sj.lqeggnwhkg windowLayoutInfo(Activity activity);
}
