package qi;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mh.hcddaimhww;
import vh.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements gxszxtbevo {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f78871zoijcleaow;

    public iobyxmoadg(List inner) {
        zdlpuopuiu.btonecajqb(inner, "inner");
        this.f78871zoijcleaow = inner;
    }

    @Override // qi.gxszxtbevo
    public List eablkybsjg(jh.eablkybsjg thisDescriptor, gtknphoqwx c13) {
        zdlpuopuiu.btonecajqb(thisDescriptor, "thisDescriptor");
        zdlpuopuiu.btonecajqb(c13, "c");
        List list = this.f78871zoijcleaow;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jyumaefscl.istkbnxepw(arrayList, ((gxszxtbevo) it.next()).eablkybsjg(thisDescriptor, c13));
        }
        return arrayList;
    }

    @Override // qi.gxszxtbevo
    public void gxszxtbevo(jh.eablkybsjg thisDescriptor, ii.gxszxtbevo name, List result, gtknphoqwx c13) {
        zdlpuopuiu.btonecajqb(thisDescriptor, "thisDescriptor");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(result, "result");
        zdlpuopuiu.btonecajqb(c13, "c");
        Iterator it = this.f78871zoijcleaow.iterator();
        while (it.hasNext()) {
            ((gxszxtbevo) it.next()).gxszxtbevo(thisDescriptor, name, result, c13);
        }
    }

    @Override // qi.gxszxtbevo
    public void iobyxmoadg(jh.eablkybsjg thisDescriptor, List result, gtknphoqwx c13) {
        zdlpuopuiu.btonecajqb(thisDescriptor, "thisDescriptor");
        zdlpuopuiu.btonecajqb(result, "result");
        zdlpuopuiu.btonecajqb(c13, "c");
        Iterator it = this.f78871zoijcleaow.iterator();
        while (it.hasNext()) {
            ((gxszxtbevo) it.next()).iobyxmoadg(thisDescriptor, result, c13);
        }
    }

    @Override // qi.gxszxtbevo
    public hcddaimhww lqeggnwhkg(jh.eablkybsjg thisDescriptor, hcddaimhww propertyDescriptor, gtknphoqwx c13) {
        zdlpuopuiu.btonecajqb(thisDescriptor, "thisDescriptor");
        zdlpuopuiu.btonecajqb(propertyDescriptor, "propertyDescriptor");
        zdlpuopuiu.btonecajqb(c13, "c");
        Iterator it = this.f78871zoijcleaow.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((gxszxtbevo) it.next()).lqeggnwhkg(thisDescriptor, propertyDescriptor, c13);
        }
        return propertyDescriptor;
    }

    @Override // qi.gxszxtbevo
    public void nufgyqmvbu(jh.eablkybsjg thisDescriptor, ii.gxszxtbevo name, Collection result, gtknphoqwx c13) {
        zdlpuopuiu.btonecajqb(thisDescriptor, "thisDescriptor");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(result, "result");
        zdlpuopuiu.btonecajqb(c13, "c");
        Iterator it = this.f78871zoijcleaow.iterator();
        while (it.hasNext()) {
            ((gxszxtbevo) it.next()).nufgyqmvbu(thisDescriptor, name, result, c13);
        }
    }

    @Override // qi.gxszxtbevo
    public List ppxfxbqfkf(jh.eablkybsjg thisDescriptor, gtknphoqwx c13) {
        zdlpuopuiu.btonecajqb(thisDescriptor, "thisDescriptor");
        zdlpuopuiu.btonecajqb(c13, "c");
        List list = this.f78871zoijcleaow;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jyumaefscl.istkbnxepw(arrayList, ((gxszxtbevo) it.next()).ppxfxbqfkf(thisDescriptor, c13));
        }
        return arrayList;
    }

    @Override // qi.gxszxtbevo
    public List wkgbmnqykc(jh.eablkybsjg thisDescriptor, gtknphoqwx c13) {
        zdlpuopuiu.btonecajqb(thisDescriptor, "thisDescriptor");
        zdlpuopuiu.btonecajqb(c13, "c");
        List list = this.f78871zoijcleaow;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jyumaefscl.istkbnxepw(arrayList, ((gxszxtbevo) it.next()).wkgbmnqykc(thisDescriptor, c13));
        }
        return arrayList;
    }

    @Override // qi.gxszxtbevo
    public void zoijcleaow(jh.eablkybsjg thisDescriptor, ii.gxszxtbevo name, Collection result, gtknphoqwx c13) {
        zdlpuopuiu.btonecajqb(thisDescriptor, "thisDescriptor");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(result, "result");
        zdlpuopuiu.btonecajqb(c13, "c");
        Iterator it = this.f78871zoijcleaow.iterator();
        while (it.hasNext()) {
            ((gxszxtbevo) it.next()).zoijcleaow(thisDescriptor, name, result, c13);
        }
    }
}
