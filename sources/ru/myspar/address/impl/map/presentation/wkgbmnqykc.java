package ru.myspar.address.impl.map.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import nn.lqeggnwhkg;
import ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment;
import xf.gxszxtbevo;
import zf.eablkybsjg;

/* JADX INFO: loaded from: classes3.dex */
abstract class wkgbmnqykc extends BaseComposeMviFragment implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile gxszxtbevo f83987jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f83988yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f83989zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f83986iwizpuwonk = new Object();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f83985cqumvgiudr = false;

    wkgbmnqykc() {
    }

    private void dsvhmnatus() {
        if (this.f83989zdlpuopuiu == null) {
            this.f83989zdlpuopuiu = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f83988yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    protected gxszxtbevo cllcsxoeiz() {
        return new gxszxtbevo(this);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f83988yggfygwlhe) {
            return null;
        }
        dsvhmnatus();
        return this.f83989zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: hkdspvbjdz, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f83987jyumaefscl == null) {
            synchronized (this.f83986iwizpuwonk) {
                try {
                    if (this.f83987jyumaefscl == null) {
                        this.f83987jyumaefscl = cllcsxoeiz();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f83987jyumaefscl;
    }

    protected void inject() {
        if (this.f83985cqumvgiudr) {
            return;
        }
        this.f83985cqumvgiudr = true;
        ((lqeggnwhkg) ojitshcjhn()).x1((AddressMapFragment) eablkybsjg.iobyxmoadg(this));
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
        ContextWrapper contextWrapper = this.f83989zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        dsvhmnatus();
        inject();
    }
}
