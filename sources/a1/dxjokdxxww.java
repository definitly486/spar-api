package a1;

/* JADX INFO: loaded from: classes.dex */
public class dxjokdxxww extends ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    double f166eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    double f167wkgbmnqykc;

    dxjokdxxww(String str) {
        this.f261iobyxmoadg = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f167wkgbmnqykc = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i13 = iIndexOf2 + 1;
        this.f166eablkybsjg = Double.parseDouble(str.substring(i13, str.indexOf(44, i13)).trim());
    }

    private double eablkybsjg(double d13) {
        double d14 = this.f166eablkybsjg;
        return d13 < d14 ? (d14 * d13) / (d13 + (this.f167wkgbmnqykc * (d14 - d13))) : ((1.0d - d14) * (d13 - 1.0d)) / ((1.0d - d13) - (this.f167wkgbmnqykc * (d14 - d13)));
    }

    private double wkgbmnqykc(double d13) {
        double d14 = this.f166eablkybsjg;
        if (d13 < d14) {
            double d15 = this.f167wkgbmnqykc;
            return ((d15 * d14) * d14) / ((((d14 - d13) * d15) + d13) * ((d15 * (d14 - d13)) + d13));
        }
        double d16 = this.f167wkgbmnqykc;
        return (((d14 - 1.0d) * d16) * (d14 - 1.0d)) / (((((-d16) * (d14 - d13)) - d13) + 1.0d) * ((((-d16) * (d14 - d13)) - d13) + 1.0d));
    }

    @Override // a1.ppxfxbqfkf
    public double iobyxmoadg(double d13) {
        return eablkybsjg(d13);
    }

    @Override // a1.ppxfxbqfkf
    public double zoijcleaow(double d13) {
        return wkgbmnqykc(d13);
    }
}
