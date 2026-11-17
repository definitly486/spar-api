package vi;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jh.xrmfcynszj;

/* JADX INFO: loaded from: classes3.dex */
public final class hkdspvbjdz implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fi.ppxfxbqfkf f116918iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.draadjrbmk f116919ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f116920wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fi.iobyxmoadg f116921zoijcleaow;

    public hkdspvbjdz(di.wflxmlrfwp proto, fi.ppxfxbqfkf nameResolver, fi.iobyxmoadg metadataVersion, tg.draadjrbmk classSource) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classSource, "classSource");
        this.f116918iobyxmoadg = nameResolver;
        this.f116921zoijcleaow = metadataVersion;
        this.f116919ppxfxbqfkf = classSource;
        List listCllcsxoeiz = proto.cllcsxoeiz();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listCllcsxoeiz, "getClass_List(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(hg.jyumaefscl.cqumvgiudr(listCllcsxoeiz, 10)), 16));
        for (Object obj : listCllcsxoeiz) {
            linkedHashMap.put(jpowsppfya.iobyxmoadg(this.f116918iobyxmoadg, ((di.ppxfxbqfkf) obj).fyldjkxazc()), obj);
        }
        this.f116920wkgbmnqykc = linkedHashMap;
    }

    @Override // vi.btonecajqb
    public dxjokdxxww iobyxmoadg(ii.zoijcleaow classId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
        di.ppxfxbqfkf ppxfxbqfkfVar = (di.ppxfxbqfkf) this.f116920wkgbmnqykc.get(classId);
        if (ppxfxbqfkfVar == null) {
            return null;
        }
        return new dxjokdxxww(this.f116918iobyxmoadg, ppxfxbqfkfVar, this.f116921zoijcleaow, (xrmfcynszj) this.f116919ppxfxbqfkf.invoke(classId));
    }

    public final Collection zoijcleaow() {
        return this.f116920wkgbmnqykc.keySet();
    }
}
