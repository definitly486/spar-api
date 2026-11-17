package xi;

import hg.ikoacuggdj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class hkdspvbjdz extends iwizpuwonk {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ii.ppxfxbqfkf f122441dxjokdxxww;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final jh.hkdspvbjdz f122442lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f122443nufgyqmvbu;

    public hkdspvbjdz(jh.hkdspvbjdz packageDescriptor, di.draadjrbmk proto, fi.ppxfxbqfkf nameResolver, fi.iobyxmoadg metadataVersion, kcexrzcfyt kcexrzcfytVar, vi.agtfadlqog components, String debugName, tg.iobyxmoadg classNames) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(packageDescriptor, "packageDescriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(components, "components");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(debugName, "debugName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classNames, "classNames");
        di.zdlpuopuiu zdlpuopuiuVarVipkmwdibw = proto.vipkmwdibw();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarVipkmwdibw, "getTypeTable(...)");
        fi.lqeggnwhkg lqeggnwhkgVar = new fi.lqeggnwhkg(zdlpuopuiuVarVipkmwdibw);
        fi.nufgyqmvbu.iobyxmoadg iobyxmoadgVar = fi.nufgyqmvbu.f33904zoijcleaow;
        di.iwizpuwonk iwizpuwonkVarJhduphickx = proto.jhduphickx();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iwizpuwonkVarJhduphickx, "getVersionRequirementTable(...)");
        vi.rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg = components.iobyxmoadg(packageDescriptor, nameResolver, lqeggnwhkgVar, iobyxmoadgVar.iobyxmoadg(iwizpuwonkVarJhduphickx), metadataVersion, kcexrzcfytVar);
        List listMbcevpiqjq = proto.mbcevpiqjq();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listMbcevpiqjq, "getFunctionList(...)");
        List listSopmlzcsov = proto.sopmlzcsov();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listSopmlzcsov, "getPropertyList(...)");
        List listRibwqtqdhb = proto.ribwqtqdhb();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listRibwqtqdhb, "getTypeAliasList(...)");
        super(rgvfuqvkyqVarIobyxmoadg, listMbcevpiqjq, listSopmlzcsov, listRibwqtqdhb, classNames);
        this.f122442lqeggnwhkg = packageDescriptor;
        this.f122443nufgyqmvbu = debugName;
        this.f122441dxjokdxxww = packageDescriptor.gxszxtbevo();
    }

    @Override // xi.iwizpuwonk
    protected void btonecajqb(Collection result, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(result, "result");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
    }

    @Override // xi.iwizpuwonk
    protected Set cqumvgiudr() {
        return ikoacuggdj.eablkybsjg();
    }

    @Override // xi.iwizpuwonk, si.draadjrbmk, si.agtfadlqog
    public jh.nufgyqmvbu eablkybsjg(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        istkbnxepw(name, location);
        return super.eablkybsjg(name, location);
    }

    public void istkbnxepw(ii.gxszxtbevo name, rh.zoijcleaow location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        qh.iobyxmoadg.zoijcleaow(kcexrzcfyt().ppxfxbqfkf().rgvfuqvkyq(), location, this.f122442lqeggnwhkg, name);
    }

    @Override // xi.iwizpuwonk
    protected Set iwizpuwonk() {
        return ikoacuggdj.eablkybsjg();
    }

    @Override // xi.iwizpuwonk
    protected Set jyumaefscl() {
        return ikoacuggdj.eablkybsjg();
    }

    @Override // xi.iwizpuwonk
    protected boolean lereixgezr(ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        if (!super.lereixgezr(name)) {
            Iterable iterableDraadjrbmk = kcexrzcfyt().ppxfxbqfkf().draadjrbmk();
            if (!(iterableDraadjrbmk instanceof Collection) || !((Collection) iterableDraadjrbmk).isEmpty()) {
                Iterator it = iterableDraadjrbmk.iterator();
                while (it.hasNext()) {
                    if (((lh.zoijcleaow) it.next()).iobyxmoadg(this.f122441dxjokdxxww, name)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // xi.iwizpuwonk
    protected ii.zoijcleaow rgvfuqvkyq(ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return new ii.zoijcleaow(this.f122441dxjokdxxww, name);
    }

    public String toString() {
        return this.f122443nufgyqmvbu;
    }

    @Override // si.draadjrbmk, si.agtfadlqog
    /* JADX INFO: renamed from: zynmafqrjb, reason: merged with bridge method [inline-methods] */
    public List gxszxtbevo(si.wkgbmnqykc kindFilter, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kindFilter, "kindFilter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        Collection collectionWflxmlrfwp = wflxmlrfwp(kindFilter, nameFilter, rh.wkgbmnqykc.WHEN_GET_ALL_DESCRIPTORS);
        Iterable iterableDraadjrbmk = kcexrzcfyt().ppxfxbqfkf().draadjrbmk();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterableDraadjrbmk.iterator();
        while (it.hasNext()) {
            hg.jyumaefscl.istkbnxepw(arrayList, ((lh.zoijcleaow) it.next()).ppxfxbqfkf(this.f122441dxjokdxxww));
        }
        return hg.jyumaefscl.ixidwrxhsl(collectionWflxmlrfwp, arrayList);
    }
}
