package ru.myspar.networkpanel.impl.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ii0.eablkybsjg;
import ru.myspar.core.base.mvi.dialog.BaseComposeMviDialogFragment;
import xf.gxszxtbevo;
import zf.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hilt_NetworkPanelFragment<Model, Event, UiLabel> extends BaseComposeMviDialogFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Object f90873cqumvgiudr = new Object();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f90874esjtqupxsv = false;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile gxszxtbevo f90875iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f90876jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ContextWrapper f90877yggfygwlhe;

    private void wypolnanlu() {
        if (this.f90877yggfygwlhe == null) {
            this.f90877yggfygwlhe = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f90876jyumaefscl = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: cllcsxoeiz, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f90875iwizpuwonk == null) {
            synchronized (this.f90873cqumvgiudr) {
                try {
                    if (this.f90875iwizpuwonk == null) {
                        this.f90875iwizpuwonk = dsvhmnatus();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f90875iwizpuwonk;
    }

    protected gxszxtbevo dsvhmnatus() {
        return new gxszxtbevo(this);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f90876jyumaefscl) {
            return null;
        }
        wypolnanlu();
        return this.f90877yggfygwlhe;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f90874esjtqupxsv) {
            return;
        }
        this.f90874esjtqupxsv = true;
        ((eablkybsjg) ojitshcjhn()).Q0((NetworkPanelFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        wypolnanlu();
        inject();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f90877yggfygwlhe;
        wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        wypolnanlu();
        inject();
    }
}
