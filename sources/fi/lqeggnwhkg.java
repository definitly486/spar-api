package fi;

import di.vdvldrhtss;
import di.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f33902iobyxmoadg;

    public lqeggnwhkg(zdlpuopuiu typeTable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeTable, "typeTable");
        List listCdpycssgdh = typeTable.cdpycssgdh();
        if (typeTable.yadqdtsiqt()) {
            int iPmvmpeiblj = typeTable.pmvmpeiblj();
            List listCdpycssgdh2 = typeTable.cdpycssgdh();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listCdpycssgdh2, "getTypeList(...)");
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listCdpycssgdh2, 10));
            int i13 = 0;
            for (Object obj : listCdpycssgdh2) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    jyumaefscl.iwizpuwonk();
                }
                vdvldrhtss vdvldrhtssVarWflxmlrfwp = (vdvldrhtss) obj;
                if (i13 >= iPmvmpeiblj) {
                    vdvldrhtssVarWflxmlrfwp = vdvldrhtssVarWflxmlrfwp.toBuilder().istkbnxepw(true).build();
                }
                arrayList.add(vdvldrhtssVarWflxmlrfwp);
                i13 = i14;
            }
            listCdpycssgdh = arrayList;
        }
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listCdpycssgdh, "run(...)");
        this.f33902iobyxmoadg = listCdpycssgdh;
    }

    public final vdvldrhtss iobyxmoadg(int i13) {
        return (vdvldrhtss) this.f33902iobyxmoadg.get(i13);
    }
}
