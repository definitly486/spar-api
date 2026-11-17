package ru.myspar.proloyalty.myspar.impl.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.proloyalty.core.base.mvvm.BaseMvvmFragment;
import sw0.eablkybsjg;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Hilt_MySparFragment<VM extends sw0.eablkybsjg> extends BaseMvvmFragment<VM> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f98108cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f98109iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile xf.gxszxtbevo f98110jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f98111yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f98112zdlpuopuiu;

    Hilt_MySparFragment(int i13) {
        super(i13);
        this.f98109iwizpuwonk = new Object();
        this.f98108cqumvgiudr = false;
    }

    private void jpowsppfya() {
        if (this.f98112zdlpuopuiu == null) {
            this.f98112zdlpuopuiu = xf.gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f98111yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f98111yggfygwlhe) {
            return null;
        }
        jpowsppfya();
        return this.f98112zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected xf.gxszxtbevo hcddaimhww() {
        return new xf.gxszxtbevo(this);
    }

    protected void inject() {
        if (this.f98108cqumvgiudr) {
            return;
        }
        this.f98108cqumvgiudr = true;
        ((agtfadlqog) ojitshcjhn()).H((MySparFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        if (this.f98110jyumaefscl == null) {
            synchronized (this.f98109iwizpuwonk) {
                try {
                    if (this.f98110jyumaefscl == null) {
                        this.f98110jyumaefscl = hcddaimhww();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f98110jyumaefscl;
    }

    Hilt_MySparFragment() {
        this.f98109iwizpuwonk = new Object();
        this.f98108cqumvgiudr = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f98112zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || xf.gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jpowsppfya();
        inject();
    }
}
