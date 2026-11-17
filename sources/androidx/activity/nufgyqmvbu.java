package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.hkdspvbjdz;
import androidx.lifecycle.jhduphickx;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import androidx.lifecycle.stevsuqkhv;
import androidx.lifecycle.vipkmwdibw;
import com.google.android.gms.location.DeviceOrientationRequest;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu extends androidx.core.app.lqeggnwhkg implements androidx.lifecycle.vdvldrhtss, ribwqtqdhb, androidx.lifecycle.dxjokdxxww, q5.dxjokdxxww, lereixgezr, eablkybsjg.wkgbmnqykc, androidx.core.content.zoijcleaow, androidx.core.content.ppxfxbqfkf, androidx.core.app.vdvldrhtss, androidx.core.app.oxmwwwfdhm, v1.cqumvgiudr, yggfygwlhe {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final eablkybsjg.ppxfxbqfkf mActivityResultRegistry;
    private int mContentLayoutId;
    private crxdokpmqz.ppxfxbqfkf mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final zdlpuopuiu mFullyDrawnReporter;
    private final AtomicInteger mNextLocalRequestCode;
    private iwizpuwonk mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<u1.iobyxmoadg> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<u1.iobyxmoadg> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<u1.iobyxmoadg> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<u1.iobyxmoadg> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<u1.iobyxmoadg> mOnTrimMemoryListeners;
    final btonecajqb mReportFullyDrawnExecutor;
    final q5.nufgyqmvbu mSavedStateRegistryController;
    private jlmebxxoox mViewModelStore;
    final wkgbmnqykc.iobyxmoadg mContextAwareHelper = new wkgbmnqykc.iobyxmoadg();
    private final v1.pmvmpeiblj mMenuHostHelper = new v1.pmvmpeiblj(new Runnable() { // from class: androidx.activity.wkgbmnqykc
        @Override // java.lang.Runnable
        public final void run() {
            this.f2360zdlpuopuiu.invalidateMenu();
        }
    });
    private final androidx.lifecycle.kcexrzcfyt mLifecycleRegistry = new androidx.lifecycle.kcexrzcfyt(this);

    private interface btonecajqb extends Executor {
        void dxjokdxxww();

        void zdlpuopuiu(View view);
    }

    static final class dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        Object f2328iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        jlmebxxoox f2329zoijcleaow;

        dxjokdxxww() {
        }
    }

    class eablkybsjg implements Runnable {
        eablkybsjg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                nufgyqmvbu.super.onBackPressed();
            } catch (IllegalStateException e13) {
                if (!TextUtils.equals(e13.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e13;
                }
            } catch (NullPointerException e14) {
                if (!TextUtils.equals(e14.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e14;
                }
            }
        }
    }

    class gtknphoqwx implements btonecajqb, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Runnable f2333yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final long f2334zdlpuopuiu = SystemClock.uptimeMillis() + DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f2332jyumaefscl = false;

        gtknphoqwx() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zoijcleaow() {
            Runnable runnable = this.f2333yggfygwlhe;
            if (runnable != null) {
                runnable.run();
                this.f2333yggfygwlhe = null;
            }
        }

        @Override // androidx.activity.nufgyqmvbu.btonecajqb
        public void dxjokdxxww() {
            nufgyqmvbu.this.getWindow().getDecorView().removeCallbacks(this);
            nufgyqmvbu.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f2333yggfygwlhe = runnable;
            View decorView = nufgyqmvbu.this.getWindow().getDecorView();
            if (!this.f2332jyumaefscl) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.dxjokdxxww
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2292zdlpuopuiu.zoijcleaow();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f2333yggfygwlhe;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f2334zdlpuopuiu) {
                    this.f2332jyumaefscl = false;
                    nufgyqmvbu.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f2333yggfygwlhe = null;
            if (nufgyqmvbu.this.mFullyDrawnReporter.ppxfxbqfkf()) {
                this.f2332jyumaefscl = false;
                nufgyqmvbu.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            nufgyqmvbu.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.nufgyqmvbu.btonecajqb
        public void zdlpuopuiu(View view) {
            if (this.f2332jyumaefscl) {
                return;
            }
            this.f2332jyumaefscl = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    class gxszxtbevo implements androidx.lifecycle.agtfadlqog {
        gxszxtbevo() {
        }

        @Override // androidx.lifecycle.agtfadlqog
        public void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar != androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                return;
            }
            nufgyqmvbu.this.mOnBackPressedDispatcher.ojitshcjhn(C0064nufgyqmvbu.iobyxmoadg((nufgyqmvbu) vdvldrhtssVar));
        }
    }

    class iobyxmoadg extends eablkybsjg.ppxfxbqfkf {

        /* JADX INFO: renamed from: androidx.activity.nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class RunnableC0063iobyxmoadg implements Runnable {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ gxszxtbevo.iobyxmoadg.C0890iobyxmoadg f2338yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ int f2339zdlpuopuiu;

            RunnableC0063iobyxmoadg(int i13, gxszxtbevo.iobyxmoadg.C0890iobyxmoadg c0890iobyxmoadg) {
                this.f2339zdlpuopuiu = i13;
                this.f2338yggfygwlhe = c0890iobyxmoadg;
            }

            @Override // java.lang.Runnable
            public void run() {
                iobyxmoadg.this.ppxfxbqfkf(this.f2339zdlpuopuiu, this.f2338yggfygwlhe.iobyxmoadg());
            }
        }

        class zoijcleaow implements Runnable {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f2341yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ int f2342zdlpuopuiu;

            zoijcleaow(int i13, IntentSender.SendIntentException sendIntentException) {
                this.f2342zdlpuopuiu = i13;
                this.f2341yggfygwlhe = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                iobyxmoadg.this.zoijcleaow(this.f2342zdlpuopuiu, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f2341yggfygwlhe));
            }
        }

        iobyxmoadg() {
        }

        @Override // eablkybsjg.ppxfxbqfkf
        public void gxszxtbevo(int i13, gxszxtbevo.iobyxmoadg iobyxmoadgVar, Object obj, androidx.core.app.ppxfxbqfkf ppxfxbqfkfVar) {
            Bundle bundle;
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
            gxszxtbevo.iobyxmoadg.C0890iobyxmoadg c0890iobyxmoadgZoijcleaow = iobyxmoadgVar.zoijcleaow(nufgyqmvbuVar, obj);
            if (c0890iobyxmoadgZoijcleaow != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0063iobyxmoadg(i13, c0890iobyxmoadgZoijcleaow));
                return;
            }
            Intent intentIobyxmoadg = iobyxmoadgVar.iobyxmoadg(nufgyqmvbuVar, obj);
            if (intentIobyxmoadg.getExtras() != null && intentIobyxmoadg.getExtras().getClassLoader() == null) {
                intentIobyxmoadg.setExtrasClassLoader(nufgyqmvbuVar.getClassLoader());
            }
            if (intentIobyxmoadg.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentIobyxmoadg.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentIobyxmoadg.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentIobyxmoadg.getAction())) {
                String[] stringArrayExtra = intentIobyxmoadg.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.zoijcleaow.lqeggnwhkg(nufgyqmvbuVar, stringArrayExtra, i13);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentIobyxmoadg.getAction())) {
                androidx.core.app.zoijcleaow.gtknphoqwx(nufgyqmvbuVar, intentIobyxmoadg, i13, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentIobyxmoadg.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                androidx.core.app.zoijcleaow.draadjrbmk(nufgyqmvbuVar, intentSenderRequest.getIntentSender(), i13, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
            } catch (IntentSender.SendIntentException e13) {
                new Handler(Looper.getMainLooper()).post(new zoijcleaow(i13, e13));
            }
        }
    }

    static class lqeggnwhkg {
        static void iobyxmoadg(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.nufgyqmvbu$nufgyqmvbu, reason: collision with other inner class name */
    static class C0064nufgyqmvbu {
        static OnBackInvokedDispatcher iobyxmoadg(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    class ppxfxbqfkf implements androidx.lifecycle.agtfadlqog {
        ppxfxbqfkf() {
        }

        @Override // androidx.lifecycle.agtfadlqog
        public void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY) {
                nufgyqmvbu.this.mContextAwareHelper.zoijcleaow();
                if (!nufgyqmvbu.this.isChangingConfigurations()) {
                    nufgyqmvbu.this.getViewModelStore().iobyxmoadg();
                }
                nufgyqmvbu.this.mReportFullyDrawnExecutor.dxjokdxxww();
            }
        }
    }

    class wkgbmnqykc implements androidx.lifecycle.agtfadlqog {
        wkgbmnqykc() {
        }

        @Override // androidx.lifecycle.agtfadlqog
        public void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
            nufgyqmvbu.this.ensureViewModelStore();
            nufgyqmvbu.this.getLifecycle().wkgbmnqykc(this);
        }
    }

    class zoijcleaow implements androidx.lifecycle.agtfadlqog {
        zoijcleaow() {
        }

        @Override // androidx.lifecycle.agtfadlqog
        public void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_STOP) {
                Window window = nufgyqmvbu.this.getWindow();
                View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                if (viewPeekDecorView != null) {
                    lqeggnwhkg.iobyxmoadg(viewPeekDecorView);
                }
            }
        }
    }

    public nufgyqmvbu() {
        q5.nufgyqmvbu nufgyqmvbuVarIobyxmoadg = q5.nufgyqmvbu.iobyxmoadg(this);
        this.mSavedStateRegistryController = nufgyqmvbuVarIobyxmoadg;
        this.mOnBackPressedDispatcher = null;
        btonecajqb btonecajqbVarNufgyqmvbu = nufgyqmvbu();
        this.mReportFullyDrawnExecutor = btonecajqbVarNufgyqmvbu;
        this.mFullyDrawnReporter = new zdlpuopuiu(btonecajqbVarNufgyqmvbu, new tg.iobyxmoadg() { // from class: androidx.activity.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return this.f2293zdlpuopuiu.dxjokdxxww();
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new iobyxmoadg();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().iobyxmoadg(new zoijcleaow());
        getLifecycle().iobyxmoadg(new ppxfxbqfkf());
        getLifecycle().iobyxmoadg(new wkgbmnqykc());
        nufgyqmvbuVarIobyxmoadg.ppxfxbqfkf();
        hkdspvbjdz.ppxfxbqfkf(this);
        getSavedStateRegistry().ppxfxbqfkf(ACTIVITY_RESULT_TAG, new q5.gxszxtbevo.zoijcleaow() { // from class: androidx.activity.gxszxtbevo
            @Override // q5.gxszxtbevo.zoijcleaow
            public final Bundle iobyxmoadg() {
                return this.f2296iobyxmoadg.btonecajqb();
            }
        });
        addOnContextAvailableListener(new wkgbmnqykc.zoijcleaow() { // from class: androidx.activity.lqeggnwhkg
            @Override // wkgbmnqykc.zoijcleaow
            public final void iobyxmoadg(Context context) {
                this.f2327iobyxmoadg.gtknphoqwx(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle btonecajqb() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.nufgyqmvbu(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wwaezpbzkn dxjokdxxww() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gtknphoqwx(Context context) {
        Bundle bundleIobyxmoadg = getSavedStateRegistry().iobyxmoadg(ACTIVITY_RESULT_TAG);
        if (bundleIobyxmoadg != null) {
            this.mActivityResultRegistry.lqeggnwhkg(bundleIobyxmoadg);
        }
    }

    private btonecajqb nufgyqmvbu() {
        return new gtknphoqwx();
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.zdlpuopuiu(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // v1.cqumvgiudr
    public void addMenuProvider(v1.istkbnxepw istkbnxepwVar) {
        this.mMenuHostHelper.ppxfxbqfkf(istkbnxepwVar);
    }

    @Override // androidx.core.content.zoijcleaow
    public final void addOnConfigurationChangedListener(u1.iobyxmoadg iobyxmoadgVar) {
        this.mOnConfigurationChangedListeners.add(iobyxmoadgVar);
    }

    public final void addOnContextAvailableListener(wkgbmnqykc.zoijcleaow zoijcleaowVar) {
        this.mContextAwareHelper.iobyxmoadg(zoijcleaowVar);
    }

    @Override // androidx.core.app.vdvldrhtss
    public final void addOnMultiWindowModeChangedListener(u1.iobyxmoadg iobyxmoadgVar) {
        this.mOnMultiWindowModeChangedListeners.add(iobyxmoadgVar);
    }

    public final void addOnNewIntentListener(u1.iobyxmoadg iobyxmoadgVar) {
        this.mOnNewIntentListeners.add(iobyxmoadgVar);
    }

    @Override // androidx.core.app.oxmwwwfdhm
    public final void addOnPictureInPictureModeChangedListener(u1.iobyxmoadg iobyxmoadgVar) {
        this.mOnPictureInPictureModeChangedListeners.add(iobyxmoadgVar);
    }

    @Override // androidx.core.content.ppxfxbqfkf
    public final void addOnTrimMemoryListener(u1.iobyxmoadg iobyxmoadgVar) {
        this.mOnTrimMemoryListeners.add(iobyxmoadgVar);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) getLastNonConfigurationInstance();
            if (dxjokdxxwwVar != null) {
                this.mViewModelStore = dxjokdxxwwVar.f2329zoijcleaow;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new jlmebxxoox();
            }
        }
    }

    @Override // eablkybsjg.wkgbmnqykc
    public final eablkybsjg.ppxfxbqfkf getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.dxjokdxxww
    public t2.iobyxmoadg getDefaultViewModelCreationExtras() {
        t2.wkgbmnqykc wkgbmnqykcVar = new t2.wkgbmnqykc();
        if (getApplication() != null) {
            wkgbmnqykcVar.ppxfxbqfkf(crxdokpmqz.iobyxmoadg.f9449nufgyqmvbu, getApplication());
        }
        wkgbmnqykcVar.ppxfxbqfkf(hkdspvbjdz.f9476iobyxmoadg, this);
        wkgbmnqykcVar.ppxfxbqfkf(hkdspvbjdz.f9478zoijcleaow, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            wkgbmnqykcVar.ppxfxbqfkf(hkdspvbjdz.f9477ppxfxbqfkf, getIntent().getExtras());
        }
        return wkgbmnqykcVar;
    }

    @Override // androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new stevsuqkhv(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public zdlpuopuiu getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) getLastNonConfigurationInstance();
        if (dxjokdxxwwVar != null) {
            return dxjokdxxwwVar.f2328iobyxmoadg;
        }
        return null;
    }

    @Override // androidx.lifecycle.vdvldrhtss
    public androidx.lifecycle.gtknphoqwx getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.lereixgezr
    public final iwizpuwonk getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new iwizpuwonk(new eablkybsjg());
            getLifecycle().iobyxmoadg(new gxszxtbevo());
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // q5.dxjokdxxww
    public final q5.gxszxtbevo getSavedStateRegistry() {
        return this.mSavedStateRegistryController.zoijcleaow();
    }

    @Override // androidx.lifecycle.ribwqtqdhb
    public jlmebxxoox getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        vipkmwdibw.zoijcleaow(getWindow().getDecorView(), this);
        jhduphickx.zoijcleaow(getWindow().getDecorView(), this);
        q5.wflxmlrfwp.zoijcleaow(getWindow().getDecorView(), this);
        cdpycssgdh.zoijcleaow(getWindow().getDecorView(), this);
        istkbnxepw.iobyxmoadg(getWindow().getDecorView(), this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i13, int i14, Intent intent) {
        if (this.mActivityResultRegistry.zoijcleaow(i13, i14, intent)) {
            return;
        }
        super.onActivityResult(i13, i14, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().draadjrbmk();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<u1.iobyxmoadg> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.lqeggnwhkg, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.wkgbmnqykc(bundle);
        this.mContextAwareHelper.ppxfxbqfkf(this);
        super.onCreate(bundle);
        androidx.lifecycle.wwaezpbzkn.eablkybsjg(this);
        int i13 = this.mContentLayoutId;
        if (i13 != 0) {
            setContentView(i13);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i13, Menu menu) {
        if (i13 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i13, menu);
        this.mMenuHostHelper.nufgyqmvbu(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i13, MenuItem menuItem) {
        if (super.onMenuItemSelected(i13, menuItem)) {
            return true;
        }
        if (i13 == 0) {
            return this.mMenuHostHelper.btonecajqb(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z13) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<u1.iobyxmoadg> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.btonecajqb(z13));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<u1.iobyxmoadg> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i13, Menu menu) {
        this.mMenuHostHelper.dxjokdxxww(menu);
        super.onPanelClosed(i13, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z13) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<u1.iobyxmoadg> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.kcexrzcfyt(z13));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i13, View view, Menu menu) {
        if (i13 != 0) {
            return true;
        }
        super.onPreparePanel(i13, view, menu);
        this.mMenuHostHelper.gtknphoqwx(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i13, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.zoijcleaow(i13, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i13, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        dxjokdxxww dxjokdxxwwVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        jlmebxxoox jlmebxxooxVar = this.mViewModelStore;
        if (jlmebxxooxVar == null && (dxjokdxxwwVar = (dxjokdxxww) getLastNonConfigurationInstance()) != null) {
            jlmebxxooxVar = dxjokdxxwwVar.f2329zoijcleaow;
        }
        if (jlmebxxooxVar == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        dxjokdxxww dxjokdxxwwVar2 = new dxjokdxxww();
        dxjokdxxwwVar2.f2328iobyxmoadg = objOnRetainCustomNonConfigurationInstance;
        dxjokdxxwwVar2.f2329zoijcleaow = jlmebxxooxVar;
        return dxjokdxxwwVar2;
    }

    @Override // androidx.core.app.lqeggnwhkg, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.gtknphoqwx lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.kcexrzcfyt) {
            ((androidx.lifecycle.kcexrzcfyt) lifecycle).agtfadlqog(androidx.lifecycle.gtknphoqwx.zoijcleaow.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.eablkybsjg(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i13) {
        super.onTrimMemory(i13);
        Iterator<u1.iobyxmoadg> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i13));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.wkgbmnqykc();
    }

    public final <I, O> eablkybsjg.zoijcleaow registerForActivityResult(gxszxtbevo.iobyxmoadg iobyxmoadgVar, eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, eablkybsjg.iobyxmoadg iobyxmoadgVar2) {
        return ppxfxbqfkfVar.dxjokdxxww("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, iobyxmoadgVar, iobyxmoadgVar2);
    }

    @Override // v1.cqumvgiudr
    public void removeMenuProvider(v1.istkbnxepw istkbnxepwVar) {
        this.mMenuHostHelper.draadjrbmk(istkbnxepwVar);
    }

    @Override // androidx.core.content.zoijcleaow
    public final void removeOnConfigurationChangedListener(u1.iobyxmoadg iobyxmoadgVar) {
        this.mOnConfigurationChangedListeners.remove(iobyxmoadgVar);
    }

    public final void removeOnContextAvailableListener(wkgbmnqykc.zoijcleaow zoijcleaowVar) {
        this.mContextAwareHelper.eablkybsjg(zoijcleaowVar);
    }

    @Override // androidx.core.app.vdvldrhtss
    public final void removeOnMultiWindowModeChangedListener(u1.iobyxmoadg iobyxmoadgVar) {
        this.mOnMultiWindowModeChangedListeners.remove(iobyxmoadgVar);
    }

    public final void removeOnNewIntentListener(u1.iobyxmoadg iobyxmoadgVar) {
        this.mOnNewIntentListeners.remove(iobyxmoadgVar);
    }

    @Override // androidx.core.app.oxmwwwfdhm
    public final void removeOnPictureInPictureModeChangedListener(u1.iobyxmoadg iobyxmoadgVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(iobyxmoadgVar);
    }

    @Override // androidx.core.content.ppxfxbqfkf
    public final void removeOnTrimMemoryListener(u1.iobyxmoadg iobyxmoadgVar) {
        this.mOnTrimMemoryListeners.remove(iobyxmoadgVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (y5.iobyxmoadg.nufgyqmvbu()) {
                y5.iobyxmoadg.ppxfxbqfkf("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.zoijcleaow();
        } finally {
            y5.iobyxmoadg.gxszxtbevo();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i13) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.zdlpuopuiu(getWindow().getDecorView());
        super.setContentView(i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i13) {
        super.startActivityForResult(intent, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i13, Intent intent, int i14, int i15, int i16) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i13, intent, i14, i15, i16);
    }

    public void addMenuProvider(v1.istkbnxepw istkbnxepwVar, androidx.lifecycle.vdvldrhtss vdvldrhtssVar) {
        this.mMenuHostHelper.wkgbmnqykc(istkbnxepwVar, vdvldrhtssVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i13, Bundle bundle) {
        super.startActivityForResult(intent, i13, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i13, Intent intent, int i14, int i15, int i16, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i13, intent, i14, i15, i16, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(v1.istkbnxepw istkbnxepwVar, androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar) {
        this.mMenuHostHelper.eablkybsjg(istkbnxepwVar, vdvldrhtssVar, zoijcleaowVar);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z13, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z13, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<u1.iobyxmoadg> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.btonecajqb(z13, configuration));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z13, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z13, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<u1.iobyxmoadg> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.kcexrzcfyt(z13, configuration));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    public final <I, O> eablkybsjg.zoijcleaow registerForActivityResult(gxszxtbevo.iobyxmoadg iobyxmoadgVar, eablkybsjg.iobyxmoadg iobyxmoadgVar2) {
        return registerForActivityResult(iobyxmoadgVar, this.mActivityResultRegistry, iobyxmoadgVar2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.zdlpuopuiu(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.zdlpuopuiu(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
