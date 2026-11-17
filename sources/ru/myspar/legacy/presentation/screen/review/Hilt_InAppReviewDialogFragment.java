package ru.myspar.legacy.presentation.screen.review;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hilt_InAppReviewDialogFragment<Model, Event, UiLabel> extends BaseMviBottomSheetDialogFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f89509cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Object f89510istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private ContextWrapper f89511lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f89512pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private volatile xf.gxszxtbevo f89513zynmafqrjb;

    Hilt_InAppReviewDialogFragment(int i13) {
        super(i13);
        this.f89510istkbnxepw = new Object();
        this.f89509cdpycssgdh = false;
    }

    private void metgxyhuhe() {
        if (this.f89511lereixgezr == null) {
            this.f89511lereixgezr = xf.gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f89512pmvmpeiblj = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f89512pmvmpeiblj) {
            return null;
        }
        metgxyhuhe();
        return this.f89511lereixgezr;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f89509cdpycssgdh) {
            return;
        }
        this.f89509cdpycssgdh = true;
        ((fd0.nufgyqmvbu) ojitshcjhn()).b0((InAppReviewDialogFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public final xf.gxszxtbevo oxmwwwfdhm() {
        if (this.f89513zynmafqrjb == null) {
            synchronized (this.f89510istkbnxepw) {
                try {
                    if (this.f89513zynmafqrjb == null) {
                        this.f89513zynmafqrjb = xrmfcynszj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f89513zynmafqrjb;
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        metgxyhuhe();
        inject();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(xf.gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    protected xf.gxszxtbevo xrmfcynszj() {
        return new xf.gxszxtbevo(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f89511lereixgezr;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || xf.gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        metgxyhuhe();
        inject();
    }
}
