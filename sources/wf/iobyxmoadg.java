package wf;

import androidx.activity.nufgyqmvbu;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.crxdokpmqz;
import java.util.Map;
import vf.gxszxtbevo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: wf.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC2980iobyxmoadg {
        ppxfxbqfkf iobyxmoadg();
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f119477iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final gxszxtbevo f119478zoijcleaow;

        ppxfxbqfkf(Map map, gxszxtbevo gxszxtbevoVar) {
            this.f119477iobyxmoadg = map;
            this.f119478zoijcleaow = gxszxtbevoVar;
        }

        private crxdokpmqz.ppxfxbqfkf ppxfxbqfkf(crxdokpmqz.ppxfxbqfkf ppxfxbqfkfVar) {
            return new wf.ppxfxbqfkf(this.f119477iobyxmoadg, (crxdokpmqz.ppxfxbqfkf) zf.wkgbmnqykc.iobyxmoadg(ppxfxbqfkfVar), this.f119478zoijcleaow);
        }

        crxdokpmqz.ppxfxbqfkf iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, crxdokpmqz.ppxfxbqfkf ppxfxbqfkfVar) {
            return ppxfxbqfkf(ppxfxbqfkfVar);
        }

        crxdokpmqz.ppxfxbqfkf zoijcleaow(Fragment fragment, crxdokpmqz.ppxfxbqfkf ppxfxbqfkfVar) {
            return ppxfxbqfkf(ppxfxbqfkfVar);
        }
    }

    public interface zoijcleaow {
        ppxfxbqfkf iobyxmoadg();
    }

    public static crxdokpmqz.ppxfxbqfkf iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, crxdokpmqz.ppxfxbqfkf ppxfxbqfkfVar) {
        return ((InterfaceC2980iobyxmoadg) qf.iobyxmoadg.iobyxmoadg(nufgyqmvbuVar, InterfaceC2980iobyxmoadg.class)).iobyxmoadg().iobyxmoadg(nufgyqmvbuVar, ppxfxbqfkfVar);
    }

    public static crxdokpmqz.ppxfxbqfkf zoijcleaow(Fragment fragment, crxdokpmqz.ppxfxbqfkf ppxfxbqfkfVar) {
        return ((zoijcleaow) qf.iobyxmoadg.iobyxmoadg(fragment, zoijcleaow.class)).iobyxmoadg().zoijcleaow(fragment, ppxfxbqfkfVar);
    }
}
