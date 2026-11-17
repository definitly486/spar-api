package ru.myspar.legacy.presentation.screen.restaurantdescriptiondialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ed0.eablkybsjg;
import ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import xf.gxszxtbevo;
import zf.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hilt_RestaurantDescriptionDialogFragment<Model, Event, UiLabel> extends BaseMviBottomSheetDialogFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f89485cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Object f89486istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private ContextWrapper f89487lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f89488pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private volatile gxszxtbevo f89489zynmafqrjb;

    Hilt_RestaurantDescriptionDialogFragment(int i13) {
        super(i13);
        this.f89486istkbnxepw = new Object();
        this.f89485cdpycssgdh = false;
    }

    private void metgxyhuhe() {
        if (this.f89487lereixgezr == null) {
            this.f89487lereixgezr = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f89488pmvmpeiblj = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f89488pmvmpeiblj) {
            return null;
        }
        metgxyhuhe();
        return this.f89487lereixgezr;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f89485cdpycssgdh) {
            return;
        }
        this.f89485cdpycssgdh = true;
        ((eablkybsjg) ojitshcjhn()).P0((RestaurantDescriptionDialogFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f89489zynmafqrjb == null) {
            synchronized (this.f89486istkbnxepw) {
                try {
                    if (this.f89489zynmafqrjb == null) {
                        this.f89489zynmafqrjb = xrmfcynszj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f89489zynmafqrjb;
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
        ContextWrapper contextWrapper = this.f89487lereixgezr;
        wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        metgxyhuhe();
        inject();
    }
}
