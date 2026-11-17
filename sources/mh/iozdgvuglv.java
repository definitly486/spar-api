package mh;

import hg.ikoacuggdj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class iozdgvuglv extends wflxmlrfwp implements jh.lmojexxdyd {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final yi.lqeggnwhkg f67027cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ii.gxszxtbevo f67028cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Map f67029esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f67030istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gh.dxjokdxxww f67031iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final yi.agtfadlqog f67032jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ylkuphrtab f67033lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private zynmafqrjb f67034pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final gg.gtknphoqwx f67035yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private jh.cllcsxoeiz f67036zynmafqrjb;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iozdgvuglv(ii.gxszxtbevo moduleName, yi.agtfadlqog storageManager, gh.dxjokdxxww builtIns, ji.iobyxmoadg iobyxmoadgVar) {
        this(moduleName, storageManager, builtIns, iobyxmoadgVar, null, null, 48, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(moduleName, "moduleName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builtIns, "builtIns");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.mbcevpiqjq ezmngbhpjk(iozdgvuglv iozdgvuglvVar, ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        return iozdgvuglvVar.f67033lereixgezr.iobyxmoadg(iozdgvuglvVar, fqName, iozdgvuglvVar.f67032jyumaefscl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final draadjrbmk fmlbqenlif(iozdgvuglv iozdgvuglvVar) {
        zynmafqrjb zynmafqrjbVar = iozdgvuglvVar.f67034pmvmpeiblj;
        if (zynmafqrjbVar == null) {
            throw new AssertionError("Dependencies of module " + iozdgvuglvVar.fyldjkxazc() + " were not set before querying module content");
        }
        List listIobyxmoadg = zynmafqrjbVar.iobyxmoadg();
        iozdgvuglvVar.ageimvtcrz();
        listIobyxmoadg.contains(iozdgvuglvVar);
        Iterator it = listIobyxmoadg.iterator();
        while (it.hasNext()) {
            ((iozdgvuglv) it.next()).ixidwrxhsl();
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIobyxmoadg, 10));
        Iterator it2 = listIobyxmoadg.iterator();
        while (it2.hasNext()) {
            jh.cllcsxoeiz cllcsxoeizVar = ((iozdgvuglv) it2.next()).f67036zynmafqrjb;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(cllcsxoeizVar);
            arrayList.add(cllcsxoeizVar);
        }
        return new draadjrbmk(arrayList, "CompositeProvider@ModuleDescriptor for " + iozdgvuglvVar.getName());
    }

    private final String fyldjkxazc() {
        String string = getName().toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    private final draadjrbmk grlcpdaxtj() {
        return (draadjrbmk) this.f67035yadqdtsiqt.getValue();
    }

    private final boolean ixidwrxhsl() {
        return this.f67036zynmafqrjb != null;
    }

    public void ageimvtcrz() {
        if (jrbgnlbqoe()) {
            return;
        }
        jh.zynmafqrjb.iobyxmoadg(this);
    }

    public final void eslsurpljm(zynmafqrjb dependencies) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dependencies, "dependencies");
        this.f67034pmvmpeiblj = dependencies;
    }

    public final jh.cllcsxoeiz ipoelvxyzq() {
        ageimvtcrz();
        return grlcpdaxtj();
    }

    @Override // jh.lmojexxdyd
    public boolean iwizpuwonk(jh.lmojexxdyd targetModule) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(targetModule, "targetModule");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this, targetModule)) {
            return true;
        }
        zynmafqrjb zynmafqrjbVar = this.f67034pmvmpeiblj;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zynmafqrjbVar);
        return hg.jyumaefscl.xrmfcynszj(zynmafqrjbVar.ppxfxbqfkf(), targetModule) || roivzttewh().contains(targetModule) || targetModule.roivzttewh().contains(this);
    }

    public boolean jrbgnlbqoe() {
        return this.f67030istkbnxepw;
    }

    public final void krqnebusok(iozdgvuglv... descriptors) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptors, "descriptors");
        rhgxfdycjh(hg.agtfadlqog.i(descriptors));
    }

    public final void mhtqkkgtqm(jh.cllcsxoeiz providerForModuleContent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(providerForModuleContent, "providerForModuleContent");
        ixidwrxhsl();
        this.f67036zynmafqrjb = providerForModuleContent;
    }

    @Override // jh.lmojexxdyd
    public Collection oxmwwwfdhm(ii.ppxfxbqfkf fqName, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        ageimvtcrz();
        return ipoelvxyzq().oxmwwwfdhm(fqName, nameFilter);
    }

    public final void rhgxfdycjh(List descriptors) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptors, "descriptors");
        yzdjzghtvl(descriptors, ikoacuggdj.eablkybsjg());
    }

    @Override // jh.lmojexxdyd
    public List roivzttewh() {
        zynmafqrjb zynmafqrjbVar = this.f67034pmvmpeiblj;
        if (zynmafqrjbVar != null) {
            return zynmafqrjbVar.zoijcleaow();
        }
        throw new AssertionError("Dependencies of module " + fyldjkxazc() + " were not set");
    }

    @Override // jh.wflxmlrfwp
    public Object tbqsvytpvh(jh.ojitshcjhn ojitshcjhnVar, Object obj) {
        return jh.lmojexxdyd.iobyxmoadg.iobyxmoadg(this, ojitshcjhnVar, obj);
    }

    @Override // mh.wflxmlrfwp
    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        if (!jrbgnlbqoe()) {
            sb3.append(" !isValid");
        }
        sb3.append(" packageFragmentProvider: ");
        jh.cllcsxoeiz cllcsxoeizVar = this.f67036zynmafqrjb;
        sb3.append(cllcsxoeizVar != null ? cllcsxoeizVar.getClass().getSimpleName() : null);
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    @Override // jh.lmojexxdyd
    public Object weqkydbzbr(jh.iozdgvuglv capability) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(capability, "capability");
        Object obj = this.f67029esjtqupxsv.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // jh.lmojexxdyd
    public gh.dxjokdxxww wflxmlrfwp() {
        return this.f67031iwizpuwonk;
    }

    @Override // jh.lmojexxdyd
    public jh.mbcevpiqjq wwaezpbzkn(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        ageimvtcrz();
        return (jh.mbcevpiqjq) this.f67027cdpycssgdh.invoke(fqName);
    }

    public final void yzdjzghtvl(List descriptors, Set friends) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptors, "descriptors");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(friends, "friends");
        eslsurpljm(new istkbnxepw(descriptors, friends, hg.jyumaefscl.wflxmlrfwp(), ikoacuggdj.eablkybsjg()));
    }

    @Override // jh.wflxmlrfwp
    public jh.wflxmlrfwp zoijcleaow() {
        return jh.lmojexxdyd.iobyxmoadg.zoijcleaow(this);
    }

    public /* synthetic */ iozdgvuglv(ii.gxszxtbevo gxszxtbevoVar, yi.agtfadlqog agtfadlqogVar, gh.dxjokdxxww dxjokdxxwwVar, ji.iobyxmoadg iobyxmoadgVar, Map map, ii.gxszxtbevo gxszxtbevoVar2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(gxszxtbevoVar, agtfadlqogVar, dxjokdxxwwVar, (i13 & 8) != 0 ? null : iobyxmoadgVar, (i13 & 16) != 0 ? hg.tzroggbefp.dxjokdxxww() : map, (i13 & 32) != 0 ? null : gxszxtbevoVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iozdgvuglv(ii.gxszxtbevo moduleName, yi.agtfadlqog storageManager, gh.dxjokdxxww builtIns, ji.iobyxmoadg iobyxmoadgVar, Map capabilities, ii.gxszxtbevo gxszxtbevoVar) {
        super(kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow(), moduleName);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(moduleName, "moduleName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builtIns, "builtIns");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(capabilities, "capabilities");
        this.f67032jyumaefscl = storageManager;
        this.f67031iwizpuwonk = builtIns;
        this.f67028cqumvgiudr = gxszxtbevoVar;
        if (moduleName.lqeggnwhkg()) {
            this.f67029esjtqupxsv = capabilities;
            ylkuphrtab ylkuphrtabVar = (ylkuphrtab) weqkydbzbr(ylkuphrtab.f67182iobyxmoadg.iobyxmoadg());
            this.f67033lereixgezr = ylkuphrtabVar == null ? ylkuphrtab.zoijcleaow.f67185zoijcleaow : ylkuphrtabVar;
            this.f67030istkbnxepw = true;
            this.f67027cdpycssgdh = storageManager.dxjokdxxww(new cdpycssgdh(this));
            this.f67035yadqdtsiqt = gg.draadjrbmk.zoijcleaow(new yadqdtsiqt(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }
}
