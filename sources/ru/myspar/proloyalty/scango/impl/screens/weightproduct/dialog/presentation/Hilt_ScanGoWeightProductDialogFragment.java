package ru.myspar.proloyalty.scango.impl.screens.weightproduct.dialog.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import pp1.eablkybsjg;
import ru.myspar.proloyalty.scango.impl.component.presentation.BaseMviScanGoBottomSheetDialogFragment;
import xf.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_ScanGoWeightProductDialogFragment<Model, Event, UiLabel> extends BaseMviScanGoBottomSheetDialogFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Object f101096cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private volatile gxszxtbevo f101097istkbnxepw;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ContextWrapper f101098pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f101099yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f101100zynmafqrjb;

    Hilt_ScanGoWeightProductDialogFragment(int i13) {
        super(i13);
        this.f101096cdpycssgdh = new Object();
        this.f101099yadqdtsiqt = false;
    }

    private void uwvvkdfqfp() {
        if (this.f101098pmvmpeiblj == null) {
            this.f101098pmvmpeiblj = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f101100zynmafqrjb = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    protected gxszxtbevo czzsidtyhn() {
        return new gxszxtbevo(this);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f101100zynmafqrjb) {
            return null;
        }
        uwvvkdfqfp();
        return this.f101098pmvmpeiblj;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f101099yadqdtsiqt) {
            return;
        }
        this.f101099yadqdtsiqt = true;
        ((eablkybsjg) ojitshcjhn()).ntlheqmsrt((ScanGoWeightProductDialogFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        uwvvkdfqfp();
        inject();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f101097istkbnxepw == null) {
            synchronized (this.f101096cdpycssgdh) {
                try {
                    if (this.f101097istkbnxepw == null) {
                        this.f101097istkbnxepw = czzsidtyhn();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f101097istkbnxepw;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f101098pmvmpeiblj;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        uwvvkdfqfp();
        inject();
    }
}
