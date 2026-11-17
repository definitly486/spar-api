package ru.myspar.sbp_recurring.impl.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import xf.gxszxtbevo;
import zf.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_SbpSelectBankAppDialogFragment<Model, Event, UiLabel> extends BaseMviBottomSheetDialogFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f103066cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Object f103067istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private ContextWrapper f103068lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f103069pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private volatile gxszxtbevo f103070zynmafqrjb;

    Hilt_SbpSelectBankAppDialogFragment(int i13) {
        super(i13);
        this.f103067istkbnxepw = new Object();
        this.f103066cdpycssgdh = false;
    }

    private void metgxyhuhe() {
        if (this.f103068lereixgezr == null) {
            this.f103068lereixgezr = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f103069pmvmpeiblj = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f103069pmvmpeiblj) {
            return null;
        }
        metgxyhuhe();
        return this.f103068lereixgezr;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f103066cdpycssgdh) {
            return;
        }
        this.f103066cdpycssgdh = true;
        ((n12.gxszxtbevo) ojitshcjhn()).ulzqkzuiru((SbpSelectBankAppDialogFragment) eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f103070zynmafqrjb == null) {
            synchronized (this.f103067istkbnxepw) {
                try {
                    if (this.f103070zynmafqrjb == null) {
                        this.f103070zynmafqrjb = xrmfcynszj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f103070zynmafqrjb;
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
        ContextWrapper contextWrapper = this.f103068lereixgezr;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        metgxyhuhe();
        inject();
    }
}
