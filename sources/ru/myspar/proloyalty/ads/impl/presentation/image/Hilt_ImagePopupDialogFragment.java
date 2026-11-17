package ru.myspar.proloyalty.ads.impl.presentation.image;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import tm0.eablkybsjg;
import xf.gxszxtbevo;
import zf.ppxfxbqfkf;
import zf.wkgbmnqykc;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Hilt_ImagePopupDialogFragment<Model, Event, UiLabel> extends BaseMviBottomSheetDialogFragment<Model, Event, UiLabel> implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f92183cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Object f92184istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private ContextWrapper f92185lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f92186pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private volatile gxszxtbevo f92187zynmafqrjb;

    Hilt_ImagePopupDialogFragment(int i13) {
        super(i13);
        this.f92184istkbnxepw = new Object();
        this.f92183cdpycssgdh = false;
    }

    private void metgxyhuhe() {
        if (this.f92185lereixgezr == null) {
            this.f92185lereixgezr = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f92186pmvmpeiblj = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f92186pmvmpeiblj) {
            return null;
        }
        metgxyhuhe();
        return this.f92185lereixgezr;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f92183cdpycssgdh) {
            return;
        }
        this.f92183cdpycssgdh = true;
        ((eablkybsjg) ojitshcjhn()).X((ImagePopupDialogFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f92187zynmafqrjb == null) {
            synchronized (this.f92184istkbnxepw) {
                try {
                    if (this.f92187zynmafqrjb == null) {
                        this.f92187zynmafqrjb = xrmfcynszj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f92187zynmafqrjb;
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
        ContextWrapper contextWrapper = this.f92185lereixgezr;
        wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        metgxyhuhe();
        inject();
    }
}
