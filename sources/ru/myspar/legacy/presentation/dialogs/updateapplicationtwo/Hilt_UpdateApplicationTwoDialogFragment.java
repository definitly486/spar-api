package ru.myspar.legacy.presentation.dialogs.updateapplicationtwo;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import tf.iobyxmoadg;
import xf.gxszxtbevo;
import zf.eablkybsjg;
import zf.ppxfxbqfkf;
import zf.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hilt_UpdateApplicationTwoDialogFragment<Model, Event, UiLabel> extends BaseMviBottomSheetDialogFragment<Model, Event, UiLabel> implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f88817cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Object f88818istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private ContextWrapper f88819lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f88820pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private volatile gxszxtbevo f88821zynmafqrjb;

    Hilt_UpdateApplicationTwoDialogFragment(int i13) {
        super(i13);
        this.f88818istkbnxepw = new Object();
        this.f88817cdpycssgdh = false;
    }

    private void metgxyhuhe() {
        if (this.f88819lereixgezr == null) {
            this.f88819lereixgezr = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f88820pmvmpeiblj = iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f88820pmvmpeiblj) {
            return null;
        }
        metgxyhuhe();
        return this.f88819lereixgezr;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f88817cdpycssgdh) {
            return;
        }
        this.f88817cdpycssgdh = true;
        ((kb0.gxszxtbevo) ojitshcjhn()).iozdgvuglv((UpdateApplicationTwoDialogFragment) eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f88821zynmafqrjb == null) {
            synchronized (this.f88818istkbnxepw) {
                try {
                    if (this.f88821zynmafqrjb == null) {
                        this.f88821zynmafqrjb = xrmfcynszj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f88821zynmafqrjb;
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
        ContextWrapper contextWrapper = this.f88819lereixgezr;
        wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        metgxyhuhe();
        inject();
    }
}
