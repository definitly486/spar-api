package we;

import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class gtknphoqwx {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static gtknphoqwx[] f119433btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    static final gtknphoqwx[] f119434dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f119435eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f119436gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f119437iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f119438lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f119439nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f119440ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f119441wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f119442zoijcleaow;

    static {
        gtknphoqwx[] gtknphoqwxVarArr = {new gtknphoqwx(false, 3, 5, 8, 8, 1), new gtknphoqwx(false, 5, 7, 10, 10, 1), new gtknphoqwx(true, 5, 7, 16, 6, 1), new gtknphoqwx(false, 8, 10, 12, 12, 1), new gtknphoqwx(true, 10, 11, 14, 6, 2), new gtknphoqwx(false, 12, 12, 14, 14, 1), new gtknphoqwx(true, 16, 14, 24, 10, 1), new gtknphoqwx(false, 18, 14, 16, 16, 1), new gtknphoqwx(false, 22, 18, 18, 18, 1), new gtknphoqwx(true, 22, 18, 16, 10, 2), new gtknphoqwx(false, 30, 20, 20, 20, 1), new gtknphoqwx(true, 32, 24, 16, 14, 2), new gtknphoqwx(false, 36, 24, 22, 22, 1), new gtknphoqwx(false, 44, 28, 24, 24, 1), new gtknphoqwx(true, 49, 28, 22, 14, 2), new gtknphoqwx(false, 62, 36, 14, 14, 4), new gtknphoqwx(false, 86, 42, 16, 16, 4), new gtknphoqwx(false, 114, 48, 18, 18, 4), new gtknphoqwx(false, 144, 56, 20, 20, 4), new gtknphoqwx(false, 174, 68, 22, 22, 4), new gtknphoqwx(false, OrderServiceErrorHandlerImpl.ORDER_NOT_FOUND, 84, 24, 24, 4, 102, 42), new gtknphoqwx(false, 280, 112, 14, 14, 16, 140, 56), new gtknphoqwx(false, 368, 144, 16, 16, 16, 92, 36), new gtknphoqwx(false, 456, 192, 18, 18, 16, 114, 48), new gtknphoqwx(false, 576, 224, 20, 20, 16, 144, 56), new gtknphoqwx(false, 696, 272, 22, 22, 16, 174, 68), new gtknphoqwx(false, 816, 336, 24, 24, 16, 136, 56), new gtknphoqwx(false, 1050, OkHttpErrorHandlerImpl.HTTP_REQUEST_TIMEOUT_ERROR, 18, 18, 36, 175, 68), new gtknphoqwx(false, 1304, 496, 20, 20, 36, 163, 62), new wkgbmnqykc()};
        f119434dxjokdxxww = gtknphoqwxVarArr;
        f119433btonecajqb = gtknphoqwxVarArr;
    }

    public gtknphoqwx(boolean z13, int i13, int i14, int i15, int i16, int i17) {
        this(z13, i13, i14, i15, i16, i17, i13, i14);
    }

    public static gtknphoqwx draadjrbmk(int i13, draadjrbmk draadjrbmkVar, com.google.zxing.zoijcleaow zoijcleaowVar, com.google.zxing.zoijcleaow zoijcleaowVar2, boolean z13) {
        for (gtknphoqwx gtknphoqwxVar : f119433btonecajqb) {
            if (!(draadjrbmkVar == draadjrbmk.FORCE_SQUARE && gtknphoqwxVar.f119437iobyxmoadg) && ((draadjrbmkVar != draadjrbmk.FORCE_RECTANGLE || gtknphoqwxVar.f119437iobyxmoadg) && i13 <= gtknphoqwxVar.f119442zoijcleaow)) {
                return gtknphoqwxVar;
            }
        }
        if (z13) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i13)));
        }
        return null;
    }

    private int eablkybsjg() {
        int i13 = this.f119436gxszxtbevo;
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2 && i13 != 4) {
                if (i13 == 16) {
                    return 4;
                }
                if (i13 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i14;
    }

    private int gtknphoqwx() {
        int i13 = this.f119436gxszxtbevo;
        if (i13 == 1 || i13 == 2) {
            return 1;
        }
        if (i13 == 4) {
            return 2;
        }
        if (i13 == 16) {
            return 4;
        }
        if (i13 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final int btonecajqb() {
        return nufgyqmvbu() + (eablkybsjg() << 1);
    }

    public final int dxjokdxxww() {
        return lqeggnwhkg() + (gtknphoqwx() << 1);
    }

    public int gxszxtbevo() {
        return this.f119442zoijcleaow / this.f119438lqeggnwhkg;
    }

    public final int iobyxmoadg() {
        return this.f119442zoijcleaow;
    }

    public final int lqeggnwhkg() {
        return gtknphoqwx() * this.f119435eablkybsjg;
    }

    public final int nufgyqmvbu() {
        return eablkybsjg() * this.f119441wkgbmnqykc;
    }

    public final int ppxfxbqfkf() {
        return this.f119440ppxfxbqfkf;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f119437iobyxmoadg ? "Rectangular Symbol:" : "Square Symbol:");
        sb3.append(" data region ");
        sb3.append(this.f119441wkgbmnqykc);
        sb3.append('x');
        sb3.append(this.f119435eablkybsjg);
        sb3.append(", symbol size ");
        sb3.append(btonecajqb());
        sb3.append('x');
        sb3.append(dxjokdxxww());
        sb3.append(", symbol data size ");
        sb3.append(nufgyqmvbu());
        sb3.append('x');
        sb3.append(lqeggnwhkg());
        sb3.append(", codewords ");
        sb3.append(this.f119442zoijcleaow);
        sb3.append('+');
        sb3.append(this.f119440ppxfxbqfkf);
        return sb3.toString();
    }

    public final int wkgbmnqykc(int i13) {
        return this.f119439nufgyqmvbu;
    }

    public int zoijcleaow(int i13) {
        return this.f119438lqeggnwhkg;
    }

    gtknphoqwx(boolean z13, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f119437iobyxmoadg = z13;
        this.f119442zoijcleaow = i13;
        this.f119440ppxfxbqfkf = i14;
        this.f119441wkgbmnqykc = i15;
        this.f119435eablkybsjg = i16;
        this.f119436gxszxtbevo = i17;
        this.f119438lqeggnwhkg = i18;
        this.f119439nufgyqmvbu = i19;
    }
}
