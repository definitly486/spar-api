package ru.myspar.scango.impl.screens.excisesticker.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import c32.btonecajqb;
import ru.myspar.core.base.mvi.dialog.BaseMviDialogFragment;
import tf.iobyxmoadg;
import xf.gxszxtbevo;
import zf.eablkybsjg;
import zf.ppxfxbqfkf;
import zf.wkgbmnqykc;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_ScanExciseStickerDialogFragment<Model, Event, UiLabel> extends BaseMviDialogFragment<Model, Event, UiLabel> implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Object f103446cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f103447esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile gxszxtbevo f103448iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f103449jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ContextWrapper f103450yggfygwlhe;

    Hilt_ScanExciseStickerDialogFragment(int i13) {
        super(i13);
        this.f103446cqumvgiudr = new Object();
        this.f103447esjtqupxsv = false;
    }

    private void tzroggbefp() {
        if (this.f103450yggfygwlhe == null) {
            this.f103450yggfygwlhe = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f103449jyumaefscl = iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f103449jyumaefscl) {
            return null;
        }
        tzroggbefp();
        return this.f103450yggfygwlhe;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f103447esjtqupxsv) {
            return;
        }
        this.f103447esjtqupxsv = true;
        ((btonecajqb) ojitshcjhn()).J((ScanExciseStickerDialogFragment) eablkybsjg.iobyxmoadg(this));
    }

    protected gxszxtbevo kegysxyocb() {
        return new gxszxtbevo(this);
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        tzroggbefp();
        inject();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: stevsuqkhv, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f103448iwizpuwonk == null) {
            synchronized (this.f103446cqumvgiudr) {
                try {
                    if (this.f103448iwizpuwonk == null) {
                        this.f103448iwizpuwonk = kegysxyocb();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f103448iwizpuwonk;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f103450yggfygwlhe;
        wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        tzroggbefp();
        inject();
    }
}
