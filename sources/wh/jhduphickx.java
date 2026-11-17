package wh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jh.xrmfcynszj;
import zi.fiwbwshyhd;
import zi.ikoacuggdj;
import zi.mhtqkkgtqm;

/* JADX INFO: loaded from: classes3.dex */
public final class jhduphickx extends mh.zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final vh.gtknphoqwx f119787cdpycssgdh;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final zh.esjtqupxsv f119788yadqdtsiqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhduphickx(vh.gtknphoqwx c13, zh.esjtqupxsv javaTypeParameter, int i13, jh.wflxmlrfwp containingDeclaration) {
        super(c13.eablkybsjg(), containingDeclaration, new vh.lqeggnwhkg(c13, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), mhtqkkgtqm.INVARIANT, false, i13, xrmfcynszj.f51348iobyxmoadg, c13.iobyxmoadg().jyumaefscl());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(javaTypeParameter, "javaTypeParameter");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(containingDeclaration, "containingDeclaration");
        this.f119787cdpycssgdh = c13;
        this.f119788yadqdtsiqt = javaTypeParameter;
    }

    private final List ipoelvxyzq() {
        Collection upperBounds = this.f119788yadqdtsiqt.getUpperBounds();
        if (upperBounds.isEmpty()) {
            ikoacuggdj ikoacuggdjVarDxjokdxxww = this.f119787cdpycssgdh.wkgbmnqykc().wflxmlrfwp().dxjokdxxww();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarDxjokdxxww, "getAnyType(...)");
            ikoacuggdj ikoacuggdjVarYlkuphrtab = this.f119787cdpycssgdh.wkgbmnqykc().wflxmlrfwp().ylkuphrtab();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ikoacuggdjVarYlkuphrtab, "getNullableAnyType(...)");
            return hg.jyumaefscl.eablkybsjg(zi.ntlheqmsrt.eablkybsjg(ikoacuggdjVarDxjokdxxww, ikoacuggdjVarYlkuphrtab));
        }
        Collection collection = upperBounds;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f119787cdpycssgdh.lqeggnwhkg().rgvfuqvkyq((zh.btonecajqb) it.next(), xh.zoijcleaow.zoijcleaow(fiwbwshyhd.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // mh.nufgyqmvbu
    protected void ageimvtcrz(zi.kegysxyocb type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
    }

    @Override // mh.nufgyqmvbu
    protected List fyldjkxazc() {
        return ipoelvxyzq();
    }

    @Override // mh.nufgyqmvbu
    protected List wizcaqwiak(List bounds) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bounds, "bounds");
        return this.f119787cdpycssgdh.iobyxmoadg().oxmwwwfdhm().oxmwwwfdhm(this, bounds, this.f119787cdpycssgdh);
    }
}
