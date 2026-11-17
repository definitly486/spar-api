package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import istkbnxepw.xrmfcynszj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class ojitshcjhn {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    int f4056wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private List f4054iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Map f4057zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f4055ppxfxbqfkf = 1;

    static class iobyxmoadg implements xrmfcynszj.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final List f4058iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final int f4059ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final int f4060wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final androidx.camera.core.impl.btonecajqb f4061zoijcleaow;

        iobyxmoadg(List list, Map map, int i13, int i14) {
            this.f4058iobyxmoadg = list;
            this.f4059ppxfxbqfkf = i13;
            this.f4060wkgbmnqykc = i14;
            androidx.camera.extensions.internal.nufgyqmvbu.zoijcleaow zoijcleaowVar = new androidx.camera.extensions.internal.nufgyqmvbu.zoijcleaow();
            for (CaptureRequest.Key key : map.keySet()) {
                zoijcleaowVar.eablkybsjg(key, map.get(key));
            }
            this.f4061zoijcleaow = zoijcleaowVar.zoijcleaow();
        }

        @Override // istkbnxepw.xrmfcynszj.zoijcleaow
        public androidx.camera.core.impl.btonecajqb getParameters() {
            return this.f4061zoijcleaow;
        }

        @Override // istkbnxepw.xrmfcynszj.zoijcleaow
        public List getTargetOutputConfigIds() {
            return this.f4058iobyxmoadg;
        }

        @Override // istkbnxepw.xrmfcynszj.zoijcleaow
        public int getTemplateId() {
            return this.f4059ppxfxbqfkf;
        }

        public int iobyxmoadg() {
            return this.f4060wkgbmnqykc;
        }
    }

    ojitshcjhn() {
    }

    ojitshcjhn eablkybsjg(int i13) {
        this.f4055ppxfxbqfkf = i13;
        return this;
    }

    ojitshcjhn iobyxmoadg(int i13) {
        this.f4054iobyxmoadg.add(Integer.valueOf(i13));
        return this;
    }

    public ojitshcjhn ppxfxbqfkf(int i13) {
        this.f4056wkgbmnqykc = i13;
        return this;
    }

    ojitshcjhn wkgbmnqykc(CaptureRequest.Key key, Object obj) {
        this.f4057zoijcleaow.put(key, obj);
        return this;
    }

    xrmfcynszj.zoijcleaow zoijcleaow() {
        return new iobyxmoadg(this.f4054iobyxmoadg, this.f4057zoijcleaow, this.f4055ppxfxbqfkf, this.f4056wkgbmnqykc);
    }
}
