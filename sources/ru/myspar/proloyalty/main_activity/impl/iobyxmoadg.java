package ru.myspar.proloyalty.main_activity.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.crxdokpmqz;
import uc1.yggfygwlhe;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg extends sw0.iobyxmoadg implements zf.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private volatile xf.iobyxmoadg f97836yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private xf.lqeggnwhkg f97837zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object f97835jyumaefscl = new Object();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f97834iwizpuwonk = false;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.main_activity.impl.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C2313iobyxmoadg implements wkgbmnqykc.zoijcleaow {
        C2313iobyxmoadg() {
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
            this.f97837zdlpuopuiu = lqeggnwhkgVarZoijcleaow;
            if (lqeggnwhkgVarZoijcleaow.zoijcleaow()) {
                this.f97837zdlpuopuiu.ppxfxbqfkf(getDefaultViewModelCreationExtras());
            }
        }
    }

    private void zynmafqrjb() {
        addOnContextAvailableListener(new C2313iobyxmoadg());
    }

    protected xf.iobyxmoadg cdpycssgdh() {
        return new xf.iobyxmoadg(this);
    }

    @Override // androidx.activity.nufgyqmvbu, androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return wf.iobyxmoadg.iobyxmoadg(this, super.getDefaultViewModelProviderFactory());
    }

    protected void iozdgvuglv() {
        if (this.f97834iwizpuwonk) {
            return;
        }
        this.f97834iwizpuwonk = true;
        ((yggfygwlhe) ojitshcjhn()).zoijcleaow((MainActivity) zf.eablkybsjg.iobyxmoadg(this));
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: istkbnxepw, reason: merged with bridge method [inline-methods] */
    public final xf.iobyxmoadg oxmwwwfdhm() {
        if (this.f97836yggfygwlhe == null) {
            synchronized (this.f97835jyumaefscl) {
                try {
                    if (this.f97836yggfygwlhe == null) {
                        this.f97836yggfygwlhe = cdpycssgdh();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f97836yggfygwlhe;
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
        xf.lqeggnwhkg lqeggnwhkgVar = this.f97837zdlpuopuiu;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.iobyxmoadg();
        }
    }
}
