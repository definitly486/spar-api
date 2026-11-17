package ru.myspar.proloyalty.legacy.presentation.screen.savedcards;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment;
import xf.gxszxtbevo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Hilt_SavedCardsFragment<Model, Event, UiLabel> extends BaseMviFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f97271cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f97272iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile gxszxtbevo f97273jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f97274yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f97275zdlpuopuiu;

    Hilt_SavedCardsFragment(int i13) {
        super(i13);
        this.f97272iwizpuwonk = new Object();
        this.f97271cqumvgiudr = false;
    }

    private void kegysxyocb() {
        if (this.f97275zdlpuopuiu == null) {
            this.f97275zdlpuopuiu = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f97274yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f97274yggfygwlhe) {
            return null;
        }
        kegysxyocb();
        return this.f97275zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f97271cqumvgiudr) {
            return;
        }
        this.f97271cqumvgiudr = true;
        ((fb1.eablkybsjg) ojitshcjhn()).wypolnanlu((SavedCardsFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        if (this.f97273jyumaefscl == null) {
            synchronized (this.f97272iwizpuwonk) {
                try {
                    if (this.f97273jyumaefscl == null) {
                        this.f97273jyumaefscl = stevsuqkhv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f97273jyumaefscl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f97275zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        kegysxyocb();
        inject();
    }
}
