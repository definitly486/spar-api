package ru.myspar.start_activity;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.wkgbmnqykc;
import androidx.lifecycle.crxdokpmqz;
import wkgbmnqykc.zoijcleaow;
import xf.lqeggnwhkg;
import zf.eablkybsjg;
import zf.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg extends wkgbmnqykc implements ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private volatile xf.iobyxmoadg f104286yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private lqeggnwhkg f104287zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object f104285jyumaefscl = new Object();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f104284iwizpuwonk = false;

    /* JADX INFO: renamed from: ru.myspar.start_activity.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C2520iobyxmoadg implements zoijcleaow {
        C2520iobyxmoadg() {
        }

        @Override // wkgbmnqykc.zoijcleaow
        public void iobyxmoadg(Context context) {
            iobyxmoadg.this.yadqdtsiqt();
        }
    }

    iobyxmoadg() {
        pmvmpeiblj();
    }

    private void cdpycssgdh() {
        if (getApplication() instanceof zf.zoijcleaow) {
            lqeggnwhkg lqeggnwhkgVarZoijcleaow = oxmwwwfdhm().zoijcleaow();
            this.f104287zdlpuopuiu = lqeggnwhkgVarZoijcleaow;
            if (lqeggnwhkgVarZoijcleaow.zoijcleaow()) {
                this.f104287zdlpuopuiu.ppxfxbqfkf(getDefaultViewModelCreationExtras());
            }
        }
    }

    private void pmvmpeiblj() {
        addOnContextAvailableListener(new C2520iobyxmoadg());
    }

    @Override // androidx.activity.nufgyqmvbu, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.iobyxmoadg(this, super.getDefaultViewModelProviderFactory());
    }

    protected xf.iobyxmoadg istkbnxepw() {
        return new xf.iobyxmoadg(this);
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, androidx.activity.nufgyqmvbu, androidx.core.app.lqeggnwhkg, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cdpycssgdh();
    }

    @Override // androidx.appcompat.app.wkgbmnqykc, androidx.fragment.app.oxmwwwfdhm, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        lqeggnwhkg lqeggnwhkgVar = this.f104287zdlpuopuiu;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.iobyxmoadg();
        }
    }

    protected void yadqdtsiqt() {
        if (this.f104284iwizpuwonk) {
            return;
        }
        this.f104284iwizpuwonk = true;
        ((q72.zoijcleaow) ojitshcjhn()).ppxfxbqfkf((StartActivity) eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: zynmafqrjb, reason: merged with bridge method [inline-methods] */
    public final xf.iobyxmoadg oxmwwwfdhm() {
        if (this.f104286yggfygwlhe == null) {
            synchronized (this.f104285jyumaefscl) {
                try {
                    if (this.f104286yggfygwlhe == null) {
                        this.f104286yggfygwlhe = istkbnxepw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f104286yggfygwlhe;
    }
}
