package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class hkdspvbjdz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final t2.iobyxmoadg.ppxfxbqfkf f9476iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final t2.iobyxmoadg.ppxfxbqfkf f9477ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final t2.iobyxmoadg.ppxfxbqfkf f9478zoijcleaow;

    public static final class iobyxmoadg implements crxdokpmqz.ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(ah.wkgbmnqykc modelClass, t2.iobyxmoadg extras) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
            return new wypolnanlu();
        }
    }

    public static final class ppxfxbqfkf implements t2.iobyxmoadg.ppxfxbqfkf {
    }

    public static final class wkgbmnqykc implements t2.iobyxmoadg.ppxfxbqfkf {
    }

    public static final class zoijcleaow implements t2.iobyxmoadg.ppxfxbqfkf {
    }

    static {
        t2.iobyxmoadg.C2684iobyxmoadg c2684iobyxmoadg = t2.iobyxmoadg.f109314zoijcleaow;
        f9476iobyxmoadg = new zoijcleaow();
        f9478zoijcleaow = new ppxfxbqfkf();
        f9477ppxfxbqfkf = new wkgbmnqykc();
    }

    public static final wypolnanlu eablkybsjg(ribwqtqdhb ribwqtqdhbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ribwqtqdhbVar, "<this>");
        return (wypolnanlu) crxdokpmqz.zoijcleaow.ppxfxbqfkf(crxdokpmqz.f9445zoijcleaow, ribwqtqdhbVar, new iobyxmoadg(), null, 4, null).ppxfxbqfkf("androidx.lifecycle.internal.SavedStateHandlesVM", kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(wypolnanlu.class));
    }

    private static final pkzmftpjix iobyxmoadg(q5.dxjokdxxww dxjokdxxwwVar, ribwqtqdhb ribwqtqdhbVar, String str, Bundle bundle) {
        dsvhmnatus dsvhmnatusVarWkgbmnqykc = wkgbmnqykc(dxjokdxxwwVar);
        wypolnanlu wypolnanluVarEablkybsjg = eablkybsjg(ribwqtqdhbVar);
        pkzmftpjix pkzmftpjixVar = (pkzmftpjix) wypolnanluVarEablkybsjg.gtknphoqwx().get(str);
        if (pkzmftpjixVar != null) {
            return pkzmftpjixVar;
        }
        pkzmftpjix pkzmftpjixVarIobyxmoadg = pkzmftpjix.f9541ppxfxbqfkf.iobyxmoadg(dsvhmnatusVarWkgbmnqykc.ppxfxbqfkf(str), bundle);
        wypolnanluVarEablkybsjg.gtknphoqwx().put(str, pkzmftpjixVarIobyxmoadg);
        return pkzmftpjixVarIobyxmoadg;
    }

    public static final void ppxfxbqfkf(q5.dxjokdxxww dxjokdxxwwVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        gtknphoqwx.zoijcleaow zoijcleaowVarZoijcleaow = dxjokdxxwwVar.getLifecycle().zoijcleaow();
        if (zoijcleaowVarZoijcleaow != gtknphoqwx.zoijcleaow.INITIALIZED && zoijcleaowVarZoijcleaow != gtknphoqwx.zoijcleaow.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (dxjokdxxwwVar.getSavedStateRegistry().zoijcleaow("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            dsvhmnatus dsvhmnatusVar = new dsvhmnatus(dxjokdxxwwVar.getSavedStateRegistry(), (ribwqtqdhb) dxjokdxxwwVar);
            dxjokdxxwwVar.getSavedStateRegistry().ppxfxbqfkf("androidx.lifecycle.internal.SavedStateHandlesProvider", dsvhmnatusVar);
            dxjokdxxwwVar.getLifecycle().iobyxmoadg(new hcddaimhww(dsvhmnatusVar));
        }
    }

    public static final dsvhmnatus wkgbmnqykc(q5.dxjokdxxww dxjokdxxwwVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        q5.gxszxtbevo.zoijcleaow zoijcleaowVarZoijcleaow = dxjokdxxwwVar.getSavedStateRegistry().zoijcleaow("androidx.lifecycle.internal.SavedStateHandlesProvider");
        dsvhmnatus dsvhmnatusVar = zoijcleaowVarZoijcleaow instanceof dsvhmnatus ? (dsvhmnatus) zoijcleaowVarZoijcleaow : null;
        if (dsvhmnatusVar != null) {
            return dsvhmnatusVar;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final pkzmftpjix zoijcleaow(t2.iobyxmoadg iobyxmoadgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        q5.dxjokdxxww dxjokdxxwwVar = (q5.dxjokdxxww) iobyxmoadgVar.iobyxmoadg(f9476iobyxmoadg);
        if (dxjokdxxwwVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ribwqtqdhb ribwqtqdhbVar = (ribwqtqdhb) iobyxmoadgVar.iobyxmoadg(f9478zoijcleaow);
        if (ribwqtqdhbVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) iobyxmoadgVar.iobyxmoadg(f9477ppxfxbqfkf);
        String str = (String) iobyxmoadgVar.iobyxmoadg(crxdokpmqz.f9444ppxfxbqfkf);
        if (str != null) {
            return iobyxmoadg(dxjokdxxwwVar, ribwqtqdhbVar, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }
}
