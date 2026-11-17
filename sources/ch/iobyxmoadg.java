package ch;

import ah.gtknphoqwx;
import ah.lqeggnwhkg;
import dh.n;
import dh.pmvmpeiblj;
import eh.nufgyqmvbu;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static final boolean iobyxmoadg(ah.ppxfxbqfkf ppxfxbqfkfVar) {
        nufgyqmvbu nufgyqmvbuVarStevsuqkhv;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (ppxfxbqfkfVar instanceof ah.nufgyqmvbu) {
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) ppxfxbqfkfVar;
            Field fieldZoijcleaow = ppxfxbqfkf.zoijcleaow(gtknphoqwxVar);
            if (!(fieldZoijcleaow != null ? fieldZoijcleaow.isAccessible() : true)) {
                return false;
            }
            Method methodPpxfxbqfkf = ppxfxbqfkf.ppxfxbqfkf(gtknphoqwxVar);
            if (!(methodPpxfxbqfkf != null ? methodPpxfxbqfkf.isAccessible() : true)) {
                return false;
            }
            Method methodEablkybsjg = ppxfxbqfkf.eablkybsjg((ah.nufgyqmvbu) ppxfxbqfkfVar);
            if (!(methodEablkybsjg != null ? methodEablkybsjg.isAccessible() : true)) {
                return false;
            }
        } else if (ppxfxbqfkfVar instanceof gtknphoqwx) {
            gtknphoqwx gtknphoqwxVar2 = (gtknphoqwx) ppxfxbqfkfVar;
            Field fieldZoijcleaow2 = ppxfxbqfkf.zoijcleaow(gtknphoqwxVar2);
            if (!(fieldZoijcleaow2 != null ? fieldZoijcleaow2.isAccessible() : true)) {
                return false;
            }
            Method methodPpxfxbqfkf2 = ppxfxbqfkf.ppxfxbqfkf(gtknphoqwxVar2);
            if (!(methodPpxfxbqfkf2 != null ? methodPpxfxbqfkf2.isAccessible() : true)) {
                return false;
            }
        } else if (ppxfxbqfkfVar instanceof gtknphoqwx.zoijcleaow) {
            Field fieldZoijcleaow3 = ppxfxbqfkf.zoijcleaow(((gtknphoqwx.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
            if (!(fieldZoijcleaow3 != null ? fieldZoijcleaow3.isAccessible() : true)) {
                return false;
            }
            Method methodWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc((lqeggnwhkg) ppxfxbqfkfVar);
            if (!(methodWkgbmnqykc != null ? methodWkgbmnqykc.isAccessible() : true)) {
                return false;
            }
        } else if (ppxfxbqfkfVar instanceof ah.nufgyqmvbu.iobyxmoadg) {
            Field fieldZoijcleaow4 = ppxfxbqfkf.zoijcleaow(((ah.nufgyqmvbu.iobyxmoadg) ppxfxbqfkfVar).iobyxmoadg());
            if (!(fieldZoijcleaow4 != null ? fieldZoijcleaow4.isAccessible() : true)) {
                return false;
            }
            Method methodWkgbmnqykc2 = ppxfxbqfkf.wkgbmnqykc((lqeggnwhkg) ppxfxbqfkfVar);
            if (!(methodWkgbmnqykc2 != null ? methodWkgbmnqykc2.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(ppxfxbqfkfVar instanceof lqeggnwhkg)) {
                throw new UnsupportedOperationException("Unknown callable: " + ppxfxbqfkfVar + " (" + ppxfxbqfkfVar.getClass() + ')');
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) ppxfxbqfkfVar;
            Method methodWkgbmnqykc3 = ppxfxbqfkf.wkgbmnqykc(lqeggnwhkgVar);
            if (!(methodWkgbmnqykc3 != null ? methodWkgbmnqykc3.isAccessible() : true)) {
                return false;
            }
            pmvmpeiblj pmvmpeibljVarZoijcleaow = n.zoijcleaow(ppxfxbqfkfVar);
            Member memberZoijcleaow = (pmvmpeibljVarZoijcleaow == null || (nufgyqmvbuVarStevsuqkhv = pmvmpeibljVarZoijcleaow.stevsuqkhv()) == null) ? null : nufgyqmvbuVarStevsuqkhv.zoijcleaow();
            AccessibleObject accessibleObject = memberZoijcleaow instanceof AccessibleObject ? (AccessibleObject) memberZoijcleaow : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Constructor constructorIobyxmoadg = ppxfxbqfkf.iobyxmoadg(lqeggnwhkgVar);
            if (!(constructorIobyxmoadg != null ? constructorIobyxmoadg.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
