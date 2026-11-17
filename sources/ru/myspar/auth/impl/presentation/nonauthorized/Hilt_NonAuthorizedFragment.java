package ru.myspar.auth.impl.presentation.nonauthorized;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import pp.eablkybsjg;
import ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment;
import xf.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hilt_NonAuthorizedFragment<Model, Event, UiLabel> extends BaseComposeMviFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile gxszxtbevo f84624jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f84625yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f84626zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f84623iwizpuwonk = new Object();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f84622cqumvgiudr = false;

    private void dsvhmnatus() {
        if (this.f84626zdlpuopuiu == null) {
            this.f84626zdlpuopuiu = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f84625yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    protected gxszxtbevo cllcsxoeiz() {
        return new gxszxtbevo(this);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f84625yggfygwlhe) {
            return null;
        }
        dsvhmnatus();
        return this.f84626zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: hkdspvbjdz, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f84624jyumaefscl == null) {
            synchronized (this.f84623iwizpuwonk) {
                try {
                    if (this.f84624jyumaefscl == null) {
                        this.f84624jyumaefscl = cllcsxoeiz();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f84624jyumaefscl;
    }

    protected void inject() {
        if (this.f84622cqumvgiudr) {
            return;
        }
        this.f84622cqumvgiudr = true;
        ((eablkybsjg) ojitshcjhn()).o1((NonAuthorizedFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        ContextWrapper contextWrapper = this.f84626zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        dsvhmnatus();
        inject();
    }
}
