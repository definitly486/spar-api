package vi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jh.xrmfcynszj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yggfygwlhe extends oxmwwwfdhm {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final hkdspvbjdz f116996cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private si.gtknphoqwx f116997iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final fi.wkgbmnqykc f116998istkbnxepw;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final fi.iobyxmoadg f116999pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private di.wflxmlrfwp f117000yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final xi.kcexrzcfyt f117001zynmafqrjb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yggfygwlhe(ii.ppxfxbqfkf fqName, yi.agtfadlqog storageManager, jh.lmojexxdyd module, di.wflxmlrfwp proto, fi.iobyxmoadg metadataVersion, xi.kcexrzcfyt kcexrzcfytVar) {
        super(fqName, storageManager, module);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metadataVersion, "metadataVersion");
        this.f116999pmvmpeiblj = metadataVersion;
        this.f117001zynmafqrjb = kcexrzcfytVar;
        di.rgvfuqvkyq rgvfuqvkyqVarMbcevpiqjq = proto.mbcevpiqjq();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(rgvfuqvkyqVarMbcevpiqjq, "getStrings(...)");
        di.ojitshcjhn ojitshcjhnVarTzroggbefp = proto.tzroggbefp();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ojitshcjhnVarTzroggbefp, "getQualifiedNames(...)");
        fi.wkgbmnqykc wkgbmnqykcVar = new fi.wkgbmnqykc(rgvfuqvkyqVarMbcevpiqjq, ojitshcjhnVarTzroggbefp);
        this.f116998istkbnxepw = wkgbmnqykcVar;
        this.f116996cdpycssgdh = new hkdspvbjdz(proto, wkgbmnqykcVar, metadataVersion, new kcexrzcfyt(this));
        this.f117000yadqdtsiqt = proto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection jrbgnlbqoe(yggfygwlhe yggfygwlheVar) {
        Collection collectionZoijcleaow = yggfygwlheVar.wizcaqwiak().zoijcleaow();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionZoijcleaow) {
            ii.zoijcleaow zoijcleaowVar = (ii.zoijcleaow) obj;
            if (!zoijcleaowVar.btonecajqb() && !draadjrbmk.f116889ppxfxbqfkf.iobyxmoadg().contains(zoijcleaowVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ii.zoijcleaow) it.next()).nufgyqmvbu());
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xrmfcynszj mhtqkkgtqm(yggfygwlhe yggfygwlheVar, ii.zoijcleaow it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        xi.kcexrzcfyt kcexrzcfytVar = yggfygwlheVar.f117001zynmafqrjb;
        if (kcexrzcfytVar != null) {
            return kcexrzcfytVar;
        }
        xrmfcynszj NO_SOURCE = xrmfcynszj.f51348iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // jh.hkdspvbjdz
    public si.gtknphoqwx agtfadlqog() {
        si.gtknphoqwx gtknphoqwxVar = this.f116997iozdgvuglv;
        if (gtknphoqwxVar != null) {
            return gtknphoqwxVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("_memberScope");
        return null;
    }

    @Override // vi.oxmwwwfdhm
    public void fyldjkxazc(agtfadlqog components) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(components, "components");
        di.wflxmlrfwp wflxmlrfwpVar = this.f117000yadqdtsiqt;
        if (wflxmlrfwpVar == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f117000yadqdtsiqt = null;
        di.draadjrbmk draadjrbmkVarStevsuqkhv = wflxmlrfwpVar.stevsuqkhv();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(draadjrbmkVarStevsuqkhv, "getPackage(...)");
        this.f116997iozdgvuglv = new xi.hkdspvbjdz(this, draadjrbmkVarStevsuqkhv, this.f116998istkbnxepw, this.f116999pmvmpeiblj, this.f117001zynmafqrjb, components, "scope of " + this, new zdlpuopuiu(this));
    }

    @Override // vi.oxmwwwfdhm
    /* JADX INFO: renamed from: ixidwrxhsl, reason: merged with bridge method [inline-methods] */
    public hkdspvbjdz wizcaqwiak() {
        return this.f116996cdpycssgdh;
    }
}
