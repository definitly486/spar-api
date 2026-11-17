package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f4038iobyxmoadg = 1;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f4041zoijcleaow = 0;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Map f4039ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private List f4040wkgbmnqykc = new ArrayList();

    private static class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f4042iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Map f4043ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f4044wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f4045zoijcleaow;

        iobyxmoadg(int i13, int i14, Map map, List list) {
            this.f4042iobyxmoadg = i13;
            this.f4045zoijcleaow = i14;
            this.f4043ppxfxbqfkf = map;
            this.f4044wkgbmnqykc = list;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.nufgyqmvbu
        public int eablkybsjg() {
            return this.f4042iobyxmoadg;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.nufgyqmvbu
        public List gxszxtbevo() {
            return this.f4044wkgbmnqykc;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.nufgyqmvbu
        public int ppxfxbqfkf() {
            return this.f4045zoijcleaow;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.nufgyqmvbu
        public Map wkgbmnqykc() {
            return this.f4043ppxfxbqfkf;
        }
    }

    dxjokdxxww() {
    }

    dxjokdxxww eablkybsjg(int i13) {
        this.f4041zoijcleaow = i13;
        return this;
    }

    dxjokdxxww iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        this.f4040wkgbmnqykc.add(gxszxtbevoVar);
        return this;
    }

    nufgyqmvbu ppxfxbqfkf() {
        return new iobyxmoadg(this.f4038iobyxmoadg, this.f4041zoijcleaow, this.f4039ppxfxbqfkf, this.f4040wkgbmnqykc);
    }

    dxjokdxxww wkgbmnqykc(int i13) {
        this.f4038iobyxmoadg = i13;
        return this;
    }

    dxjokdxxww zoijcleaow(CaptureRequest.Key key, Object obj) {
        this.f4039ppxfxbqfkf.put(key, obj);
        return this;
    }
}
