package ru.myspar.proloyalty.story.impl.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.proloyalty.core.base.mvi.dialog.BaseComposeMviDialogFragment;
import wt1.lqeggnwhkg;
import xf.gxszxtbevo;
import zf.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_StoryFragment<Model, Event, UiLabel> extends BaseComposeMviDialogFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Object f101641cqumvgiudr = new Object();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f101642esjtqupxsv = false;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile gxszxtbevo f101643iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f101644jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ContextWrapper f101645yggfygwlhe;

    private void wypolnanlu() {
        if (this.f101645yggfygwlhe == null) {
            this.f101645yggfygwlhe = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f101644jyumaefscl = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: cllcsxoeiz, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f101643iwizpuwonk == null) {
            synchronized (this.f101641cqumvgiudr) {
                try {
                    if (this.f101643iwizpuwonk == null) {
                        this.f101643iwizpuwonk = dsvhmnatus();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f101643iwizpuwonk;
    }

    protected gxszxtbevo dsvhmnatus() {
        return new gxszxtbevo(this);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f101644jyumaefscl) {
            return null;
        }
        wypolnanlu();
        return this.f101645yggfygwlhe;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f101642esjtqupxsv) {
            return;
        }
        this.f101642esjtqupxsv = true;
        ((lqeggnwhkg) ojitshcjhn()).vipkmwdibw((StoryFragment) eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        wypolnanlu();
        inject();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f101645yggfygwlhe;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        wypolnanlu();
        inject();
    }
}
