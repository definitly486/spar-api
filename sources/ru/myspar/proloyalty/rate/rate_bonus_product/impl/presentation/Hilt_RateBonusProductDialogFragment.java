package ru.myspar.proloyalty.rate.rate_bonus_product.impl.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import pl1.eablkybsjg;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import xf.gxszxtbevo;
import zf.wkgbmnqykc;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_RateBonusProductDialogFragment<Model, Event, UiLabel> extends BaseComposeMviBottomSheetDialogFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private volatile gxszxtbevo f100038istkbnxepw;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ContextWrapper f100039pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f100041zynmafqrjb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Object f100037cdpycssgdh = new Object();

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f100040yadqdtsiqt = false;

    private void metgxyhuhe() {
        if (this.f100039pmvmpeiblj == null) {
            this.f100039pmvmpeiblj = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f100041zynmafqrjb = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f100041zynmafqrjb) {
            return null;
        }
        metgxyhuhe();
        return this.f100039pmvmpeiblj;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f100040yadqdtsiqt) {
            return;
        }
        this.f100040yadqdtsiqt = true;
        ((eablkybsjg) ojitshcjhn()).d((RateBonusProductDialogFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f100038istkbnxepw == null) {
            synchronized (this.f100037cdpycssgdh) {
                try {
                    if (this.f100038istkbnxepw == null) {
                        this.f100038istkbnxepw = xrmfcynszj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f100038istkbnxepw;
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
        ContextWrapper contextWrapper = this.f100039pmvmpeiblj;
        wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        metgxyhuhe();
        inject();
    }
}
