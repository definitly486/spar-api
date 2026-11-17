package v2;

import android.media.AudioAttributes;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f115662eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private wkgbmnqykc f115663gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f115664iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f115665ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f115666wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f115667zoijcleaow;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final ppxfxbqfkf f115660lqeggnwhkg = new eablkybsjg().iobyxmoadg();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final String f115661nufgyqmvbu = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final String f115658dxjokdxxww = stevsuqkhv.uawqvzlxes(1);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final String f115656btonecajqb = stevsuqkhv.uawqvzlxes(2);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final String f115659gtknphoqwx = stevsuqkhv.uawqvzlxes(3);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final String f115657draadjrbmk = stevsuqkhv.uawqvzlxes(4);

    public static final class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f115669iobyxmoadg = 0;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f115672zoijcleaow = 0;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f115670ppxfxbqfkf = 1;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f115671wkgbmnqykc = 1;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f115668eablkybsjg = 0;

        public ppxfxbqfkf iobyxmoadg() {
            return new ppxfxbqfkf(this.f115669iobyxmoadg, this.f115672zoijcleaow, this.f115670ppxfxbqfkf, this.f115671wkgbmnqykc, this.f115668eablkybsjg);
        }
    }

    /* JADX INFO: renamed from: v2.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private static final class C2873ppxfxbqfkf {
        public static void iobyxmoadg(AudioAttributes.Builder builder, int i13) {
            builder.setSpatializationBehavior(i13);
        }
    }

    public static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final AudioAttributes f115673iobyxmoadg;

        private wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(ppxfxbqfkfVar.f115664iobyxmoadg).setFlags(ppxfxbqfkfVar.f115667zoijcleaow).setUsage(ppxfxbqfkfVar.f115665ppxfxbqfkf);
            int i13 = stevsuqkhv.f123602iobyxmoadg;
            if (i13 >= 29) {
                zoijcleaow.iobyxmoadg(usage, ppxfxbqfkfVar.f115666wkgbmnqykc);
            }
            if (i13 >= 32) {
                C2873ppxfxbqfkf.iobyxmoadg(usage, ppxfxbqfkfVar.f115662eablkybsjg);
            }
            this.f115673iobyxmoadg = usage.build();
        }
    }

    private static final class zoijcleaow {
        public static void iobyxmoadg(AudioAttributes.Builder builder, int i13) {
            builder.setAllowedCapturePolicy(i13);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ppxfxbqfkf.class != obj.getClass()) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f115664iobyxmoadg == ppxfxbqfkfVar.f115664iobyxmoadg && this.f115667zoijcleaow == ppxfxbqfkfVar.f115667zoijcleaow && this.f115665ppxfxbqfkf == ppxfxbqfkfVar.f115665ppxfxbqfkf && this.f115666wkgbmnqykc == ppxfxbqfkfVar.f115666wkgbmnqykc && this.f115662eablkybsjg == ppxfxbqfkfVar.f115662eablkybsjg;
    }

    public int hashCode() {
        return ((((((((527 + this.f115664iobyxmoadg) * 31) + this.f115667zoijcleaow) * 31) + this.f115665ppxfxbqfkf) * 31) + this.f115666wkgbmnqykc) * 31) + this.f115662eablkybsjg;
    }

    public wkgbmnqykc iobyxmoadg() {
        if (this.f115663gxszxtbevo == null) {
            this.f115663gxszxtbevo = new wkgbmnqykc();
        }
        return this.f115663gxszxtbevo;
    }

    public int zoijcleaow() {
        if ((this.f115667zoijcleaow & 1) == 1) {
            return 1;
        }
        switch (this.f115665ppxfxbqfkf) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    private ppxfxbqfkf(int i13, int i14, int i15, int i16, int i17) {
        this.f115664iobyxmoadg = i13;
        this.f115667zoijcleaow = i14;
        this.f115665ppxfxbqfkf = i15;
        this.f115666wkgbmnqykc = i16;
        this.f115662eablkybsjg = i17;
    }
}
