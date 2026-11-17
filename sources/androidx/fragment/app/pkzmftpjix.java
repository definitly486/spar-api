package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.ribwqtqdhb;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
class pkzmftpjix {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final esjtqupxsv f9335iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Fragment f9336ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final hcddaimhww f9338zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f9337wkgbmnqykc = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f9334eablkybsjg = -1;

    class iobyxmoadg implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ View f9340zdlpuopuiu;

        iobyxmoadg(View view) {
            this.f9340zdlpuopuiu = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f9340zdlpuopuiu.removeOnAttachStateChangeListener(this);
            jhduphickx.ydmasvzmpa(this.f9340zdlpuopuiu);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f9341iobyxmoadg;

        static {
            int[] iArr = new int[androidx.lifecycle.gtknphoqwx.zoijcleaow.values().length];
            f9341iobyxmoadg = iArr;
            try {
                iArr[androidx.lifecycle.gtknphoqwx.zoijcleaow.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9341iobyxmoadg[androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9341iobyxmoadg[androidx.lifecycle.gtknphoqwx.zoijcleaow.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9341iobyxmoadg[androidx.lifecycle.gtknphoqwx.zoijcleaow.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    pkzmftpjix(esjtqupxsv esjtqupxsvVar, hcddaimhww hcddaimhwwVar, Fragment fragment) {
        this.f9335iobyxmoadg = esjtqupxsvVar;
        this.f9338zoijcleaow = hcddaimhwwVar;
        this.f9336ppxfxbqfkf = fragment;
    }

    private boolean draadjrbmk(View view) {
        if (view == this.f9336ppxfxbqfkf.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f9336ppxfxbqfkf.mView) {
                return true;
            }
        }
        return false;
    }

    void agtfadlqog() {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f9336ppxfxbqfkf);
        }
        this.f9336ppxfxbqfkf.performPause();
        this.f9335iobyxmoadg.gxszxtbevo(this.f9336ppxfxbqfkf, false);
    }

    void btonecajqb() {
        Fragment fragment = this.f9336ppxfxbqfkf;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.rhgxfdycjh(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f9336ppxfxbqfkf);
            }
            Bundle bundle = this.f9336ppxfxbqfkf.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            Fragment fragment2 = this.f9336ppxfxbqfkf;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f9336ppxfxbqfkf.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f9336ppxfxbqfkf;
                fragment3.mView.setTag(k2.zoijcleaow.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f9336ppxfxbqfkf;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f9336ppxfxbqfkf.performViewCreated();
                esjtqupxsv esjtqupxsvVar = this.f9335iobyxmoadg;
                Fragment fragment5 = this.f9336ppxfxbqfkf;
                esjtqupxsvVar.wflxmlrfwp(fragment5, fragment5.mView, bundle2, false);
                this.f9336ppxfxbqfkf.mState = 2;
            }
        }
    }

    void dxjokdxxww() {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f9336ppxfxbqfkf);
        }
        this.f9336ppxfxbqfkf.performDetach();
        this.f9335iobyxmoadg.eablkybsjg(this.f9336ppxfxbqfkf, false);
        Fragment fragment = this.f9336ppxfxbqfkf;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f9338zoijcleaow.rgvfuqvkyq().lereixgezr(this.f9336ppxfxbqfkf)) {
            return;
        }
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f9336ppxfxbqfkf);
        }
        this.f9336ppxfxbqfkf.initState();
    }

    void eablkybsjg() {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f9336ppxfxbqfkf);
        }
        Bundle bundle = this.f9336ppxfxbqfkf.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        Fragment fragment = this.f9336ppxfxbqfkf;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.f9335iobyxmoadg.nufgyqmvbu(fragment, bundle2, false);
            this.f9336ppxfxbqfkf.performCreate(bundle2);
            this.f9335iobyxmoadg.ppxfxbqfkf(this.f9336ppxfxbqfkf, bundle2, false);
        }
    }

    Fragment gtknphoqwx() {
        return this.f9336ppxfxbqfkf;
    }

    void gxszxtbevo() {
        String resourceName;
        if (this.f9336ppxfxbqfkf.mFromLayout) {
            return;
        }
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f9336ppxfxbqfkf);
        }
        Bundle bundle = this.f9336ppxfxbqfkf.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f9336ppxfxbqfkf.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f9336ppxfxbqfkf;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i13 = fragment.mContainerId;
            if (i13 != 0) {
                if (i13 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f9336ppxfxbqfkf + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.auzgnhcxok().ppxfxbqfkf(this.f9336ppxfxbqfkf.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f9336ppxfxbqfkf;
                    if (!fragment2.mRestored && !fragment2.mInDynamicContainer) {
                        try {
                            resourceName = fragment2.getResources().getResourceName(this.f9336ppxfxbqfkf.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f9336ppxfxbqfkf.mContainerId) + " (" + resourceName + ") for fragment " + this.f9336ppxfxbqfkf);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    l2.zoijcleaow.agtfadlqog(this.f9336ppxfxbqfkf, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f9336ppxfxbqfkf;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f9336ppxfxbqfkf.mView != null) {
            if (FragmentManager.rhgxfdycjh(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f9336ppxfxbqfkf);
            }
            this.f9336ppxfxbqfkf.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f9336ppxfxbqfkf;
            fragment4.mView.setTag(k2.zoijcleaow.fragment_container_view_tag, fragment4);
            if (viewGroup != null) {
                zoijcleaow();
            }
            Fragment fragment5 = this.f9336ppxfxbqfkf;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (this.f9336ppxfxbqfkf.mView.isAttachedToWindow()) {
                jhduphickx.ydmasvzmpa(this.f9336ppxfxbqfkf.mView);
            } else {
                View view = this.f9336ppxfxbqfkf.mView;
                view.addOnAttachStateChangeListener(new iobyxmoadg(view));
            }
            this.f9336ppxfxbqfkf.performViewCreated();
            esjtqupxsv esjtqupxsvVar = this.f9335iobyxmoadg;
            Fragment fragment6 = this.f9336ppxfxbqfkf;
            esjtqupxsvVar.wflxmlrfwp(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f9336ppxfxbqfkf.mView.getVisibility();
            this.f9336ppxfxbqfkf.setPostOnViewCreatedAlpha(this.f9336ppxfxbqfkf.mView.getAlpha());
            Fragment fragment7 = this.f9336ppxfxbqfkf;
            if (fragment7.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f9336ppxfxbqfkf.setFocusedView(viewFindFocus);
                    if (FragmentManager.rhgxfdycjh(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f9336ppxfxbqfkf);
                    }
                }
                this.f9336ppxfxbqfkf.mView.setAlpha(0.0f);
            }
        }
        this.f9336ppxfxbqfkf.mState = 2;
    }

    void iobyxmoadg() {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f9336ppxfxbqfkf);
        }
        Bundle bundle = this.f9336ppxfxbqfkf.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f9336ppxfxbqfkf.performActivityCreated(bundle2);
        this.f9335iobyxmoadg.iobyxmoadg(this.f9336ppxfxbqfkf, bundle2, false);
    }

    void jyumaefscl() {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f9336ppxfxbqfkf);
        }
        this.f9336ppxfxbqfkf.performStop();
        this.f9335iobyxmoadg.draadjrbmk(this.f9336ppxfxbqfkf, false);
    }

    void kcexrzcfyt() {
        if (this.f9336ppxfxbqfkf.mView == null) {
            return;
        }
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f9336ppxfxbqfkf + " with view " + this.f9336ppxfxbqfkf.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f9336ppxfxbqfkf.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f9336ppxfxbqfkf.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f9336ppxfxbqfkf.mViewLifecycleOwner.eablkybsjg(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f9336ppxfxbqfkf.mSavedViewRegistryState = bundle;
    }

    void lqeggnwhkg() {
        Fragment fragmentGxszxtbevo;
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f9336ppxfxbqfkf);
        }
        Fragment fragment = this.f9336ppxfxbqfkf;
        boolean zIsChangingConfigurations = true;
        boolean z13 = fragment.mRemoving && !fragment.isInBackStack();
        if (z13) {
            Fragment fragment2 = this.f9336ppxfxbqfkf;
            if (!fragment2.mBeingSaved) {
                this.f9338zoijcleaow.zynmafqrjb(fragment2.mWho, null);
            }
        }
        if (!z13 && !this.f9338zoijcleaow.rgvfuqvkyq().lereixgezr(this.f9336ppxfxbqfkf)) {
            String str = this.f9336ppxfxbqfkf.mTargetWho;
            if (str != null && (fragmentGxszxtbevo = this.f9338zoijcleaow.gxszxtbevo(str)) != null && fragmentGxszxtbevo.mRetainInstance) {
                this.f9336ppxfxbqfkf.mTarget = fragmentGxszxtbevo;
            }
            this.f9336ppxfxbqfkf.mState = 0;
            return;
        }
        iwizpuwonk iwizpuwonkVar = this.f9336ppxfxbqfkf.mHost;
        if (iwizpuwonkVar instanceof ribwqtqdhb) {
            zIsChangingConfigurations = this.f9338zoijcleaow.rgvfuqvkyq().iwizpuwonk();
        } else if (iwizpuwonkVar.gxszxtbevo() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) iwizpuwonkVar.gxszxtbevo()).isChangingConfigurations();
        }
        if ((z13 && !this.f9336ppxfxbqfkf.mBeingSaved) || zIsChangingConfigurations) {
            this.f9338zoijcleaow.rgvfuqvkyq().draadjrbmk(this.f9336ppxfxbqfkf, false);
        }
        this.f9336ppxfxbqfkf.performDestroy();
        this.f9335iobyxmoadg.wkgbmnqykc(this.f9336ppxfxbqfkf, false);
        for (pkzmftpjix pkzmftpjixVar : this.f9338zoijcleaow.gtknphoqwx()) {
            if (pkzmftpjixVar != null) {
                Fragment fragmentGtknphoqwx = pkzmftpjixVar.gtknphoqwx();
                if (this.f9336ppxfxbqfkf.mWho.equals(fragmentGtknphoqwx.mTargetWho)) {
                    fragmentGtknphoqwx.mTarget = this.f9336ppxfxbqfkf;
                    fragmentGtknphoqwx.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f9336ppxfxbqfkf;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f9338zoijcleaow.gxszxtbevo(str2);
        }
        this.f9338zoijcleaow.kcexrzcfyt(this);
    }

    void nufgyqmvbu() {
        View view;
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f9336ppxfxbqfkf);
        }
        Fragment fragment = this.f9336ppxfxbqfkf;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f9336ppxfxbqfkf.performDestroyView();
        this.f9335iobyxmoadg.agtfadlqog(this.f9336ppxfxbqfkf, false);
        Fragment fragment2 = this.f9336ppxfxbqfkf;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.ojitshcjhn(null);
        this.f9336ppxfxbqfkf.mInLayout = false;
    }

    void ojitshcjhn(ClassLoader classLoader) {
        Bundle bundle = this.f9336ppxfxbqfkf.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f9336ppxfxbqfkf.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f9336ppxfxbqfkf.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            Fragment fragment = this.f9336ppxfxbqfkf;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            Fragment fragment2 = this.f9336ppxfxbqfkf;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) this.f9336ppxfxbqfkf.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                Fragment fragment3 = this.f9336ppxfxbqfkf;
                fragment3.mTargetWho = fragmentState.f9159iozdgvuglv;
                fragment3.mTargetRequestCode = fragmentState.f9164lmojexxdyd;
                Boolean bool = fragment3.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment3.mUserVisibleHint = bool.booleanValue();
                    this.f9336ppxfxbqfkf.mSavedUserVisibleHint = null;
                } else {
                    fragment3.mUserVisibleHint = fragmentState.f9166wwaezpbzkn;
                }
            }
            Fragment fragment4 = this.f9336ppxfxbqfkf;
            if (fragment4.mUserVisibleHint) {
                return;
            }
            fragment4.mDeferStart = true;
        } catch (BadParcelableException e13) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + gtknphoqwx(), e13);
        }
    }

    Bundle oxmwwwfdhm() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f9336ppxfxbqfkf;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f9336ppxfxbqfkf));
        if (this.f9336ppxfxbqfkf.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f9336ppxfxbqfkf.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f9335iobyxmoadg.btonecajqb(this.f9336ppxfxbqfkf, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f9336ppxfxbqfkf.mSavedStateRegistryController.eablkybsjg(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleE = this.f9336ppxfxbqfkf.mChildFragmentManager.e();
            if (!bundleE.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleE);
            }
            if (this.f9336ppxfxbqfkf.mView != null) {
                kcexrzcfyt();
            }
            SparseArray<Parcelable> sparseArray = this.f9336ppxfxbqfkf.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f9336ppxfxbqfkf.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f9336ppxfxbqfkf.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void ppxfxbqfkf() {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f9336ppxfxbqfkf);
        }
        Fragment fragment = this.f9336ppxfxbqfkf;
        Fragment fragment2 = fragment.mTarget;
        pkzmftpjix pkzmftpjixVarAgtfadlqog = null;
        if (fragment2 != null) {
            pkzmftpjix pkzmftpjixVarAgtfadlqog2 = this.f9338zoijcleaow.agtfadlqog(fragment2.mWho);
            if (pkzmftpjixVarAgtfadlqog2 == null) {
                throw new IllegalStateException("Fragment " + this.f9336ppxfxbqfkf + " declared target fragment " + this.f9336ppxfxbqfkf.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f9336ppxfxbqfkf;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            pkzmftpjixVarAgtfadlqog = pkzmftpjixVarAgtfadlqog2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (pkzmftpjixVarAgtfadlqog = this.f9338zoijcleaow.agtfadlqog(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f9336ppxfxbqfkf + " declared target fragment " + this.f9336ppxfxbqfkf.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (pkzmftpjixVarAgtfadlqog != null) {
            pkzmftpjixVarAgtfadlqog.wflxmlrfwp();
        }
        Fragment fragment4 = this.f9336ppxfxbqfkf;
        fragment4.mHost = fragment4.mFragmentManager.lxfrhoxuzk();
        Fragment fragment5 = this.f9336ppxfxbqfkf;
        fragment5.mParentFragment = fragment5.mFragmentManager.fiwbwshyhd();
        this.f9335iobyxmoadg.lqeggnwhkg(this.f9336ppxfxbqfkf, false);
        this.f9336ppxfxbqfkf.performAttach();
        this.f9335iobyxmoadg.zoijcleaow(this.f9336ppxfxbqfkf, false);
    }

    void rgvfuqvkyq() {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f9336ppxfxbqfkf);
        }
        View focusedView = this.f9336ppxfxbqfkf.getFocusedView();
        if (focusedView != null && draadjrbmk(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.rhgxfdycjh(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("requestFocus: Restoring focused view ");
                sb3.append(focusedView);
                sb3.append(" ");
                sb3.append(zRequestFocus ? "succeeded" : "failed");
                sb3.append(" on Fragment ");
                sb3.append(this.f9336ppxfxbqfkf);
                sb3.append(" resulting in focused view ");
                sb3.append(this.f9336ppxfxbqfkf.mView.findFocus());
                Log.v("FragmentManager", sb3.toString());
            }
        }
        this.f9336ppxfxbqfkf.setFocusedView(null);
        this.f9336ppxfxbqfkf.performResume();
        this.f9335iobyxmoadg.dxjokdxxww(this.f9336ppxfxbqfkf, false);
        this.f9338zoijcleaow.zynmafqrjb(this.f9336ppxfxbqfkf.mWho, null);
        Fragment fragment = this.f9336ppxfxbqfkf;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    Fragment.SavedState vdvldrhtss() {
        if (this.f9336ppxfxbqfkf.mState > -1) {
            return new Fragment.SavedState(oxmwwwfdhm());
        }
        return null;
    }

    void wflxmlrfwp() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f9337wkgbmnqykc) {
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + gtknphoqwx());
                return;
            }
            return;
        }
        try {
            this.f9337wkgbmnqykc = true;
            boolean z13 = false;
            while (true) {
                int iWkgbmnqykc = wkgbmnqykc();
                Fragment fragment = this.f9336ppxfxbqfkf;
                int i13 = fragment.mState;
                if (iWkgbmnqykc == i13) {
                    if (!z13 && i13 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f9336ppxfxbqfkf.mBeingSaved) {
                        if (FragmentManager.rhgxfdycjh(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f9336ppxfxbqfkf);
                        }
                        this.f9338zoijcleaow.rgvfuqvkyq().draadjrbmk(this.f9336ppxfxbqfkf, true);
                        this.f9338zoijcleaow.kcexrzcfyt(this);
                        if (FragmentManager.rhgxfdycjh(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f9336ppxfxbqfkf);
                        }
                        this.f9336ppxfxbqfkf.initState();
                    }
                    Fragment fragment2 = this.f9336ppxfxbqfkf;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            ntlheqmsrt ntlheqmsrtVarYggfygwlhe = ntlheqmsrt.yggfygwlhe(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f9336ppxfxbqfkf.mHidden) {
                                ntlheqmsrtVarYggfygwlhe.gtknphoqwx(this);
                            } else {
                                ntlheqmsrtVarYggfygwlhe.wflxmlrfwp(this);
                            }
                        }
                        Fragment fragment3 = this.f9336ppxfxbqfkf;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.fmlbqenlif(fragment3);
                        }
                        Fragment fragment4 = this.f9336ppxfxbqfkf;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f9336ppxfxbqfkf.mChildFragmentManager.dsvhmnatus();
                    }
                    return;
                }
                if (iWkgbmnqykc <= i13) {
                    switch (i13 - 1) {
                        case -1:
                            dxjokdxxww();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f9338zoijcleaow.vdvldrhtss(fragment.mWho) == null) {
                                this.f9338zoijcleaow.zynmafqrjb(this.f9336ppxfxbqfkf.mWho, oxmwwwfdhm());
                            }
                            lqeggnwhkg();
                            break;
                        case 1:
                            nufgyqmvbu();
                            this.f9336ppxfxbqfkf.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.rhgxfdycjh(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f9336ppxfxbqfkf);
                            }
                            Fragment fragment5 = this.f9336ppxfxbqfkf;
                            if (fragment5.mBeingSaved) {
                                this.f9338zoijcleaow.zynmafqrjb(fragment5.mWho, oxmwwwfdhm());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                kcexrzcfyt();
                            }
                            Fragment fragment6 = this.f9336ppxfxbqfkf;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                ntlheqmsrt.yggfygwlhe(viewGroup2, fragment6.getParentFragmentManager()).draadjrbmk(this);
                            }
                            this.f9336ppxfxbqfkf.mState = 3;
                            break;
                        case 4:
                            jyumaefscl();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            agtfadlqog();
                            break;
                    }
                } else {
                    switch (i13 + 1) {
                        case 0:
                            ppxfxbqfkf();
                            break;
                        case 1:
                            eablkybsjg();
                            break;
                        case 2:
                            btonecajqb();
                            gxszxtbevo();
                            break;
                        case 3:
                            iobyxmoadg();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                ntlheqmsrt.yggfygwlhe(viewGroup3, fragment.getParentFragmentManager()).btonecajqb(ntlheqmsrt.wkgbmnqykc.zoijcleaow.lqeggnwhkg(this.f9336ppxfxbqfkf.mView.getVisibility()), this);
                            }
                            this.f9336ppxfxbqfkf.mState = 4;
                            break;
                        case 5:
                            yggfygwlhe();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            rgvfuqvkyq();
                            break;
                    }
                }
                z13 = true;
            }
        } finally {
            this.f9337wkgbmnqykc = false;
        }
    }

    int wkgbmnqykc() {
        Fragment fragment = this.f9336ppxfxbqfkf;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f9334eablkybsjg;
        int i13 = zoijcleaow.f9341iobyxmoadg[fragment.mMaxState.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i13 != 3) {
                iMin = i13 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment2 = this.f9336ppxfxbqfkf;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f9334eablkybsjg, 2);
                View view = this.f9336ppxfxbqfkf.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f9334eablkybsjg < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.f9336ppxfxbqfkf;
        if (fragment3.mInDynamicContainer && fragment3.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f9336ppxfxbqfkf.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment4 = this.f9336ppxfxbqfkf;
        ViewGroup viewGroup = fragment4.mContainer;
        ntlheqmsrt.wkgbmnqykc.iobyxmoadg iobyxmoadgVarKcexrzcfyt = viewGroup != null ? ntlheqmsrt.yggfygwlhe(viewGroup, fragment4.getParentFragmentManager()).kcexrzcfyt(this) : null;
        if (iobyxmoadgVarKcexrzcfyt == ntlheqmsrt.wkgbmnqykc.iobyxmoadg.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (iobyxmoadgVarKcexrzcfyt == ntlheqmsrt.wkgbmnqykc.iobyxmoadg.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment5 = this.f9336ppxfxbqfkf;
            if (fragment5.mRemoving) {
                iMin = fragment5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment6 = this.f9336ppxfxbqfkf;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f9336ppxfxbqfkf.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f9336ppxfxbqfkf);
        }
        return iMin;
    }

    void yggfygwlhe() {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f9336ppxfxbqfkf);
        }
        this.f9336ppxfxbqfkf.performStart();
        this.f9335iobyxmoadg.gtknphoqwx(this.f9336ppxfxbqfkf, false);
    }

    void zdlpuopuiu(int i13) {
        this.f9334eablkybsjg = i13;
    }

    void zoijcleaow() {
        Fragment fragmentIyctptxqzt = FragmentManager.iyctptxqzt(this.f9336ppxfxbqfkf.mContainer);
        Fragment parentFragment = this.f9336ppxfxbqfkf.getParentFragment();
        if (fragmentIyctptxqzt != null && !fragmentIyctptxqzt.equals(parentFragment)) {
            Fragment fragment = this.f9336ppxfxbqfkf;
            l2.zoijcleaow.ojitshcjhn(fragment, fragmentIyctptxqzt, fragment.mContainerId);
        }
        int iBtonecajqb = this.f9338zoijcleaow.btonecajqb(this.f9336ppxfxbqfkf);
        Fragment fragment2 = this.f9336ppxfxbqfkf;
        fragment2.mContainer.addView(fragment2.mView, iBtonecajqb);
    }

    pkzmftpjix(esjtqupxsv esjtqupxsvVar, hcddaimhww hcddaimhwwVar, ClassLoader classLoader, jyumaefscl jyumaefsclVar, Bundle bundle) {
        this.f9335iobyxmoadg = esjtqupxsvVar;
        this.f9338zoijcleaow = hcddaimhwwVar;
        Fragment fragmentZoijcleaow = ((FragmentState) bundle.getParcelable("state")).zoijcleaow(jyumaefsclVar, classLoader);
        this.f9336ppxfxbqfkf = fragmentZoijcleaow;
        fragmentZoijcleaow.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentZoijcleaow.setArguments(bundle2);
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentZoijcleaow);
        }
    }

    pkzmftpjix(esjtqupxsv esjtqupxsvVar, hcddaimhww hcddaimhwwVar, Fragment fragment, Bundle bundle) {
        this.f9335iobyxmoadg = esjtqupxsvVar;
        this.f9338zoijcleaow = hcddaimhwwVar;
        this.f9336ppxfxbqfkf = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
