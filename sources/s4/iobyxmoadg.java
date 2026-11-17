package s4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.zdlpuopuiu;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import q4.oxmwwwfdhm;
import y2.cdpycssgdh;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.wflxmlrfwp;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements oxmwwwfdhm {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final C2565iobyxmoadg f105445eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final nufgyqmvbu f105446gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Paint f105447iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Bitmap f105448lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Canvas f105449ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f105450wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Paint f105451zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final byte[] f105444nufgyqmvbu = {0, 7, 8, 15};

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final byte[] f105443dxjokdxxww = {0, 119, -120, -1};

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final byte[] f105442btonecajqb = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    private static final class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f105452iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f105453zoijcleaow;

        public eablkybsjg(int i13, int i14) {
            this.f105452iobyxmoadg = i13;
            this.f105453zoijcleaow = i14;
        }
    }

    private static final class gxszxtbevo {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public final int f105454btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public final int f105455dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final int f105456eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        public final SparseArray f105457gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final int f105458gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f105459iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public final int f105460lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public final int f105461nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f105462ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f105463wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final boolean f105464zoijcleaow;

        public gxszxtbevo(int i13, boolean z13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24, SparseArray sparseArray) {
            this.f105459iobyxmoadg = i13;
            this.f105464zoijcleaow = z13;
            this.f105462ppxfxbqfkf = i14;
            this.f105463wkgbmnqykc = i15;
            this.f105456eablkybsjg = i16;
            this.f105458gxszxtbevo = i17;
            this.f105460lqeggnwhkg = i18;
            this.f105461nufgyqmvbu = i19;
            this.f105455dxjokdxxww = i23;
            this.f105454btonecajqb = i24;
            this.f105457gtknphoqwx = sparseArray;
        }

        public void iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            SparseArray sparseArray = gxszxtbevoVar.f105457gtknphoqwx;
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                this.f105457gtknphoqwx.put(sparseArray.keyAt(i13), (lqeggnwhkg) sparseArray.valueAt(i13));
            }
        }
    }

    /* JADX INFO: renamed from: s4.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C2565iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f105465iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int[] f105466ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int[] f105467wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int[] f105468zoijcleaow;

        public C2565iobyxmoadg(int i13, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f105465iobyxmoadg = i13;
            this.f105468zoijcleaow = iArr;
            this.f105466ppxfxbqfkf = iArr2;
            this.f105467wkgbmnqykc = iArr3;
        }
    }

    private static final class lqeggnwhkg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final int f105469eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final int f105470gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f105471iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f105472ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f105473wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f105474zoijcleaow;

        public lqeggnwhkg(int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f105471iobyxmoadg = i13;
            this.f105474zoijcleaow = i14;
            this.f105472ppxfxbqfkf = i15;
            this.f105473wkgbmnqykc = i16;
            this.f105469eablkybsjg = i17;
            this.f105470gxszxtbevo = i18;
        }
    }

    private static final class nufgyqmvbu {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public wkgbmnqykc f105475dxjokdxxww;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f105478iobyxmoadg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public zoijcleaow f105480nufgyqmvbu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f105483zoijcleaow;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final SparseArray f105481ppxfxbqfkf = new SparseArray();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final SparseArray f105482wkgbmnqykc = new SparseArray();

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final SparseArray f105476eablkybsjg = new SparseArray();

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final SparseArray f105477gxszxtbevo = new SparseArray();

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public final SparseArray f105479lqeggnwhkg = new SparseArray();

        public nufgyqmvbu(int i13, int i14) {
            this.f105478iobyxmoadg = i13;
            this.f105483zoijcleaow = i14;
        }

        public void iobyxmoadg() {
            this.f105481ppxfxbqfkf.clear();
            this.f105482wkgbmnqykc.clear();
            this.f105476eablkybsjg.clear();
            this.f105477gxszxtbevo.clear();
            this.f105479lqeggnwhkg.clear();
            this.f105480nufgyqmvbu = null;
            this.f105475dxjokdxxww = null;
        }
    }

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f105484iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final byte[] f105485ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final byte[] f105486wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final boolean f105487zoijcleaow;

        public ppxfxbqfkf(int i13, boolean z13, byte[] bArr, byte[] bArr2) {
            this.f105484iobyxmoadg = i13;
            this.f105487zoijcleaow = z13;
            this.f105485ppxfxbqfkf = bArr;
            this.f105486wkgbmnqykc = bArr2;
        }
    }

    private static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f105488iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f105489ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final SparseArray f105490wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f105491zoijcleaow;

        public wkgbmnqykc(int i13, int i14, int i15, SparseArray sparseArray) {
            this.f105488iobyxmoadg = i13;
            this.f105491zoijcleaow = i14;
            this.f105489ppxfxbqfkf = i15;
            this.f105490wkgbmnqykc = sparseArray;
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final int f105492eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final int f105493gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f105494iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f105495ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final int f105496wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f105497zoijcleaow;

        public zoijcleaow(int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f105494iobyxmoadg = i13;
            this.f105497zoijcleaow = i14;
            this.f105495ppxfxbqfkf = i15;
            this.f105496wkgbmnqykc = i16;
            this.f105492eablkybsjg = i17;
            this.f105493gxszxtbevo = i18;
        }
    }

    public iobyxmoadg(List list) {
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt((byte[]) list.get(0));
        int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        int iWypolnanlu2 = yadqdtsiqtVar.wypolnanlu();
        Paint paint = new Paint();
        this.f105447iobyxmoadg = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f105451zoijcleaow = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f105449ppxfxbqfkf = new Canvas();
        this.f105450wkgbmnqykc = new zoijcleaow(719, 575, 0, 719, 0, 575);
        this.f105445eablkybsjg = new C2565iobyxmoadg(0, gxszxtbevo(), lqeggnwhkg(), nufgyqmvbu());
        this.f105446gxszxtbevo = new nufgyqmvbu(iWypolnanlu, iWypolnanlu2);
    }

    private static void agtfadlqog(ppxfxbqfkf ppxfxbqfkfVar, C2565iobyxmoadg c2565iobyxmoadg, int i13, int i14, int i15, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i13 == 3) {
            iArr = c2565iobyxmoadg.f105467wkgbmnqykc;
        } else {
            iArr = i13 == 2 ? c2565iobyxmoadg.f105466ppxfxbqfkf : c2565iobyxmoadg.f105468zoijcleaow;
        }
        int[] iArr2 = iArr;
        wflxmlrfwp(ppxfxbqfkfVar.f105485ppxfxbqfkf, iArr2, i13, i14, i15, paint, canvas);
        wflxmlrfwp(ppxfxbqfkfVar.f105486wkgbmnqykc, iArr2, i13, i14, i15 + 1, paint, canvas);
    }

    private static int btonecajqb(cdpycssgdh cdpycssgdhVar, int[] iArr, byte[] bArr, int i13, int i14, Paint paint, Canvas canvas) {
        int i15;
        int iNufgyqmvbu;
        int iNufgyqmvbu2;
        int i16 = i13;
        boolean z13 = false;
        while (true) {
            int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(2);
            if (iNufgyqmvbu3 != 0) {
                z13 = z13;
                i15 = 1;
            } else {
                if (cdpycssgdhVar.lqeggnwhkg()) {
                    iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(3) + 3;
                    iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(2);
                } else {
                    if (cdpycssgdhVar.lqeggnwhkg()) {
                        i15 = 1;
                    } else {
                        int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(2);
                        if (iNufgyqmvbu4 == 0) {
                            z13 = true;
                        } else if (iNufgyqmvbu4 == 1) {
                            i15 = 2;
                        } else if (iNufgyqmvbu4 == 2) {
                            iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(4) + 12;
                            iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(2);
                        } else if (iNufgyqmvbu4 != 3) {
                            z13 = z13;
                        } else {
                            iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(8) + 29;
                            iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(2);
                        }
                        iNufgyqmvbu3 = 0;
                        i15 = 0;
                    }
                    iNufgyqmvbu3 = 0;
                }
                z13 = z13;
                i15 = iNufgyqmvbu;
                iNufgyqmvbu3 = iNufgyqmvbu2;
            }
            if (i15 != 0 && paint != null) {
                if (bArr != null) {
                    iNufgyqmvbu3 = bArr[iNufgyqmvbu3];
                }
                paint.setColor(iArr[iNufgyqmvbu3]);
                canvas.drawRect(i16, i14, i16 + i15, i14 + 1, paint);
            }
            i16 += i15;
            if (z13) {
                return i16;
            }
            z13 = z13;
        }
    }

    private static int draadjrbmk(cdpycssgdh cdpycssgdhVar, int[] iArr, byte[] bArr, int i13, int i14, Paint paint, Canvas canvas) {
        boolean z13;
        int iNufgyqmvbu;
        int i15 = i13;
        boolean z14 = false;
        while (true) {
            int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(8);
            if (iNufgyqmvbu2 != 0) {
                z13 = z14;
                iNufgyqmvbu = 1;
            } else if (cdpycssgdhVar.lqeggnwhkg()) {
                z13 = z14;
                iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(7);
                iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(8);
            } else {
                int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(7);
                if (iNufgyqmvbu3 != 0) {
                    z13 = z14;
                    iNufgyqmvbu = iNufgyqmvbu3;
                    iNufgyqmvbu2 = 0;
                } else {
                    z13 = true;
                    iNufgyqmvbu2 = 0;
                    iNufgyqmvbu = 0;
                }
            }
            if (iNufgyqmvbu != 0 && paint != null) {
                if (bArr != null) {
                    iNufgyqmvbu2 = bArr[iNufgyqmvbu2];
                }
                paint.setColor(iArr[iNufgyqmvbu2]);
                canvas.drawRect(i15, i14, i15 + iNufgyqmvbu, i14 + 1, paint);
            }
            i15 += iNufgyqmvbu;
            if (z13) {
                return i15;
            }
            z14 = z13;
        }
    }

    private static int dxjokdxxww(int i13, int i14, int i15, int i16) {
        return (i13 << 24) | (i14 << 16) | (i15 << 8) | i16;
    }

    private static byte[] eablkybsjg(int i13, int i14, cdpycssgdh cdpycssgdhVar) {
        byte[] bArr = new byte[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            bArr[i15] = (byte) cdpycssgdhVar.nufgyqmvbu(i14);
        }
        return bArr;
    }

    private static int gtknphoqwx(cdpycssgdh cdpycssgdhVar, int[] iArr, byte[] bArr, int i13, int i14, Paint paint, Canvas canvas) {
        int i15;
        int iNufgyqmvbu;
        int iNufgyqmvbu2;
        int i16 = i13;
        boolean z13 = false;
        while (true) {
            int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(4);
            if (iNufgyqmvbu3 != 0) {
                z13 = z13;
                i15 = 1;
            } else if (cdpycssgdhVar.lqeggnwhkg()) {
                if (cdpycssgdhVar.lqeggnwhkg()) {
                    int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(2);
                    if (iNufgyqmvbu4 == 0) {
                        i15 = 1;
                    } else if (iNufgyqmvbu4 == 1) {
                        i15 = 2;
                    } else if (iNufgyqmvbu4 == 2) {
                        iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(4) + 9;
                        iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(4);
                    } else if (iNufgyqmvbu4 != 3) {
                        z13 = z13;
                        iNufgyqmvbu3 = 0;
                        i15 = 0;
                    } else {
                        iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(8) + 25;
                        iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(4);
                    }
                    iNufgyqmvbu3 = 0;
                } else {
                    iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(2) + 4;
                    iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(4);
                }
                z13 = z13;
                i15 = iNufgyqmvbu;
                iNufgyqmvbu3 = iNufgyqmvbu2;
            } else {
                int iNufgyqmvbu5 = cdpycssgdhVar.nufgyqmvbu(3);
                if (iNufgyqmvbu5 != 0) {
                    i15 = iNufgyqmvbu5 + 2;
                    iNufgyqmvbu3 = 0;
                } else {
                    z13 = true;
                    iNufgyqmvbu3 = 0;
                    i15 = 0;
                }
            }
            if (i15 != 0 && paint != null) {
                if (bArr != null) {
                    iNufgyqmvbu3 = bArr[iNufgyqmvbu3];
                }
                paint.setColor(iArr[iNufgyqmvbu3]);
                canvas.drawRect(i16, i14, i16 + i15, i14 + 1, paint);
            }
            i16 += i15;
            if (z13) {
                return i16;
            }
            z13 = z13;
        }
    }

    private static int[] gxszxtbevo() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static wkgbmnqykc kcexrzcfyt(cdpycssgdh cdpycssgdhVar, int i13) {
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(8);
        int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(4);
        int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(2);
        cdpycssgdhVar.oxmwwwfdhm(2);
        int i14 = i13 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i14 > 0) {
            int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(8);
            cdpycssgdhVar.oxmwwwfdhm(8);
            i14 -= 6;
            sparseArray.put(iNufgyqmvbu4, new eablkybsjg(cdpycssgdhVar.nufgyqmvbu(16), cdpycssgdhVar.nufgyqmvbu(16)));
        }
        return new wkgbmnqykc(iNufgyqmvbu, iNufgyqmvbu2, iNufgyqmvbu3, sparseArray);
    }

    private static int[] lqeggnwhkg() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i13 = 1; i13 < 16; i13++) {
            if (i13 < 8) {
                iArr[i13] = dxjokdxxww(KotlinVersion.MAX_COMPONENT_VALUE, (i13 & 1) != 0 ? 255 : 0, (i13 & 2) != 0 ? 255 : 0, (i13 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i13] = dxjokdxxww(KotlinVersion.MAX_COMPONENT_VALUE, (i13 & 1) != 0 ? 127 : 0, (i13 & 2) != 0 ? 127 : 0, (i13 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] nufgyqmvbu() {
        int[] iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        iArr[0] = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            int i14 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i13 < 8) {
                int i15 = (i13 & 1) != 0 ? 255 : 0;
                int i16 = (i13 & 2) != 0 ? 255 : 0;
                if ((i13 & 4) == 0) {
                    i14 = 0;
                }
                iArr[i13] = dxjokdxxww(63, i15, i16, i14);
            } else {
                int i17 = i13 & 136;
                if (i17 == 0) {
                    iArr[i13] = dxjokdxxww(KotlinVersion.MAX_COMPONENT_VALUE, ((i13 & 1) != 0 ? 85 : 0) + ((i13 & 16) != 0 ? 170 : 0), ((i13 & 2) != 0 ? 85 : 0) + ((i13 & 32) != 0 ? 170 : 0), ((i13 & 4) == 0 ? 0 : 85) + ((i13 & 64) == 0 ? 0 : 170));
                } else if (i17 == 8) {
                    iArr[i13] = dxjokdxxww(127, ((i13 & 1) != 0 ? 85 : 0) + ((i13 & 16) != 0 ? 170 : 0), ((i13 & 2) != 0 ? 85 : 0) + ((i13 & 32) != 0 ? 170 : 0), ((i13 & 4) == 0 ? 0 : 85) + ((i13 & 64) == 0 ? 0 : 170));
                } else if (i17 == 128) {
                    iArr[i13] = dxjokdxxww(KotlinVersion.MAX_COMPONENT_VALUE, ((i13 & 1) != 0 ? 43 : 0) + 127 + ((i13 & 16) != 0 ? 85 : 0), ((i13 & 2) != 0 ? 43 : 0) + 127 + ((i13 & 32) != 0 ? 85 : 0), ((i13 & 4) == 0 ? 0 : 43) + 127 + ((i13 & 64) == 0 ? 0 : 85));
                } else if (i17 == 136) {
                    iArr[i13] = dxjokdxxww(KotlinVersion.MAX_COMPONENT_VALUE, ((i13 & 1) != 0 ? 43 : 0) + ((i13 & 16) != 0 ? 85 : 0), ((i13 & 2) != 0 ? 43 : 0) + ((i13 & 32) != 0 ? 85 : 0), ((i13 & 4) == 0 ? 0 : 43) + ((i13 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private q4.eablkybsjg ojitshcjhn(cdpycssgdh cdpycssgdhVar) {
        while (cdpycssgdhVar.zoijcleaow() >= 48 && cdpycssgdhVar.nufgyqmvbu(8) == 15) {
            yggfygwlhe(cdpycssgdhVar, this.f105446gxszxtbevo);
        }
        nufgyqmvbu nufgyqmvbuVar = this.f105446gxszxtbevo;
        wkgbmnqykc wkgbmnqykcVar = nufgyqmvbuVar.f105475dxjokdxxww;
        if (wkgbmnqykcVar == null) {
            return new q4.eablkybsjg(zdlpuopuiu.zynmafqrjb(), -9223372036854775807L, -9223372036854775807L);
        }
        zoijcleaow zoijcleaowVar = nufgyqmvbuVar.f105480nufgyqmvbu;
        if (zoijcleaowVar == null) {
            zoijcleaowVar = this.f105450wkgbmnqykc;
        }
        Bitmap bitmap = this.f105448lqeggnwhkg;
        if (bitmap == null || zoijcleaowVar.f105494iobyxmoadg + 1 != bitmap.getWidth() || zoijcleaowVar.f105497zoijcleaow + 1 != this.f105448lqeggnwhkg.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zoijcleaowVar.f105494iobyxmoadg + 1, zoijcleaowVar.f105497zoijcleaow + 1, Bitmap.Config.ARGB_8888);
            this.f105448lqeggnwhkg = bitmapCreateBitmap;
            this.f105449ppxfxbqfkf.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = wkgbmnqykcVar.f105490wkgbmnqykc;
        for (int i13 = 0; i13 < sparseArray.size(); i13++) {
            this.f105449ppxfxbqfkf.save();
            eablkybsjg eablkybsjgVar = (eablkybsjg) sparseArray.valueAt(i13);
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) this.f105446gxszxtbevo.f105481ppxfxbqfkf.get(sparseArray.keyAt(i13));
            int i14 = eablkybsjgVar.f105452iobyxmoadg + zoijcleaowVar.f105495ppxfxbqfkf;
            int i15 = eablkybsjgVar.f105453zoijcleaow + zoijcleaowVar.f105492eablkybsjg;
            this.f105449ppxfxbqfkf.clipRect(i14, i15, Math.min(gxszxtbevoVar.f105462ppxfxbqfkf + i14, zoijcleaowVar.f105496wkgbmnqykc), Math.min(gxszxtbevoVar.f105463wkgbmnqykc + i15, zoijcleaowVar.f105493gxszxtbevo));
            C2565iobyxmoadg c2565iobyxmoadg = (C2565iobyxmoadg) this.f105446gxszxtbevo.f105482wkgbmnqykc.get(gxszxtbevoVar.f105460lqeggnwhkg);
            if (c2565iobyxmoadg == null && (c2565iobyxmoadg = (C2565iobyxmoadg) this.f105446gxszxtbevo.f105477gxszxtbevo.get(gxszxtbevoVar.f105460lqeggnwhkg)) == null) {
                c2565iobyxmoadg = this.f105445eablkybsjg;
            }
            int i16 = 0;
            for (SparseArray sparseArray2 = gxszxtbevoVar.f105457gtknphoqwx; i16 < sparseArray2.size(); sparseArray2 = sparseArray2) {
                int iKeyAt = sparseArray2.keyAt(i16);
                lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) sparseArray2.valueAt(i16);
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f105446gxszxtbevo.f105476eablkybsjg.get(iKeyAt);
                ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVar == null ? (ppxfxbqfkf) this.f105446gxszxtbevo.f105479lqeggnwhkg.get(iKeyAt) : ppxfxbqfkfVar;
                if (ppxfxbqfkfVar2 != null) {
                    agtfadlqog(ppxfxbqfkfVar2, c2565iobyxmoadg, gxszxtbevoVar.f105458gxszxtbevo, lqeggnwhkgVar.f105472ppxfxbqfkf + i14, i15 + lqeggnwhkgVar.f105473wkgbmnqykc, ppxfxbqfkfVar2.f105487zoijcleaow ? null : this.f105447iobyxmoadg, this.f105449ppxfxbqfkf);
                }
                i16++;
            }
            if (gxszxtbevoVar.f105464zoijcleaow) {
                int i17 = gxszxtbevoVar.f105458gxszxtbevo;
                this.f105451zoijcleaow.setColor(i17 == 3 ? c2565iobyxmoadg.f105467wkgbmnqykc[gxszxtbevoVar.f105461nufgyqmvbu] : i17 == 2 ? c2565iobyxmoadg.f105466ppxfxbqfkf[gxszxtbevoVar.f105455dxjokdxxww] : c2565iobyxmoadg.f105468zoijcleaow[gxszxtbevoVar.f105454btonecajqb]);
                this.f105449ppxfxbqfkf.drawRect(i14, i15, gxszxtbevoVar.f105462ppxfxbqfkf + i14, gxszxtbevoVar.f105463wkgbmnqykc + i15, this.f105451zoijcleaow);
            }
            arrayList.add(new x2.iobyxmoadg.zoijcleaow().gxszxtbevo(Bitmap.createBitmap(this.f105448lqeggnwhkg, i14, i15, gxszxtbevoVar.f105462ppxfxbqfkf, gxszxtbevoVar.f105463wkgbmnqykc)).gtknphoqwx(i14 / zoijcleaowVar.f105494iobyxmoadg).draadjrbmk(0).nufgyqmvbu(i15 / zoijcleaowVar.f105497zoijcleaow, 0).dxjokdxxww(0).agtfadlqog(gxszxtbevoVar.f105462ppxfxbqfkf / zoijcleaowVar.f105494iobyxmoadg).lqeggnwhkg(gxszxtbevoVar.f105463wkgbmnqykc / zoijcleaowVar.f105497zoijcleaow).iobyxmoadg());
            this.f105449ppxfxbqfkf.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f105449ppxfxbqfkf.restore();
        }
        return new q4.eablkybsjg(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static ppxfxbqfkf oxmwwwfdhm(cdpycssgdh cdpycssgdhVar) {
        byte[] bArr;
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(16);
        cdpycssgdhVar.oxmwwwfdhm(4);
        int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(2);
        boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
        cdpycssgdhVar.oxmwwwfdhm(1);
        byte[] bArr2 = stevsuqkhv.f123601gxszxtbevo;
        if (iNufgyqmvbu2 != 1) {
            if (iNufgyqmvbu2 == 0) {
                int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(16);
                int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(16);
                if (iNufgyqmvbu3 > 0) {
                    bArr2 = new byte[iNufgyqmvbu3];
                    cdpycssgdhVar.gtknphoqwx(bArr2, 0, iNufgyqmvbu3);
                }
                if (iNufgyqmvbu4 > 0) {
                    bArr = new byte[iNufgyqmvbu4];
                    cdpycssgdhVar.gtknphoqwx(bArr, 0, iNufgyqmvbu4);
                }
            }
            return new ppxfxbqfkf(iNufgyqmvbu, zLqeggnwhkg, bArr2, bArr);
        }
        cdpycssgdhVar.oxmwwwfdhm(cdpycssgdhVar.nufgyqmvbu(8) * 16);
        bArr = bArr2;
        return new ppxfxbqfkf(iNufgyqmvbu, zLqeggnwhkg, bArr2, bArr);
    }

    private static C2565iobyxmoadg rgvfuqvkyq(cdpycssgdh cdpycssgdhVar, int i13) {
        int[] iArr;
        int iNufgyqmvbu;
        int i14;
        int iNufgyqmvbu2;
        int iNufgyqmvbu3;
        int iNufgyqmvbu4;
        int i15 = 8;
        int iNufgyqmvbu5 = cdpycssgdhVar.nufgyqmvbu(8);
        cdpycssgdhVar.oxmwwwfdhm(8);
        int i16 = 2;
        int i17 = i13 - 2;
        int[] iArrGxszxtbevo = gxszxtbevo();
        int[] iArrLqeggnwhkg = lqeggnwhkg();
        int[] iArrNufgyqmvbu = nufgyqmvbu();
        while (i17 > 0) {
            int iNufgyqmvbu6 = cdpycssgdhVar.nufgyqmvbu(i15);
            int iNufgyqmvbu7 = cdpycssgdhVar.nufgyqmvbu(i15);
            if ((iNufgyqmvbu7 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                iArr = iArrGxszxtbevo;
            } else {
                iArr = (iNufgyqmvbu7 & 64) != 0 ? iArrLqeggnwhkg : iArrNufgyqmvbu;
            }
            if ((iNufgyqmvbu7 & 1) != 0) {
                iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(i15);
                iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(i15);
                iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(i15);
                iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(i15);
                i14 = i17 - 6;
            } else {
                int iNufgyqmvbu8 = cdpycssgdhVar.nufgyqmvbu(6) << i16;
                int iNufgyqmvbu9 = cdpycssgdhVar.nufgyqmvbu(4) << 4;
                iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(4) << 4;
                i14 = i17 - 4;
                iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(i16) << 6;
                iNufgyqmvbu3 = iNufgyqmvbu8;
                iNufgyqmvbu4 = iNufgyqmvbu9;
            }
            if (iNufgyqmvbu3 == 0) {
                iNufgyqmvbu2 = 255;
                iNufgyqmvbu4 = 0;
                iNufgyqmvbu = 0;
            }
            double d13 = iNufgyqmvbu3;
            double d14 = iNufgyqmvbu4 - 128;
            double d15 = iNufgyqmvbu - 128;
            iArr[iNufgyqmvbu6] = dxjokdxxww((byte) (255 - (iNufgyqmvbu2 & KotlinVersion.MAX_COMPONENT_VALUE)), stevsuqkhv.ojitshcjhn((int) (d13 + (1.402d * d14)), 0, KotlinVersion.MAX_COMPONENT_VALUE), stevsuqkhv.ojitshcjhn((int) ((d13 - (0.34414d * d15)) - (d14 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE), stevsuqkhv.ojitshcjhn((int) (d13 + (d15 * 1.772d)), 0, KotlinVersion.MAX_COMPONENT_VALUE));
            i17 = i14;
            iNufgyqmvbu5 = iNufgyqmvbu5;
            i15 = 8;
            i16 = 2;
        }
        return new C2565iobyxmoadg(iNufgyqmvbu5, iArrGxszxtbevo, iArrLqeggnwhkg, iArrNufgyqmvbu);
    }

    private static zoijcleaow vdvldrhtss(cdpycssgdh cdpycssgdhVar) {
        int i13;
        int i14;
        int i15;
        int iNufgyqmvbu;
        cdpycssgdhVar.oxmwwwfdhm(4);
        boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
        cdpycssgdhVar.oxmwwwfdhm(3);
        int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(16);
        int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(16);
        if (zLqeggnwhkg) {
            int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(16);
            int iNufgyqmvbu5 = cdpycssgdhVar.nufgyqmvbu(16);
            int iNufgyqmvbu6 = cdpycssgdhVar.nufgyqmvbu(16);
            iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(16);
            i15 = iNufgyqmvbu5;
            i14 = iNufgyqmvbu6;
            i13 = iNufgyqmvbu4;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = iNufgyqmvbu2;
            iNufgyqmvbu = iNufgyqmvbu3;
        }
        return new zoijcleaow(iNufgyqmvbu2, iNufgyqmvbu3, i13, i15, i14, iNufgyqmvbu);
    }

    private static void wflxmlrfwp(byte[] bArr, int[] iArr, int i13, int i14, int i15, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        cdpycssgdh cdpycssgdhVar = new cdpycssgdh(bArr);
        int iBtonecajqb = i14;
        int i16 = i15;
        byte[] bArrEablkybsjg = null;
        byte[] bArrEablkybsjg2 = null;
        byte[] bArrEablkybsjg3 = null;
        while (cdpycssgdhVar.zoijcleaow() != 0) {
            int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(8);
            if (iNufgyqmvbu != 240) {
                switch (iNufgyqmvbu) {
                    case 16:
                        if (i13 != 3) {
                            if (i13 == 2) {
                                bArr3 = bArrEablkybsjg3 == null ? f105444nufgyqmvbu : bArrEablkybsjg3;
                            } else {
                                bArr2 = null;
                            }
                            iBtonecajqb = btonecajqb(cdpycssgdhVar, iArr, bArr2, iBtonecajqb, i16, paint, canvas);
                            cdpycssgdhVar.ppxfxbqfkf();
                        } else {
                            bArr3 = bArrEablkybsjg == null ? f105443dxjokdxxww : bArrEablkybsjg;
                        }
                        bArr2 = bArr3;
                        iBtonecajqb = btonecajqb(cdpycssgdhVar, iArr, bArr2, iBtonecajqb, i16, paint, canvas);
                        cdpycssgdhVar.ppxfxbqfkf();
                        break;
                    case 17:
                        iBtonecajqb = gtknphoqwx(cdpycssgdhVar, iArr, i13 == 3 ? bArrEablkybsjg2 == null ? f105442btonecajqb : bArrEablkybsjg2 : null, iBtonecajqb, i16, paint, canvas);
                        cdpycssgdhVar.ppxfxbqfkf();
                        break;
                    case 18:
                        iBtonecajqb = draadjrbmk(cdpycssgdhVar, iArr, null, iBtonecajqb, i16, paint, canvas);
                        break;
                    default:
                        switch (iNufgyqmvbu) {
                            case 32:
                                bArrEablkybsjg3 = eablkybsjg(4, 4, cdpycssgdhVar);
                                break;
                            case 33:
                                bArrEablkybsjg = eablkybsjg(4, 8, cdpycssgdhVar);
                                break;
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                bArrEablkybsjg2 = eablkybsjg(16, 8, cdpycssgdhVar);
                                break;
                        }
                        break;
                }
            } else {
                i16 += 2;
                iBtonecajqb = i14;
            }
        }
    }

    private static void yggfygwlhe(cdpycssgdh cdpycssgdhVar, nufgyqmvbu nufgyqmvbuVar) {
        gxszxtbevo gxszxtbevoVar;
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(8);
        int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(16);
        int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(16);
        int iWkgbmnqykc = cdpycssgdhVar.wkgbmnqykc() + iNufgyqmvbu3;
        if (iNufgyqmvbu3 * 8 > cdpycssgdhVar.zoijcleaow()) {
            kcexrzcfyt.nufgyqmvbu("DvbParser", "Data field length exceeds limit");
            cdpycssgdhVar.oxmwwwfdhm(cdpycssgdhVar.zoijcleaow());
            return;
        }
        switch (iNufgyqmvbu) {
            case 16:
                if (iNufgyqmvbu2 == nufgyqmvbuVar.f105478iobyxmoadg) {
                    wkgbmnqykc wkgbmnqykcVar = nufgyqmvbuVar.f105475dxjokdxxww;
                    wkgbmnqykc wkgbmnqykcVarKcexrzcfyt = kcexrzcfyt(cdpycssgdhVar, iNufgyqmvbu3);
                    if (wkgbmnqykcVarKcexrzcfyt.f105489ppxfxbqfkf != 0) {
                        nufgyqmvbuVar.f105475dxjokdxxww = wkgbmnqykcVarKcexrzcfyt;
                        nufgyqmvbuVar.f105481ppxfxbqfkf.clear();
                        nufgyqmvbuVar.f105482wkgbmnqykc.clear();
                        nufgyqmvbuVar.f105476eablkybsjg.clear();
                    } else if (wkgbmnqykcVar != null && wkgbmnqykcVar.f105491zoijcleaow != wkgbmnqykcVarKcexrzcfyt.f105491zoijcleaow) {
                        nufgyqmvbuVar.f105475dxjokdxxww = wkgbmnqykcVarKcexrzcfyt;
                    }
                }
                break;
            case 17:
                wkgbmnqykc wkgbmnqykcVar2 = nufgyqmvbuVar.f105475dxjokdxxww;
                if (iNufgyqmvbu2 == nufgyqmvbuVar.f105478iobyxmoadg && wkgbmnqykcVar2 != null) {
                    gxszxtbevo gxszxtbevoVarZdlpuopuiu = zdlpuopuiu(cdpycssgdhVar, iNufgyqmvbu3);
                    if (wkgbmnqykcVar2.f105489ppxfxbqfkf == 0 && (gxszxtbevoVar = (gxszxtbevo) nufgyqmvbuVar.f105481ppxfxbqfkf.get(gxszxtbevoVarZdlpuopuiu.f105459iobyxmoadg)) != null) {
                        gxszxtbevoVarZdlpuopuiu.iobyxmoadg(gxszxtbevoVar);
                    }
                    nufgyqmvbuVar.f105481ppxfxbqfkf.put(gxszxtbevoVarZdlpuopuiu.f105459iobyxmoadg, gxszxtbevoVarZdlpuopuiu);
                }
                break;
            case 18:
                if (iNufgyqmvbu2 == nufgyqmvbuVar.f105478iobyxmoadg) {
                    C2565iobyxmoadg c2565iobyxmoadgRgvfuqvkyq = rgvfuqvkyq(cdpycssgdhVar, iNufgyqmvbu3);
                    nufgyqmvbuVar.f105482wkgbmnqykc.put(c2565iobyxmoadgRgvfuqvkyq.f105465iobyxmoadg, c2565iobyxmoadgRgvfuqvkyq);
                } else if (iNufgyqmvbu2 == nufgyqmvbuVar.f105483zoijcleaow) {
                    C2565iobyxmoadg c2565iobyxmoadgRgvfuqvkyq2 = rgvfuqvkyq(cdpycssgdhVar, iNufgyqmvbu3);
                    nufgyqmvbuVar.f105477gxszxtbevo.put(c2565iobyxmoadgRgvfuqvkyq2.f105465iobyxmoadg, c2565iobyxmoadgRgvfuqvkyq2);
                }
                break;
            case 19:
                if (iNufgyqmvbu2 == nufgyqmvbuVar.f105478iobyxmoadg) {
                    ppxfxbqfkf ppxfxbqfkfVarOxmwwwfdhm = oxmwwwfdhm(cdpycssgdhVar);
                    nufgyqmvbuVar.f105476eablkybsjg.put(ppxfxbqfkfVarOxmwwwfdhm.f105484iobyxmoadg, ppxfxbqfkfVarOxmwwwfdhm);
                } else if (iNufgyqmvbu2 == nufgyqmvbuVar.f105483zoijcleaow) {
                    ppxfxbqfkf ppxfxbqfkfVarOxmwwwfdhm2 = oxmwwwfdhm(cdpycssgdhVar);
                    nufgyqmvbuVar.f105479lqeggnwhkg.put(ppxfxbqfkfVarOxmwwwfdhm2.f105484iobyxmoadg, ppxfxbqfkfVarOxmwwwfdhm2);
                }
                break;
            case 20:
                if (iNufgyqmvbu2 == nufgyqmvbuVar.f105478iobyxmoadg) {
                    nufgyqmvbuVar.f105480nufgyqmvbu = vdvldrhtss(cdpycssgdhVar);
                }
                break;
        }
        cdpycssgdhVar.kcexrzcfyt(iWkgbmnqykc - cdpycssgdhVar.wkgbmnqykc());
    }

    private static gxszxtbevo zdlpuopuiu(cdpycssgdh cdpycssgdhVar, int i13) {
        int i14;
        int iNufgyqmvbu;
        int iNufgyqmvbu2;
        int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(8);
        cdpycssgdhVar.oxmwwwfdhm(4);
        boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
        cdpycssgdhVar.oxmwwwfdhm(3);
        int i15 = 16;
        int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(16);
        int iNufgyqmvbu5 = cdpycssgdhVar.nufgyqmvbu(16);
        int iNufgyqmvbu6 = cdpycssgdhVar.nufgyqmvbu(3);
        int iNufgyqmvbu7 = cdpycssgdhVar.nufgyqmvbu(3);
        int i16 = 2;
        cdpycssgdhVar.oxmwwwfdhm(2);
        int iNufgyqmvbu8 = cdpycssgdhVar.nufgyqmvbu(8);
        int iNufgyqmvbu9 = cdpycssgdhVar.nufgyqmvbu(8);
        int iNufgyqmvbu10 = cdpycssgdhVar.nufgyqmvbu(4);
        int iNufgyqmvbu11 = cdpycssgdhVar.nufgyqmvbu(2);
        cdpycssgdhVar.oxmwwwfdhm(2);
        int i17 = i13 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i17 > 0) {
            int iNufgyqmvbu12 = cdpycssgdhVar.nufgyqmvbu(i15);
            int iNufgyqmvbu13 = cdpycssgdhVar.nufgyqmvbu(i16);
            int iNufgyqmvbu14 = cdpycssgdhVar.nufgyqmvbu(i16);
            int iNufgyqmvbu15 = cdpycssgdhVar.nufgyqmvbu(12);
            int i18 = iNufgyqmvbu11;
            cdpycssgdhVar.oxmwwwfdhm(4);
            int iNufgyqmvbu16 = cdpycssgdhVar.nufgyqmvbu(12);
            int i19 = i17 - 6;
            if (iNufgyqmvbu13 != 1) {
                i14 = 2;
                if (iNufgyqmvbu13 != 2) {
                    iNufgyqmvbu2 = 0;
                    iNufgyqmvbu = 0;
                    i17 = i19;
                }
                sparseArray.put(iNufgyqmvbu12, new lqeggnwhkg(iNufgyqmvbu13, iNufgyqmvbu14, iNufgyqmvbu15, iNufgyqmvbu16, iNufgyqmvbu2, iNufgyqmvbu));
                i16 = i14;
                iNufgyqmvbu11 = i18;
                i15 = 16;
            } else {
                i14 = 2;
            }
            i17 -= 8;
            iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(8);
            iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(8);
            sparseArray.put(iNufgyqmvbu12, new lqeggnwhkg(iNufgyqmvbu13, iNufgyqmvbu14, iNufgyqmvbu15, iNufgyqmvbu16, iNufgyqmvbu2, iNufgyqmvbu));
            i16 = i14;
            iNufgyqmvbu11 = i18;
            i15 = 16;
        }
        return new gxszxtbevo(iNufgyqmvbu3, zLqeggnwhkg, iNufgyqmvbu4, iNufgyqmvbu5, iNufgyqmvbu6, iNufgyqmvbu7, iNufgyqmvbu8, iNufgyqmvbu9, iNufgyqmvbu10, iNufgyqmvbu11, sparseArray);
    }

    @Override // q4.oxmwwwfdhm
    public void ppxfxbqfkf(byte[] bArr, int i13, int i14, oxmwwwfdhm.zoijcleaow zoijcleaowVar, wflxmlrfwp wflxmlrfwpVar) {
        cdpycssgdh cdpycssgdhVar = new cdpycssgdh(bArr, i14 + i13);
        cdpycssgdhVar.rgvfuqvkyq(i13);
        wflxmlrfwpVar.accept(ojitshcjhn(cdpycssgdhVar));
    }

    @Override // q4.oxmwwwfdhm
    public int wkgbmnqykc() {
        return 2;
    }

    @Override // q4.oxmwwwfdhm
    public void zoijcleaow() {
        this.f105446gxszxtbevo.iobyxmoadg();
    }
}
