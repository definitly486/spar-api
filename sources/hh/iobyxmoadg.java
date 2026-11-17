package hh;

import androidx.appcompat.app.yggfygwlhe;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jh.lmojexxdyd;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import yi.agtfadlqog;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements lh.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f40302iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lmojexxdyd f40303zoijcleaow;

    public iobyxmoadg(agtfadlqog storageManager, lmojexxdyd module) {
        zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        zdlpuopuiu.btonecajqb(module, "module");
        this.f40302iobyxmoadg = storageManager;
        this.f40303zoijcleaow = module;
    }

    @Override // lh.zoijcleaow
    public boolean iobyxmoadg(ii.ppxfxbqfkf packageFqName, ii.gxszxtbevo name) {
        zdlpuopuiu.btonecajqb(packageFqName, "packageFqName");
        zdlpuopuiu.btonecajqb(name, "name");
        String strZoijcleaow = name.zoijcleaow();
        zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        return (kcexrzcfyt.stevsuqkhv(strZoijcleaow, "Function", false, 2, null) || kcexrzcfyt.stevsuqkhv(strZoijcleaow, "KFunction", false, 2, null) || kcexrzcfyt.stevsuqkhv(strZoijcleaow, "SuspendFunction", false, 2, null) || kcexrzcfyt.stevsuqkhv(strZoijcleaow, "KSuspendFunction", false, 2, null)) && lqeggnwhkg.f40304ppxfxbqfkf.iobyxmoadg().ppxfxbqfkf(packageFqName, strZoijcleaow) != null;
    }

    @Override // lh.zoijcleaow
    public Collection ppxfxbqfkf(ii.ppxfxbqfkf packageFqName) {
        zdlpuopuiu.btonecajqb(packageFqName, "packageFqName");
        return ikoacuggdj.eablkybsjg();
    }

    @Override // lh.zoijcleaow
    public jh.eablkybsjg zoijcleaow(ii.zoijcleaow classId) {
        ii.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo;
        lqeggnwhkg.zoijcleaow zoijcleaowVarPpxfxbqfkf;
        zdlpuopuiu.btonecajqb(classId, "classId");
        if (classId.dxjokdxxww() || classId.btonecajqb()) {
            return null;
        }
        String strZoijcleaow = classId.lqeggnwhkg().zoijcleaow();
        zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        if (!kcexrzcfyt.sopmlzcsov(strZoijcleaow, "Function", false, 2, null) || (zoijcleaowVarPpxfxbqfkf = lqeggnwhkg.f40304ppxfxbqfkf.iobyxmoadg().ppxfxbqfkf((ppxfxbqfkfVarGxszxtbevo = classId.gxszxtbevo()), strZoijcleaow)) == null) {
            return null;
        }
        gxszxtbevo gxszxtbevoVarIobyxmoadg = zoijcleaowVarPpxfxbqfkf.iobyxmoadg();
        int iZoijcleaow = zoijcleaowVarPpxfxbqfkf.zoijcleaow();
        List listRlfsiqarku = this.f40303zoijcleaow.wwaezpbzkn(ppxfxbqfkfVarGxszxtbevo).rlfsiqarku();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listRlfsiqarku) {
            if (obj instanceof gh.ppxfxbqfkf) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        yggfygwlhe.iobyxmoadg(jyumaefscl.weqkydbzbr(arrayList2));
        return new zoijcleaow(this.f40302iobyxmoadg, (gh.ppxfxbqfkf) jyumaefscl.opjhrmiecq(arrayList), gxszxtbevoVarIobyxmoadg, iZoijcleaow);
    }
}
