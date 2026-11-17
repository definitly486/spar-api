package j4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo extends j4.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final List f50642iobyxmoadg;

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public final int f50643btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public final int f50644dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final long f50645eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        public final int f50646gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final List f50647gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long f50648iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public final boolean f50649lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public final long f50650nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final boolean f50651ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final boolean f50652wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final boolean f50653zoijcleaow;

        private ppxfxbqfkf(long j13, boolean z13, boolean z14, boolean z15, List list, long j14, boolean z16, long j15, int i13, int i14, int i15) {
            this.f50648iobyxmoadg = j13;
            this.f50653zoijcleaow = z13;
            this.f50651ppxfxbqfkf = z14;
            this.f50652wkgbmnqykc = z15;
            this.f50647gxszxtbevo = Collections.unmodifiableList(list);
            this.f50645eablkybsjg = j14;
            this.f50649lqeggnwhkg = z16;
            this.f50650nufgyqmvbu = j15;
            this.f50644dxjokdxxww = i13;
            this.f50643btonecajqb = i14;
            this.f50646gtknphoqwx = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ppxfxbqfkf zoijcleaow(yadqdtsiqt yadqdtsiqtVar) {
            ArrayList arrayList;
            boolean z13;
            long j13;
            boolean z14;
            long j14;
            int i13;
            int i14;
            int iWwaezpbzkn;
            boolean z15;
            boolean z16;
            long jPkzmftpjix;
            long jPkzmftpjix2 = yadqdtsiqtVar.pkzmftpjix();
            boolean z17 = (yadqdtsiqtVar.wwaezpbzkn() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z17) {
                arrayList = arrayList2;
                z13 = false;
                j13 = -9223372036854775807L;
                z14 = false;
                j14 = -9223372036854775807L;
                i13 = 0;
                i14 = 0;
                iWwaezpbzkn = 0;
                z15 = false;
            } else {
                int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
                boolean z18 = (iWwaezpbzkn2 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                boolean z19 = (iWwaezpbzkn2 & 64) != 0;
                boolean z23 = (iWwaezpbzkn2 & 32) != 0;
                long jPkzmftpjix3 = z19 ? yadqdtsiqtVar.pkzmftpjix() : -9223372036854775807L;
                if (!z19) {
                    int iWwaezpbzkn3 = yadqdtsiqtVar.wwaezpbzkn();
                    ArrayList arrayList3 = new ArrayList(iWwaezpbzkn3);
                    for (int i15 = 0; i15 < iWwaezpbzkn3; i15++) {
                        arrayList3.add(new zoijcleaow(yadqdtsiqtVar.wwaezpbzkn(), yadqdtsiqtVar.pkzmftpjix()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z23) {
                    long jWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                    boolean z24 = (128 & jWwaezpbzkn) != 0;
                    jPkzmftpjix = ((((jWwaezpbzkn & 1) << 32) | yadqdtsiqtVar.pkzmftpjix()) * 1000) / 90;
                    z16 = z24;
                } else {
                    z16 = false;
                    jPkzmftpjix = -9223372036854775807L;
                }
                int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
                int iWwaezpbzkn4 = yadqdtsiqtVar.wwaezpbzkn();
                z15 = z19;
                iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                j14 = jPkzmftpjix;
                arrayList = arrayList2;
                long j15 = jPkzmftpjix3;
                i13 = iWypolnanlu;
                i14 = iWwaezpbzkn4;
                j13 = j15;
                boolean z25 = z18;
                z14 = z16;
                z13 = z25;
            }
            return new ppxfxbqfkf(jPkzmftpjix2, z17, z13, z15, arrayList, j13, z14, j14, i13, i14, iWwaezpbzkn);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f50654iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f50655zoijcleaow;

        private zoijcleaow(int i13, long j13) {
            this.f50654iobyxmoadg = i13;
            this.f50655zoijcleaow = j13;
        }
    }

    private gxszxtbevo(List list) {
        this.f50642iobyxmoadg = Collections.unmodifiableList(list);
    }

    static gxszxtbevo wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar) {
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        ArrayList arrayList = new ArrayList(iWwaezpbzkn);
        for (int i13 = 0; i13 < iWwaezpbzkn; i13++) {
            arrayList.add(ppxfxbqfkf.zoijcleaow(yadqdtsiqtVar));
        }
        return new gxszxtbevo(arrayList);
    }
}
