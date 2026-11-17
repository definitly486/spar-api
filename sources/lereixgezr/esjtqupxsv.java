package lereixgezr;

import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f62273iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f62274ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f62275wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f62276zoijcleaow;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final List f62277iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final List f62278ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        long f62279wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final List f62280zoijcleaow;

        public iobyxmoadg(ribwqtqdhb ribwqtqdhbVar) {
            this(ribwqtqdhbVar, 7);
        }

        public iobyxmoadg iobyxmoadg(ribwqtqdhb ribwqtqdhbVar, int i13) {
            boolean z13 = false;
            u1.nufgyqmvbu.zoijcleaow(ribwqtqdhbVar != null, "Point cannot be null.");
            if (i13 >= 1 && i13 <= 7) {
                z13 = true;
            }
            u1.nufgyqmvbu.zoijcleaow(z13, "Invalid metering mode " + i13);
            if ((i13 & 1) != 0) {
                this.f62277iobyxmoadg.add(ribwqtqdhbVar);
            }
            if ((i13 & 2) != 0) {
                this.f62280zoijcleaow.add(ribwqtqdhbVar);
            }
            if ((i13 & 4) != 0) {
                this.f62278ppxfxbqfkf.add(ribwqtqdhbVar);
            }
            return this;
        }

        public iobyxmoadg ppxfxbqfkf(int i13) {
            if ((i13 & 1) != 0) {
                this.f62277iobyxmoadg.clear();
            }
            if ((i13 & 2) != 0) {
                this.f62280zoijcleaow.clear();
            }
            if ((i13 & 4) != 0) {
                this.f62278ppxfxbqfkf.clear();
            }
            return this;
        }

        public esjtqupxsv zoijcleaow() {
            return new esjtqupxsv(this);
        }

        public iobyxmoadg(ribwqtqdhb ribwqtqdhbVar, int i13) {
            this.f62277iobyxmoadg = new ArrayList();
            this.f62280zoijcleaow = new ArrayList();
            this.f62278ppxfxbqfkf = new ArrayList();
            this.f62279wkgbmnqykc = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
            iobyxmoadg(ribwqtqdhbVar, i13);
        }

        public iobyxmoadg(esjtqupxsv esjtqupxsvVar) {
            ArrayList arrayList = new ArrayList();
            this.f62277iobyxmoadg = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f62280zoijcleaow = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f62278ppxfxbqfkf = arrayList3;
            this.f62279wkgbmnqykc = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
            arrayList.addAll(esjtqupxsvVar.ppxfxbqfkf());
            arrayList2.addAll(esjtqupxsvVar.zoijcleaow());
            arrayList3.addAll(esjtqupxsvVar.wkgbmnqykc());
            this.f62279wkgbmnqykc = esjtqupxsvVar.iobyxmoadg();
        }
    }

    esjtqupxsv(iobyxmoadg iobyxmoadgVar) {
        this.f62273iobyxmoadg = Collections.unmodifiableList(iobyxmoadgVar.f62277iobyxmoadg);
        this.f62276zoijcleaow = Collections.unmodifiableList(iobyxmoadgVar.f62280zoijcleaow);
        this.f62274ppxfxbqfkf = Collections.unmodifiableList(iobyxmoadgVar.f62278ppxfxbqfkf);
        this.f62275wkgbmnqykc = iobyxmoadgVar.f62279wkgbmnqykc;
    }

    public boolean eablkybsjg() {
        return this.f62275wkgbmnqykc > 0;
    }

    public long iobyxmoadg() {
        return this.f62275wkgbmnqykc;
    }

    public List ppxfxbqfkf() {
        return this.f62273iobyxmoadg;
    }

    public List wkgbmnqykc() {
        return this.f62274ppxfxbqfkf;
    }

    public List zoijcleaow() {
        return this.f62276zoijcleaow;
    }
}
