package ru.myspar.legacy.presentation.dialogs.iqos;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.core.base.mvi.dialog.BaseMviDialogFragment;
import tf.iobyxmoadg;
import xf.gxszxtbevo;
import zf.eablkybsjg;
import zf.ppxfxbqfkf;
import zf.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hilt_IqosAgreementsDialogFragment<Model, Event, UiLabel> extends BaseMviDialogFragment<Model, Event, UiLabel> implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Object f88622cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f88623esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile gxszxtbevo f88624iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f88625jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ContextWrapper f88626yggfygwlhe;

    Hilt_IqosAgreementsDialogFragment(int i13) {
        super(i13);
        this.f88622cqumvgiudr = new Object();
        this.f88623esjtqupxsv = false;
    }

    private void tzroggbefp() {
        if (this.f88626yggfygwlhe == null) {
            this.f88626yggfygwlhe = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f88625jyumaefscl = iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f88625jyumaefscl) {
            return null;
        }
        tzroggbefp();
        return this.f88626yggfygwlhe;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f88623esjtqupxsv) {
            return;
        }
        this.f88623esjtqupxsv = true;
        ((db0.gxszxtbevo) ojitshcjhn()).ixidwrxhsl((IqosAgreementsDialogFragment) eablkybsjg.iobyxmoadg(this));
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
        if (this.f88624iwizpuwonk == null) {
            synchronized (this.f88622cqumvgiudr) {
                try {
                    if (this.f88624iwizpuwonk == null) {
                        this.f88624iwizpuwonk = kegysxyocb();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f88624iwizpuwonk;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f88626yggfygwlhe;
        wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        tzroggbefp();
        inject();
    }
}
