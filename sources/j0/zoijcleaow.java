package j0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements istkbnxepw {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final k0.rlfsiqarku f50341eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final CharSequence f50342gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final s0.eablkybsjg f50343iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f50344lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f50345ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f50346wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f50347zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f50348iobyxmoadg;

        static {
            int[] iArr = new int[v0.dxjokdxxww.values().length];
            try {
                iArr[v0.dxjokdxxww.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v0.dxjokdxxww.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50348iobyxmoadg = iArr;
        }
    }

    public /* synthetic */ zoijcleaow(s0.eablkybsjg eablkybsjgVar, int i13, int i14, long j13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(eablkybsjgVar, i13, i14, j13);
    }

    private final void hkdspvbjdz(h.metgxyhuhe metgxyhuheVar) {
        Canvas canvasWkgbmnqykc = h.yadqdtsiqt.wkgbmnqykc(metgxyhuheVar);
        if (rgvfuqvkyq()) {
            canvasWkgbmnqykc.save();
            canvasWkgbmnqykc.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f50341eablkybsjg.jpowsppfya(canvasWkgbmnqykc);
        if (rgvfuqvkyq()) {
            canvasWkgbmnqykc.restore();
        }
    }

    private final k0.rlfsiqarku iozdgvuglv(int i13, int i14, TextUtils.TruncateAt truncateAt, int i15, int i16, int i17, int i18, int i19, CharSequence charSequence) {
        return new k0.rlfsiqarku(charSequence, getWidth(), hcddaimhww(), i13, truncateAt, this.f50343iobyxmoadg.dxjokdxxww(), 1.0f, 0.0f, s0.ppxfxbqfkf.zoijcleaow(this.f50343iobyxmoadg.nufgyqmvbu()), true, i15, i17, i18, i19, i16, i14, null, null, this.f50343iobyxmoadg.lqeggnwhkg(), 196736, null);
    }

    private final boolean jpowsppfya(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    static /* synthetic */ k0.rlfsiqarku lmojexxdyd(zoijcleaow zoijcleaowVar, int i13, int i14, TextUtils.TruncateAt truncateAt, int i15, int i16, int i17, int i18, int i19, CharSequence charSequence, int i23, Object obj) {
        return zoijcleaowVar.iozdgvuglv(i13, i14, truncateAt, i15, i16, i17, i18, i19, (i23 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? zoijcleaowVar.f50342gxszxtbevo : charSequence);
    }

    private final u0.lqeggnwhkg[] pkzmftpjix(k0.rlfsiqarku rlfsiqarkuVar) {
        if (!(rlfsiqarkuVar.lmojexxdyd() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceLmojexxdyd = rlfsiqarkuVar.lmojexxdyd();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(charSequenceLmojexxdyd, "null cannot be cast to non-null type android.text.Spanned");
        if (!jpowsppfya((Spanned) charSequenceLmojexxdyd, u0.lqeggnwhkg.class)) {
            return null;
        }
        CharSequence charSequenceLmojexxdyd2 = rlfsiqarkuVar.lmojexxdyd();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(charSequenceLmojexxdyd2, "null cannot be cast to non-null type android.text.Spanned");
        return (u0.lqeggnwhkg[]) ((Spanned) charSequenceLmojexxdyd2).getSpans(0, rlfsiqarkuVar.lmojexxdyd().length(), u0.lqeggnwhkg.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ylkuphrtab(c cVar, RectF rectF, RectF rectF2) {
        return cVar.iobyxmoadg(h.yzdjzghtvl.gxszxtbevo(rectF), h.yzdjzghtvl.gxszxtbevo(rectF2));
    }

    @Override // j0.istkbnxepw
    public float agtfadlqog(int i13) {
        return this.f50341eablkybsjg.yggfygwlhe(i13);
    }

    @Override // j0.istkbnxepw
    public int btonecajqb(int i13) {
        return this.f50341eablkybsjg.jyumaefscl(i13);
    }

    @Override // j0.istkbnxepw
    public int cqumvgiudr(int i13) {
        return this.f50341eablkybsjg.vdvldrhtss(i13);
    }

    @Override // j0.istkbnxepw
    public long draadjrbmk(g.lqeggnwhkg lqeggnwhkgVar, int i13, final c cVar) {
        int[] iArrIstkbnxepw = this.f50341eablkybsjg.istkbnxepw(h.yzdjzghtvl.ppxfxbqfkf(lqeggnwhkgVar), ppxfxbqfkf.oxmwwwfdhm(i13), new tg.rgvfuqvkyq() { // from class: j0.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(zoijcleaow.ylkuphrtab(cVar, (RectF) obj, (RectF) obj2));
            }
        });
        return iArrIstkbnxepw == null ? l.f50289zoijcleaow.iobyxmoadg() : m.zoijcleaow(iArrIstkbnxepw[0], iArrIstkbnxepw[1]);
    }

    @Override // j0.istkbnxepw
    public int dxjokdxxww(long j13) {
        return this.f50341eablkybsjg.esjtqupxsv(this.f50341eablkybsjg.oxmwwwfdhm((int) Float.intBitsToFloat((int) (4294967295L & j13))), Float.intBitsToFloat((int) (j13 >> 32)));
    }

    @Override // j0.istkbnxepw
    public g.lqeggnwhkg eablkybsjg(int i13) {
        if (!(i13 >= 0 && i13 <= this.f50342gxszxtbevo.length())) {
            q0.iobyxmoadg.iobyxmoadg("offset(" + i13 + ") is out of bounds [0," + this.f50342gxszxtbevo.length() + ']');
        }
        float fZynmafqrjb = k0.rlfsiqarku.zynmafqrjb(this.f50341eablkybsjg, i13, false, 2, null);
        int iVdvldrhtss = this.f50341eablkybsjg.vdvldrhtss(i13);
        return new g.lqeggnwhkg(fZynmafqrjb, this.f50341eablkybsjg.iwizpuwonk(iVdvldrhtss), fZynmafqrjb, this.f50341eablkybsjg.draadjrbmk(iVdvldrhtss));
    }

    @Override // j0.istkbnxepw
    public v0.dxjokdxxww esjtqupxsv(int i13) {
        return this.f50341eablkybsjg.hcddaimhww(i13) ? v0.dxjokdxxww.Rtl : v0.dxjokdxxww.Ltr;
    }

    @Override // j0.istkbnxepw
    public float getHeight() {
        return this.f50341eablkybsjg.gxszxtbevo();
    }

    @Override // j0.istkbnxepw
    public float getWidth() {
        return w0.zoijcleaow.draadjrbmk(this.f50346wkgbmnqykc);
    }

    @Override // j0.istkbnxepw
    public int gtknphoqwx(int i13, boolean z13) {
        return z13 ? this.f50341eablkybsjg.cqumvgiudr(i13) : this.f50341eablkybsjg.rgvfuqvkyq(i13);
    }

    @Override // j0.istkbnxepw
    public long gxszxtbevo(int i13) {
        l0.dxjokdxxww dxjokdxxwwVarYlkuphrtab = this.f50341eablkybsjg.ylkuphrtab();
        return m.zoijcleaow(l0.nufgyqmvbu.zoijcleaow(dxjokdxxwwVarYlkuphrtab, i13), l0.nufgyqmvbu.iobyxmoadg(dxjokdxxwwVarYlkuphrtab, i13));
    }

    public final s0.dxjokdxxww hcddaimhww() {
        return this.f50343iobyxmoadg.btonecajqb();
    }

    @Override // j0.istkbnxepw
    public float iobyxmoadg() {
        return this.f50343iobyxmoadg.iobyxmoadg();
    }

    @Override // j0.istkbnxepw
    public float iwizpuwonk() {
        return wwaezpbzkn(wflxmlrfwp() - 1);
    }

    @Override // j0.istkbnxepw
    public void jyumaefscl(long j13, float[] fArr, int i13) {
        this.f50341eablkybsjg.iobyxmoadg(l.draadjrbmk(j13), l.gtknphoqwx(j13), fArr, i13);
    }

    @Override // j0.istkbnxepw
    public float kcexrzcfyt(int i13, boolean z13) {
        return z13 ? k0.rlfsiqarku.zynmafqrjb(this.f50341eablkybsjg, i13, false, 2, null) : k0.rlfsiqarku.yadqdtsiqt(this.f50341eablkybsjg, i13, false, 2, null);
    }

    @Override // j0.istkbnxepw
    public float lereixgezr(int i13) {
        return this.f50341eablkybsjg.draadjrbmk(i13);
    }

    @Override // j0.istkbnxepw
    public float lqeggnwhkg() {
        return wwaezpbzkn(0);
    }

    @Override // j0.istkbnxepw
    public void nufgyqmvbu(h.metgxyhuhe metgxyhuheVar, h.jztzpxfvev jztzpxfvevVar, float f13, h.c cVar, v0.gtknphoqwx gtknphoqwxVar, j.lqeggnwhkg lqeggnwhkgVar, int i13) {
        int iPpxfxbqfkf = hcddaimhww().ppxfxbqfkf();
        s0.dxjokdxxww dxjokdxxwwVarHcddaimhww = hcddaimhww();
        float width = getWidth();
        dxjokdxxwwVarHcddaimhww.gxszxtbevo(jztzpxfvevVar, g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), f13);
        dxjokdxxwwVarHcddaimhww.btonecajqb(cVar);
        dxjokdxxwwVarHcddaimhww.gtknphoqwx(gtknphoqwxVar);
        dxjokdxxwwVarHcddaimhww.dxjokdxxww(lqeggnwhkgVar);
        dxjokdxxwwVarHcddaimhww.eablkybsjg(i13);
        hkdspvbjdz(metgxyhuheVar);
        hcddaimhww().eablkybsjg(iPpxfxbqfkf);
    }

    @Override // j0.istkbnxepw
    public float ojitshcjhn(int i13) {
        return this.f50341eablkybsjg.kcexrzcfyt(i13);
    }

    @Override // j0.istkbnxepw
    public h.mhtqkkgtqm oxmwwwfdhm(int i13, int i14) {
        if (!(i13 >= 0 && i13 <= i14 && i14 <= this.f50342gxszxtbevo.length())) {
            q0.iobyxmoadg.iobyxmoadg("start(" + i13 + ") or end(" + i14 + ") is out of range [0.." + this.f50342gxszxtbevo.length() + "], or start > end!");
        }
        Path path = new Path();
        this.f50341eablkybsjg.iozdgvuglv(i13, i14, path);
        return h.ntlheqmsrt.ppxfxbqfkf(path);
    }

    @Override // j0.istkbnxepw
    public g.lqeggnwhkg pmvmpeiblj(int i13) {
        boolean z13 = false;
        if (i13 >= 0 && i13 < this.f50342gxszxtbevo.length()) {
            z13 = true;
        }
        if (!z13) {
            q0.iobyxmoadg.iobyxmoadg("offset(" + i13 + ") is out of bounds [0," + this.f50342gxszxtbevo.length() + ')');
        }
        RectF rectFPpxfxbqfkf = this.f50341eablkybsjg.ppxfxbqfkf(i13);
        return new g.lqeggnwhkg(rectFPpxfxbqfkf.left, rectFPpxfxbqfkf.top, rectFPpxfxbqfkf.right, rectFPpxfxbqfkf.bottom);
    }

    @Override // j0.istkbnxepw
    public v0.dxjokdxxww ppxfxbqfkf(int i13) {
        return this.f50341eablkybsjg.lereixgezr(this.f50341eablkybsjg.vdvldrhtss(i13)) == 1 ? v0.dxjokdxxww.Ltr : v0.dxjokdxxww.Rtl;
    }

    @Override // j0.istkbnxepw
    public boolean rgvfuqvkyq() {
        return this.f50341eablkybsjg.wkgbmnqykc();
    }

    @Override // j0.istkbnxepw
    public int vdvldrhtss(float f13) {
        return this.f50341eablkybsjg.oxmwwwfdhm((int) f13);
    }

    @Override // j0.istkbnxepw
    public int wflxmlrfwp() {
        return this.f50341eablkybsjg.wflxmlrfwp();
    }

    @Override // j0.istkbnxepw
    public float wkgbmnqykc(int i13) {
        return this.f50341eablkybsjg.iwizpuwonk(i13);
    }

    public float wwaezpbzkn(int i13) {
        return this.f50341eablkybsjg.gtknphoqwx(i13);
    }

    @Override // j0.istkbnxepw
    public void yggfygwlhe(h.metgxyhuhe metgxyhuheVar, long j13, h.c cVar, v0.gtknphoqwx gtknphoqwxVar, j.lqeggnwhkg lqeggnwhkgVar, int i13) {
        int iPpxfxbqfkf = hcddaimhww().ppxfxbqfkf();
        s0.dxjokdxxww dxjokdxxwwVarHcddaimhww = hcddaimhww();
        dxjokdxxwwVarHcddaimhww.nufgyqmvbu(j13);
        dxjokdxxwwVarHcddaimhww.btonecajqb(cVar);
        dxjokdxxwwVarHcddaimhww.gtknphoqwx(gtknphoqwxVar);
        dxjokdxxwwVarHcddaimhww.dxjokdxxww(lqeggnwhkgVar);
        dxjokdxxwwVarHcddaimhww.eablkybsjg(i13);
        hkdspvbjdz(metgxyhuheVar);
        hcddaimhww().eablkybsjg(iPpxfxbqfkf);
    }

    @Override // j0.istkbnxepw
    public float zdlpuopuiu(int i13) {
        return this.f50341eablkybsjg.zdlpuopuiu(i13);
    }

    @Override // j0.istkbnxepw
    public float zoijcleaow() {
        return this.f50343iobyxmoadg.zoijcleaow();
    }

    @Override // j0.istkbnxepw
    public List zynmafqrjb() {
        return this.f50344lqeggnwhkg;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x016d  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ec A[LOOP:0: B:59:0x01e6->B:61:0x01ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0215  */
    /* JADX WARN: Code duplicated, block: B:65:0x021b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0232  */
    /* JADX WARN: Code duplicated, block: B:69:0x0248  */
    /* JADX WARN: Code duplicated, block: B:70:0x024a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0253  */
    /* JADX WARN: Code duplicated, block: B:76:0x025d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0266  */
    /* JADX WARN: Code duplicated, block: B:80:0x0268  */
    /* JADX WARN: Code duplicated, block: B:82:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x026f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.text.Spanned] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r29v0, types: [j0.zoijcleaow] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    private zoijcleaow(s0.eablkybsjg eablkybsjgVar, int i13, int i14, long j13) {
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        k0.rlfsiqarku rlfsiqarkuVarLmojexxdyd;
        int i15;
        ?? r15;
        u0.lqeggnwhkg[] lqeggnwhkgVarArrPkzmftpjix;
        CharSequence charSequence;
        ?? r13;
        Object[] spans;
        ArrayList arrayList;
        int length;
        int i16;
        List listWflxmlrfwp;
        int spanEnd;
        int iVdvldrhtss;
        ?? r14;
        ?? r16;
        ?? r17;
        g.lqeggnwhkg lqeggnwhkgVar;
        float fKcexrzcfyt;
        float fGtknphoqwx;
        int iZoijcleaow;
        float fIwizpuwonk;
        float fZoijcleaow;
        float fGtknphoqwx2;
        Iterator itIobyxmoadg;
        this.f50343iobyxmoadg = eablkybsjgVar;
        this.f50347zoijcleaow = i13;
        this.f50345ppxfxbqfkf = i14;
        this.f50346wkgbmnqykc = j13;
        if ((w0.zoijcleaow.wflxmlrfwp(j13) == 0 && w0.zoijcleaow.agtfadlqog(j13) == 0) == false) {
            q0.iobyxmoadg.iobyxmoadg("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if ((i13 >= 1) == false) {
            q0.iobyxmoadg.iobyxmoadg("maxLines should be greater than 0");
        }
        n nVarNufgyqmvbu = eablkybsjgVar.nufgyqmvbu();
        v0.jyumaefscl.iobyxmoadg iobyxmoadgVar = v0.jyumaefscl.f114986iobyxmoadg;
        CharSequence charSequenceBtonecajqb = ppxfxbqfkf.draadjrbmk(nVarNufgyqmvbu, v0.jyumaefscl.lqeggnwhkg(i14, iobyxmoadgVar.zoijcleaow())) ? ppxfxbqfkf.btonecajqb(eablkybsjgVar.gxszxtbevo()) : eablkybsjgVar.gxszxtbevo();
        this.f50342gxszxtbevo = charSequenceBtonecajqb;
        int iWflxmlrfwp = ppxfxbqfkf.wflxmlrfwp(nVarNufgyqmvbu.lereixgezr());
        boolean zGtknphoqwx = v0.btonecajqb.gtknphoqwx(nVarNufgyqmvbu.lereixgezr(), v0.btonecajqb.f114934zoijcleaow.ppxfxbqfkf());
        int iOjitshcjhn = ppxfxbqfkf.ojitshcjhn(nVarNufgyqmvbu.jyumaefscl().ppxfxbqfkf());
        int iAgtfadlqog = ppxfxbqfkf.agtfadlqog(v0.gxszxtbevo.lqeggnwhkg(nVarNufgyqmvbu.oxmwwwfdhm()));
        int iRgvfuqvkyq = ppxfxbqfkf.rgvfuqvkyq(v0.gxszxtbevo.nufgyqmvbu(nVarNufgyqmvbu.oxmwwwfdhm()));
        int iVdvldrhtss2 = ppxfxbqfkf.vdvldrhtss(v0.gxszxtbevo.dxjokdxxww(nVarNufgyqmvbu.oxmwwwfdhm()));
        if (v0.jyumaefscl.lqeggnwhkg(i14, iobyxmoadgVar.zoijcleaow())) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (!v0.jyumaefscl.lqeggnwhkg(i14, iobyxmoadgVar.ppxfxbqfkf())) {
                if (v0.jyumaefscl.lqeggnwhkg(i14, iobyxmoadgVar.wkgbmnqykc())) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    truncateAt = null;
                }
                rlfsiqarkuVarLmojexxdyd = lmojexxdyd(this, iWflxmlrfwp, zGtknphoqwx ? 1 : 0, truncateAt, i13, iOjitshcjhn, iAgtfadlqog, iRgvfuqvkyq, iVdvldrhtss2, null, UserVerificationMethods.USER_VERIFY_HANDPRINT, null);
                if (Build.VERSION.SDK_INT >= 35 && hcddaimhww().getLetterSpacing() != 0.0f && (v0.jyumaefscl.lqeggnwhkg(i14, iobyxmoadgVar.wkgbmnqykc()) || v0.jyumaefscl.lqeggnwhkg(i14, iobyxmoadgVar.ppxfxbqfkf()))) {
                    i15 = 0;
                    if (rlfsiqarkuVarLmojexxdyd.agtfadlqog(0) > 0) {
                        int iOjitshcjhn2 = rlfsiqarkuVarLmojexxdyd.ojitshcjhn(0);
                        r15 = 1;
                        rlfsiqarkuVarLmojexxdyd = iozdgvuglv(iWflxmlrfwp, zGtknphoqwx ? 1 : 0, truncateAt, i13, iOjitshcjhn, iAgtfadlqog, iRgvfuqvkyq, iVdvldrhtss2, TextUtils.concat(charSequenceBtonecajqb.subSequence(0, iOjitshcjhn2), "…", charSequenceBtonecajqb.subSequence(rlfsiqarkuVarLmojexxdyd.agtfadlqog(0) + iOjitshcjhn2, charSequenceBtonecajqb.length())));
                    }
                    if (v0.jyumaefscl.lqeggnwhkg(i14, iobyxmoadgVar.zoijcleaow()) || rlfsiqarkuVarLmojexxdyd.gxszxtbevo() <= w0.zoijcleaow.gtknphoqwx(j13) || i13 <= r15) {
                        i15 = i15;
                        this.f50341eablkybsjg = rlfsiqarkuVarLmojexxdyd;
                    } else {
                        int iGtknphoqwx = ppxfxbqfkf.gtknphoqwx(rlfsiqarkuVarLmojexxdyd, w0.zoijcleaow.gtknphoqwx(j13));
                        if (iGtknphoqwx >= 0 && iGtknphoqwx != i13) {
                            rlfsiqarkuVarLmojexxdyd = lmojexxdyd(this, iWflxmlrfwp, zGtknphoqwx ? 1 : 0, truncateAt, zg.gtknphoqwx.gxszxtbevo(iGtknphoqwx, r15), iOjitshcjhn, iAgtfadlqog, iRgvfuqvkyq, iVdvldrhtss2, null, UserVerificationMethods.USER_VERIFY_HANDPRINT, null);
                        }
                        this.f50341eablkybsjg = rlfsiqarkuVarLmojexxdyd;
                    }
                    hcddaimhww().gxszxtbevo(nVarNufgyqmvbu.lqeggnwhkg(), g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)), nVarNufgyqmvbu.wkgbmnqykc());
                    lqeggnwhkgVarArrPkzmftpjix = pkzmftpjix(this.f50341eablkybsjg);
                    if (lqeggnwhkgVarArrPkzmftpjix != null) {
                        itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(lqeggnwhkgVarArrPkzmftpjix);
                        while (itIobyxmoadg.hasNext()) {
                            ((u0.lqeggnwhkg) itIobyxmoadg.next()).ppxfxbqfkf(g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)));
                        }
                    }
                    charSequence = this.f50342gxszxtbevo;
                    if (charSequence instanceof Spanned) {
                        r13 = (Spanned) charSequence;
                        spans = r13.getSpans(i15, charSequence.length(), m0.btonecajqb.class);
                        arrayList = new ArrayList(spans.length);
                        length = spans.length;
                        for (i16 = i15; i16 < length; i16 += r15) {
                            m0.btonecajqb btonecajqbVar = (m0.btonecajqb) spans[i16];
                            int spanStart = r13.getSpanStart(btonecajqbVar);
                            spanEnd = r13.getSpanEnd(btonecajqbVar);
                            iVdvldrhtss = this.f50341eablkybsjg.vdvldrhtss(spanStart);
                            if (iVdvldrhtss >= this.f50347zoijcleaow) {
                                r14 = r15;
                            } else {
                                r14 = i15;
                            }
                            if (this.f50341eablkybsjg.agtfadlqog(iVdvldrhtss) > 0 || spanEnd <= this.f50341eablkybsjg.ojitshcjhn(iVdvldrhtss)) {
                                r16 = i15;
                            } else {
                                r16 = r15;
                            }
                            if (spanEnd > this.f50341eablkybsjg.rgvfuqvkyq(iVdvldrhtss)) {
                                r17 = r15;
                            } else {
                                r17 = i15;
                            }
                            if (r16 != 0 && r17 == 0 && r14 == 0) {
                                int i17 = iobyxmoadg.f50348iobyxmoadg[esjtqupxsv(spanStart).ordinal()];
                                if (i17 == r15) {
                                    fKcexrzcfyt = kcexrzcfyt(spanStart, r15);
                                } else {
                                    if (i17 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fKcexrzcfyt = kcexrzcfyt(spanStart, r15) - btonecajqbVar.wkgbmnqykc();
                                }
                                float fWkgbmnqykc = btonecajqbVar.wkgbmnqykc() + fKcexrzcfyt;
                                k0.rlfsiqarku rlfsiqarkuVar = this.f50341eablkybsjg;
                                switch (btonecajqbVar.ppxfxbqfkf()) {
                                    case 0:
                                        fGtknphoqwx = rlfsiqarkuVar.gtknphoqwx(iVdvldrhtss);
                                        iZoijcleaow = btonecajqbVar.zoijcleaow();
                                        fIwizpuwonk = fGtknphoqwx - iZoijcleaow;
                                        lqeggnwhkgVar = new g.lqeggnwhkg(fKcexrzcfyt, fIwizpuwonk, fWkgbmnqykc, btonecajqbVar.zoijcleaow() + fIwizpuwonk);
                                        break;
                                    case 1:
                                        fIwizpuwonk = rlfsiqarkuVar.iwizpuwonk(iVdvldrhtss);
                                        lqeggnwhkgVar = new g.lqeggnwhkg(fKcexrzcfyt, fIwizpuwonk, fWkgbmnqykc, btonecajqbVar.zoijcleaow() + fIwizpuwonk);
                                        break;
                                    case 2:
                                        fGtknphoqwx = rlfsiqarkuVar.draadjrbmk(iVdvldrhtss);
                                        iZoijcleaow = btonecajqbVar.zoijcleaow();
                                        fIwizpuwonk = fGtknphoqwx - iZoijcleaow;
                                        lqeggnwhkgVar = new g.lqeggnwhkg(fKcexrzcfyt, fIwizpuwonk, fWkgbmnqykc, btonecajqbVar.zoijcleaow() + fIwizpuwonk);
                                        break;
                                    case 3:
                                        fIwizpuwonk = ((rlfsiqarkuVar.iwizpuwonk(iVdvldrhtss) + rlfsiqarkuVar.draadjrbmk(iVdvldrhtss)) - btonecajqbVar.zoijcleaow()) / 2;
                                        lqeggnwhkgVar = new g.lqeggnwhkg(fKcexrzcfyt, fIwizpuwonk, fWkgbmnqykc, btonecajqbVar.zoijcleaow() + fIwizpuwonk);
                                        break;
                                    case 4:
                                        fZoijcleaow = btonecajqbVar.iobyxmoadg().ascent;
                                        fGtknphoqwx2 = rlfsiqarkuVar.gtknphoqwx(iVdvldrhtss);
                                        fIwizpuwonk = fZoijcleaow + fGtknphoqwx2;
                                        lqeggnwhkgVar = new g.lqeggnwhkg(fKcexrzcfyt, fIwizpuwonk, fWkgbmnqykc, btonecajqbVar.zoijcleaow() + fIwizpuwonk);
                                        break;
                                    case 5:
                                        fIwizpuwonk = (btonecajqbVar.iobyxmoadg().descent + rlfsiqarkuVar.gtknphoqwx(iVdvldrhtss)) - btonecajqbVar.zoijcleaow();
                                        lqeggnwhkgVar = new g.lqeggnwhkg(fKcexrzcfyt, fIwizpuwonk, fWkgbmnqykc, btonecajqbVar.zoijcleaow() + fIwizpuwonk);
                                        break;
                                    case 6:
                                        Paint.FontMetricsInt fontMetricsIntIobyxmoadg = btonecajqbVar.iobyxmoadg();
                                        fZoijcleaow = ((fontMetricsIntIobyxmoadg.ascent + fontMetricsIntIobyxmoadg.descent) - btonecajqbVar.zoijcleaow()) / 2;
                                        fGtknphoqwx2 = rlfsiqarkuVar.gtknphoqwx(iVdvldrhtss);
                                        fIwizpuwonk = fZoijcleaow + fGtknphoqwx2;
                                        lqeggnwhkgVar = new g.lqeggnwhkg(fKcexrzcfyt, fIwizpuwonk, fWkgbmnqykc, btonecajqbVar.zoijcleaow() + fIwizpuwonk);
                                        break;
                                    default:
                                        throw new IllegalStateException("unexpected verticalAlignment");
                                }
                            }
                            arrayList.add(lqeggnwhkgVar);
                        }
                        listWflxmlrfwp = arrayList;
                    } else {
                        listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
                    }
                    this.f50344lqeggnwhkg = listWflxmlrfwp;
                }
                i15 = 0;
                r15 = 1;
                if (v0.jyumaefscl.lqeggnwhkg(i14, iobyxmoadgVar.zoijcleaow())) {
                    i15 = i15;
                    this.f50341eablkybsjg = rlfsiqarkuVarLmojexxdyd;
                } else {
                    i15 = i15;
                    this.f50341eablkybsjg = rlfsiqarkuVarLmojexxdyd;
                }
                hcddaimhww().gxszxtbevo(nVarNufgyqmvbu.lqeggnwhkg(), g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)), nVarNufgyqmvbu.wkgbmnqykc());
                lqeggnwhkgVarArrPkzmftpjix = pkzmftpjix(this.f50341eablkybsjg);
                if (lqeggnwhkgVarArrPkzmftpjix != null) {
                    itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(lqeggnwhkgVarArrPkzmftpjix);
                    while (itIobyxmoadg.hasNext()) {
                        ((u0.lqeggnwhkg) itIobyxmoadg.next()).ppxfxbqfkf(g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)));
                    }
                }
                charSequence = this.f50342gxszxtbevo;
                if (charSequence instanceof Spanned) {
                    listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
                } else {
                    r13 = (Spanned) charSequence;
                    spans = r13.getSpans(i15, charSequence.length(), m0.btonecajqb.class);
                    arrayList = new ArrayList(spans.length);
                    length = spans.length;
                    while (i16 < length) {
                        m0.btonecajqb btonecajqbVar2 = (m0.btonecajqb) spans[i16];
                        int spanStart2 = r13.getSpanStart(btonecajqbVar2);
                        spanEnd = r13.getSpanEnd(btonecajqbVar2);
                        iVdvldrhtss = this.f50341eablkybsjg.vdvldrhtss(spanStart2);
                        if (iVdvldrhtss >= this.f50347zoijcleaow) {
                            r14 = r15;
                        } else {
                            r14 = i15;
                        }
                        if (this.f50341eablkybsjg.agtfadlqog(iVdvldrhtss) > 0) {
                            r16 = i15;
                        } else {
                            r16 = i15;
                        }
                        if (spanEnd > this.f50341eablkybsjg.rgvfuqvkyq(iVdvldrhtss)) {
                            r17 = r15;
                        } else {
                            r17 = i15;
                        }
                        lqeggnwhkgVar = r16 != 0 ? null : null;
                        arrayList.add(lqeggnwhkgVar);
                    }
                    listWflxmlrfwp = arrayList;
                }
                this.f50344lqeggnwhkg = listWflxmlrfwp;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        truncateAt = truncateAt2;
        rlfsiqarkuVarLmojexxdyd = lmojexxdyd(this, iWflxmlrfwp, zGtknphoqwx ? 1 : 0, truncateAt, i13, iOjitshcjhn, iAgtfadlqog, iRgvfuqvkyq, iVdvldrhtss2, null, UserVerificationMethods.USER_VERIFY_HANDPRINT, null);
        if (Build.VERSION.SDK_INT >= 35) {
            i15 = 0;
            r15 = 1;
        } else {
            i15 = 0;
            r15 = 1;
        }
        if (v0.jyumaefscl.lqeggnwhkg(i14, iobyxmoadgVar.zoijcleaow())) {
            i15 = i15;
            this.f50341eablkybsjg = rlfsiqarkuVarLmojexxdyd;
        } else {
            i15 = i15;
            this.f50341eablkybsjg = rlfsiqarkuVarLmojexxdyd;
        }
        hcddaimhww().gxszxtbevo(nVarNufgyqmvbu.lqeggnwhkg(), g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)), nVarNufgyqmvbu.wkgbmnqykc());
        lqeggnwhkgVarArrPkzmftpjix = pkzmftpjix(this.f50341eablkybsjg);
        if (lqeggnwhkgVarArrPkzmftpjix != null) {
            itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(lqeggnwhkgVarArrPkzmftpjix);
            while (itIobyxmoadg.hasNext()) {
                ((u0.lqeggnwhkg) itIobyxmoadg.next()).ppxfxbqfkf(g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(getWidth())) << 32)));
            }
        }
        charSequence = this.f50342gxszxtbevo;
        if (charSequence instanceof Spanned) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        } else {
            r13 = (Spanned) charSequence;
            spans = r13.getSpans(i15, charSequence.length(), m0.btonecajqb.class);
            arrayList = new ArrayList(spans.length);
            length = spans.length;
            while (i16 < length) {
                m0.btonecajqb btonecajqbVar3 = (m0.btonecajqb) spans[i16];
                int spanStart3 = r13.getSpanStart(btonecajqbVar3);
                spanEnd = r13.getSpanEnd(btonecajqbVar3);
                iVdvldrhtss = this.f50341eablkybsjg.vdvldrhtss(spanStart3);
                if (iVdvldrhtss >= this.f50347zoijcleaow) {
                    r14 = r15;
                } else {
                    r14 = i15;
                }
                if (this.f50341eablkybsjg.agtfadlqog(iVdvldrhtss) > 0) {
                    r16 = i15;
                } else {
                    r16 = i15;
                }
                if (spanEnd > this.f50341eablkybsjg.rgvfuqvkyq(iVdvldrhtss)) {
                    r17 = r15;
                } else {
                    r17 = i15;
                }
                if (r16 != 0) {
                }
                arrayList.add(lqeggnwhkgVar);
            }
            listWflxmlrfwp = arrayList;
        }
        this.f50344lqeggnwhkg = listWflxmlrfwp;
    }
}
