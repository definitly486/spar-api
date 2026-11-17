package ru.myspar.proloyalty.auth.impl.presentation.deleteaccountfinish;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment;
import tf.iobyxmoadg;
import xf.gxszxtbevo;
import zf.eablkybsjg;
import zf.ppxfxbqfkf;
import zf.wkgbmnqykc;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Hilt_DeleteAccountFinishFragment<Model, Event, UiLabel> extends BaseMviFragment<Model, Event, UiLabel> implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f92610cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f92611iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile gxszxtbevo f92612jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f92613yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f92614zdlpuopuiu;

    Hilt_DeleteAccountFinishFragment(int i13) {
        super(i13);
        this.f92611iwizpuwonk = new Object();
        this.f92610cqumvgiudr = false;
    }

    private void kegysxyocb() {
        if (this.f92614zdlpuopuiu == null) {
            this.f92614zdlpuopuiu = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f92613yggfygwlhe = iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f92613yggfygwlhe) {
            return null;
        }
        kegysxyocb();
        return this.f92614zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f92610cqumvgiudr) {
            return;
        }
        this.f92610cqumvgiudr = true;
        ((qn0.gxszxtbevo) ojitshcjhn()).btonecajqb((DeleteAccountFinishFragment) eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        kegysxyocb();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    protected gxszxtbevo stevsuqkhv() {
        return new gxszxtbevo(this);
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: wypolnanlu, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f92612jyumaefscl == null) {
            synchronized (this.f92611iwizpuwonk) {
                try {
                    if (this.f92612jyumaefscl == null) {
                        this.f92612jyumaefscl = stevsuqkhv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f92612jyumaefscl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f92614zdlpuopuiu;
        wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        kegysxyocb();
        inject();
    }
}
