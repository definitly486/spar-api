package ru.myspar.webview_screen.impl.chatorder.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import bb2.gtknphoqwx;
import ru.myspar.core.base.mvi.fragment.BaseMviFragment;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_ChatOrderFragment<Model, Event, UiLabel> extends BaseMviFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f104712cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f104713iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile xf.gxszxtbevo f104714jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f104715yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ContextWrapper f104716zdlpuopuiu;

    Hilt_ChatOrderFragment(int i13) {
        super(i13);
        this.f104713iwizpuwonk = new Object();
        this.f104712cqumvgiudr = false;
    }

    private void kegysxyocb() {
        if (this.f104716zdlpuopuiu == null) {
            this.f104716zdlpuopuiu = xf.gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f104715yggfygwlhe = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f104715yggfygwlhe) {
            return null;
        }
        kegysxyocb();
        return this.f104716zdlpuopuiu;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f104712cqumvgiudr) {
            return;
        }
        this.f104712cqumvgiudr = true;
        ((gtknphoqwx) ojitshcjhn()).wkgbmnqykc((ChatOrderFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        if (this.f104714jyumaefscl == null) {
            synchronized (this.f104713iwizpuwonk) {
                try {
                    if (this.f104714jyumaefscl == null) {
                        this.f104714jyumaefscl = stevsuqkhv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f104714jyumaefscl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f104716zdlpuopuiu;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || xf.gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        kegysxyocb();
        inject();
    }
}
