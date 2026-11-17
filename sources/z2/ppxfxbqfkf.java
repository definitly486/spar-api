package z2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f127707iobyxmoadg;

    /* JADX INFO: renamed from: z2.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C3260ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final yadqdtsiqt f127708zoijcleaow;

        public C3260ppxfxbqfkf(int i13, yadqdtsiqt yadqdtsiqtVar) {
            super(i13);
            this.f127708zoijcleaow = yadqdtsiqtVar;
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final List f127709ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final List f127710wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f127711zoijcleaow;

        public zoijcleaow(int i13, long j13) {
            super(i13);
            this.f127711zoijcleaow = j13;
            this.f127709ppxfxbqfkf = new ArrayList();
            this.f127710wkgbmnqykc = new ArrayList();
        }

        public C3260ppxfxbqfkf eablkybsjg(int i13) {
            int size = this.f127709ppxfxbqfkf.size();
            for (int i14 = 0; i14 < size; i14++) {
                C3260ppxfxbqfkf c3260ppxfxbqfkf = (C3260ppxfxbqfkf) this.f127709ppxfxbqfkf.get(i14);
                if (c3260ppxfxbqfkf.f127707iobyxmoadg == i13) {
                    return c3260ppxfxbqfkf;
                }
            }
            return null;
        }

        public void ppxfxbqfkf(C3260ppxfxbqfkf c3260ppxfxbqfkf) {
            this.f127709ppxfxbqfkf.add(c3260ppxfxbqfkf);
        }

        @Override // z2.ppxfxbqfkf
        public String toString() {
            return ppxfxbqfkf.iobyxmoadg(this.f127707iobyxmoadg) + " leaves: " + Arrays.toString(this.f127709ppxfxbqfkf.toArray()) + " containers: " + Arrays.toString(this.f127710wkgbmnqykc.toArray());
        }

        public zoijcleaow wkgbmnqykc(int i13) {
            int size = this.f127710wkgbmnqykc.size();
            for (int i14 = 0; i14 < size; i14++) {
                zoijcleaow zoijcleaowVar = (zoijcleaow) this.f127710wkgbmnqykc.get(i14);
                if (zoijcleaowVar.f127707iobyxmoadg == i13) {
                    return zoijcleaowVar;
                }
            }
            return null;
        }

        public void zoijcleaow(zoijcleaow zoijcleaowVar) {
            this.f127710wkgbmnqykc.add(zoijcleaowVar);
        }
    }

    public static String iobyxmoadg(int i13) {
        return "" + ((char) ((i13 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i13 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i13 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) (i13 & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public String toString() {
        return iobyxmoadg(this.f127707iobyxmoadg);
    }

    private ppxfxbqfkf(int i13) {
        this.f127707iobyxmoadg = i13;
    }
}
