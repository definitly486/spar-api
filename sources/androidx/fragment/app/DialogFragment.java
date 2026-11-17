package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.jhduphickx;
import androidx.lifecycle.vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private androidx.lifecycle.zynmafqrjb mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    class eablkybsjg extends zdlpuopuiu {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ zdlpuopuiu f9023zdlpuopuiu;

        eablkybsjg(zdlpuopuiu zdlpuopuiuVar) {
            this.f9023zdlpuopuiu = zdlpuopuiuVar;
        }

        @Override // androidx.fragment.app.zdlpuopuiu
        public View ppxfxbqfkf(int i13) {
            return this.f9023zdlpuopuiu.wkgbmnqykc() ? this.f9023zdlpuopuiu.ppxfxbqfkf(i13) : DialogFragment.this.onFindViewById(i13);
        }

        @Override // androidx.fragment.app.zdlpuopuiu
        public boolean wkgbmnqykc() {
            return this.f9023zdlpuopuiu.wkgbmnqykc() || DialogFragment.this.onHasView();
        }
    }

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogFragment.this.mOnDismissListener.onDismiss(DialogFragment.this.mDialog);
        }
    }

    class ppxfxbqfkf implements DialogInterface.OnDismissListener {
        ppxfxbqfkf() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogFragment.this.mDialog != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onDismiss(dialogFragment.mDialog);
            }
        }
    }

    class wkgbmnqykc implements androidx.lifecycle.zynmafqrjb {
        wkgbmnqykc() {
        }

        @Override // androidx.lifecycle.zynmafqrjb
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(androidx.lifecycle.vdvldrhtss vdvldrhtssVar) {
            if (vdvldrhtssVar == null || !DialogFragment.this.mShowsDialog) {
                return;
            }
            View viewRequireView = DialogFragment.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogFragment.this.mDialog != null) {
                if (FragmentManager.rhgxfdycjh(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogFragment.this.mDialog);
                }
                DialogFragment.this.mDialog.setContentView(viewRequireView);
            }
        }
    }

    class zoijcleaow implements DialogInterface.OnCancelListener {
        zoijcleaow() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogFragment.this.mDialog != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onCancel(dialogFragment.mDialog);
            }
        }
    }

    public DialogFragment() {
        this.mDismissRunnable = new iobyxmoadg();
        this.mOnCancelListener = new zoijcleaow();
        this.mOnDismissListener = new ppxfxbqfkf();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new wkgbmnqykc();
        this.mDialogCreated = false;
    }

    private void cdpycssgdh(boolean z13, boolean z14, boolean z15) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z14) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z15) {
                getParentFragmentManager().w(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().t(this.mBackStackId, 1, z13);
            }
            this.mBackStackId = -1;
            return;
        }
        jpowsppfya jpowsppfyaVarKcexrzcfyt = getParentFragmentManager().kcexrzcfyt();
        jpowsppfyaVarKcexrzcfyt.iwizpuwonk(true);
        jpowsppfyaVarKcexrzcfyt.rgvfuqvkyq(this);
        if (z15) {
            jpowsppfyaVarKcexrzcfyt.gtknphoqwx();
        } else if (z13) {
            jpowsppfyaVarKcexrzcfyt.btonecajqb();
        } else {
            jpowsppfyaVarKcexrzcfyt.dxjokdxxww();
        }
    }

    private void yadqdtsiqt(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    zdlpuopuiu createFragmentContainer() {
        return new eablkybsjg(super.createFragmentContainer());
    }

    public void dismiss() {
        cdpycssgdh(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        cdpycssgdh(true, false, false);
    }

    public void dismissNow() {
        cdpycssgdh(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().btonecajqb(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.draadjrbmk(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().agtfadlqog(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.rhgxfdycjh(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        cdpycssgdh(true, true, false);
    }

    View onFindViewById(int i13) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i13);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            yadqdtsiqt(bundle);
            if (FragmentManager.rhgxfdycjh(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
        }
        if (FragmentManager.rhgxfdycjh(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.mShowsDialog) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i13 = this.mStyle;
        if (i13 != 0) {
            bundle.putInt(SAVED_STYLE, i13);
        }
        int i14 = this.mTheme;
        if (i14 != 0) {
            bundle.putInt(SAVED_THEME, i14);
        }
        boolean z13 = this.mCancelable;
        if (!z13) {
            bundle.putBoolean(SAVED_CANCELABLE, z13);
        }
        boolean z14 = this.mShowsDialog;
        if (!z14) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z14);
        }
        int i15 = this.mBackStackId;
        if (i15 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i15);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            vipkmwdibw.zoijcleaow(decorView, this);
            jhduphickx.zoijcleaow(decorView, this);
            q5.wflxmlrfwp.zoijcleaow(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final androidx.activity.draadjrbmk requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof androidx.activity.draadjrbmk) {
            return (androidx.activity.draadjrbmk) dialogRequireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + dialogRequireDialog);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z13) {
        this.mCancelable = z13;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z13);
        }
    }

    public void setShowsDialog(boolean z13) {
        this.mShowsDialog = z13;
    }

    public void setStyle(int i13, int i14) {
        if (FragmentManager.rhgxfdycjh(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i13 + ", " + i14);
        }
        this.mStyle = i13;
        if (i13 == 2 || i13 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i14 != 0) {
            this.mTheme = i14;
        }
    }

    public void setupDialog(Dialog dialog, int i13) {
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        jpowsppfya jpowsppfyaVarKcexrzcfyt = fragmentManager.kcexrzcfyt();
        jpowsppfyaVarKcexrzcfyt.iwizpuwonk(true);
        jpowsppfyaVarKcexrzcfyt.eablkybsjg(this, str);
        jpowsppfyaVarKcexrzcfyt.dxjokdxxww();
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        jpowsppfya jpowsppfyaVarKcexrzcfyt = fragmentManager.kcexrzcfyt();
        jpowsppfyaVarKcexrzcfyt.iwizpuwonk(true);
        jpowsppfyaVarKcexrzcfyt.eablkybsjg(this, str);
        jpowsppfyaVarKcexrzcfyt.gtknphoqwx();
    }

    public int show(jpowsppfya jpowsppfyaVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        jpowsppfyaVar.eablkybsjg(this, str);
        this.mViewDestroyed = false;
        int iDxjokdxxww = jpowsppfyaVar.dxjokdxxww();
        this.mBackStackId = iDxjokdxxww;
        return iDxjokdxxww;
    }

    public DialogFragment(int i13) {
        super(i13);
        this.mDismissRunnable = new iobyxmoadg();
        this.mOnCancelListener = new zoijcleaow();
        this.mOnDismissListener = new ppxfxbqfkf();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new wkgbmnqykc();
        this.mDialogCreated = false;
    }
}
