package ru.myspar.proloyalty.catalog.impl.product_list.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment;
import tp0.agtfadlqog;
import xf.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
abstract class iobyxmoadg extends BaseComposeMviFragment implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile gxszxtbevo f93250jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f93251yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f93252zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f93249iwizpuwonk = new Object();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f93248cqumvgiudr = false;

    iobyxmoadg() {
    }

    private void dsvhmnatus() {
        if (this.f93252zdlpuopuiu == null) {
            this.f93252zdlpuopuiu = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f93251yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    protected gxszxtbevo cllcsxoeiz() {
        return new gxszxtbevo(this);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f93251yggfygwlhe) {
            return null;
        }
        dsvhmnatus();
        return this.f93252zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: hkdspvbjdz, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f93250jyumaefscl == null) {
            synchronized (this.f93249iwizpuwonk) {
                try {
                    if (this.f93250jyumaefscl == null) {
                        this.f93250jyumaefscl = cllcsxoeiz();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f93250jyumaefscl;
    }

    protected void inject() {
        if (this.f93248cqumvgiudr) {
            return;
        }
        this.f93248cqumvgiudr = true;
        ((agtfadlqog) ojitshcjhn()).k0((ProductListMviFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        ContextWrapper contextWrapper = this.f93252zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        dsvhmnatus();
        inject();
    }
}
