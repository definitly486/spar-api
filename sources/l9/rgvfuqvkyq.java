package l9;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.kegysxyocb;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rgvfuqvkyq extends ppxfxbqfkf {
    public final void btonecajqb(vdvldrhtss screen) {
        zdlpuopuiu.btonecajqb(screen, "screen");
        iobyxmoadg(new gtknphoqwx(screen));
    }

    public final void dxjokdxxww(vdvldrhtss... screens) {
        zdlpuopuiu.btonecajqb(screens, "screens");
        ArrayList arrayList = new ArrayList(screens.length);
        int length = screens.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            vdvldrhtss vdvldrhtssVar = screens[i13];
            int i15 = i14 + 1;
            arrayList.add(i14 == 0 ? new gtknphoqwx(vdvldrhtssVar) : new nufgyqmvbu(vdvldrhtssVar));
            i13++;
            i14 = i15;
        }
        kegysxyocb kegysxyocbVar = new kegysxyocb(2);
        kegysxyocbVar.iobyxmoadg(new zoijcleaow(null));
        Object[] array = arrayList.toArray(new eablkybsjg[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        kegysxyocbVar.zoijcleaow(array);
        iobyxmoadg((eablkybsjg[]) kegysxyocbVar.wkgbmnqykc(new eablkybsjg[kegysxyocbVar.ppxfxbqfkf()]));
    }

    public final void eablkybsjg(vdvldrhtss vdvldrhtssVar) {
        iobyxmoadg(new zoijcleaow(vdvldrhtssVar));
    }

    public final void gxszxtbevo() {
        iobyxmoadg(new iobyxmoadg());
    }

    public final void lqeggnwhkg(vdvldrhtss screen) {
        zdlpuopuiu.btonecajqb(screen, "screen");
        iobyxmoadg(new nufgyqmvbu(screen));
    }

    public final void nufgyqmvbu(vdvldrhtss... screens) {
        zdlpuopuiu.btonecajqb(screens, "screens");
        ArrayList arrayList = new ArrayList(screens.length);
        for (vdvldrhtss vdvldrhtssVar : screens) {
            arrayList.add(new nufgyqmvbu(vdvldrhtssVar));
        }
        Object[] array = arrayList.toArray(new nufgyqmvbu[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        nufgyqmvbu[] nufgyqmvbuVarArr = (nufgyqmvbu[]) array;
        iobyxmoadg((eablkybsjg[]) Arrays.copyOf(nufgyqmvbuVarArr, nufgyqmvbuVarArr.length));
    }
}
