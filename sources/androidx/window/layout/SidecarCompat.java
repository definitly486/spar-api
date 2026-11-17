package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import gg.wwaezpbzkn;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 +2\u00020\u0001:\u0005,-./0B\u001d\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u001d\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020(0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010*¨\u00061"}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/agtfadlqog;", "Landroidx/window/sidecar/SidecarInterface;", "sidecar", "Landroidx/window/layout/vdvldrhtss;", "sidecarAdapter", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/vdvldrhtss;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "Lgg/wwaezpbzkn;", "registerConfigurationChangeListener", "(Landroid/app/Activity;)V", "unregisterComponentCallback", "Landroidx/window/layout/agtfadlqog$iobyxmoadg;", "extensionCallback", "setExtensionCallback", "(Landroidx/window/layout/agtfadlqog$iobyxmoadg;)V", "Landroidx/window/layout/iwizpuwonk;", "getWindowLayoutInfo", "(Landroid/app/Activity;)Landroidx/window/layout/iwizpuwonk;", "onWindowLayoutChangeListenerAdded", "Landroid/os/IBinder;", "windowToken", "register", "(Landroid/os/IBinder;Landroid/app/Activity;)V", "onWindowLayoutChangeListenerRemoved", "", "validateExtensionInterface", "()Z", "Landroidx/window/sidecar/SidecarInterface;", "getSidecar", "()Landroidx/window/sidecar/SidecarInterface;", "Landroidx/window/layout/vdvldrhtss;", "", "windowListenerRegisteredContexts", "Ljava/util/Map;", "Landroid/content/ComponentCallbacks;", "componentCallbackMap", "Landroidx/window/layout/agtfadlqog$iobyxmoadg;", "Companion", "iobyxmoadg", "zoijcleaow", "DistinctSidecarElementCallback", "ppxfxbqfkf", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SidecarCompat implements agtfadlqog {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "SidecarCompat";
    private final Map<Activity, ComponentCallbacks> componentCallbackMap;
    private agtfadlqog.iobyxmoadg extensionCallback;
    private final SidecarInterface sidecar;
    private final vdvldrhtss sidecarAdapter;
    private final Map<IBinder, Activity> windowListenerRegisteredContexts;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/layout/vdvldrhtss;", "sidecarAdapter", "callbackInterface", "<init>", "(Landroidx/window/layout/vdvldrhtss;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lgg/wwaezpbzkn;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "iobyxmoadg", "Landroidx/window/layout/vdvldrhtss;", "zoijcleaow", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Ljava/util/concurrent/locks/ReentrantLock;", "ppxfxbqfkf", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "wkgbmnqykc", "Landroidx/window/sidecar/SidecarDeviceState;", "lastDeviceState", "Ljava/util/WeakHashMap;", "eablkybsjg", "Ljava/util/WeakHashMap;", "mActivityWindowLayoutInfo", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name and from kotlin metadata */
        private final WeakHashMap mActivityWindowLayoutInfo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata */
        private final vdvldrhtss sidecarAdapter;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
        private final ReentrantLock lock;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name and from kotlin metadata */
        private SidecarDeviceState lastDeviceState;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
        private final SidecarInterface.SidecarCallback callbackInterface;

        public DistinctSidecarElementCallback(vdvldrhtss sidecarAdapter, SidecarInterface.SidecarCallback callbackInterface) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sidecarAdapter, "sidecarAdapter");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callbackInterface, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap();
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.iobyxmoadg(this.lastDeviceState, newDeviceState)) {
                    return;
                }
                this.lastDeviceState = newDeviceState;
                this.callbackInterface.onDeviceStateChanged(newDeviceState);
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder token, SidecarWindowLayoutInfo newLayout) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(token, "token");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newLayout, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.wkgbmnqykc((SidecarWindowLayoutInfo) this.mActivityWindowLayoutInfo.get(token), newLayout)) {
                    return;
                }
                this.callbackInterface.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "<init>", "(Landroidx/window/layout/SidecarCompat;)V", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lgg/wwaezpbzkn;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ SidecarCompat f13801iobyxmoadg;

        public TranslatingCallback(SidecarCompat this$0) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
            this.f13801iobyxmoadg = this$0;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface sidecar;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = this.f13801iobyxmoadg.windowListenerRegisteredContexts.values();
            SidecarCompat sidecarCompat = this.f13801iobyxmoadg;
            for (Activity activity : collectionValues) {
                IBinder iBinderIobyxmoadg = SidecarCompat.INSTANCE.iobyxmoadg(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderIobyxmoadg != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    windowLayoutInfo = sidecar.getWindowLayoutInfo(iBinderIobyxmoadg);
                }
                agtfadlqog.iobyxmoadg iobyxmoadgVar = sidecarCompat.extensionCallback;
                if (iobyxmoadgVar != null) {
                    iobyxmoadgVar.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.eablkybsjg(windowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(windowToken, "windowToken");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newLayout, "newLayout");
            Activity activity = (Activity) this.f13801iobyxmoadg.windowListenerRegisteredContexts.get(windowToken);
            if (activity == null) {
                Log.w(SidecarCompat.TAG, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            vdvldrhtss vdvldrhtssVar = this.f13801iobyxmoadg.sidecarAdapter;
            SidecarInterface sidecar = this.f13801iobyxmoadg.getSidecar();
            SidecarDeviceState deviceState = sidecar == null ? null : sidecar.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            iwizpuwonk iwizpuwonkVarEablkybsjg = vdvldrhtssVar.eablkybsjg(newLayout, deviceState);
            agtfadlqog.iobyxmoadg iobyxmoadgVar = this.f13801iobyxmoadg.extensionCallback;
            if (iobyxmoadgVar == null) {
                return;
            }
            iobyxmoadgVar.onWindowLayoutChanged(activity, iwizpuwonkVarEablkybsjg);
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.SidecarCompat$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final IBinder iobyxmoadg(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final f6.nufgyqmvbu ppxfxbqfkf() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return f6.nufgyqmvbu.f32922esjtqupxsv.zoijcleaow(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public final SidecarInterface zoijcleaow(Context context) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        private Companion() {
        }
    }

    private static final class ppxfxbqfkf implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final WeakReference f13802yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final SidecarCompat f13803zdlpuopuiu;

        public ppxfxbqfkf(SidecarCompat sidecarCompat, Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sidecarCompat, "sidecarCompat");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            this.f13803zdlpuopuiu = sidecarCompat;
            this.f13802yggfygwlhe = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f13802yggfygwlhe.get();
            IBinder iBinderIobyxmoadg = SidecarCompat.INSTANCE.iobyxmoadg(activity);
            if (activity == null || iBinderIobyxmoadg == null) {
                return;
            }
            this.f13803zdlpuopuiu.register(iBinderIobyxmoadg, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        }
    }

    public static final class wkgbmnqykc implements ComponentCallbacks {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Activity f13804yggfygwlhe;

        wkgbmnqykc(Activity activity) {
            this.f13804yggfygwlhe = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newConfig, "newConfig");
            agtfadlqog.iobyxmoadg iobyxmoadgVar = SidecarCompat.this.extensionCallback;
            if (iobyxmoadgVar == null) {
                return;
            }
            Activity activity = this.f13804yggfygwlhe;
            iobyxmoadgVar.onWindowLayoutChanged(activity, SidecarCompat.this.getWindowLayoutInfo(activity));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    private static final class zoijcleaow implements agtfadlqog.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final agtfadlqog.iobyxmoadg f13806iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final WeakHashMap f13807ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ReentrantLock f13808zoijcleaow;

        public zoijcleaow(agtfadlqog.iobyxmoadg callbackInterface) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callbackInterface, "callbackInterface");
            this.f13806iobyxmoadg = callbackInterface;
            this.f13808zoijcleaow = new ReentrantLock();
            this.f13807ppxfxbqfkf = new WeakHashMap();
        }

        @Override // androidx.window.layout.agtfadlqog.iobyxmoadg
        public void onWindowLayoutChanged(Activity activity, iwizpuwonk newLayout) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.f13808zoijcleaow;
            reentrantLock.lock();
            try {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(newLayout, (iwizpuwonk) this.f13807ppxfxbqfkf.get(activity))) {
                    reentrantLock.unlock();
                    return;
                }
                reentrantLock.unlock();
                this.f13806iobyxmoadg.onWindowLayoutChanged(activity, newLayout);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, vdvldrhtss sidecarAdapter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }

    private final void registerConfigurationChangeListener(Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(activity);
            this.componentCallbackMap.put(activity, wkgbmnqykcVar);
            activity.registerComponentCallbacks(wkgbmnqykcVar);
        }
    }

    private final void unregisterComponentCallback(Activity activity) {
        activity.unregisterComponentCallbacks(this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    public final iwizpuwonk getWindowLayoutInfo(Activity activity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        IBinder iBinderIobyxmoadg = INSTANCE.iobyxmoadg(activity);
        if (iBinderIobyxmoadg == null) {
            return new iwizpuwonk(hg.jyumaefscl.wflxmlrfwp());
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinderIobyxmoadg);
        vdvldrhtss vdvldrhtssVar = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return vdvldrhtssVar.eablkybsjg(windowLayoutInfo, deviceState);
    }

    @Override // androidx.window.layout.agtfadlqog
    public void onWindowLayoutChangeListenerAdded(Activity activity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        IBinder iBinderIobyxmoadg = INSTANCE.iobyxmoadg(activity);
        if (iBinderIobyxmoadg != null) {
            register(iBinderIobyxmoadg, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ppxfxbqfkf(this, activity));
        }
    }

    @Override // androidx.window.layout.agtfadlqog
    public void onWindowLayoutChangeListenerRemoved(Activity activity) {
        SidecarInterface sidecarInterface;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        IBinder iBinderIobyxmoadg = INSTANCE.iobyxmoadg(activity);
        if (iBinderIobyxmoadg == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderIobyxmoadg);
        }
        unregisterComponentCallback(activity);
        boolean z13 = this.windowListenerRegisteredContexts.size() == 1;
        this.windowListenerRegisteredContexts.remove(iBinderIobyxmoadg);
        if (!z13 || (sidecarInterface = this.sidecar) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void register(IBinder windowToken, Activity activity) {
        SidecarInterface sidecarInterface;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(windowToken, "windowToken");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        this.windowListenerRegisteredContexts.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        agtfadlqog.iobyxmoadg iobyxmoadgVar = this.extensionCallback;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        registerConfigurationChangeListener(activity);
    }

    @Override // androidx.window.layout.agtfadlqog
    public void setExtensionCallback(agtfadlqog.iobyxmoadg extensionCallback) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extensionCallback, "extensionCallback");
        this.extensionCallback = new zoijcleaow(extensionCallback);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.sidecarAdapter, new TranslatingCallback(this)));
    }

    @SuppressLint({"BanUncheckedReflection"})
    public boolean validateExtensionInterface() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.sidecar;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method == null ? null : method.getReturnType();
            Class cls5 = Void.TYPE;
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(returnType, cls5)) {
                throw new NoSuchMethodException(kotlin.jvm.internal.zdlpuopuiu.oxmwwwfdhm("Illegal return type for 'setSidecarCallback': ", returnType));
            }
            SidecarInterface sidecarInterface2 = this.sidecar;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.sidecar;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.sidecar;
            Method method2 = (sidecarInterface4 == null || (cls2 = sidecarInterface4.getClass()) == null) ? null : cls2.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 == null ? null : method2.getReturnType();
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(kotlin.jvm.internal.zdlpuopuiu.oxmwwwfdhm("Illegal return type for 'getWindowLayoutInfo': ", returnType2));
            }
            SidecarInterface sidecarInterface5 = this.sidecar;
            Method method3 = (sidecarInterface5 == null || (cls3 = sidecarInterface5.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 == null ? null : method3.getReturnType();
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(returnType3, cls5)) {
                throw new NoSuchMethodException(kotlin.jvm.internal.zdlpuopuiu.oxmwwwfdhm("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType3));
            }
            SidecarInterface sidecarInterface6 = this.sidecar;
            Method method4 = (sidecarInterface6 == null || (cls4 = sidecarInterface6.getClass()) == null) ? null : cls4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 == null ? null : method4.getReturnType();
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(returnType4, cls5)) {
                throw new NoSuchMethodException(kotlin.jvm.internal.zdlpuopuiu.oxmwwwfdhm("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", returnType4));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(arrayList, (List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SidecarCompat(Context context) {
        this(INSTANCE.zoijcleaow(context), new vdvldrhtss(null, 1, 0 == true ? 1 : 0));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
    }
}
