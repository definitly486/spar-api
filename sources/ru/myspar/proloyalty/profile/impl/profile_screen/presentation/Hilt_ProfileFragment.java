package ru.myspar.proloyalty.profile.impl.profile_screen.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ji1.nufgyqmvbu;
import ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment;
import xf.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_ProfileFragment<Model, Event, UiLabel> extends BaseComposeMviFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile gxszxtbevo f99411jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f99412yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f99413zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f99410iwizpuwonk = new Object();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f99409cqumvgiudr = false;

    private void dsvhmnatus() {
        if (this.f99413zdlpuopuiu == null) {
            this.f99413zdlpuopuiu = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f99412yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    protected gxszxtbevo cllcsxoeiz() {
        return new gxszxtbevo(this);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f99412yggfygwlhe) {
            return null;
        }
        dsvhmnatus();
        return this.f99413zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: hkdspvbjdz, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f99411jyumaefscl == null) {
            synchronized (this.f99410iwizpuwonk) {
                try {
                    if (this.f99411jyumaefscl == null) {
                        this.f99411jyumaefscl = cllcsxoeiz();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f99411jyumaefscl;
    }

    protected void inject() {
        if (this.f99409cqumvgiudr) {
            return;
        }
        this.f99409cqumvgiudr = true;
        ((nufgyqmvbu) ojitshcjhn()).i((ProfileFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        ContextWrapper contextWrapper = this.f99413zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        dsvhmnatus();
        inject();
    }
}
