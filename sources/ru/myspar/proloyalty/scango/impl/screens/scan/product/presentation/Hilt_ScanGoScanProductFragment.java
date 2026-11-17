package ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.crxdokpmqz;
import jp1.yggfygwlhe;
import ru.myspar.proloyalty.scango.impl.component.presentation.BaseScanGoMvvmFragment;
import sw0.eablkybsjg;
import xf.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Hilt_ScanGoScanProductFragment<VM extends eablkybsjg> extends BaseScanGoMvvmFragment<VM> implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Object f100917cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f100918esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile gxszxtbevo f100919iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f100920jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ContextWrapper f100921yggfygwlhe;

    Hilt_ScanGoScanProductFragment(int i13) {
        super(i13);
        this.f100917cqumvgiudr = new Object();
        this.f100918esjtqupxsv = false;
    }

    private void cllcsxoeiz() {
        if (this.f100921yggfygwlhe == null) {
            this.f100921yggfygwlhe = gxszxtbevo.zoijcleaow(super.getContext(), this);
            this.f100920jyumaefscl = tf.iobyxmoadg.iobyxmoadg(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f100920jyumaefscl) {
            return null;
        }
        cllcsxoeiz();
        return this.f100921yggfygwlhe;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.zoijcleaow(this, super.getDefaultViewModelProviderFactory());
    }

    protected gxszxtbevo hkdspvbjdz() {
        return new gxszxtbevo(this);
    }

    protected void inject() {
        if (this.f100918esjtqupxsv) {
            return;
        }
        this.f100918esjtqupxsv = true;
        ((yggfygwlhe) ojitshcjhn()).q0((ScanGoScanProductFragment) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: jpowsppfya, reason: merged with bridge method [inline-methods] */
    public final gxszxtbevo oxmwwwfdhm() {
        if (this.f100919iwizpuwonk == null) {
            synchronized (this.f100917cqumvgiudr) {
                try {
                    if (this.f100919iwizpuwonk == null) {
                        this.f100919iwizpuwonk = hkdspvbjdz();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f100919iwizpuwonk;
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        cllcsxoeiz();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(gxszxtbevo.ppxfxbqfkf(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f100921yggfygwlhe;
        zf.wkgbmnqykc.ppxfxbqfkf(contextWrapper == null || gxszxtbevo.wkgbmnqykc(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        cllcsxoeiz();
        inject();
    }
}
