package ru.myspar.contacts.impl.contacts_screen.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import mx.eablkybsjg;
import ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import xf.gxszxtbevo;
import zf.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hilt_ContactsFragmentCompose<Model, Event, UiLabel> extends BaseComposeMviBottomSheetDialogFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private volatile gxszxtbevo f86478istkbnxepw;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ContextWrapper f86479pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f86481zynmafqrjb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Object f86477cdpycssgdh = new Object();

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f86480yadqdtsiqt = false;

    private void metgxyhuhe() {
        if (this.f86479pmvmpeiblj == null) {
            this.f86479pmvmpeiblj = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f86481zynmafqrjb = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f86481zynmafqrjb) {
            return null;
        }
        metgxyhuhe();
        return this.f86479pmvmpeiblj;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f86480yadqdtsiqt) {
            return;
        }
        this.f86480yadqdtsiqt = true;
        ((eablkybsjg) ojitshcjhn()).O0((ContactsFragmentCompose) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f86478istkbnxepw == null) {
            synchronized (this.f86477cdpycssgdh) {
                try {
                    if (this.f86478istkbnxepw == null) {
                        this.f86478istkbnxepw = xrmfcynszj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f86478istkbnxepw;
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
        ContextWrapper contextWrapper = this.f86479pmvmpeiblj;
        wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        metgxyhuhe();
        inject();
    }
}
