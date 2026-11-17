package ru.myspar.rate.rate_order.impl.presentation.success;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.core.base.mvvm.BaseMvvmFragment;
import vx.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_RateOrderSuccessFragment<VM extends vx.eablkybsjg> extends BaseMvvmFragment<VM> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f102898cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f102899iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile xf.gxszxtbevo f102900jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f102901yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f102902zdlpuopuiu;

    Hilt_RateOrderSuccessFragment(int i13) {
        super(i13);
        this.f102899iwizpuwonk = new Object();
        this.f102898cqumvgiudr = false;
    }

    private void jpowsppfya() {
        if (this.f102902zdlpuopuiu == null) {
            this.f102902zdlpuopuiu = xf.gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f102901yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f102901yggfygwlhe) {
            return null;
        }
        jpowsppfya();
        return this.f102902zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected xf.gxszxtbevo hcddaimhww() {
        return new xf.gxszxtbevo(this);
    }

    protected void inject() {
        if (this.f102898cqumvgiudr) {
            return;
        }
        this.f102898cqumvgiudr = true;
        ((wkgbmnqykc) ojitshcjhn()).cllcsxoeiz((RateOrderSuccessFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        jpowsppfya();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(xf.gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: pkzmftpjix, reason: merged with bridge method [inline-methods] */
    public final xf.gxszxtbevo oxmwwwfdhm() {
        if (this.f102900jyumaefscl == null) {
            synchronized (this.f102899iwizpuwonk) {
                try {
                    if (this.f102900jyumaefscl == null) {
                        this.f102900jyumaefscl = hcddaimhww();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f102900jyumaefscl;
    }

    Hilt_RateOrderSuccessFragment() {
        this.f102899iwizpuwonk = new Object();
        this.f102898cqumvgiudr = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f102902zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || xf.gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jpowsppfya();
        inject();
    }
}
