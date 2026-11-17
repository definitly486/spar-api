package ru.myspar.proloyalty.subscription.impl.survey;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment;
import xf.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_SubscriptionSurveyBottomSheetDialogFragment<Model> extends SimpleComposeBottomSheetDialogFragment<Model> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f101787cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private ContextWrapper f101789istkbnxepw;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private volatile gxszxtbevo f101791yadqdtsiqt;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final Object f101788iozdgvuglv = new Object();

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f101790lmojexxdyd = false;

    Hilt_SubscriptionSurveyBottomSheetDialogFragment() {
    }

    private void metgxyhuhe() {
        if (this.f101789istkbnxepw == null) {
            this.f101789istkbnxepw = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f101787cdpycssgdh = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f101787cdpycssgdh) {
            return null;
        }
        metgxyhuhe();
        return this.f101789istkbnxepw;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f101790lmojexxdyd) {
            return;
        }
        this.f101790lmojexxdyd = true;
        ((wkgbmnqykc) ojitshcjhn()).E0((SubscriptionSurveyBottomSheetDialogFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f101791yadqdtsiqt == null) {
            synchronized (this.f101788iozdgvuglv) {
                try {
                    if (this.f101791yadqdtsiqt == null) {
                        this.f101791yadqdtsiqt = xrmfcynszj();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f101791yadqdtsiqt;
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        metgxyhuhe();
        inject();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    protected gxszxtbevo xrmfcynszj() {
        return new gxszxtbevo(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f101789istkbnxepw;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        metgxyhuhe();
        inject();
    }
}
