package ru.myspar.specialbanner.impl.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import ru.myspar.core.base.mvvm.BaseMvvmFragment;
import vx.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_SpecialBannerFragment<VM extends vx.eablkybsjg> extends BaseMvvmFragment<VM> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f103832cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f103833iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile xf.gxszxtbevo f103834jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f103835yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f103836zdlpuopuiu;

    Hilt_SpecialBannerFragment(int i13) {
        super(i13);
        this.f103833iwizpuwonk = new Object();
        this.f103832cqumvgiudr = false;
    }

    private void jpowsppfya() {
        if (this.f103836zdlpuopuiu == null) {
            this.f103836zdlpuopuiu = xf.gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f103835yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f103835yggfygwlhe) {
            return null;
        }
        jpowsppfya();
        return this.f103836zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public androidx.lifecycle.crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected xf.gxszxtbevo hcddaimhww() {
        return new xf.gxszxtbevo(this);
    }

    protected void inject() {
        if (this.f103832cqumvgiudr) {
            return;
        }
        this.f103832cqumvgiudr = true;
        ((okpsazkaxt) ojitshcjhn()).w((SpecialBannerFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        if (this.f103834jyumaefscl == null) {
            synchronized (this.f103833iwizpuwonk) {
                try {
                    if (this.f103834jyumaefscl == null) {
                        this.f103834jyumaefscl = hcddaimhww();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f103834jyumaefscl;
    }

    Hilt_SpecialBannerFragment() {
        this.f103833iwizpuwonk = new Object();
        this.f103832cqumvgiudr = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f103836zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || xf.gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jpowsppfya();
        inject();
    }
}
