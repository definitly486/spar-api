package ru.myspar.legacy.presentation.dialogs.update;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.core.base.mvvm.BaseMvvmBottomSheetDialogFragment;
import vx.eablkybsjg;
import xf.gxszxtbevo;
import zf.ppxfxbqfkf;
import zf.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hilt_UpdateApplicationDialogFragment<VM extends eablkybsjg> extends BaseMvvmBottomSheetDialogFragment<VM> implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Object f88761cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private volatile gxszxtbevo f88762istkbnxepw;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ContextWrapper f88763pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f88764yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f88765zynmafqrjb;

    Hilt_UpdateApplicationDialogFragment(int i13) {
        super(i13);
        this.f88761cdpycssgdh = new Object();
        this.f88764yadqdtsiqt = false;
    }

    private void ribwqtqdhb() {
        if (this.f88763pmvmpeiblj == null) {
            this.f88763pmvmpeiblj = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f88765zynmafqrjb = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f88762istkbnxepw == null) {
            synchronized (this.f88761cdpycssgdh) {
                try {
                    if (this.f88762istkbnxepw == null) {
                        this.f88762istkbnxepw = jlmebxxoox();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f88762istkbnxepw;
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f88765zynmafqrjb) {
            return null;
        }
        ribwqtqdhb();
        return this.f88763pmvmpeiblj;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f88764yadqdtsiqt) {
            return;
        }
        this.f88764yadqdtsiqt = true;
        ((jb0.eablkybsjg) ojitshcjhn()).z1((UpdateApplicationDialogFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        ContextWrapper contextWrapper = this.f88763pmvmpeiblj;
        wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        ribwqtqdhb();
        inject();
    }
}
