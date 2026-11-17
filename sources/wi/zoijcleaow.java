package wi;

import ah.gxszxtbevo;
import gh.ojitshcjhn;
import hg.jyumaefscl;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import jh.jpowsppfya;
import jh.lmojexxdyd;
import jh.stevsuqkhv;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.rgvfuqvkyq;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import vi.cqumvgiudr;
import vi.iwizpuwonk;
import vi.vdvldrhtss;
import vi.wflxmlrfwp;
import vi.zynmafqrjb;
import yi.agtfadlqog;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements gh.zoijcleaow {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f119908zoijcleaow = new wkgbmnqykc();

    /* synthetic */ class iobyxmoadg extends rgvfuqvkyq implements draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo, ah.ppxfxbqfkf
        public final String getName() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final gxszxtbevo getOwner() {
            return cllcsxoeiz.zoijcleaow(wkgbmnqykc.class);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return ((wkgbmnqykc) this.receiver).iobyxmoadg(p13);
        }
    }

    @Override // gh.zoijcleaow
    public jh.cllcsxoeiz iobyxmoadg(agtfadlqog storageManager, lmojexxdyd builtInsModule, Iterable classDescriptorFactories, lh.ppxfxbqfkf platformDependentDeclarationFilter, lh.iobyxmoadg additionalClassPartsProvider, boolean z13) {
        zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        zdlpuopuiu.btonecajqb(builtInsModule, "builtInsModule");
        zdlpuopuiu.btonecajqb(classDescriptorFactories, "classDescriptorFactories");
        zdlpuopuiu.btonecajqb(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        zdlpuopuiu.btonecajqb(additionalClassPartsProvider, "additionalClassPartsProvider");
        return zoijcleaow(storageManager, builtInsModule, ojitshcjhn.f37267wwaezpbzkn, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z13, new iobyxmoadg(this.f119908zoijcleaow));
    }

    public final jh.cllcsxoeiz zoijcleaow(agtfadlqog storageManager, lmojexxdyd module, Set packageFqNames, Iterable classDescriptorFactories, lh.ppxfxbqfkf platformDependentDeclarationFilter, lh.iobyxmoadg additionalClassPartsProvider, boolean z13, draadjrbmk loadResource) {
        zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        zdlpuopuiu.btonecajqb(module, "module");
        zdlpuopuiu.btonecajqb(packageFqNames, "packageFqNames");
        zdlpuopuiu.btonecajqb(classDescriptorFactories, "classDescriptorFactories");
        zdlpuopuiu.btonecajqb(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        zdlpuopuiu.btonecajqb(additionalClassPartsProvider, "additionalClassPartsProvider");
        zdlpuopuiu.btonecajqb(loadResource, "loadResource");
        Set<ii.ppxfxbqfkf> set = packageFqNames;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(set, 10));
        for (ii.ppxfxbqfkf ppxfxbqfkfVar : set) {
            String strOxmwwwfdhm = wi.iobyxmoadg.f119905oxmwwwfdhm.oxmwwwfdhm(ppxfxbqfkfVar);
            InputStream inputStream = (InputStream) loadResource.invoke(strOxmwwwfdhm);
            if (inputStream == null) {
                throw new IllegalStateException("Resource not found in classpath: " + strOxmwwwfdhm);
            }
            arrayList.add(ppxfxbqfkf.f119906wwaezpbzkn.iobyxmoadg(ppxfxbqfkfVar, storageManager, module, inputStream, z13));
        }
        stevsuqkhv stevsuqkhvVar = new stevsuqkhv(arrayList);
        jpowsppfya jpowsppfyaVar = new jpowsppfya(storageManager, module);
        vi.ojitshcjhn.iobyxmoadg iobyxmoadgVar = vi.ojitshcjhn.iobyxmoadg.f116944iobyxmoadg;
        vdvldrhtss vdvldrhtssVar = new vdvldrhtss(stevsuqkhvVar);
        wi.iobyxmoadg iobyxmoadgVar2 = wi.iobyxmoadg.f119905oxmwwwfdhm;
        vi.gxszxtbevo gxszxtbevoVar = new vi.gxszxtbevo(module, jpowsppfyaVar, iobyxmoadgVar2);
        zynmafqrjb.iobyxmoadg iobyxmoadgVar3 = zynmafqrjb.iobyxmoadg.f117007iobyxmoadg;
        iwizpuwonk DO_NOTHING = iwizpuwonk.f116930iobyxmoadg;
        zdlpuopuiu.dxjokdxxww(DO_NOTHING, "DO_NOTHING");
        vi.agtfadlqog agtfadlqogVar = new vi.agtfadlqog(storageManager, module, iobyxmoadgVar, vdvldrhtssVar, gxszxtbevoVar, stevsuqkhvVar, iobyxmoadgVar3, DO_NOTHING, rh.ppxfxbqfkf.iobyxmoadg.f82607iobyxmoadg, cqumvgiudr.iobyxmoadg.f116887iobyxmoadg, classDescriptorFactories, jpowsppfyaVar, wflxmlrfwp.f116976iobyxmoadg.iobyxmoadg(), additionalClassPartsProvider, platformDependentDeclarationFilter, iobyxmoadgVar2.eablkybsjg(), null, new ri.zoijcleaow(storageManager, jyumaefscl.wflxmlrfwp()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ppxfxbqfkf) it.next()).fyldjkxazc(agtfadlqogVar);
        }
        return stevsuqkhvVar;
    }
}
