package t2;

import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ntlheqmsrt;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jlmebxxoox f109317iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f109318ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final u2.gxszxtbevo f109319wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final crxdokpmqz.ppxfxbqfkf f109320zoijcleaow;

    public lqeggnwhkg(jlmebxxoox store, crxdokpmqz.ppxfxbqfkf factory, iobyxmoadg defaultExtras) {
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(factory, "factory");
        zdlpuopuiu.btonecajqb(defaultExtras, "defaultExtras");
        this.f109317iobyxmoadg = store;
        this.f109320zoijcleaow = factory;
        this.f109318ppxfxbqfkf = defaultExtras;
        this.f109319wkgbmnqykc = new u2.gxszxtbevo();
    }

    public static /* synthetic */ ntlheqmsrt eablkybsjg(lqeggnwhkg lqeggnwhkgVar, ah.wkgbmnqykc wkgbmnqykcVar, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = u2.nufgyqmvbu.f112511iobyxmoadg.eablkybsjg(wkgbmnqykcVar);
        }
        return lqeggnwhkgVar.wkgbmnqykc(wkgbmnqykcVar, str);
    }

    public final ntlheqmsrt wkgbmnqykc(ah.wkgbmnqykc modelClass, String key) {
        ntlheqmsrt ntlheqmsrtVarZoijcleaow;
        zdlpuopuiu.btonecajqb(modelClass, "modelClass");
        zdlpuopuiu.btonecajqb(key, "key");
        synchronized (this.f109319wkgbmnqykc) {
            try {
                ntlheqmsrtVarZoijcleaow = this.f109317iobyxmoadg.zoijcleaow(key);
                if (modelClass.zdlpuopuiu(ntlheqmsrtVarZoijcleaow)) {
                    if (this.f109320zoijcleaow instanceof crxdokpmqz.eablkybsjg) {
                        crxdokpmqz.eablkybsjg eablkybsjgVar = (crxdokpmqz.eablkybsjg) this.f109320zoijcleaow;
                        zdlpuopuiu.lqeggnwhkg(ntlheqmsrtVarZoijcleaow);
                        eablkybsjgVar.iobyxmoadg(ntlheqmsrtVarZoijcleaow);
                    }
                    zdlpuopuiu.nufgyqmvbu(ntlheqmsrtVarZoijcleaow, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f109318ppxfxbqfkf);
                    wkgbmnqykcVar.ppxfxbqfkf(crxdokpmqz.f9444ppxfxbqfkf, key);
                    ntlheqmsrtVarZoijcleaow = nufgyqmvbu.iobyxmoadg(this.f109320zoijcleaow, modelClass, wkgbmnqykcVar);
                    this.f109317iobyxmoadg.wkgbmnqykc(key, ntlheqmsrtVarZoijcleaow);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ntlheqmsrtVarZoijcleaow;
    }
}
