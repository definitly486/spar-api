package r1;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import lereixgezr.istkbnxepw;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {

    public static class ppxfxbqfkf {
        public abstract void iobyxmoadg(int i13);

        public abstract void zoijcleaow(Typeface typeface);
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final int f81447eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Uri f81448iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f81449ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f81450wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f81451zoijcleaow;

        public zoijcleaow(Uri uri, int i13, int i14, boolean z13, int i15) {
            this.f81448iobyxmoadg = (Uri) u1.nufgyqmvbu.gxszxtbevo(uri);
            this.f81451zoijcleaow = i13;
            this.f81449ppxfxbqfkf = i14;
            this.f81450wkgbmnqykc = z13;
            this.f81447eablkybsjg = i15;
        }

        static zoijcleaow iobyxmoadg(Uri uri, int i13, int i14, boolean z13, int i15) {
            return new zoijcleaow(uri, i13, i14, z13, i15);
        }

        public int eablkybsjg() {
            return this.f81449ppxfxbqfkf;
        }

        public boolean gxszxtbevo() {
            return this.f81450wkgbmnqykc;
        }

        public int ppxfxbqfkf() {
            return this.f81451zoijcleaow;
        }

        public Uri wkgbmnqykc() {
            return this.f81448iobyxmoadg;
        }

        public int zoijcleaow() {
            return this.f81447eablkybsjg;
        }
    }

    public static Typeface iobyxmoadg(Context context, List list, int i13, boolean z13, int i14, Handler handler, ppxfxbqfkf ppxfxbqfkfVar) {
        r1.iobyxmoadg iobyxmoadgVar = new r1.iobyxmoadg(ppxfxbqfkfVar, draadjrbmk.zoijcleaow(handler));
        if (!z13) {
            return dxjokdxxww.wkgbmnqykc(context, list, i13, null, iobyxmoadgVar);
        }
        if (list.size() <= 1) {
            return dxjokdxxww.eablkybsjg(context, (eablkybsjg) list.get(0), iobyxmoadgVar, i13, i14);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static Typeface zoijcleaow(Context context, eablkybsjg eablkybsjgVar, int i13, boolean z13, int i14, Handler handler, ppxfxbqfkf ppxfxbqfkfVar) {
        return iobyxmoadg(context, istkbnxepw.iobyxmoadg(new Object[]{eablkybsjgVar}), i13, z13, i14, handler, ppxfxbqfkfVar);
    }

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f81445iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f81446zoijcleaow;

        public iobyxmoadg(int i13, zoijcleaow[] zoijcleaowVarArr) {
            this.f81445iobyxmoadg = i13;
            this.f81446zoijcleaow = Collections.singletonList(zoijcleaowVarArr);
        }

        static iobyxmoadg iobyxmoadg(int i13, List list) {
            return new iobyxmoadg(i13, list);
        }

        static iobyxmoadg zoijcleaow(int i13, zoijcleaow[] zoijcleaowVarArr) {
            return new iobyxmoadg(i13, zoijcleaowVarArr);
        }

        public int eablkybsjg() {
            return this.f81445iobyxmoadg;
        }

        boolean gxszxtbevo() {
            return this.f81446zoijcleaow.size() > 1;
        }

        public zoijcleaow[] ppxfxbqfkf() {
            return (zoijcleaow[]) this.f81446zoijcleaow.get(0);
        }

        public List wkgbmnqykc() {
            return this.f81446zoijcleaow;
        }

        iobyxmoadg(int i13, List list) {
            this.f81445iobyxmoadg = i13;
            this.f81446zoijcleaow = list;
        }
    }
}
