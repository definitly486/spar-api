package xh;

import gg.vdvldrhtss;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.agtfadlqog;
import ki.iwizpuwonk;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import zi.auzgnhcxok;
import zi.ikoacuggdj;
import zi.iwxlajgraz;
import zi.jhduphickx;
import zi.kegysxyocb;
import zi.opjhrmiecq;
import zi.ylkuphrtab;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx extends ylkuphrtab implements jhduphickx {
    private gtknphoqwx(ikoacuggdj ikoacuggdjVar, ikoacuggdj ikoacuggdjVar2, boolean z13) {
        super(ikoacuggdjVar, ikoacuggdjVar2);
        if (z13) {
            return;
        }
        aj.eablkybsjg.f2055iobyxmoadg.zoijcleaow(ikoacuggdjVar, ikoacuggdjVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence e(String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return "(raw) " + it;
    }

    private static final boolean f(String str, String str2) {
        return zdlpuopuiu.eablkybsjg(str, kcexrzcfyt.lxfrhoxuzk(str2, "out ")) || zdlpuopuiu.eablkybsjg(str2, "*");
    }

    private static final List g(agtfadlqog agtfadlqogVar, kegysxyocb kegysxyocbVar) {
        List listFyldjkxazc = kegysxyocbVar.fyldjkxazc();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listFyldjkxazc, 10));
        Iterator it = listFyldjkxazc.iterator();
        while (it.hasNext()) {
            arrayList.add(agtfadlqogVar.ulzqkzuiru((iwxlajgraz) it.next()));
        }
        return arrayList;
    }

    private static final String h(String str, String str2) {
        if (!kcexrzcfyt.ulzqkzuiru(str, '<', false, 2, null)) {
            return str;
        }
        return kcexrzcfyt.j(str, '<', null, 2, null) + '<' + str2 + '>' + kcexrzcfyt.f(str, '>', null, 2, null);
    }

    @Override // zi.ylkuphrtab
    public String a(agtfadlqog renderer, iwizpuwonk options) {
        vdvldrhtss vdvldrhtssVar;
        zdlpuopuiu.btonecajqb(renderer, "renderer");
        zdlpuopuiu.btonecajqb(options, "options");
        String strNtlheqmsrt = renderer.ntlheqmsrt(eslsurpljm());
        String strNtlheqmsrt2 = renderer.ntlheqmsrt(krqnebusok());
        if (options.dxjokdxxww()) {
            return "raw (" + strNtlheqmsrt + ".." + strNtlheqmsrt2 + ')';
        }
        if (krqnebusok().fyldjkxazc().isEmpty()) {
            return renderer.kegysxyocb(strNtlheqmsrt, strNtlheqmsrt2, ej.wkgbmnqykc.agtfadlqog(this));
        }
        List listG = g(renderer, eslsurpljm());
        List listG2 = g(renderer, krqnebusok());
        String strIwxlajgraz = jyumaefscl.iwxlajgraz(listG, ", ", null, null, 0, null, btonecajqb.f122366zdlpuopuiu, 30, null);
        List listW = jyumaefscl.w(listG, listG2);
        if (listW != null && listW.isEmpty()) {
            strNtlheqmsrt2 = h(strNtlheqmsrt2, strIwxlajgraz);
            break;
        }
        Iterator it = listW.iterator();
        do {
            if (!it.hasNext()) {
                strNtlheqmsrt2 = h(strNtlheqmsrt2, strIwxlajgraz);
                break;
            }
            vdvldrhtssVar = (vdvldrhtss) it.next();
        } while (f((String) vdvldrhtssVar.lqeggnwhkg(), (String) vdvldrhtssVar.nufgyqmvbu()));
        String strH = h(strNtlheqmsrt, strIwxlajgraz);
        return zdlpuopuiu.eablkybsjg(strH, strNtlheqmsrt2) ? strH : renderer.kegysxyocb(strH, strNtlheqmsrt2, ej.wkgbmnqykc.agtfadlqog(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zi.ylkuphrtab, zi.kegysxyocb
    public si.gtknphoqwx agtfadlqog() {
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = grlcpdaxtj().wkgbmnqykc();
        auzgnhcxok auzgnhcxokVar = null;
        Object[] objArr = 0;
        jh.eablkybsjg eablkybsjgVar = nufgyqmvbuVarWkgbmnqykc instanceof jh.eablkybsjg ? (jh.eablkybsjg) nufgyqmvbuVarWkgbmnqykc : null;
        if (eablkybsjgVar != null) {
            si.gtknphoqwx gtknphoqwxVarBfopjjpdmp = eablkybsjgVar.bfopjjpdmp(new dxjokdxxww(auzgnhcxokVar, 1, objArr == true ? 1 : 0));
            zdlpuopuiu.dxjokdxxww(gtknphoqwxVarBfopjjpdmp, "getMemberScope(...)");
            return gtknphoqwxVarBfopjjpdmp;
        }
        throw new IllegalStateException(("Incorrect classifier: " + grlcpdaxtj().wkgbmnqykc()).toString());
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public gtknphoqwx fmlbqenlif(boolean z13) {
        return new gtknphoqwx(eslsurpljm().fmlbqenlif(z13), krqnebusok().fmlbqenlif(z13));
    }

    @Override // zi.kegysxyocb
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ylkuphrtab ixidwrxhsl(aj.lqeggnwhkg kotlinTypeRefiner) {
        zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        kegysxyocb kegysxyocbVarIobyxmoadg = kotlinTypeRefiner.iobyxmoadg(eslsurpljm());
        zdlpuopuiu.nufgyqmvbu(kegysxyocbVarIobyxmoadg, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        kegysxyocb kegysxyocbVarIobyxmoadg2 = kotlinTypeRefiner.iobyxmoadg(krqnebusok());
        zdlpuopuiu.nufgyqmvbu(kegysxyocbVarIobyxmoadg2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new gtknphoqwx((ikoacuggdj) kegysxyocbVarIobyxmoadg, (ikoacuggdj) kegysxyocbVarIobyxmoadg2, true);
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public gtknphoqwx rhgxfdycjh(opjhrmiecq newAttributes) {
        zdlpuopuiu.btonecajqb(newAttributes, "newAttributes");
        return new gtknphoqwx(eslsurpljm().rhgxfdycjh(newAttributes), krqnebusok().rhgxfdycjh(newAttributes));
    }

    @Override // zi.ylkuphrtab
    public ikoacuggdj yzdjzghtvl() {
        return eslsurpljm();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(ikoacuggdj lowerBound, ikoacuggdj upperBound) {
        this(lowerBound, upperBound, false);
        zdlpuopuiu.btonecajqb(lowerBound, "lowerBound");
        zdlpuopuiu.btonecajqb(upperBound, "upperBound");
    }
}
