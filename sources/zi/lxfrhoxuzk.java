package zi;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lxfrhoxuzk {
    public static /* synthetic */ kegysxyocb eablkybsjg(kegysxyocb kegysxyocbVar, List list, kh.nufgyqmvbu nufgyqmvbuVar, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = kegysxyocbVar.fyldjkxazc();
        }
        if ((i13 & 2) != 0) {
            nufgyqmvbuVar = kegysxyocbVar.getAnnotations();
        }
        if ((i13 & 4) != 0) {
            list2 = list;
        }
        return ppxfxbqfkf(kegysxyocbVar, list, nufgyqmvbuVar, list2);
    }

    public static /* synthetic */ ikoacuggdj gxszxtbevo(ikoacuggdj ikoacuggdjVar, List list, opjhrmiecq opjhrmiecqVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = ikoacuggdjVar.fyldjkxazc();
        }
        if ((i13 & 2) != 0) {
            opjhrmiecqVar = ikoacuggdjVar.ipoelvxyzq();
        }
        return wkgbmnqykc(ikoacuggdjVar, list, opjhrmiecqVar);
    }

    public static final ikoacuggdj iobyxmoadg(kegysxyocb kegysxyocbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = kegysxyocbVar.jrbgnlbqoe();
        ikoacuggdj ikoacuggdjVar = grlcpdaxtjVarJrbgnlbqoe instanceof ikoacuggdj ? (ikoacuggdj) grlcpdaxtjVarJrbgnlbqoe : null;
        if (ikoacuggdjVar != null) {
            return ikoacuggdjVar;
        }
        throw new IllegalStateException(("This is should be simple type: " + kegysxyocbVar).toString());
    }

    public static final kegysxyocb ppxfxbqfkf(kegysxyocb kegysxyocbVar, List newArguments, kh.nufgyqmvbu newAnnotations, List newArgumentsForUpperBound) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newArguments, "newArguments");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newAnnotations, "newAnnotations");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == kegysxyocbVar.fyldjkxazc()) && newAnnotations == kegysxyocbVar.getAnnotations()) {
            return kegysxyocbVar;
        }
        opjhrmiecq opjhrmiecqVarIpoelvxyzq = kegysxyocbVar.ipoelvxyzq();
        if ((newAnnotations instanceof kh.rgvfuqvkyq) && ((kh.rgvfuqvkyq) newAnnotations).isEmpty()) {
            newAnnotations = kh.nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow();
        }
        opjhrmiecq opjhrmiecqVarIobyxmoadg = iyctptxqzt.iobyxmoadg(opjhrmiecqVarIpoelvxyzq, newAnnotations);
        grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = kegysxyocbVar.jrbgnlbqoe();
        if (grlcpdaxtjVarJrbgnlbqoe instanceof ylkuphrtab) {
            ylkuphrtab ylkuphrtabVar = (ylkuphrtab) grlcpdaxtjVarJrbgnlbqoe;
            return ntlheqmsrt.eablkybsjg(wkgbmnqykc(ylkuphrtabVar.eslsurpljm(), newArguments, opjhrmiecqVarIobyxmoadg), wkgbmnqykc(ylkuphrtabVar.krqnebusok(), newArgumentsForUpperBound, opjhrmiecqVarIobyxmoadg));
        }
        if (grlcpdaxtjVarJrbgnlbqoe instanceof ikoacuggdj) {
            return wkgbmnqykc((ikoacuggdj) grlcpdaxtjVarJrbgnlbqoe, newArguments, opjhrmiecqVarIobyxmoadg);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ikoacuggdj wkgbmnqykc(ikoacuggdj ikoacuggdjVar, List newArguments, opjhrmiecq newAttributes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ikoacuggdjVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newArguments, "newArguments");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == ikoacuggdjVar.ipoelvxyzq()) {
            return ikoacuggdjVar;
        }
        if (newArguments.isEmpty()) {
            return ikoacuggdjVar.rhgxfdycjh(newAttributes);
        }
        return ikoacuggdjVar instanceof bj.dxjokdxxww ? ((bj.dxjokdxxww) ikoacuggdjVar).c(newArguments) : ntlheqmsrt.gtknphoqwx(newAttributes, ikoacuggdjVar.grlcpdaxtj(), newArguments, ikoacuggdjVar.mhtqkkgtqm(), null, 16, null);
    }

    public static final kegysxyocb zoijcleaow(kegysxyocb kegysxyocbVar, List newArguments, kh.nufgyqmvbu newAnnotations) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newArguments, "newArguments");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newAnnotations, "newAnnotations");
        return eablkybsjg(kegysxyocbVar, newArguments, newAnnotations, null, 4, null);
    }
}
