package ru.myspar.legacy.presentation.screen.review;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import fd0.vdvldrhtss;
import ru.myspar.core.base.mvi.fragment.BaseMviFragment;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hilt_ReviewProductFragment<Model, Event, UiLabel> extends BaseMviFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f89514cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f89515iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile xf.gxszxtbevo f89516jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f89517yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f89518zdlpuopuiu;

    Hilt_ReviewProductFragment(int i13) {
        super(i13);
        this.f89515iwizpuwonk = new Object();
        this.f89514cqumvgiudr = false;
    }

    private void kegysxyocb() {
        if (this.f89518zdlpuopuiu == null) {
            this.f89518zdlpuopuiu = xf.gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f89517yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f89517yggfygwlhe) {
            return null;
        }
        kegysxyocb();
        return this.f89518zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f89514cqumvgiudr) {
            return;
        }
        this.f89514cqumvgiudr = true;
        ((vdvldrhtss) ojitshcjhn()).agtfadlqog((ReviewProductFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        return layoutInflaterOnGetLayoutInflater.cloneInContext(xf.gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    protected xf.gxszxtbevo stevsuqkhv() {
        return new xf.gxszxtbevo(this);
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: wypolnanlu, reason: merged with bridge method [inline-methods] */
    public final xf.gxszxtbevo oxmwwwfdhm() {
        if (this.f89516jyumaefscl == null) {
            synchronized (this.f89515iwizpuwonk) {
                try {
                    if (this.f89516jyumaefscl == null) {
                        this.f89516jyumaefscl = stevsuqkhv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f89516jyumaefscl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f89518zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || xf.gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        kegysxyocb();
        inject();
    }
}
