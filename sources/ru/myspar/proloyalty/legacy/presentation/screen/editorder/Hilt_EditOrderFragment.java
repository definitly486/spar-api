package ru.myspar.proloyalty.legacy.presentation.screen.editorder;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.proloyalty.core.base.mvvm.BaseMvvmFragment;
import sw0.eablkybsjg;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Hilt_EditOrderFragment<VM extends sw0.eablkybsjg> extends BaseMvvmFragment<VM> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f96754cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f96755iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile xf.gxszxtbevo f96756jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f96757yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f96758zdlpuopuiu;

    Hilt_EditOrderFragment(int i13) {
        super(i13);
        this.f96755iwizpuwonk = new Object();
        this.f96754cqumvgiudr = false;
    }

    private void jpowsppfya() {
        if (this.f96758zdlpuopuiu == null) {
            this.f96758zdlpuopuiu = xf.gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f96757yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f96757yggfygwlhe) {
            return null;
        }
        jpowsppfya();
        return this.f96758zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected xf.gxszxtbevo hcddaimhww() {
        return new xf.gxszxtbevo(this);
    }

    protected void inject() {
        if (this.f96754cqumvgiudr) {
            return;
        }
        this.f96754cqumvgiudr = true;
        ((oxmwwwfdhm) ojitshcjhn()).czzsidtyhn((EditOrderFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        if (this.f96756jyumaefscl == null) {
            synchronized (this.f96755iwizpuwonk) {
                try {
                    if (this.f96756jyumaefscl == null) {
                        this.f96756jyumaefscl = hcddaimhww();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f96756jyumaefscl;
    }

    Hilt_EditOrderFragment() {
        this.f96755iwizpuwonk = new Object();
        this.f96754cqumvgiudr = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f96758zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || xf.gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jpowsppfya();
        inject();
    }
}
