package ru.myspar.scango.impl.screens.weightproduct.dialog.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import ru.myspar.scango.impl.component.presentation.BaseMviScanGoBottomSheetDialogFragment;
import t32.eablkybsjg;
import xf.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_ScanGoWeightProductDialogFragment<Model, Event, UiLabel> extends BaseMviScanGoBottomSheetDialogFragment<Model, Event, UiLabel> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Object f103753cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private volatile gxszxtbevo f103754istkbnxepw;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ContextWrapper f103755pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f103756yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f103757zynmafqrjb;

    Hilt_ScanGoWeightProductDialogFragment(int i13) {
        super(i13);
        this.f103753cdpycssgdh = new Object();
        this.f103756yadqdtsiqt = false;
    }

    private void uwvvkdfqfp() {
        if (this.f103755pmvmpeiblj == null) {
            this.f103755pmvmpeiblj = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f103757zynmafqrjb = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    protected gxszxtbevo czzsidtyhn() {
        return new gxszxtbevo(this);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f103757zynmafqrjb) {
            return null;
        }
        uwvvkdfqfp();
        return this.f103755pmvmpeiblj;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f103756yadqdtsiqt) {
            return;
        }
        this.f103756yadqdtsiqt = true;
        ((eablkybsjg) ojitshcjhn()).r1((ScanGoWeightProductDialogFragment) zf.eablkybsjg.iobyxmoadg(this));
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
        if (this.f103754istkbnxepw == null) {
            synchronized (this.f103753cdpycssgdh) {
                try {
                    if (this.f103754istkbnxepw == null) {
                        this.f103754istkbnxepw = czzsidtyhn();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f103754istkbnxepw;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f103755pmvmpeiblj;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        uwvvkdfqfp();
        inject();
    }
}
