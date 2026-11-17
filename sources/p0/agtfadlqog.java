package p0;

import j0.l;
import j0.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class agtfadlqog {
    public static final long iobyxmoadg(long j13, long j14) {
        int iBtonecajqb;
        int iDraadjrbmk = l.draadjrbmk(j13);
        int iGtknphoqwx = l.gtknphoqwx(j13);
        if (l.rgvfuqvkyq(j14, j13)) {
            if (l.wkgbmnqykc(j14, j13)) {
                iDraadjrbmk = l.draadjrbmk(j14);
                iGtknphoqwx = iDraadjrbmk;
            } else {
                if (l.wkgbmnqykc(j13, j14)) {
                    iBtonecajqb = l.btonecajqb(j14);
                } else if (l.eablkybsjg(j14, iDraadjrbmk)) {
                    iDraadjrbmk = l.draadjrbmk(j14);
                    iBtonecajqb = l.btonecajqb(j14);
                } else {
                    iGtknphoqwx = l.draadjrbmk(j14);
                }
                iGtknphoqwx -= iBtonecajqb;
            }
        } else if (iGtknphoqwx > l.draadjrbmk(j14)) {
            iDraadjrbmk -= l.btonecajqb(j14);
            iBtonecajqb = l.btonecajqb(j14);
            iGtknphoqwx -= iBtonecajqb;
        }
        return m.zoijcleaow(iDraadjrbmk, iGtknphoqwx);
    }
}
