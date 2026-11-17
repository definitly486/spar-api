package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class jyumaefscl implements gxszxtbevo, gxszxtbevo.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private volatile Object f20889cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private volatile r8.agtfadlqog.iobyxmoadg f20890esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile ppxfxbqfkf f20891iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile int f20892jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private volatile wkgbmnqykc f20893lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final gxszxtbevo.iobyxmoadg f20894yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lqeggnwhkg f20895zdlpuopuiu;

    class iobyxmoadg implements com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ r8.agtfadlqog.iobyxmoadg f20897zdlpuopuiu;

        iobyxmoadg(r8.agtfadlqog.iobyxmoadg iobyxmoadgVar) {
            this.f20897zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg
        public void gxszxtbevo(Object obj) {
            if (jyumaefscl.this.lqeggnwhkg(this.f20897zdlpuopuiu)) {
                jyumaefscl.this.nufgyqmvbu(this.f20897zdlpuopuiu, obj);
            }
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg
        public void ppxfxbqfkf(Exception exc) {
            if (jyumaefscl.this.lqeggnwhkg(this.f20897zdlpuopuiu)) {
                jyumaefscl.this.dxjokdxxww(this.f20897zdlpuopuiu, exc);
            }
        }
    }

    jyumaefscl(lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        this.f20895zdlpuopuiu = lqeggnwhkgVar;
        this.f20894yggfygwlhe = iobyxmoadgVar;
    }

    private void btonecajqb(r8.agtfadlqog.iobyxmoadg iobyxmoadgVar) {
        this.f20890esjtqupxsv.f82021ppxfxbqfkf.eablkybsjg(this.f20895zdlpuopuiu.draadjrbmk(), new iobyxmoadg(iobyxmoadgVar));
    }

    private boolean eablkybsjg(Object obj) throws Throwable {
        long jZoijcleaow = g9.lqeggnwhkg.zoijcleaow();
        boolean z13 = false;
        try {
            com.bumptech.glide.load.data.eablkybsjg eablkybsjgVarOjitshcjhn = this.f20895zdlpuopuiu.ojitshcjhn(obj);
            Object objIobyxmoadg = eablkybsjgVarOjitshcjhn.iobyxmoadg();
            l8.wkgbmnqykc wkgbmnqykcVarVdvldrhtss = this.f20895zdlpuopuiu.vdvldrhtss(objIobyxmoadg);
            eablkybsjg eablkybsjgVar = new eablkybsjg(wkgbmnqykcVarVdvldrhtss, objIobyxmoadg, this.f20895zdlpuopuiu.gtknphoqwx());
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f20890esjtqupxsv.f82020iobyxmoadg, this.f20895zdlpuopuiu.rgvfuqvkyq());
            p8.iobyxmoadg iobyxmoadgVarWkgbmnqykc = this.f20895zdlpuopuiu.wkgbmnqykc();
            iobyxmoadgVarWkgbmnqykc.zoijcleaow(wkgbmnqykcVar, eablkybsjgVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + wkgbmnqykcVar + ", data: " + obj + ", encoder: " + wkgbmnqykcVarVdvldrhtss + ", duration: " + g9.lqeggnwhkg.iobyxmoadg(jZoijcleaow));
            }
            if (iobyxmoadgVarWkgbmnqykc.iobyxmoadg(wkgbmnqykcVar) != null) {
                this.f20893lereixgezr = wkgbmnqykcVar;
                this.f20891iwizpuwonk = new ppxfxbqfkf(Collections.singletonList(this.f20890esjtqupxsv.f82020iobyxmoadg), this.f20895zdlpuopuiu, this);
                this.f20890esjtqupxsv.f82021ppxfxbqfkf.zoijcleaow();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f20893lereixgezr + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f20894yggfygwlhe.wkgbmnqykc(this.f20890esjtqupxsv.f82020iobyxmoadg, eablkybsjgVarOjitshcjhn.iobyxmoadg(), this.f20890esjtqupxsv.f82021ppxfxbqfkf, this.f20890esjtqupxsv.f82021ppxfxbqfkf.wkgbmnqykc(), this.f20890esjtqupxsv.f82020iobyxmoadg);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z13 = true;
                if (!z13) {
                    this.f20890esjtqupxsv.f82021ppxfxbqfkf.zoijcleaow();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean gxszxtbevo() {
        return this.f20892jyumaefscl < this.f20895zdlpuopuiu.lqeggnwhkg().size();
    }

    @Override // com.bumptech.glide.load.engine.gxszxtbevo
    public void cancel() {
        r8.agtfadlqog.iobyxmoadg iobyxmoadgVar = this.f20890esjtqupxsv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.f82021ppxfxbqfkf.cancel();
        }
    }

    void dxjokdxxww(r8.agtfadlqog.iobyxmoadg iobyxmoadgVar, Exception exc) {
        gxszxtbevo.iobyxmoadg iobyxmoadgVar2 = this.f20894yggfygwlhe;
        wkgbmnqykc wkgbmnqykcVar = this.f20893lereixgezr;
        com.bumptech.glide.load.data.wkgbmnqykc wkgbmnqykcVar2 = iobyxmoadgVar.f82021ppxfxbqfkf;
        iobyxmoadgVar2.iobyxmoadg(wkgbmnqykcVar, exc, wkgbmnqykcVar2, wkgbmnqykcVar2.wkgbmnqykc());
    }

    @Override // com.bumptech.glide.load.engine.gxszxtbevo.iobyxmoadg
    public void iobyxmoadg(l8.eablkybsjg eablkybsjgVar, Exception exc, com.bumptech.glide.load.data.wkgbmnqykc wkgbmnqykcVar, l8.iobyxmoadg iobyxmoadgVar) {
        this.f20894yggfygwlhe.iobyxmoadg(eablkybsjgVar, exc, wkgbmnqykcVar, this.f20890esjtqupxsv.f82021ppxfxbqfkf.wkgbmnqykc());
    }

    boolean lqeggnwhkg(r8.agtfadlqog.iobyxmoadg iobyxmoadgVar) {
        r8.agtfadlqog.iobyxmoadg iobyxmoadgVar2 = this.f20890esjtqupxsv;
        return iobyxmoadgVar2 != null && iobyxmoadgVar2 == iobyxmoadgVar;
    }

    void nufgyqmvbu(r8.agtfadlqog.iobyxmoadg iobyxmoadgVar, Object obj) {
        n8.iobyxmoadg iobyxmoadgVarEablkybsjg = this.f20895zdlpuopuiu.eablkybsjg();
        if (obj != null && iobyxmoadgVarEablkybsjg.ppxfxbqfkf(iobyxmoadgVar.f82021ppxfxbqfkf.wkgbmnqykc())) {
            this.f20889cqumvgiudr = obj;
            this.f20894yggfygwlhe.ppxfxbqfkf();
        } else {
            gxszxtbevo.iobyxmoadg iobyxmoadgVar2 = this.f20894yggfygwlhe;
            l8.eablkybsjg eablkybsjgVar = iobyxmoadgVar.f82020iobyxmoadg;
            com.bumptech.glide.load.data.wkgbmnqykc wkgbmnqykcVar = iobyxmoadgVar.f82021ppxfxbqfkf;
            iobyxmoadgVar2.wkgbmnqykc(eablkybsjgVar, obj, wkgbmnqykcVar, wkgbmnqykcVar.wkgbmnqykc(), this.f20893lereixgezr);
        }
    }

    @Override // com.bumptech.glide.load.engine.gxszxtbevo.iobyxmoadg
    public void ppxfxbqfkf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.gxszxtbevo.iobyxmoadg
    public void wkgbmnqykc(l8.eablkybsjg eablkybsjgVar, Object obj, com.bumptech.glide.load.data.wkgbmnqykc wkgbmnqykcVar, l8.iobyxmoadg iobyxmoadgVar, l8.eablkybsjg eablkybsjgVar2) {
        this.f20894yggfygwlhe.wkgbmnqykc(eablkybsjgVar, obj, wkgbmnqykcVar, this.f20890esjtqupxsv.f82021ppxfxbqfkf.wkgbmnqykc(), eablkybsjgVar);
    }

    @Override // com.bumptech.glide.load.engine.gxszxtbevo
    public boolean zoijcleaow() {
        if (this.f20889cqumvgiudr != null) {
            Object obj = this.f20889cqumvgiudr;
            this.f20889cqumvgiudr = null;
            try {
                if (!eablkybsjg(obj)) {
                    return true;
                }
            } catch (IOException e13) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e13);
                }
            }
        }
        if (this.f20891iwizpuwonk != null && this.f20891iwizpuwonk.zoijcleaow()) {
            return true;
        }
        this.f20891iwizpuwonk = null;
        this.f20890esjtqupxsv = null;
        boolean z13 = false;
        while (!z13 && gxszxtbevo()) {
            List listLqeggnwhkg = this.f20895zdlpuopuiu.lqeggnwhkg();
            int i13 = this.f20892jyumaefscl;
            this.f20892jyumaefscl = i13 + 1;
            this.f20890esjtqupxsv = (r8.agtfadlqog.iobyxmoadg) listLqeggnwhkg.get(i13);
            if (this.f20890esjtqupxsv != null && (this.f20895zdlpuopuiu.eablkybsjg().ppxfxbqfkf(this.f20890esjtqupxsv.f82021ppxfxbqfkf.wkgbmnqykc()) || this.f20895zdlpuopuiu.yggfygwlhe(this.f20890esjtqupxsv.f82021ppxfxbqfkf.iobyxmoadg()))) {
                btonecajqb(this.f20890esjtqupxsv);
                z13 = true;
            }
        }
        return z13;
    }
}
