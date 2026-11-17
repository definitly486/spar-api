package ru.myspar.proloyalty.popups.impl.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import xf.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
abstract class iobyxmoadg extends BaseMviBottomSheetDialogFragment implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f99268cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Object f99269istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private ContextWrapper f99270lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f99271pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private volatile gxszxtbevo f99272zynmafqrjb;

    iobyxmoadg(int i13) {
        super(i13);
        this.f99269istkbnxepw = new Object();
        this.f99268cdpycssgdh = false;
    }

    private void metgxyhuhe() {
        if (this.f99270lereixgezr == null) {
            this.f99270lereixgezr = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f99271pmvmpeiblj = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f99271pmvmpeiblj) {
            return null;
        }
        metgxyhuhe();
        return this.f99270lereixgezr;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f99268cdpycssgdh) {
            return;
        }
        this.f99268cdpycssgdh = true;
        ((nh1.gxszxtbevo) ojitshcjhn()).crxdokpmqz((PopupsDialogFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f99272zynmafqrjb == null) {
            synchronized (this.f99269istkbnxepw) {
                try {
                    if (this.f99272zynmafqrjb == null) {
                        this.f99272zynmafqrjb = xrmfcynszj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f99272zynmafqrjb;
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
        ContextWrapper contextWrapper = this.f99270lereixgezr;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        metgxyhuhe();
        inject();
    }
}
