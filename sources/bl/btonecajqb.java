package bl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb extends dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final dxjokdxxww f16654eablkybsjg;

    public btonecajqb(dxjokdxxww delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f16654eablkybsjg = delegate;
    }

    @Override // bl.dxjokdxxww
    public lqeggnwhkg agtfadlqog(esjtqupxsv file) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        return this.f16654eablkybsjg.agtfadlqog(oxmwwwfdhm(file, "openReadOnly", "file"));
    }

    @Override // bl.dxjokdxxww
    public void dxjokdxxww(esjtqupxsv path, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "path");
        this.f16654eablkybsjg.dxjokdxxww(oxmwwwfdhm(path, "delete", "path"), z13);
    }

    @Override // bl.dxjokdxxww
    public List gtknphoqwx(esjtqupxsv dir) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dir, "dir");
        List listGtknphoqwx = this.f16654eablkybsjg.gtknphoqwx(oxmwwwfdhm(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = listGtknphoqwx.iterator();
        while (it.hasNext()) {
            arrayList.add(kcexrzcfyt((esjtqupxsv) it.next(), "list"));
        }
        hg.jyumaefscl.pmvmpeiblj(arrayList);
        return arrayList;
    }

    public esjtqupxsv kcexrzcfyt(esjtqupxsv path, String functionName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "path");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionName, "functionName");
        return path;
    }

    @Override // bl.dxjokdxxww
    public void lqeggnwhkg(esjtqupxsv dir, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dir, "dir");
        this.f16654eablkybsjg.lqeggnwhkg(oxmwwwfdhm(dir, "createDirectory", "dir"), z13);
    }

    public esjtqupxsv oxmwwwfdhm(esjtqupxsv path, String functionName, String parameterName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "path");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionName, "functionName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameterName, "parameterName");
        return path;
    }

    @Override // bl.dxjokdxxww
    public void ppxfxbqfkf(esjtqupxsv source, esjtqupxsv target) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(target, "target");
        this.f16654eablkybsjg.ppxfxbqfkf(oxmwwwfdhm(source, "atomicMove", AdRevenueConstants.SOURCE_KEY), oxmwwwfdhm(target, "atomicMove", "target"));
    }

    @Override // bl.dxjokdxxww
    public iozdgvuglv rgvfuqvkyq(esjtqupxsv file, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        return this.f16654eablkybsjg.rgvfuqvkyq(oxmwwwfdhm(file, "sink", "file"), z13);
    }

    public String toString() {
        return kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(getClass()).jyumaefscl() + '(' + this.f16654eablkybsjg + ')';
    }

    @Override // bl.dxjokdxxww
    public wwaezpbzkn vdvldrhtss(esjtqupxsv file) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        return this.f16654eablkybsjg.vdvldrhtss(oxmwwwfdhm(file, AdRevenueConstants.SOURCE_KEY, "file"));
    }

    @Override // bl.dxjokdxxww
    public nufgyqmvbu wflxmlrfwp(esjtqupxsv path) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "path");
        nufgyqmvbu nufgyqmvbuVarWflxmlrfwp = this.f16654eablkybsjg.wflxmlrfwp(oxmwwwfdhm(path, "metadataOrNull", "path"));
        if (nufgyqmvbuVarWflxmlrfwp == null) {
            return null;
        }
        return nufgyqmvbuVarWflxmlrfwp.eablkybsjg() == null ? nufgyqmvbuVarWflxmlrfwp : nufgyqmvbuVarWflxmlrfwp.iobyxmoadg((251 & 1) != 0 ? nufgyqmvbuVarWflxmlrfwp.f16726iobyxmoadg : false, (251 & 2) != 0 ? nufgyqmvbuVarWflxmlrfwp.f16731zoijcleaow : false, (251 & 4) != 0 ? nufgyqmvbuVarWflxmlrfwp.f16729ppxfxbqfkf : kcexrzcfyt(nufgyqmvbuVarWflxmlrfwp.eablkybsjg(), "metadataOrNull"), (251 & 8) != 0 ? nufgyqmvbuVarWflxmlrfwp.f16730wkgbmnqykc : null, (251 & 16) != 0 ? nufgyqmvbuVarWflxmlrfwp.f16724eablkybsjg : null, (251 & 32) != 0 ? nufgyqmvbuVarWflxmlrfwp.f16725gxszxtbevo : null, (251 & 64) != 0 ? nufgyqmvbuVarWflxmlrfwp.f16727lqeggnwhkg : null, (251 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nufgyqmvbuVarWflxmlrfwp.f16728nufgyqmvbu : null);
    }

    @Override // bl.dxjokdxxww
    public iozdgvuglv zoijcleaow(esjtqupxsv file, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        return this.f16654eablkybsjg.zoijcleaow(oxmwwwfdhm(file, "appendingSink", "file"), z13);
    }
}
