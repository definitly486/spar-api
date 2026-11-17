package xd;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import ub.dxjokdxxww;
import ub.lqeggnwhkg;
import ub.wkgbmnqykc;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow implements dxjokdxxww {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object ppxfxbqfkf(String str, ub.ppxfxbqfkf ppxfxbqfkfVar, wkgbmnqykc wkgbmnqykcVar) {
        try {
            ppxfxbqfkf.zoijcleaow(str);
            return ppxfxbqfkfVar.nufgyqmvbu().iobyxmoadg(wkgbmnqykcVar);
        } finally {
            ppxfxbqfkf.iobyxmoadg();
        }
    }

    @Override // ub.dxjokdxxww
    public List iobyxmoadg(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final ub.ppxfxbqfkf ppxfxbqfkfVarZdlpuopuiu : componentRegistrar.getComponents()) {
            final String strDxjokdxxww = ppxfxbqfkfVarZdlpuopuiu.dxjokdxxww();
            if (strDxjokdxxww != null) {
                ppxfxbqfkfVarZdlpuopuiu = ppxfxbqfkfVarZdlpuopuiu.zdlpuopuiu(new lqeggnwhkg() { // from class: xd.iobyxmoadg
                    @Override // ub.lqeggnwhkg
                    public final Object iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
                        return zoijcleaow.ppxfxbqfkf(strDxjokdxxww, ppxfxbqfkfVarZdlpuopuiu, wkgbmnqykcVar);
                    }
                });
            }
            arrayList.add(ppxfxbqfkfVarZdlpuopuiu);
        }
        return arrayList;
    }
}
