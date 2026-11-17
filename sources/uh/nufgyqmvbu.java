package uh;

import gg.vdvldrhtss;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jh.iyctptxqzt;
import jh.xrmfcynszj;
import kotlin.jvm.internal.zdlpuopuiu;
import mh.ntlheqmsrt;
import si.gtknphoqwx;
import wh.ribwqtqdhb;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu {
    public static final List iobyxmoadg(Collection newValueParameterTypes, Collection oldValueParameters, jh.iobyxmoadg newOwner) {
        zdlpuopuiu.btonecajqb(newValueParameterTypes, "newValueParameterTypes");
        zdlpuopuiu.btonecajqb(oldValueParameters, "oldValueParameters");
        zdlpuopuiu.btonecajqb(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        List listW = jyumaefscl.w(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listW, 10));
        for (Iterator it = listW.iterator(); it.hasNext(); it = it) {
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) it.next();
            kegysxyocb kegysxyocbVar = (kegysxyocb) vdvldrhtssVar.iobyxmoadg();
            iyctptxqzt iyctptxqztVar = (iyctptxqzt) vdvldrhtssVar.wkgbmnqykc();
            int index = iyctptxqztVar.getIndex();
            kh.nufgyqmvbu annotations = iyctptxqztVar.getAnnotations();
            ii.gxszxtbevo name = iyctptxqztVar.getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            boolean zAuzgnhcxok = iyctptxqztVar.auzgnhcxok();
            boolean zZfvoamnweg = iyctptxqztVar.zfvoamnweg();
            boolean zSflfametgt = iyctptxqztVar.sflfametgt();
            kegysxyocb kegysxyocbVarGtknphoqwx = iyctptxqztVar.iyctptxqzt() != null ? pi.eablkybsjg.kcexrzcfyt(newOwner).wflxmlrfwp().gtknphoqwx(kegysxyocbVar) : null;
            xrmfcynszj xrmfcynszjVarLqeggnwhkg = iyctptxqztVar.lqeggnwhkg();
            zdlpuopuiu.dxjokdxxww(xrmfcynszjVarLqeggnwhkg, "getSource(...)");
            arrayList.add(new ntlheqmsrt(newOwner, null, index, annotations, name, kegysxyocbVar, zAuzgnhcxok, zZfvoamnweg, zSflfametgt, kegysxyocbVarGtknphoqwx, xrmfcynszjVarLqeggnwhkg));
        }
        return arrayList;
    }

    public static final ribwqtqdhb zoijcleaow(jh.eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        jh.eablkybsjg eablkybsjgVarCqumvgiudr = pi.eablkybsjg.cqumvgiudr(eablkybsjgVar);
        if (eablkybsjgVarCqumvgiudr == null) {
            return null;
        }
        gtknphoqwx gtknphoqwxVarUwvvkdfqfp = eablkybsjgVarCqumvgiudr.uwvvkdfqfp();
        ribwqtqdhb ribwqtqdhbVar = gtknphoqwxVarUwvvkdfqfp instanceof ribwqtqdhb ? (ribwqtqdhb) gtknphoqwxVarUwvvkdfqfp : null;
        return ribwqtqdhbVar == null ? zoijcleaow(eablkybsjgVarCqumvgiudr) : ribwqtqdhbVar;
    }
}
