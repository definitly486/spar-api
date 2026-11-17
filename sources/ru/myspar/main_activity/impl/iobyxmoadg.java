package ru.myspar.main_activity.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.crxdokpmqz;
import qf0.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg extends vx.iobyxmoadg implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private volatile xf.iobyxmoadg f90439yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private xf.lqeggnwhkg f90440zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object f90438jyumaefscl = new Object();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f90437iwizpuwonk = false;

    /* JADX INFO: renamed from: ru.myspar.main_activity.impl.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C2078iobyxmoadg implements wkgbmnqykc.zoijcleaow {
        C2078iobyxmoadg() {
        }

        @Override // wkgbmnqykc.zoijcleaow
        public void iobyxmoadg(Context context) {
            iobyxmoadg.this.iozdgvuglv();
        }
    }

    iobyxmoadg() {
        zynmafqrjb();
    }

    private void yadqdtsiqt() {
        if (getApplication() instanceof zf.zoijcleaow) {
            xf.lqeggnwhkg lqeggnwhkgVarZoijcleaow = oxmwwwfdhm().zoijcleaow();
            this.f90440zdlpuopuiu = lqeggnwhkgVarZoijcleaow;
            if (lqeggnwhkgVarZoijcleaow.zoijcleaow()) {
                this.f90440zdlpuopuiu.ppxfxbqfkf(getDefaultViewModelCreationExtras());
            }
        }
    }

    private void zynmafqrjb() {
        addOnContextAvailableListener(new C2078iobyxmoadg());
    }

    protected xf.iobyxmoadg cdpycssgdh() {
        return new xf.iobyxmoadg(this);
    }

    @Override // androidx.activity.nufgyqmvbu, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.iobyxmoadg(this, super.getDefaultViewModelProviderFactory());
    }

    protected void iozdgvuglv() {
        if (this.f90437iwizpuwonk) {
            return;
        }
        this.f90437iwizpuwonk = true;
        ((zdlpuopuiu) ojitshcjhn()).eablkybsjg((MainActivity) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: istkbnxepw, reason: merged with bridge method [inline-methods] */
    public final xf.iobyxmoadg oxmwwwfdhm() {
        if (this.f90439yggfygwlhe == null) {
            synchronized (this.f90438jyumaefscl) {
                try {
                    if (this.f90439yggfygwlhe == null) {
                        this.f90439yggfygwlhe = cdpycssgdh();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f90439yggfygwlhe;
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, androidx.activity.nufgyqmvbu, androidx.core.app.lqeggnwhkg, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yadqdtsiqt();
    }

    @Override // androidx.appcompat.app.wkgbmnqykc, androidx.fragment.app.oxmwwwfdhm, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        xf.lqeggnwhkg lqeggnwhkgVar = this.f90440zdlpuopuiu;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.iobyxmoadg();
        }
    }
}
