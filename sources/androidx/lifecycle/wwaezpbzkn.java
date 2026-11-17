package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 \u001b2\u00020\u0001:\u0003\r\n\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/wwaezpbzkn;", "Landroid/app/Fragment;", "<init>", "()V", "Landroidx/lifecycle/wwaezpbzkn$iobyxmoadg;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lgg/wwaezpbzkn;", "zoijcleaow", "(Landroidx/lifecycle/wwaezpbzkn$iobyxmoadg;)V", "wkgbmnqykc", "ppxfxbqfkf", "Landroidx/lifecycle/gtknphoqwx$iobyxmoadg;", "event", "iobyxmoadg", "(Landroidx/lifecycle/gtknphoqwx$iobyxmoadg;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "zdlpuopuiu", "Landroidx/lifecycle/wwaezpbzkn$iobyxmoadg;", "processListener", "yggfygwlhe", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class wwaezpbzkn extends Fragment {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg processListener;

    public interface iobyxmoadg {
        void onCreate();

        void onResume();

        void onStart();
    }

    public static final class ppxfxbqfkf implements Application.ActivityLifecycleCallbacks {
        public static final iobyxmoadg Companion = new iobyxmoadg(null);

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final void iobyxmoadg(Activity activity) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new ppxfxbqfkf());
            }

            private iobyxmoadg() {
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.iobyxmoadg(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            wwaezpbzkn.INSTANCE.iobyxmoadg(activity, gtknphoqwx.iobyxmoadg.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            wwaezpbzkn.INSTANCE.iobyxmoadg(activity, gtknphoqwx.iobyxmoadg.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            wwaezpbzkn.INSTANCE.iobyxmoadg(activity, gtknphoqwx.iobyxmoadg.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            wwaezpbzkn.INSTANCE.iobyxmoadg(activity, gtknphoqwx.iobyxmoadg.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            wwaezpbzkn.INSTANCE.iobyxmoadg(activity, gtknphoqwx.iobyxmoadg.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            wwaezpbzkn.INSTANCE.iobyxmoadg(activity, gtknphoqwx.iobyxmoadg.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.wwaezpbzkn$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void iobyxmoadg(Activity activity, gtknphoqwx.iobyxmoadg event) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
            if (activity instanceof vdvldrhtss) {
                gtknphoqwx lifecycle = ((vdvldrhtss) activity).getLifecycle();
                if (lifecycle instanceof kcexrzcfyt) {
                    ((kcexrzcfyt) lifecycle).dxjokdxxww(event);
                }
            }
        }

        public final void zoijcleaow(Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                ppxfxbqfkf.Companion.iobyxmoadg(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new wwaezpbzkn(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        private Companion() {
        }
    }

    public static final void eablkybsjg(Activity activity) {
        INSTANCE.zoijcleaow(activity);
    }

    private final void iobyxmoadg(gtknphoqwx.iobyxmoadg event) {
        if (Build.VERSION.SDK_INT < 29) {
            Companion companion = INSTANCE;
            Activity activity = getActivity();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(activity, "getActivity(...)");
            companion.iobyxmoadg(activity, event);
        }
    }

    private final void ppxfxbqfkf(iobyxmoadg listener) {
        if (listener != null) {
            listener.onResume();
        }
    }

    private final void wkgbmnqykc(iobyxmoadg listener) {
        if (listener != null) {
            listener.onStart();
        }
    }

    private final void zoijcleaow(iobyxmoadg listener) {
        if (listener != null) {
            listener.onCreate();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        zoijcleaow(this.processListener);
        iobyxmoadg(gtknphoqwx.iobyxmoadg.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        iobyxmoadg(gtknphoqwx.iobyxmoadg.ON_DESTROY);
        this.processListener = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        iobyxmoadg(gtknphoqwx.iobyxmoadg.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        ppxfxbqfkf(this.processListener);
        iobyxmoadg(gtknphoqwx.iobyxmoadg.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        wkgbmnqykc(this.processListener);
        iobyxmoadg(gtknphoqwx.iobyxmoadg.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        iobyxmoadg(gtknphoqwx.iobyxmoadg.ON_STOP);
    }
}
