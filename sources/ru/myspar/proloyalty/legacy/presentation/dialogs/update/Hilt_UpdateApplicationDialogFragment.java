package ru.myspar.proloyalty.legacy.presentation.dialogs.update;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.proloyalty.core.base.mvvm.BaseMvvmBottomSheetDialogFragment;
import sw0.eablkybsjg;
import xf.gxszxtbevo;
import zf.ppxfxbqfkf;
import zf.wkgbmnqykc;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Hilt_UpdateApplicationDialogFragment<VM extends eablkybsjg> extends BaseMvvmBottomSheetDialogFragment<VM> implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Object f96546cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private volatile gxszxtbevo f96547istkbnxepw;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ContextWrapper f96548pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f96549yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f96550zynmafqrjb;

    Hilt_UpdateApplicationDialogFragment(int i13) {
        super(i13);
        this.f96546cdpycssgdh = new Object();
        this.f96549yadqdtsiqt = false;
    }

    private void ribwqtqdhb() {
        if (this.f96548pmvmpeiblj == null) {
            this.f96548pmvmpeiblj = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f96550zynmafqrjb = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f96547istkbnxepw == null) {
            synchronized (this.f96546cdpycssgdh) {
                try {
                    if (this.f96547istkbnxepw == null) {
                        this.f96547istkbnxepw = jlmebxxoox();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f96547istkbnxepw;
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f96550zynmafqrjb) {
            return null;
        }
        ribwqtqdhb();
        return this.f96548pmvmpeiblj;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f96549yadqdtsiqt) {
            return;
        }
        this.f96549yadqdtsiqt = true;
        ((i91.eablkybsjg) ojitshcjhn()).ylkuphrtab((UpdateApplicationDialogFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    protected gxszxtbevo jlmebxxoox() {
        return new gxszxtbevo(this);
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ribwqtqdhb();
        inject();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f96548pmvmpeiblj;
        wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        ribwqtqdhb();
        inject();
    }
}
