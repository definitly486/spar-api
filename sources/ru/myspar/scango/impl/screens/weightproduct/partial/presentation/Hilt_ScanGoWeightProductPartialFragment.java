package ru.myspar.scango.impl.screens.weightproduct.partial.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.core.base.mvi.fragment.BaseMviFragment;
import xf.gxszxtbevo;
import zf.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_ScanGoWeightProductPartialFragment<Model, Event, UiLabel> extends BaseMviFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f103787cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f103788iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile gxszxtbevo f103789jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f103790yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f103791zdlpuopuiu;

    Hilt_ScanGoWeightProductPartialFragment(int i13) {
        super(i13);
        this.f103788iwizpuwonk = new Object();
        this.f103787cqumvgiudr = false;
    }

    private void kegysxyocb() {
        if (this.f103791zdlpuopuiu == null) {
            this.f103791zdlpuopuiu = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f103790yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f103790yggfygwlhe) {
            return null;
        }
        kegysxyocb();
        return this.f103791zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f103787cqumvgiudr) {
            return;
        }
        this.f103787cqumvgiudr = true;
        ((v32.gxszxtbevo) ojitshcjhn()).tzroggbefp((ScanGoWeightProductPartialFragment) eablkybsjg.iobyxmoadg(this));
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
        if (this.f103789jyumaefscl == null) {
            synchronized (this.f103788iwizpuwonk) {
                try {
                    if (this.f103789jyumaefscl == null) {
                        this.f103789jyumaefscl = stevsuqkhv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f103789jyumaefscl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f103791zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        kegysxyocb();
        inject();
    }
}
