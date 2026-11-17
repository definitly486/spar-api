package ru.myspar.proloyalty.purchases.impl.list_add_product.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import xf.gxszxtbevo;
import zf.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_PurchaseListAddProductDialogFragment<Model, Event, UiLabel> extends BaseComposeMviBottomSheetDialogFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private volatile gxszxtbevo f99664istkbnxepw;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ContextWrapper f99665pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f99667zynmafqrjb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Object f99663cdpycssgdh = new Object();

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f99666yadqdtsiqt = false;

    private void metgxyhuhe() {
        if (this.f99665pmvmpeiblj == null) {
            this.f99665pmvmpeiblj = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f99667zynmafqrjb = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f99667zynmafqrjb) {
            return null;
        }
        metgxyhuhe();
        return this.f99665pmvmpeiblj;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f99666yadqdtsiqt) {
            return;
        }
        this.f99666yadqdtsiqt = true;
        ((kj1.gxszxtbevo) ojitshcjhn()).V0((PurchaseListAddProductDialogFragment) eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f99664istkbnxepw == null) {
            synchronized (this.f99663cdpycssgdh) {
                try {
                    if (this.f99664istkbnxepw == null) {
                        this.f99664istkbnxepw = xrmfcynszj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f99664istkbnxepw;
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
        return layoutInflaterOnGetLayoutInflater.cloneInContext(gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    protected gxszxtbevo xrmfcynszj() {
        return new gxszxtbevo(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f99665pmvmpeiblj;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        metgxyhuhe();
        inject();
    }
}
