package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 #2\u00020\u0001:\u0003$%&B\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0005R&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend;", "Landroidx/window/layout/kcexrzcfyt;", "Landroidx/window/layout/agtfadlqog;", "windowExtension", "<init>", "(Landroidx/window/layout/agtfadlqog;)V", "Landroid/app/Activity;", "activity", "", "isActivityRegistered", "(Landroid/app/Activity;)Z", "Lgg/wwaezpbzkn;", "callbackRemovedForActivity", "(Landroid/app/Activity;)V", "Ljava/util/concurrent/Executor;", "executor", "Lu1/iobyxmoadg;", "Landroidx/window/layout/iwizpuwonk;", "callback", "registerLayoutChangeCallback", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Lu1/iobyxmoadg;)V", "unregisterLayoutChangeCallback", "(Lu1/iobyxmoadg;)V", "Landroidx/window/layout/agtfadlqog;", "getWindowExtension", "()Landroidx/window/layout/agtfadlqog;", "setWindowExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/SidecarWindowBackend$zoijcleaow;", "windowLayoutChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "Companion", "iobyxmoadg", "ExtensionListenerImpl", "zoijcleaow", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SidecarWindowBackend implements kcexrzcfyt {
    public static final boolean DEBUG = false;
    private static final String TAG = "WindowServer";
    private static volatile SidecarWindowBackend globalInstance;
    private agtfadlqog windowExtension;
    private final CopyOnWriteArrayList<zoijcleaow> windowLayoutChangeCallbacks = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$ExtensionListenerImpl;", "Landroidx/window/layout/agtfadlqog$iobyxmoadg;", "<init>", "(Landroidx/window/layout/SidecarWindowBackend;)V", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/iwizpuwonk;", "newLayout", "Lgg/wwaezpbzkn;", "onWindowLayoutChanged", "(Landroid/app/Activity;Landroidx/window/layout/iwizpuwonk;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ExtensionListenerImpl implements agtfadlqog.iobyxmoadg {
        final /* synthetic */ SidecarWindowBackend this$0;

        public ExtensionListenerImpl(SidecarWindowBackend this$0) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // androidx.window.layout.agtfadlqog.iobyxmoadg
        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(Activity activity, iwizpuwonk newLayout) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newLayout, "newLayout");
            for (zoijcleaow zoijcleaowVar : this.this$0.getWindowLayoutChangeCallbacks()) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar.wkgbmnqykc(), activity)) {
                    zoijcleaowVar.zoijcleaow(newLayout);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.SidecarWindowBackend$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SidecarWindowBackend iobyxmoadg(Context context) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            if (SidecarWindowBackend.globalInstance == null) {
                ReentrantLock reentrantLock = SidecarWindowBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (SidecarWindowBackend.globalInstance == null) {
                        SidecarWindowBackend.globalInstance = new SidecarWindowBackend(SidecarWindowBackend.INSTANCE.zoijcleaow(context));
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            SidecarWindowBackend sidecarWindowBackend = SidecarWindowBackend.globalInstance;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(sidecarWindowBackend);
            return sidecarWindowBackend;
        }

        public final boolean ppxfxbqfkf(f6.nufgyqmvbu nufgyqmvbuVar) {
            return nufgyqmvbuVar != null && nufgyqmvbuVar.compareTo(f6.nufgyqmvbu.f32922esjtqupxsv.iobyxmoadg()) >= 0;
        }

        public final agtfadlqog zoijcleaow(Context context) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            try {
                if (!ppxfxbqfkf(SidecarCompat.INSTANCE.ppxfxbqfkf())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (sidecarCompat.validateExtensionInterface()) {
                    return sidecarCompat;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Activity f13809iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final u1.iobyxmoadg f13810ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private iwizpuwonk f13811wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Executor f13812zoijcleaow;

        public zoijcleaow(Activity activity, Executor executor, u1.iobyxmoadg callback) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(executor, "executor");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callback, "callback");
            this.f13809iobyxmoadg = activity;
            this.f13812zoijcleaow = executor;
            this.f13810ppxfxbqfkf = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ppxfxbqfkf(zoijcleaow this$0, iwizpuwonk newLayoutInfo) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newLayoutInfo, "$newLayoutInfo");
            this$0.f13810ppxfxbqfkf.accept(newLayoutInfo);
        }

        public final u1.iobyxmoadg eablkybsjg() {
            return this.f13810ppxfxbqfkf;
        }

        public final iwizpuwonk gxszxtbevo() {
            return this.f13811wkgbmnqykc;
        }

        public final Activity wkgbmnqykc() {
            return this.f13809iobyxmoadg;
        }

        public final void zoijcleaow(final iwizpuwonk newLayoutInfo) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newLayoutInfo, "newLayoutInfo");
            this.f13811wkgbmnqykc = newLayoutInfo;
            this.f13812zoijcleaow.execute(new Runnable() { // from class: androidx.window.layout.oxmwwwfdhm
                @Override // java.lang.Runnable
                public final void run() {
                    SidecarWindowBackend.zoijcleaow.ppxfxbqfkf(this.f13828zdlpuopuiu, newLayoutInfo);
                }
            });
        }
    }

    public SidecarWindowBackend(agtfadlqog agtfadlqogVar) {
        this.windowExtension = agtfadlqogVar;
        agtfadlqog agtfadlqogVar2 = this.windowExtension;
        if (agtfadlqogVar2 == null) {
            return;
        }
        agtfadlqogVar2.setExtensionCallback(new ExtensionListenerImpl(this));
    }

    private final void callbackRemovedForActivity(Activity activity) {
        CopyOnWriteArrayList<zoijcleaow> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((zoijcleaow) it.next()).wkgbmnqykc(), activity)) {
                    return;
                }
            }
        }
        agtfadlqog agtfadlqogVar = this.windowExtension;
        if (agtfadlqogVar == null) {
            return;
        }
        agtfadlqogVar.onWindowLayoutChangeListenerRemoved(activity);
    }

    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }

    private final boolean isActivityRegistered(Activity activity) {
        CopyOnWriteArrayList<zoijcleaow> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((zoijcleaow) it.next()).wkgbmnqykc(), activity)) {
                return true;
            }
        }
        return false;
    }

    public final agtfadlqog getWindowExtension() {
        return this.windowExtension;
    }

    public final CopyOnWriteArrayList<zoijcleaow> getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    @Override // androidx.window.layout.kcexrzcfyt
    public void registerLayoutChangeCallback(Activity activity, Executor executor, u1.iobyxmoadg callback) {
        iwizpuwonk iwizpuwonkVarGxszxtbevo;
        Object next;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(executor, "executor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callback, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            agtfadlqog windowExtension = getWindowExtension();
            if (windowExtension == null) {
                callback.accept(new iwizpuwonk(hg.jyumaefscl.wflxmlrfwp()));
                return;
            }
            boolean zIsActivityRegistered = isActivityRegistered(activity);
            zoijcleaow zoijcleaowVar = new zoijcleaow(activity, executor, callback);
            getWindowLayoutChangeCallbacks().add(zoijcleaowVar);
            if (zIsActivityRegistered) {
                Iterator<T> it = getWindowLayoutChangeCallbacks().iterator();
                do {
                    iwizpuwonkVarGxszxtbevo = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(activity, ((zoijcleaow) next).wkgbmnqykc()));
                zoijcleaow zoijcleaowVar2 = (zoijcleaow) next;
                if (zoijcleaowVar2 != null) {
                    iwizpuwonkVarGxszxtbevo = zoijcleaowVar2.gxszxtbevo();
                }
                if (iwizpuwonkVarGxszxtbevo != null) {
                    zoijcleaowVar.zoijcleaow(iwizpuwonkVarGxszxtbevo);
                }
            } else {
                windowExtension.onWindowLayoutChangeListenerAdded(activity);
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setWindowExtension(agtfadlqog agtfadlqogVar) {
        this.windowExtension = agtfadlqogVar;
    }

    @Override // androidx.window.layout.kcexrzcfyt
    public void unregisterLayoutChangeCallback(u1.iobyxmoadg callback) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callback, "callback");
        synchronized (globalLock) {
            try {
                if (getWindowExtension() == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zoijcleaow callbackWrapper : getWindowLayoutChangeCallbacks()) {
                    if (callbackWrapper.eablkybsjg() == callback) {
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                getWindowLayoutChangeCallbacks().removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    callbackRemovedForActivity(((zoijcleaow) it.next()).wkgbmnqykc());
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
