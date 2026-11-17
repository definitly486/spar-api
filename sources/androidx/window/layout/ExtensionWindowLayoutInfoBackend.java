package androidx.window.layout;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend;", "Landroidx/window/layout/kcexrzcfyt;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Lu1/iobyxmoadg;", "Landroidx/window/layout/iwizpuwonk;", "callback", "Lgg/wwaezpbzkn;", "registerLayoutChangeCallback", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Lu1/iobyxmoadg;)V", "unregisterLayoutChangeCallback", "(Lu1/iobyxmoadg;)V", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "Ljava/util/concurrent/locks/ReentrantLock;", "extensionWindowBackendLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "Landroidx/window/layout/ExtensionWindowLayoutInfoBackend$iobyxmoadg;", "activityToListeners", "Ljava/util/Map;", "listenerToActivity", "iobyxmoadg", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ExtensionWindowLayoutInfoBackend implements kcexrzcfyt {
    private final Map<Activity, iobyxmoadg> activityToListeners;
    private final WindowLayoutComponent component;
    private final ReentrantLock extensionWindowBackendLock;
    private final Map<u1.iobyxmoadg, Activity> listenerToActivity;

    private static final class iobyxmoadg implements Consumer {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Activity f13776iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private iwizpuwonk f13777ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Set f13778wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ReentrantLock f13779zoijcleaow;

        public iobyxmoadg(Activity activity) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            this.f13776iobyxmoadg = activity;
            this.f13779zoijcleaow = new ReentrantLock();
            this.f13778wkgbmnqykc = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void accept(WindowLayoutInfo value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            ReentrantLock reentrantLock = this.f13779zoijcleaow;
            reentrantLock.lock();
            try {
                this.f13777ppxfxbqfkf = ojitshcjhn.f13826iobyxmoadg.zoijcleaow(this.f13776iobyxmoadg, value);
                Iterator it = this.f13778wkgbmnqykc.iterator();
                while (it.hasNext()) {
                    ((u1.iobyxmoadg) it.next()).accept(this.f13777ppxfxbqfkf);
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean ppxfxbqfkf() {
            return this.f13778wkgbmnqykc.isEmpty();
        }

        public final void wkgbmnqykc(u1.iobyxmoadg listener) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
            ReentrantLock reentrantLock = this.f13779zoijcleaow;
            reentrantLock.lock();
            try {
                this.f13778wkgbmnqykc.remove(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void zoijcleaow(u1.iobyxmoadg listener) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
            ReentrantLock reentrantLock = this.f13779zoijcleaow;
            reentrantLock.lock();
            try {
                iwizpuwonk iwizpuwonkVar = this.f13777ppxfxbqfkf;
                if (iwizpuwonkVar != null) {
                    listener.accept(iwizpuwonkVar);
                }
                this.f13778wkgbmnqykc.add(listener);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public ExtensionWindowLayoutInfoBackend(WindowLayoutComponent component) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(component, "component");
        this.component = component;
        this.extensionWindowBackendLock = new ReentrantLock();
        this.activityToListeners = new LinkedHashMap();
        this.listenerToActivity = new LinkedHashMap();
    }

    @Override // androidx.window.layout.kcexrzcfyt
    public void registerLayoutChangeCallback(Activity activity, Executor executor, u1.iobyxmoadg callback) {
        wwaezpbzkn wwaezpbzknVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(executor, "executor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callback, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            iobyxmoadg iobyxmoadgVar = this.activityToListeners.get(activity);
            if (iobyxmoadgVar == null) {
                wwaezpbzknVar = null;
            } else {
                iobyxmoadgVar.zoijcleaow(callback);
                this.listenerToActivity.put(callback, activity);
                wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            if (wwaezpbzknVar == null) {
                iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(activity);
                this.activityToListeners.put(activity, iobyxmoadgVar2);
                this.listenerToActivity.put(callback, activity);
                iobyxmoadgVar2.zoijcleaow(callback);
                this.component.addWindowLayoutInfoListener(activity, iobyxmoadgVar2);
            }
            wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.kcexrzcfyt
    public void unregisterLayoutChangeCallback(u1.iobyxmoadg callback) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callback, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            Activity activity = this.listenerToActivity.get(callback);
            if (activity == null) {
                return;
            }
            iobyxmoadg iobyxmoadgVar = this.activityToListeners.get(activity);
            if (iobyxmoadgVar == null) {
                return;
            }
            iobyxmoadgVar.wkgbmnqykc(callback);
            if (iobyxmoadgVar.ppxfxbqfkf()) {
                this.component.removeWindowLayoutInfoListener(iobyxmoadgVar);
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            reentrantLock.unlock();
        }
    }
}
