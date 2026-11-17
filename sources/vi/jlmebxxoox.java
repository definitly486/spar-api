package vi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.bfopjjpdmp;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jlmebxxoox {
    public static final bfopjjpdmp iobyxmoadg(di.ppxfxbqfkf ppxfxbqfkfVar, fi.ppxfxbqfkf nameResolver, fi.lqeggnwhkg typeTable, tg.draadjrbmk typeDeserializer, tg.draadjrbmk typeOfPublicProperty) {
        dj.btonecajqb btonecajqbVar;
        List listB;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeTable, "typeTable");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeDeserializer, "typeDeserializer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeOfPublicProperty, "typeOfPublicProperty");
        if (ppxfxbqfkfVar.ezmngbhpjk() <= 0) {
            if (!ppxfxbqfkfVar.x()) {
                return null;
            }
            ii.gxszxtbevo gxszxtbevoVarZoijcleaow = jpowsppfya.zoijcleaow(nameResolver, ppxfxbqfkfVar.ixidwrxhsl());
            di.vdvldrhtss vdvldrhtssVarDxjokdxxww = fi.gxszxtbevo.dxjokdxxww(ppxfxbqfkfVar, typeTable);
            if ((vdvldrhtssVarDxjokdxxww != null && (btonecajqbVar = (dj.btonecajqb) typeDeserializer.invoke(vdvldrhtssVarDxjokdxxww)) != null) || (btonecajqbVar = (dj.btonecajqb) typeOfPublicProperty.invoke(gxszxtbevoVarZoijcleaow)) != null) {
                return new jh.pmvmpeiblj(gxszxtbevoVarZoijcleaow, btonecajqbVar);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + jpowsppfya.zoijcleaow(nameResolver, ppxfxbqfkfVar.fyldjkxazc()) + " with property " + gxszxtbevoVarZoijcleaow).toString());
        }
        List<Integer> listRhgxfdycjh = ppxfxbqfkfVar.rhgxfdycjh();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listRhgxfdycjh, "getMultiFieldValueClassUnderlyingNameList(...)");
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listRhgxfdycjh, 10));
        for (Integer num : listRhgxfdycjh) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(num);
            arrayList.add(jpowsppfya.zoijcleaow(nameResolver, num.intValue()));
        }
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(Integer.valueOf(ppxfxbqfkfVar.krqnebusok()), Integer.valueOf(ppxfxbqfkfVar.eslsurpljm()));
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(vdvldrhtssVarIobyxmoadg, gg.cqumvgiudr.iobyxmoadg(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> listA = ppxfxbqfkfVar.a();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listA, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            listB = new ArrayList(hg.jyumaefscl.cqumvgiudr(listA, 10));
            for (Integer num2 : listA) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(num2);
                listB.add(typeTable.iobyxmoadg(num2.intValue()));
            }
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(vdvldrhtssVarIobyxmoadg, gg.cqumvgiudr.iobyxmoadg(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + jpowsppfya.zoijcleaow(nameResolver, ppxfxbqfkfVar.fyldjkxazc()) + " has illegal multi-field value class representation").toString());
            }
            listB = ppxfxbqfkfVar.b();
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(listB);
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new jh.wwaezpbzkn(hg.jyumaefscl.w(arrayList, arrayList2));
    }
}
