package ru.myspar.webview_screen.impl.trackingorder.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.core.base.mvi.fragment.BaseMviFragment;
import xf.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_TrackingOrderFragment<Model, Event, UiLabel> extends BaseMviFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f104776cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f104777iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile gxszxtbevo f104778jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f104779yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f104780zdlpuopuiu;

    Hilt_TrackingOrderFragment(int i13) {
        super(i13);
        this.f104777iwizpuwonk = new Object();
        this.f104776cqumvgiudr = false;
    }

    private void kegysxyocb() {
        if (this.f104780zdlpuopuiu == null) {
            this.f104780zdlpuopuiu = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f104779yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f104779yggfygwlhe) {
            return null;
        }
        kegysxyocb();
        return this.f104780zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f104776cqumvgiudr) {
            return;
        }
        this.f104776cqumvgiudr = true;
        ((hb2.eablkybsjg) ojitshcjhn()).q1((TrackingOrderFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        if (this.f104778jyumaefscl == null) {
            synchronized (this.f104777iwizpuwonk) {
                try {
                    if (this.f104778jyumaefscl == null) {
                        this.f104778jyumaefscl = stevsuqkhv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f104778jyumaefscl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f104780zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        kegysxyocb();
        inject();
    }
}
