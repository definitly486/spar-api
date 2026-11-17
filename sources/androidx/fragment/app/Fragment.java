package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jhduphickx;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import androidx.lifecycle.vipkmwdibw;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.vdvldrhtss, ribwqtqdhb, androidx.lifecycle.dxjokdxxww, q5.dxjokdxxww {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    gtknphoqwx mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    crxdokpmqz.ppxfxbqfkf mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    iwizpuwonk mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.kcexrzcfyt mLifecycleRegistry;
    androidx.lifecycle.gtknphoqwx.zoijcleaow mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<draadjrbmk> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final draadjrbmk mSavedStateAttachListener;
    q5.nufgyqmvbu mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    wypolnanlu mViewLifecycleOwner;
    androidx.lifecycle.pmvmpeiblj mViewLifecycleOwnerLiveData;
    String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    class btonecajqb extends draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ojitshcjhn.iobyxmoadg f9030iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo.iobyxmoadg f9031ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ eablkybsjg.iobyxmoadg f9032wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ AtomicReference f9033zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(ojitshcjhn.iobyxmoadg iobyxmoadgVar, AtomicReference atomicReference, gxszxtbevo.iobyxmoadg iobyxmoadgVar2, eablkybsjg.iobyxmoadg iobyxmoadgVar3) {
            super(null);
            this.f9030iobyxmoadg = iobyxmoadgVar;
            this.f9033zoijcleaow = atomicReference;
            this.f9031ppxfxbqfkf = iobyxmoadgVar2;
            this.f9032wkgbmnqykc = iobyxmoadgVar3;
        }

        @Override // androidx.fragment.app.Fragment.draadjrbmk
        void iobyxmoadg() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f9033zoijcleaow.set(((eablkybsjg.ppxfxbqfkf) this.f9030iobyxmoadg.apply(null)).dxjokdxxww(strGenerateActivityResultKey, Fragment.this, this.f9031ppxfxbqfkf, this.f9032wkgbmnqykc));
        }
    }

    private static abstract class draadjrbmk {
        private draadjrbmk() {
        }

        abstract void iobyxmoadg();

        /* synthetic */ draadjrbmk(zoijcleaow zoijcleaowVar) {
            this();
        }
    }

    class dxjokdxxww implements ojitshcjhn.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ eablkybsjg.ppxfxbqfkf f9034iobyxmoadg;

        dxjokdxxww(eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f9034iobyxmoadg = ppxfxbqfkfVar;
        }

        @Override // ojitshcjhn.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public eablkybsjg.ppxfxbqfkf apply(Void r13) {
            return this.f9034iobyxmoadg;
        }
    }

    class eablkybsjg implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ntlheqmsrt f9037zdlpuopuiu;

        eablkybsjg(ntlheqmsrt ntlheqmsrtVar) {
            this.f9037zdlpuopuiu = ntlheqmsrtVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9037zdlpuopuiu.esjtqupxsv()) {
                this.f9037zdlpuopuiu.agtfadlqog();
            }
        }
    }

    static class gtknphoqwx {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        Object f9038agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        Object f9039btonecajqb = null;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        Object f9040draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        ArrayList f9041dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f9042eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        Object f9043gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        int f9044gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        View f9045iobyxmoadg;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        View f9046kcexrzcfyt;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        int f9047lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        ArrayList f9048nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        Object f9049ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        float f9050oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f9051ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        Boolean f9052rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        Boolean f9053vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        Object f9054wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f9055wkgbmnqykc;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        boolean f9056zdlpuopuiu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        boolean f9057zoijcleaow;

        gtknphoqwx() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f9043gtknphoqwx = obj;
            this.f9040draadjrbmk = null;
            this.f9054wflxmlrfwp = obj;
            this.f9038agtfadlqog = null;
            this.f9049ojitshcjhn = obj;
            this.f9050oxmwwwfdhm = 1.0f;
            this.f9046kcexrzcfyt = null;
        }
    }

    class gxszxtbevo extends zdlpuopuiu {
        gxszxtbevo() {
        }

        @Override // androidx.fragment.app.zdlpuopuiu
        public View ppxfxbqfkf(int i13) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i13);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.zdlpuopuiu
        public boolean wkgbmnqykc() {
            return Fragment.this.mView != null;
        }
    }

    class iobyxmoadg extends eablkybsjg.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ AtomicReference f9059iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo.iobyxmoadg f9061zoijcleaow;

        iobyxmoadg(AtomicReference atomicReference, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
            this.f9059iobyxmoadg = atomicReference;
            this.f9061zoijcleaow = iobyxmoadgVar;
        }

        @Override // eablkybsjg.zoijcleaow
        public void ppxfxbqfkf() {
            eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) this.f9059iobyxmoadg.getAndSet(null);
            if (zoijcleaowVar != null) {
                zoijcleaowVar.ppxfxbqfkf();
            }
        }

        @Override // eablkybsjg.zoijcleaow
        public void zoijcleaow(Object obj, androidx.core.app.ppxfxbqfkf ppxfxbqfkfVar) {
            eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) this.f9059iobyxmoadg.get();
            if (zoijcleaowVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            zoijcleaowVar.zoijcleaow(obj, ppxfxbqfkfVar);
        }
    }

    class lqeggnwhkg implements androidx.lifecycle.agtfadlqog {
        lqeggnwhkg() {
        }

        @Override // androidx.lifecycle.agtfadlqog
        public void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
            View view;
            if (iobyxmoadgVar != androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_STOP || (view = Fragment.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    class nufgyqmvbu implements ojitshcjhn.iobyxmoadg {
        nufgyqmvbu() {
        }

        @Override // ojitshcjhn.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public eablkybsjg.ppxfxbqfkf apply(Void r13) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof eablkybsjg.wkgbmnqykc ? ((eablkybsjg.wkgbmnqykc) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    class ppxfxbqfkf extends draadjrbmk {
        ppxfxbqfkf() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.draadjrbmk
        void iobyxmoadg() {
            Fragment.this.mSavedStateRegistryController.ppxfxbqfkf();
            androidx.lifecycle.hkdspvbjdz.ppxfxbqfkf(Fragment.this);
            Bundle bundle = Fragment.this.mSavedFragmentState;
            Fragment.this.mSavedStateRegistryController.wkgbmnqykc(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    class wkgbmnqykc implements Runnable {
        wkgbmnqykc() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new iozdgvuglv();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new zoijcleaow();
        this.mMaxState = androidx.lifecycle.gtknphoqwx.zoijcleaow.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.pmvmpeiblj();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new ppxfxbqfkf();
        esjtqupxsv();
    }

    private Fragment cqumvgiudr(boolean z13) {
        String str;
        if (z13) {
            l2.zoijcleaow.btonecajqb(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.ydmasvzmpa(str);
    }

    private void esjtqupxsv() {
        this.mLifecycleRegistry = new androidx.lifecycle.kcexrzcfyt(this);
        this.mSavedStateRegistryController = q5.nufgyqmvbu.iobyxmoadg(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        zynmafqrjb(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private void istkbnxepw() {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    private int iwizpuwonk() {
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.mMaxState;
        return (zoijcleaowVar == androidx.lifecycle.gtknphoqwx.zoijcleaow.INITIALIZED || this.mParentFragment == null) ? zoijcleaowVar.ordinal() : Math.min(zoijcleaowVar.ordinal(), this.mParentFragment.iwizpuwonk());
    }

    private gtknphoqwx jyumaefscl() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new gtknphoqwx();
        }
        return this.mAnimationInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lereixgezr() {
        this.mViewLifecycleOwner.wkgbmnqykc(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private eablkybsjg.zoijcleaow pmvmpeiblj(gxszxtbevo.iobyxmoadg iobyxmoadgVar, ojitshcjhn.iobyxmoadg iobyxmoadgVar2, eablkybsjg.iobyxmoadg iobyxmoadgVar3) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            zynmafqrjb(new btonecajqb(iobyxmoadgVar2, atomicReference, iobyxmoadgVar, iobyxmoadgVar3));
            return new iobyxmoadg(atomicReference, iobyxmoadgVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void zynmafqrjb(draadjrbmk draadjrbmkVar) {
        if (this.mState >= 0) {
            draadjrbmkVar.iobyxmoadg();
        } else {
            this.mOnPreAttachedListeners.add(draadjrbmkVar);
        }
    }

    void callStartTransitionListener(boolean z13) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar != null) {
            gtknphoqwxVar.f9056zdlpuopuiu = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        ntlheqmsrt ntlheqmsrtVarYggfygwlhe = ntlheqmsrt.yggfygwlhe(viewGroup, fragmentManager);
        ntlheqmsrtVarYggfygwlhe.lereixgezr();
        if (z13) {
            this.mHost.nufgyqmvbu().post(new eablkybsjg(ntlheqmsrtVarYggfygwlhe));
        } else {
            ntlheqmsrtVarYggfygwlhe.agtfadlqog();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    zdlpuopuiu createFragmentContainer() {
        return new gxszxtbevo();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment fragmentCqumvgiudr = cqumvgiudr(false);
        if (fragmentCqumvgiudr != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentCqumvgiudr);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.iobyxmoadg.zoijcleaow(this).iobyxmoadg(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.mChildFragmentManager.ikoacuggdj(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.bfopjjpdmp(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final oxmwwwfdhm getActivity() {
        iwizpuwonk iwizpuwonkVar = this.mHost;
        if (iwizpuwonkVar == null) {
            return null;
        }
        return (oxmwwwfdhm) iwizpuwonkVar.eablkybsjg();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null || (bool = gtknphoqwxVar.f9053vdvldrhtss) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null || (bool = gtknphoqwxVar.f9052rgvfuqvkyq) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return null;
        }
        return gtknphoqwxVar.f9045iobyxmoadg;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        iwizpuwonk iwizpuwonkVar = this.mHost;
        if (iwizpuwonkVar == null) {
            return null;
        }
        return iwizpuwonkVar.gxszxtbevo();
    }

    @Override // androidx.lifecycle.dxjokdxxww
    public t2.iobyxmoadg getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        t2.wkgbmnqykc wkgbmnqykcVar = new t2.wkgbmnqykc();
        if (application != null) {
            wkgbmnqykcVar.ppxfxbqfkf(crxdokpmqz.iobyxmoadg.f9449nufgyqmvbu, application);
        }
        wkgbmnqykcVar.ppxfxbqfkf(androidx.lifecycle.hkdspvbjdz.f9476iobyxmoadg, this);
        wkgbmnqykcVar.ppxfxbqfkf(androidx.lifecycle.hkdspvbjdz.f9478zoijcleaow, this);
        if (getArguments() != null) {
            wkgbmnqykcVar.ppxfxbqfkf(androidx.lifecycle.hkdspvbjdz.f9477ppxfxbqfkf, getArguments());
        }
        return wkgbmnqykcVar;
    }

    @Override // androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.rhgxfdycjh(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.stevsuqkhv(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return 0;
        }
        return gtknphoqwxVar.f9051ppxfxbqfkf;
    }

    public Object getEnterTransition() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return null;
        }
        return gtknphoqwxVar.f9039btonecajqb;
    }

    androidx.core.app.yggfygwlhe getEnterTransitionCallback() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return null;
        }
        gtknphoqwxVar.getClass();
        return null;
    }

    int getExitAnim() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return 0;
        }
        return gtknphoqwxVar.f9055wkgbmnqykc;
    }

    public Object getExitTransition() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return null;
        }
        return gtknphoqwxVar.f9040draadjrbmk;
    }

    androidx.core.app.yggfygwlhe getExitTransitionCallback() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return null;
        }
        gtknphoqwxVar.getClass();
        return null;
    }

    View getFocusedView() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return null;
        }
        return gtknphoqwxVar.f9046kcexrzcfyt;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        iwizpuwonk iwizpuwonkVar = this.mHost;
        if (iwizpuwonkVar == null) {
            return null;
        }
        return iwizpuwonkVar.btonecajqb();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.vdvldrhtss
    public androidx.lifecycle.gtknphoqwx getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.iobyxmoadg getLoaderManager() {
        return androidx.loader.app.iobyxmoadg.zoijcleaow(this);
    }

    int getNextTransition() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return 0;
        }
        return gtknphoqwxVar.f9047lqeggnwhkg;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return false;
        }
        return gtknphoqwxVar.f9057zoijcleaow;
    }

    int getPopEnterAnim() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return 0;
        }
        return gtknphoqwxVar.f9042eablkybsjg;
    }

    int getPopExitAnim() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return 0;
        }
        return gtknphoqwxVar.f9044gxszxtbevo;
    }

    float getPostOnViewCreatedAlpha() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return 1.0f;
        }
        return gtknphoqwxVar.f9050oxmwwwfdhm;
    }

    public Object getReenterTransition() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return null;
        }
        Object obj = gtknphoqwxVar.f9054wflxmlrfwp;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        l2.zoijcleaow.nufgyqmvbu(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return null;
        }
        Object obj = gtknphoqwxVar.f9043gtknphoqwx;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // q5.dxjokdxxww
    public final q5.gxszxtbevo getSavedStateRegistry() {
        return this.mSavedStateRegistryController.zoijcleaow();
    }

    public Object getSharedElementEnterTransition() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return null;
        }
        return gtknphoqwxVar.f9038agtfadlqog;
    }

    public Object getSharedElementReturnTransition() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return null;
        }
        Object obj = gtknphoqwxVar.f9049ojitshcjhn;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        return (gtknphoqwxVar == null || (arrayList = gtknphoqwxVar.f9048nufgyqmvbu) == null) ? new ArrayList<>() : arrayList;
    }

    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        return (gtknphoqwxVar == null || (arrayList = gtknphoqwxVar.f9041dxjokdxxww) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i13) {
        return getResources().getString(i13);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return cqumvgiudr(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        l2.zoijcleaow.dxjokdxxww(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i13) {
        return getResources().getText(i13);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.vdvldrhtss getViewLifecycleOwner() {
        wypolnanlu wypolnanluVar = this.mViewLifecycleOwner;
        if (wypolnanluVar != null) {
            return wypolnanluVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public androidx.lifecycle.cqumvgiudr getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.ribwqtqdhb
    public jlmebxxoox getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (iwizpuwonk() != androidx.lifecycle.gtknphoqwx.zoijcleaow.INITIALIZED.ordinal()) {
            return this.mFragmentManager.mhtqkkgtqm(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        esjtqupxsv();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new iozdgvuglv();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        return this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.krqnebusok(this.mParentFragment));
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.a(this.mParentFragment));
    }

    boolean isPostponed() {
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        if (gtknphoqwxVar == null) {
            return false;
        }
        return gtknphoqwxVar.f9056zdlpuopuiu;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.d();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.o();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i13, int i14, Intent intent) {
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i13 + " resultCode: " + i14 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        iwizpuwonk iwizpuwonkVar = this.mHost;
        Activity activityEablkybsjg = iwizpuwonkVar == null ? null : iwizpuwonkVar.eablkybsjg();
        if (activityEablkybsjg != null) {
            this.mCalled = false;
            onAttach(activityEablkybsjg);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.c(1)) {
            return;
        }
        this.mChildFragmentManager.wwaezpbzkn();
    }

    public Animation onCreateAnimation(int i13, boolean z13, int i14) {
        return null;
    }

    public Animator onCreateAnimator(int i13, boolean z13, int i14) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i13 = this.mContentLayoutId;
        if (i13 != 0) {
            return layoutInflater.inflate(i13, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z13) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        iwizpuwonk iwizpuwonkVar = this.mHost;
        Activity activityEablkybsjg = iwizpuwonkVar == null ? null : iwizpuwonkVar.eablkybsjg();
        if (activityEablkybsjg != null) {
            this.mCalled = false;
            onInflate(activityEablkybsjg, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z13) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z13) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z13) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i13, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.o();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            istkbnxepw();
            this.mChildFragmentManager.cdpycssgdh();
        } else {
            throw new sopmlzcsov("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        Iterator<draadjrbmk> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().iobyxmoadg();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.vdvldrhtss(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.gxszxtbevo());
        if (this.mCalled) {
            this.mFragmentManager.cllcsxoeiz(this);
            this.mChildFragmentManager.yadqdtsiqt();
        } else {
            throw new sopmlzcsov("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.lmojexxdyd(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.o();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.iobyxmoadg(new lqeggnwhkg());
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_CREATE);
            return;
        }
        throw new sopmlzcsov("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z13 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z13 = true;
        }
        return z13 | this.mChildFragmentManager.ylkuphrtab(menu, menuInflater);
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.o();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new wypolnanlu(this, getViewModelStore(), new Runnable() { // from class: androidx.fragment.app.wflxmlrfwp
            @Override // java.lang.Runnable
            public final void run() {
                this.f9360zdlpuopuiu.lereixgezr();
            }
        });
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.ppxfxbqfkf()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.zoijcleaow();
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        vipkmwdibw.zoijcleaow(this.mView, this.mViewLifecycleOwner);
        jhduphickx.zoijcleaow(this.mView, this.mViewLifecycleOwner);
        q5.wflxmlrfwp.zoijcleaow(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.ojitshcjhn(this.mViewLifecycleOwner);
    }

    void performDestroy() {
        this.mChildFragmentManager.pkzmftpjix();
        this.mLifecycleRegistry.dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new sopmlzcsov("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.hcddaimhww();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.CREATED)) {
            this.mViewLifecycleOwner.iobyxmoadg(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.iobyxmoadg.zoijcleaow(this).wkgbmnqykc();
            this.mPerformedCreateView = false;
        } else {
            throw new sopmlzcsov("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.ezmngbhpjk()) {
                return;
            }
            this.mChildFragmentManager.pkzmftpjix();
            this.mChildFragmentManager = new iozdgvuglv();
            return;
        }
        throw new sopmlzcsov("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z13) {
        onMultiWindowModeChanged(z13);
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.wypolnanlu(menuItem);
    }

    void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.stevsuqkhv(menu);
    }

    void performPause() {
        this.mChildFragmentManager.tzroggbefp();
        if (this.mView != null) {
            this.mViewLifecycleOwner.iobyxmoadg(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_PAUSE);
        }
        this.mLifecycleRegistry.dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new sopmlzcsov("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z13) {
        onPictureInPictureModeChanged(z13);
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z13 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z13 = true;
        }
        return z13 | this.mChildFragmentManager.ntlheqmsrt(menu);
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zB = this.mFragmentManager.b(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zB) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zB);
            onPrimaryNavigationFragmentChanged(zB);
            this.mChildFragmentManager.ulzqkzuiru();
        }
    }

    void performResume() {
        this.mChildFragmentManager.o();
        this.mChildFragmentManager.metgxyhuhe(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new sopmlzcsov("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.kcexrzcfyt kcexrzcfytVar = this.mLifecycleRegistry;
        androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar = androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_RESUME;
        kcexrzcfytVar.dxjokdxxww(iobyxmoadgVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.iobyxmoadg(iobyxmoadgVar);
        }
        this.mChildFragmentManager.sopmlzcsov();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    void performStart() {
        this.mChildFragmentManager.o();
        this.mChildFragmentManager.metgxyhuhe(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new sopmlzcsov("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.kcexrzcfyt kcexrzcfytVar = this.mLifecycleRegistry;
        androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar = androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_START;
        kcexrzcfytVar.dxjokdxxww(iobyxmoadgVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.iobyxmoadg(iobyxmoadgVar);
        }
        this.mChildFragmentManager.crxdokpmqz();
    }

    void performStop() {
        this.mChildFragmentManager.ribwqtqdhb();
        if (this.mView != null) {
            this.mViewLifecycleOwner.iobyxmoadg(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_STOP);
        }
        this.mLifecycleRegistry.dxjokdxxww(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new sopmlzcsov("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.vipkmwdibw();
    }

    public void postponeEnterTransition() {
        jyumaefscl().f9056zdlpuopuiu = true;
    }

    public final <I, O> eablkybsjg.zoijcleaow registerForActivityResult(gxszxtbevo.iobyxmoadg iobyxmoadgVar, eablkybsjg.iobyxmoadg iobyxmoadgVar2) {
        return pmvmpeiblj(iobyxmoadgVar, new nufgyqmvbu(), iobyxmoadgVar2);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i13) {
        if (this.mHost != null) {
            getParentFragmentManager().k(this, strArr, i13);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final oxmwwwfdhm requireActivity() {
        oxmwwwfdhm activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.I(bundle);
        this.mChildFragmentManager.wwaezpbzkn();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.iobyxmoadg(androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_CREATE);
            }
        } else {
            throw new sopmlzcsov("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z13) {
        jyumaefscl().f9053vdvldrhtss = Boolean.valueOf(z13);
    }

    public void setAllowReturnTransitionOverlap(boolean z13) {
        jyumaefscl().f9052rgvfuqvkyq = Boolean.valueOf(z13);
    }

    void setAnimations(int i13, int i14, int i15, int i16) {
        if (this.mAnimationInfo == null && i13 == 0 && i14 == 0 && i15 == 0 && i16 == 0) {
            return;
        }
        jyumaefscl().f9051ppxfxbqfkf = i13;
        jyumaefscl().f9055wkgbmnqykc = i14;
        jyumaefscl().f9042eablkybsjg = i15;
        jyumaefscl().f9044gxszxtbevo = i16;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(androidx.core.app.yggfygwlhe yggfygwlheVar) {
        jyumaefscl().getClass();
    }

    public void setEnterTransition(Object obj) {
        jyumaefscl().f9039btonecajqb = obj;
    }

    public void setExitSharedElementCallback(androidx.core.app.yggfygwlhe yggfygwlheVar) {
        jyumaefscl().getClass();
    }

    public void setExitTransition(Object obj) {
        jyumaefscl().f9040draadjrbmk = obj;
    }

    void setFocusedView(View view) {
        jyumaefscl().f9046kcexrzcfyt = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z13) {
        if (this.mHasMenu != z13) {
            this.mHasMenu = z13;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.rgvfuqvkyq();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f9028zdlpuopuiu) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z13) {
        if (this.mMenuVisible != z13) {
            this.mMenuVisible = z13;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.rgvfuqvkyq();
            }
        }
    }

    void setNextTransition(int i13) {
        if (this.mAnimationInfo == null && i13 == 0) {
            return;
        }
        jyumaefscl();
        this.mAnimationInfo.f9047lqeggnwhkg = i13;
    }

    void setPopDirection(boolean z13) {
        if (this.mAnimationInfo == null) {
            return;
        }
        jyumaefscl().f9057zoijcleaow = z13;
    }

    void setPostOnViewCreatedAlpha(float f13) {
        jyumaefscl().f9050oxmwwwfdhm = f13;
    }

    public void setReenterTransition(Object obj) {
        jyumaefscl().f9054wflxmlrfwp = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z13) {
        l2.zoijcleaow.gtknphoqwx(this);
        this.mRetainInstance = z13;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z13) {
            fragmentManager.ojitshcjhn(this);
        } else {
            fragmentManager.E(this);
        }
    }

    public void setReturnTransition(Object obj) {
        jyumaefscl().f9043gtknphoqwx = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        jyumaefscl().f9038agtfadlqog = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        jyumaefscl();
        gtknphoqwx gtknphoqwxVar = this.mAnimationInfo;
        gtknphoqwxVar.f9048nufgyqmvbu = arrayList;
        gtknphoqwxVar.f9041dxjokdxxww = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        jyumaefscl().f9049ojitshcjhn = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i13) {
        if (fragment != null) {
            l2.zoijcleaow.draadjrbmk(this, fragment, i13);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragmentCqumvgiudr = fragment; fragmentCqumvgiudr != null; fragmentCqumvgiudr = fragmentCqumvgiudr.cqumvgiudr(false)) {
            if (fragmentCqumvgiudr.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i13;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z13) {
        l2.zoijcleaow.wflxmlrfwp(this, z13);
        if (!this.mUserVisibleHint && z13 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.q(fragmentManager.zynmafqrjb(this));
        }
        this.mUserVisibleHint = z13;
        this.mDeferStart = this.mState < 5 && !z13;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z13);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        iwizpuwonk iwizpuwonkVar = this.mHost;
        if (iwizpuwonkVar != null) {
            return iwizpuwonkVar.wflxmlrfwp(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i13) {
        startActivityForResult(intent, i13, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i13, Intent intent, int i14, int i15, int i16, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i13 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().m(this, intentSender, i13, intent, i14, i15, i16, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !jyumaefscl().f9056zdlpuopuiu) {
            return;
        }
        if (this.mHost == null) {
            jyumaefscl().f9056zdlpuopuiu = false;
        } else if (Looper.myLooper() != this.mHost.nufgyqmvbu().getLooper()) {
            this.mHost.nufgyqmvbu().postAtFrontOfQueue(new wkgbmnqykc());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb3.append(getClass().getSimpleName());
        sb3.append("{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("}");
        sb3.append(" (");
        sb3.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb3.append(" id=0x");
            sb3.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb3.append(" tag=");
            sb3.append(this.mTag);
        }
        sb3.append(")");
        return sb3.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Bundle f9028zdlpuopuiu;

        class iobyxmoadg implements Parcelable.ClassLoaderCreator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        SavedState(Bundle bundle) {
            this.f9028zdlpuopuiu = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            parcel.writeBundle(this.f9028zdlpuopuiu);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f9028zdlpuopuiu = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) jyumaefscl.wkgbmnqykc(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e13) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e13);
        } catch (java.lang.InstantiationException e14) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e14);
        } catch (NoSuchMethodException e15) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e15);
        } catch (InvocationTargetException e16) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e16);
        }
    }

    public final String getString(int i13, Object... objArr) {
        return getResources().getString(i13, objArr);
    }

    public final void postponeEnterTransition(long j13, TimeUnit timeUnit) {
        jyumaefscl().f9056zdlpuopuiu = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.lxfrhoxuzk().nufgyqmvbu();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j13));
    }

    public final <I, O> eablkybsjg.zoijcleaow registerForActivityResult(gxszxtbevo.iobyxmoadg iobyxmoadgVar, eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, eablkybsjg.iobyxmoadg iobyxmoadgVar2) {
        return pmvmpeiblj(iobyxmoadgVar, new dxjokdxxww(ppxfxbqfkfVar), iobyxmoadgVar2);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        iwizpuwonk iwizpuwonkVar = this.mHost;
        if (iwizpuwonkVar != null) {
            iwizpuwonkVar.agtfadlqog(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i13, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().l(this, intent, i13, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        iwizpuwonk iwizpuwonkVar = this.mHost;
        if (iwizpuwonkVar != null) {
            LayoutInflater layoutInflaterGtknphoqwx = iwizpuwonkVar.gtknphoqwx();
            v1.jyumaefscl.iobyxmoadg(layoutInflaterGtknphoqwx, this.mChildFragmentManager.wizcaqwiak());
            return layoutInflaterGtknphoqwx;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i13) {
        this();
        this.mContentLayoutId = i13;
    }
}
