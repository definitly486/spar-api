package ru.myspar.ads.impl.presentation.dialog.productday;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import go.eablkybsjg;
import ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import xf.gxszxtbevo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_ProductDayPopupDialogFragment<Model, Event, UiLabel> extends BaseMviBottomSheetDialogFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f84124cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Object f84125istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private ContextWrapper f84126lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f84127pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private volatile gxszxtbevo f84128zynmafqrjb;

    Hilt_ProductDayPopupDialogFragment(int i13) {
        super(i13);
        this.f84125istkbnxepw = new Object();
        this.f84124cdpycssgdh = false;
    }

    private void metgxyhuhe() {
        if (this.f84126lereixgezr == null) {
            this.f84126lereixgezr = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f84127pmvmpeiblj = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f84127pmvmpeiblj) {
            return null;
        }
        metgxyhuhe();
        return this.f84126lereixgezr;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f84124cdpycssgdh) {
            return;
        }
        this.f84124cdpycssgdh = true;
        ((eablkybsjg) ojitshcjhn()).yggfygwlhe((ProductDayPopupDialogFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f84128zynmafqrjb == null) {
            synchronized (this.f84125istkbnxepw) {
                try {
                    if (this.f84128zynmafqrjb == null) {
                        this.f84128zynmafqrjb = xrmfcynszj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f84128zynmafqrjb;
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
        ContextWrapper contextWrapper = this.f84126lereixgezr;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        metgxyhuhe();
        inject();
    }
}
