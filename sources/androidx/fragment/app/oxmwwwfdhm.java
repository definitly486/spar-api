package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class oxmwwwfdhm extends androidx.activity.nufgyqmvbu implements androidx.core.app.zoijcleaow.eablkybsjg {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final yggfygwlhe mFragments = yggfygwlhe.zoijcleaow(new iobyxmoadg());
    final androidx.lifecycle.kcexrzcfyt mFragmentLifecycleRegistry = new androidx.lifecycle.kcexrzcfyt(this);
    boolean mStopped = true;

    class iobyxmoadg extends iwizpuwonk implements androidx.core.content.zoijcleaow, androidx.core.content.ppxfxbqfkf, androidx.core.app.vdvldrhtss, androidx.core.app.oxmwwwfdhm, ribwqtqdhb, androidx.activity.lereixgezr, eablkybsjg.wkgbmnqykc, q5.dxjokdxxww, wwaezpbzkn, v1.cqumvgiudr {
        public iobyxmoadg() {
            super(oxmwwwfdhm.this);
        }

        @Override // v1.cqumvgiudr
        public void addMenuProvider(v1.istkbnxepw istkbnxepwVar) {
            oxmwwwfdhm.this.addMenuProvider(istkbnxepwVar);
        }

        @Override // androidx.core.content.zoijcleaow
        public void addOnConfigurationChangedListener(u1.iobyxmoadg iobyxmoadgVar) {
            oxmwwwfdhm.this.addOnConfigurationChangedListener(iobyxmoadgVar);
        }

        @Override // androidx.core.app.vdvldrhtss
        public void addOnMultiWindowModeChangedListener(u1.iobyxmoadg iobyxmoadgVar) {
            oxmwwwfdhm.this.addOnMultiWindowModeChangedListener(iobyxmoadgVar);
        }

        @Override // androidx.core.app.oxmwwwfdhm
        public void addOnPictureInPictureModeChangedListener(u1.iobyxmoadg iobyxmoadgVar) {
            oxmwwwfdhm.this.addOnPictureInPictureModeChangedListener(iobyxmoadgVar);
        }

        @Override // androidx.core.content.ppxfxbqfkf
        public void addOnTrimMemoryListener(u1.iobyxmoadg iobyxmoadgVar) {
            oxmwwwfdhm.this.addOnTrimMemoryListener(iobyxmoadgVar);
        }

        @Override // androidx.fragment.app.iwizpuwonk
        public void dxjokdxxww(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            oxmwwwfdhm.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // eablkybsjg.wkgbmnqykc
        public eablkybsjg.ppxfxbqfkf getActivityResultRegistry() {
            return oxmwwwfdhm.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.vdvldrhtss
        public androidx.lifecycle.gtknphoqwx getLifecycle() {
            return oxmwwwfdhm.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.lereixgezr
        public androidx.activity.iwizpuwonk getOnBackPressedDispatcher() {
            return oxmwwwfdhm.this.getOnBackPressedDispatcher();
        }

        @Override // q5.dxjokdxxww
        public q5.gxszxtbevo getSavedStateRegistry() {
            return oxmwwwfdhm.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.ribwqtqdhb
        public jlmebxxoox getViewModelStore() {
            return oxmwwwfdhm.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.iwizpuwonk
        public LayoutInflater gtknphoqwx() {
            return oxmwwwfdhm.this.getLayoutInflater().cloneInContext(oxmwwwfdhm.this);
        }

        @Override // androidx.fragment.app.wwaezpbzkn
        public void iobyxmoadg(FragmentManager fragmentManager, Fragment fragment) {
            oxmwwwfdhm.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.iwizpuwonk
        /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
        public oxmwwwfdhm btonecajqb() {
            return oxmwwwfdhm.this;
        }

        @Override // androidx.fragment.app.zdlpuopuiu
        public View ppxfxbqfkf(int i13) {
            return oxmwwwfdhm.this.findViewById(i13);
        }

        @Override // v1.cqumvgiudr
        public void removeMenuProvider(v1.istkbnxepw istkbnxepwVar) {
            oxmwwwfdhm.this.removeMenuProvider(istkbnxepwVar);
        }

        @Override // androidx.core.content.zoijcleaow
        public void removeOnConfigurationChangedListener(u1.iobyxmoadg iobyxmoadgVar) {
            oxmwwwfdhm.this.removeOnConfigurationChangedListener(iobyxmoadgVar);
        }

        @Override // androidx.core.app.vdvldrhtss
        public void removeOnMultiWindowModeChangedListener(u1.iobyxmoadg iobyxmoadgVar) {
            oxmwwwfdhm.this.removeOnMultiWindowModeChangedListener(iobyxmoadgVar);
        }

        @Override // androidx.core.app.oxmwwwfdhm
        public void removeOnPictureInPictureModeChangedListener(u1.iobyxmoadg iobyxmoadgVar) {
            oxmwwwfdhm.this.removeOnPictureInPictureModeChangedListener(iobyxmoadgVar);
        }

        @Override // androidx.core.content.ppxfxbqfkf
        public void removeOnTrimMemoryListener(u1.iobyxmoadg iobyxmoadgVar) {
            oxmwwwfdhm.this.removeOnTrimMemoryListener(iobyxmoadgVar);
        }

        @Override // androidx.fragment.app.iwizpuwonk
        public void rgvfuqvkyq() {
            vdvldrhtss();
        }

        public void vdvldrhtss() {
            oxmwwwfdhm.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.iwizpuwonk
        public boolean wflxmlrfwp(String str) {
            return androidx.core.app.zoijcleaow.btonecajqb(oxmwwwfdhm.this, str);
        }

        @Override // androidx.fragment.app.zdlpuopuiu
        public boolean wkgbmnqykc() {
            Window window = oxmwwwfdhm.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    public oxmwwwfdhm() {
        vdvldrhtss();
    }

    private static boolean iwizpuwonk(FragmentManager fragmentManager, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar) {
        boolean zIwizpuwonk = false;
        for (Fragment fragment : fragmentManager.igdgnonuha()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zIwizpuwonk |= iwizpuwonk(fragment.getChildFragmentManager(), zoijcleaowVar);
                }
                wypolnanlu wypolnanluVar = fragment.mViewLifecycleOwner;
                if (wypolnanluVar != null && wypolnanluVar.getLifecycle().zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED)) {
                    fragment.mViewLifecycleOwner.gxszxtbevo(zoijcleaowVar);
                    zIwizpuwonk = true;
                }
                if (fragment.mLifecycleRegistry.zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED)) {
                    fragment.mLifecycleRegistry.agtfadlqog(zoijcleaowVar);
                    zIwizpuwonk = true;
                }
            }
        }
        return zIwizpuwonk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jyumaefscl(Context context) {
        this.mFragments.iobyxmoadg(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle kcexrzcfyt() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_STOP);
        return new Bundle();
    }

    private void vdvldrhtss() {
        getSavedStateRegistry().ppxfxbqfkf(LIFECYCLE_TAG, new q5.gxszxtbevo.zoijcleaow() { // from class: androidx.fragment.app.agtfadlqog
            @Override // q5.gxszxtbevo.zoijcleaow
            public final Bundle iobyxmoadg() {
                return this.f9185iobyxmoadg.kcexrzcfyt();
            }
        });
        addOnConfigurationChangedListener(new u1.iobyxmoadg() { // from class: androidx.fragment.app.ojitshcjhn
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                this.f9332iobyxmoadg.zdlpuopuiu((Configuration) obj);
            }
        });
        addOnNewIntentListener(new u1.iobyxmoadg() { // from class: androidx.fragment.app.rgvfuqvkyq
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                this.f9346iobyxmoadg.yggfygwlhe((Intent) obj);
            }
        });
        addOnContextAvailableListener(new wkgbmnqykc.zoijcleaow() { // from class: androidx.fragment.app.vdvldrhtss
            @Override // wkgbmnqykc.zoijcleaow
            public final void iobyxmoadg(Context context) {
                this.f9359iobyxmoadg.jyumaefscl(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yggfygwlhe(Intent intent) {
        this.mFragments.wflxmlrfwp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zdlpuopuiu(Configuration configuration) {
        this.mFragments.wflxmlrfwp();
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.agtfadlqog(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.iobyxmoadg.zoijcleaow(this).iobyxmoadg(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.draadjrbmk().ikoacuggdj(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.draadjrbmk();
    }

    @Deprecated
    public androidx.loader.app.iobyxmoadg getSupportLoaderManager() {
        return androidx.loader.app.iobyxmoadg.zoijcleaow(this);
    }

    void markFragmentsCreated() {
        while (iwizpuwonk(getSupportFragmentManager(), androidx.lifecycle.gtknphoqwx.zoijcleaow.CREATED)) {
        }
    }

    @Override // androidx.activity.nufgyqmvbu, android.app.Activity
    protected void onActivityResult(int i13, int i14, Intent intent) {
        this.mFragments.wflxmlrfwp();
        super.onActivityResult(i13, i14, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.nufgyqmvbu, androidx.core.app.lqeggnwhkg, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_CREATE);
        this.mFragments.eablkybsjg();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.gxszxtbevo();
        this.mFragmentLifecycleRegistry.dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY);
    }

    @Override // androidx.activity.nufgyqmvbu, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i13, MenuItem menuItem) {
        if (super.onMenuItemSelected(i13, menuItem)) {
            return true;
        }
        if (i13 == 6) {
            return this.mFragments.wkgbmnqykc(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.lqeggnwhkg();
        this.mFragmentLifecycleRegistry.dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.nufgyqmvbu, android.app.Activity
    public void onRequestPermissionsResult(int i13, String[] strArr, int[] iArr) {
        this.mFragments.wflxmlrfwp();
        super.onRequestPermissionsResult(i13, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.wflxmlrfwp();
        super.onResume();
        this.mResumed = true;
        this.mFragments.gtknphoqwx();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_RESUME);
        this.mFragments.nufgyqmvbu();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.wflxmlrfwp();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.ppxfxbqfkf();
        }
        this.mFragments.gtknphoqwx();
        this.mFragmentLifecycleRegistry.dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_START);
        this.mFragments.dxjokdxxww();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.wflxmlrfwp();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.btonecajqb();
        this.mFragmentLifecycleRegistry.dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.yggfygwlhe yggfygwlheVar) {
        androidx.core.app.zoijcleaow.nufgyqmvbu(this, yggfygwlheVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.yggfygwlhe yggfygwlheVar) {
        androidx.core.app.zoijcleaow.dxjokdxxww(this, yggfygwlheVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i13) {
        startActivityFromFragment(fragment, intent, i13, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i13, Intent intent, int i14, int i15, int i16, Bundle bundle) throws IntentSender.SendIntentException {
        if (i13 == -1) {
            androidx.core.app.zoijcleaow.draadjrbmk(this, intentSender, i13, intent, i14, i15, i16, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i13, intent, i14, i15, i16, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.zoijcleaow.ppxfxbqfkf(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.zoijcleaow.eablkybsjg(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.zoijcleaow.wflxmlrfwp(this);
    }

    @Override // androidx.core.app.zoijcleaow.eablkybsjg
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i13) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i13, Bundle bundle) {
        if (i13 == -1) {
            androidx.core.app.zoijcleaow.gtknphoqwx(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i13, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }
}
