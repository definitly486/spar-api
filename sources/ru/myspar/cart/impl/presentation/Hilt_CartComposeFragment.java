package ru.myspar.cart.impl.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment;
import wp.eablkybsjg;
import xf.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hilt_CartComposeFragment<Model, Event, UiLabel> extends BaseComposeMviFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile gxszxtbevo f84999jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f85000yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f85001zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f84998iwizpuwonk = new Object();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f84997cqumvgiudr = false;

    private void dsvhmnatus() {
        if (this.f85001zdlpuopuiu == null) {
            this.f85001zdlpuopuiu = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f85000yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    protected gxszxtbevo cllcsxoeiz() {
        return new gxszxtbevo(this);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f85000yggfygwlhe) {
            return null;
        }
        dsvhmnatus();
        return this.f85001zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: hkdspvbjdz, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f84999jyumaefscl == null) {
            synchronized (this.f84998iwizpuwonk) {
                try {
                    if (this.f84999jyumaefscl == null) {
                        this.f84999jyumaefscl = cllcsxoeiz();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f84999jyumaefscl;
    }

    protected void inject() {
        if (this.f84997cqumvgiudr) {
            return;
        }
        this.f84997cqumvgiudr = true;
        ((eablkybsjg) ojitshcjhn()).D0((CartComposeFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        dsvhmnatus();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f85001zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        dsvhmnatus();
        inject();
    }
}
