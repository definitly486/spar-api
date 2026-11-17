package ru.myspar.catalog.impl.search;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.core.base.mvvm.BaseMvvmFragment;
import vx.eablkybsjg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hilt_SearchFragment<VM extends vx.eablkybsjg> extends BaseMvvmFragment<VM> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f85377cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f85378iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile xf.gxszxtbevo f85379jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f85380yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f85381zdlpuopuiu;

    Hilt_SearchFragment(int i13) {
        super(i13);
        this.f85378iwizpuwonk = new Object();
        this.f85377cqumvgiudr = false;
    }

    private void jpowsppfya() {
        if (this.f85381zdlpuopuiu == null) {
            this.f85381zdlpuopuiu = xf.gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f85380yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f85380yggfygwlhe) {
            return null;
        }
        jpowsppfya();
        return this.f85381zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected xf.gxszxtbevo hcddaimhww() {
        return new xf.gxszxtbevo(this);
    }

    protected void inject() {
        if (this.f85377cqumvgiudr) {
            return;
        }
        this.f85377cqumvgiudr = true;
        ((btonecajqb) ojitshcjhn()).M((SearchFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        if (this.f85379jyumaefscl == null) {
            synchronized (this.f85378iwizpuwonk) {
                try {
                    if (this.f85379jyumaefscl == null) {
                        this.f85379jyumaefscl = hcddaimhww();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f85379jyumaefscl;
    }

    Hilt_SearchFragment() {
        this.f85378iwizpuwonk = new Object();
        this.f85377cqumvgiudr = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f85381zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || xf.gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        jpowsppfya();
        inject();
    }
}
