package a5;

import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb implements jpowsppfya.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f413iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f414zoijcleaow;

    public btonecajqb(int i13) {
        this(i13, com.google.common.collect.zdlpuopuiu.zynmafqrjb());
    }

    private List eablkybsjg(jpowsppfya.zoijcleaow zoijcleaowVar) {
        String str;
        int i13;
        if (gxszxtbevo(32)) {
            return this.f414zoijcleaow;
        }
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(zoijcleaowVar.f563eablkybsjg);
        List arrayList = this.f414zoijcleaow;
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo() + yadqdtsiqtVar.wwaezpbzkn();
            if (iWwaezpbzkn == 134) {
                arrayList = new ArrayList();
                int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn() & 31;
                for (int i14 = 0; i14 < iWwaezpbzkn2; i14++) {
                    String strYadqdtsiqt = yadqdtsiqtVar.yadqdtsiqt(3);
                    int iWwaezpbzkn3 = yadqdtsiqtVar.wwaezpbzkn();
                    boolean z13 = (iWwaezpbzkn3 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                    if (z13) {
                        i13 = iWwaezpbzkn3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i13 = 1;
                    }
                    byte bWwaezpbzkn = (byte) yadqdtsiqtVar.wwaezpbzkn();
                    yadqdtsiqtVar.crxdokpmqz(1);
                    arrayList.add(new androidx.media3.common.iobyxmoadg.zoijcleaow().zeieaojujs(str).uwvvkdfqfp(strYadqdtsiqt).dsvhmnatus(i13).metgxyhuhe(z13 ? y2.btonecajqb.eablkybsjg((bWwaezpbzkn & 64) != 0) : null).cllcsxoeiz());
                }
            }
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
        }
        return arrayList;
    }

    private boolean gxszxtbevo(int i13) {
        return (i13 & this.f413iobyxmoadg) != 0;
    }

    private lmojexxdyd ppxfxbqfkf(jpowsppfya.zoijcleaow zoijcleaowVar) {
        return new lmojexxdyd(eablkybsjg(zoijcleaowVar), "video/mp2t");
    }

    private cllcsxoeiz wkgbmnqykc(jpowsppfya.zoijcleaow zoijcleaowVar) {
        return new cllcsxoeiz(eablkybsjg(zoijcleaowVar), "video/mp2t");
    }

    @Override // a5.jpowsppfya.ppxfxbqfkf
    public SparseArray iobyxmoadg() {
        return new SparseArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0059  */
    @Override // a5.jpowsppfya.ppxfxbqfkf
    public jpowsppfya zoijcleaow(int i13, jpowsppfya.zoijcleaow zoijcleaowVar) {
        if (i13 != 2) {
            if (i13 == 3 || i13 == 4) {
                return new esjtqupxsv(new zdlpuopuiu(zoijcleaowVar.f567zoijcleaow, zoijcleaowVar.iobyxmoadg(), "video/mp2t"));
            }
            if (i13 == 21) {
                return new esjtqupxsv(new oxmwwwfdhm("video/mp2t"));
            }
            if (i13 == 27) {
                if (gxszxtbevo(4)) {
                    return null;
                }
                return new esjtqupxsv(new rgvfuqvkyq(ppxfxbqfkf(zoijcleaowVar), gxszxtbevo(1), gxszxtbevo(8), "video/mp2t"));
            }
            if (i13 == 36) {
                return new esjtqupxsv(new vdvldrhtss(ppxfxbqfkf(zoijcleaowVar), "video/mp2t"));
            }
            if (i13 == 45) {
                return new esjtqupxsv(new yggfygwlhe("video/mp2t"));
            }
            if (i13 == 89) {
                return new esjtqupxsv(new draadjrbmk(zoijcleaowVar.f566wkgbmnqykc, "video/mp2t"));
            }
            if (i13 == 172) {
                return new esjtqupxsv(new gxszxtbevo(zoijcleaowVar.f567zoijcleaow, zoijcleaowVar.iobyxmoadg(), "video/mp2t"));
            }
            if (i13 == 257) {
                return new yadqdtsiqt(new cqumvgiudr("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i13 != 138) {
                if (i13 == 139) {
                    return new esjtqupxsv(new gtknphoqwx(zoijcleaowVar.f567zoijcleaow, zoijcleaowVar.iobyxmoadg(), 5408, "video/mp2t"));
                }
                switch (i13) {
                    case 15:
                        if (gxszxtbevo(2)) {
                            return null;
                        }
                        return new esjtqupxsv(new dxjokdxxww(false, zoijcleaowVar.f567zoijcleaow, zoijcleaowVar.iobyxmoadg(), "video/mp2t"));
                    case 16:
                        return new esjtqupxsv(new ojitshcjhn(wkgbmnqykc(zoijcleaowVar), "video/mp2t"));
                    case 17:
                        if (gxszxtbevo(2)) {
                            return null;
                        }
                        return new esjtqupxsv(new kcexrzcfyt(zoijcleaowVar.f567zoijcleaow, zoijcleaowVar.iobyxmoadg(), "video/mp2t"));
                    default:
                        switch (i13) {
                            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                                break;
                            case 129:
                                return new esjtqupxsv(new ppxfxbqfkf(zoijcleaowVar.f567zoijcleaow, zoijcleaowVar.iobyxmoadg(), "video/mp2t"));
                            case 130:
                                if (!gxszxtbevo(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i13) {
                                    case 134:
                                        if (gxszxtbevo(16)) {
                                            return null;
                                        }
                                        return new yadqdtsiqt(new cqumvgiudr("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        return new esjtqupxsv(new ppxfxbqfkf(zoijcleaowVar.f567zoijcleaow, zoijcleaowVar.iobyxmoadg(), "video/mp2t"));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new esjtqupxsv(new gtknphoqwx(zoijcleaowVar.f567zoijcleaow, zoijcleaowVar.iobyxmoadg(), 4096, "video/mp2t"));
        }
        return new esjtqupxsv(new agtfadlqog(wkgbmnqykc(zoijcleaowVar), "video/mp2t"));
    }

    public btonecajqb(int i13, List list) {
        this.f413iobyxmoadg = i13;
        this.f414zoijcleaow = list;
    }
}
