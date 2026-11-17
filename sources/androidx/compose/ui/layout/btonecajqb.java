package androidx.compose.ui.layout;

import androidx.collection.dsvhmnatus;
import androidx.collection.ribwqtqdhb;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.fiwbwshyhd;
import androidx.compose.runtime.ipoelvxyzq;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.x;
import androidx.compose.ui.platform.n;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;
import x.kegysxyocb;
import z.cllcsxoeiz;
import z.fyldjkxazc;
import z.mbcevpiqjq;
import z.ntlheqmsrt;
import z.oipsdeybqn;
import z.okpsazkaxt;
import z.pkzmftpjix;
import z.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb implements androidx.compose.runtime.dxjokdxxww {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f6414cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f6418iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private cdpycssgdh f6419jyumaefscl;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private int f6421lmojexxdyd;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private int f6423wwaezpbzkn;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private androidx.compose.runtime.cqumvgiudr f6425yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final pkzmftpjix f6427zdlpuopuiu;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final dsvhmnatus f6415esjtqupxsv = ribwqtqdhb.zoijcleaow();

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final dsvhmnatus f6420lereixgezr = ribwqtqdhb.zoijcleaow();

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final ppxfxbqfkf f6422pmvmpeiblj = new ppxfxbqfkf();

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final iobyxmoadg f6428zynmafqrjb = new iobyxmoadg();

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final dsvhmnatus f6417istkbnxepw = ribwqtqdhb.zoijcleaow();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final cdpycssgdh.iobyxmoadg f6413cdpycssgdh = new cdpycssgdh.iobyxmoadg(null, 1, null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final dsvhmnatus f6424yadqdtsiqt = ribwqtqdhb.zoijcleaow();

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f6416iozdgvuglv = new ipoelvxyzq.ppxfxbqfkf(new Object[16], 0);

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final String f6426ylkuphrtab = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* JADX INFO: renamed from: androidx.compose.ui.layout.btonecajqb$btonecajqb, reason: collision with other inner class name */
    static final class C0111btonecajqb extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f6429yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f6430zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0111btonecajqb(zoijcleaow zoijcleaowVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            super(2);
            this.f6430zdlpuopuiu = zoijcleaowVar;
            this.f6429yggfygwlhe = rgvfuqvkyqVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if (!draadjrbmkVar.vdvldrhtss((i13 & 3) != 2, i13 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1524156494, i13, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:683)");
            }
            boolean zIobyxmoadg = this.f6430zdlpuopuiu.iobyxmoadg();
            tg.rgvfuqvkyq rgvfuqvkyqVar = this.f6429yggfygwlhe;
            draadjrbmkVar.jpowsppfya(OrderServiceErrorHandlerImpl.ORDER_LOCKED, Boolean.valueOf(zIobyxmoadg));
            boolean zIobyxmoadg2 = draadjrbmkVar.iobyxmoadg(zIobyxmoadg);
            if (zIobyxmoadg) {
                rgvfuqvkyqVar.invoke(draadjrbmkVar, 0);
            } else {
                draadjrbmkVar.dxjokdxxww(zIobyxmoadg2);
            }
            draadjrbmkVar.istkbnxepw();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class dxjokdxxww implements istkbnxepw.iobyxmoadg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Object f6432zoijcleaow;

        dxjokdxxww(Object obj) {
            this.f6432zoijcleaow = obj;
        }

        private final zoijcleaow ppxfxbqfkf() {
            pkzmftpjix pkzmftpjixVar = (pkzmftpjix) btonecajqb.this.f6417istkbnxepw.eablkybsjg(this.f6432zoijcleaow);
            if (pkzmftpjixVar != null) {
                return (zoijcleaow) btonecajqb.this.f6415esjtqupxsv.eablkybsjg(pkzmftpjixVar);
            }
            return null;
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.iobyxmoadg
        public istkbnxepw.zoijcleaow apply() {
            zoijcleaow zoijcleaowVarPpxfxbqfkf = ppxfxbqfkf();
            if (zoijcleaowVarPpxfxbqfkf != null) {
                btonecajqb.this.kcexrzcfyt(zoijcleaowVarPpxfxbqfkf, false);
            }
            return btonecajqb.this.esjtqupxsv(this.f6432zoijcleaow);
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.iobyxmoadg
        public void cancel() {
            zoijcleaow zoijcleaowVarPpxfxbqfkf = ppxfxbqfkf();
            if ((zoijcleaowVarPpxfxbqfkf != null ? zoijcleaowVarPpxfxbqfkf.lqeggnwhkg() : null) != null) {
                btonecajqb.this.istkbnxepw(this.f6432zoijcleaow);
            }
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.iobyxmoadg
        public boolean iobyxmoadg() {
            ipoelvxyzq ipoelvxyzqVarLqeggnwhkg;
            zoijcleaow zoijcleaowVarPpxfxbqfkf = ppxfxbqfkf();
            if (zoijcleaowVarPpxfxbqfkf == null || (ipoelvxyzqVarLqeggnwhkg = zoijcleaowVarPpxfxbqfkf.lqeggnwhkg()) == null) {
                return true;
            }
            return ipoelvxyzqVarLqeggnwhkg.iobyxmoadg();
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.iobyxmoadg
        public boolean zoijcleaow(b0 b0Var) {
            zoijcleaow zoijcleaowVarPpxfxbqfkf = ppxfxbqfkf();
            ipoelvxyzq ipoelvxyzqVarLqeggnwhkg = zoijcleaowVarPpxfxbqfkf != null ? zoijcleaowVarPpxfxbqfkf.lqeggnwhkg() : null;
            boolean zZoijcleaow = true;
            if (ipoelvxyzqVarLqeggnwhkg != null && !ipoelvxyzqVarLqeggnwhkg.iobyxmoadg()) {
                androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg;
                btonecajqb btonecajqbVar = btonecajqb.this;
                androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
                tg.draadjrbmk draadjrbmkVarLqeggnwhkg = lqeggnwhkgVarWkgbmnqykc != null ? lqeggnwhkgVarWkgbmnqykc.lqeggnwhkg() : null;
                androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(lqeggnwhkgVarWkgbmnqykc);
                try {
                    pkzmftpjix pkzmftpjixVar = btonecajqbVar.f6427zdlpuopuiu;
                    pkzmftpjixVar.f127147hcddaimhww = true;
                    zZoijcleaow = ipoelvxyzqVarLqeggnwhkg.zoijcleaow(b0Var);
                    pkzmftpjixVar.f127147hcddaimhww = false;
                } finally {
                    iobyxmoadgVar.wflxmlrfwp(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarGxszxtbevo, draadjrbmkVarLqeggnwhkg);
                }
            }
            return zZoijcleaow;
        }
    }

    public static final class eablkybsjg implements istkbnxepw.zoijcleaow {
        eablkybsjg() {
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.zoijcleaow
        public void iobyxmoadg() {
        }
    }

    public static final class gxszxtbevo implements istkbnxepw.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final androidx.collection.lmojexxdyd f6433iobyxmoadg = androidx.collection.oxmwwwfdhm.zoijcleaow();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ Object f6434ppxfxbqfkf;

        gxszxtbevo(Object obj) {
            this.f6434ppxfxbqfkf = obj;
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.zoijcleaow
        public void eablkybsjg(int i13, long j13) {
            pkzmftpjix pkzmftpjixVar = (pkzmftpjix) btonecajqb.this.f6417istkbnxepw.eablkybsjg(this.f6434ppxfxbqfkf);
            if (pkzmftpjixVar == null || !pkzmftpjixVar.gxszxtbevo()) {
                return;
            }
            int size = pkzmftpjixVar.wypolnanlu().size();
            if (i13 < 0 || i13 >= size) {
                w.iobyxmoadg.wkgbmnqykc("Index (" + i13 + ") is out of bound of [0, " + size + ')');
            }
            if (pkzmftpjixVar.gtknphoqwx()) {
                w.iobyxmoadg.iobyxmoadg("Pre-measure called on node that is not placed");
            }
            pkzmftpjix pkzmftpjixVar2 = btonecajqb.this.f6427zdlpuopuiu;
            pkzmftpjixVar2.f127147hcddaimhww = true;
            cllcsxoeiz.zoijcleaow(pkzmftpjixVar).kcexrzcfyt((pkzmftpjix) pkzmftpjixVar.wypolnanlu().get(i13), j13);
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            pkzmftpjixVar2.f127147hcddaimhww = false;
            this.f6433iobyxmoadg.lqeggnwhkg(i13);
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.zoijcleaow
        public void iobyxmoadg() {
            btonecajqb.this.istkbnxepw(this.f6434ppxfxbqfkf);
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.zoijcleaow
        public long ppxfxbqfkf(int i13) {
            pkzmftpjix pkzmftpjixVar = (pkzmftpjix) btonecajqb.this.f6417istkbnxepw.eablkybsjg(this.f6434ppxfxbqfkf);
            if (pkzmftpjixVar != null && pkzmftpjixVar.gxszxtbevo()) {
                int size = pkzmftpjixVar.wypolnanlu().size();
                if (i13 < 0 || i13 >= size) {
                    w.iobyxmoadg.wkgbmnqykc("Index (" + i13 + ") is out of bound of [0, " + size + ')');
                }
                if (this.f6433iobyxmoadg.iobyxmoadg(i13)) {
                    return w0.oxmwwwfdhm.ppxfxbqfkf((((long) ((pkzmftpjix) pkzmftpjixVar.wypolnanlu().get(i13)).lxfrhoxuzk()) << 32) | (((long) ((pkzmftpjix) pkzmftpjixVar.wypolnanlu().get(i13)).sopmlzcsov()) & 4294967295L));
                }
            }
            return w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg();
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.zoijcleaow
        public void wkgbmnqykc(Object obj, tg.draadjrbmk draadjrbmkVar) {
            okpsazkaxt okpsazkaxtVarWeqkydbzbr;
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarGtknphoqwx;
            pkzmftpjix pkzmftpjixVar = (pkzmftpjix) btonecajqb.this.f6417istkbnxepw.eablkybsjg(this.f6434ppxfxbqfkf);
            if (pkzmftpjixVar == null || (okpsazkaxtVarWeqkydbzbr = pkzmftpjixVar.weqkydbzbr()) == null || (ppxfxbqfkfVarGtknphoqwx = okpsazkaxtVarWeqkydbzbr.gtknphoqwx()) == null) {
                return;
            }
            fyldjkxazc.eablkybsjg(ppxfxbqfkfVarGtknphoqwx, obj, draadjrbmkVar);
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.zoijcleaow
        public int zoijcleaow() {
            List listWypolnanlu;
            pkzmftpjix pkzmftpjixVar = (pkzmftpjix) btonecajqb.this.f6417istkbnxepw.eablkybsjg(this.f6434ppxfxbqfkf);
            if (pkzmftpjixVar == null || (listWypolnanlu = pkzmftpjixVar.wypolnanlu()) == null) {
                return 0;
            }
            return listWypolnanlu.size();
        }
    }

    private final class iobyxmoadg implements kegysxyocb, draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final /* synthetic */ ppxfxbqfkf f6437zdlpuopuiu;

        public iobyxmoadg() {
            this.f6437zdlpuopuiu = btonecajqb.this.f6422pmvmpeiblj;
        }

        @Override // w0.wkgbmnqykc
        public float A(float f13) {
            return this.f6437zdlpuopuiu.A(f13);
        }

        @Override // w0.draadjrbmk
        public float F() {
            return this.f6437zdlpuopuiu.F();
        }

        @Override // w0.wkgbmnqykc
        public float I(float f13) {
            return this.f6437zdlpuopuiu.I(f13);
        }

        @Override // w0.wkgbmnqykc
        public long V(long j13) {
            return this.f6437zdlpuopuiu.V(j13);
        }

        @Override // androidx.compose.ui.layout.draadjrbmk
        public x.istkbnxepw Z(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
            return this.f6437zdlpuopuiu.Z(i13, i14, map, draadjrbmkVar, draadjrbmkVar2);
        }

        @Override // x.kegysxyocb
        public List fmlbqenlif(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            pkzmftpjix pkzmftpjixVar = (pkzmftpjix) btonecajqb.this.f6420lereixgezr.eablkybsjg(obj);
            return (pkzmftpjixVar == null || btonecajqb.this.f6427zdlpuopuiu.mbcevpiqjq().indexOf(pkzmftpjixVar) >= btonecajqb.this.f6418iwizpuwonk) ? btonecajqb.this.yggfygwlhe(obj, rgvfuqvkyqVar) : pkzmftpjixVar.dsvhmnatus();
        }

        @Override // w0.wkgbmnqykc
        public float getDensity() {
            return this.f6437zdlpuopuiu.getDensity();
        }

        @Override // x.wflxmlrfwp
        public w0.zdlpuopuiu getLayoutDirection() {
            return this.f6437zdlpuopuiu.getLayoutDirection();
        }

        @Override // w0.wkgbmnqykc
        public int hszhottldk(float f13) {
            return this.f6437zdlpuopuiu.hszhottldk(f13);
        }

        @Override // w0.wkgbmnqykc
        public long mbcevpiqjq(long j13) {
            return this.f6437zdlpuopuiu.mbcevpiqjq(j13);
        }

        @Override // w0.wkgbmnqykc
        public float mhtqkkgtqm(long j13) {
            return this.f6437zdlpuopuiu.mhtqkkgtqm(j13);
        }

        @Override // androidx.compose.ui.layout.draadjrbmk
        public x.istkbnxepw nuxfzjnpeb(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar) {
            return this.f6437zdlpuopuiu.nuxfzjnpeb(i13, i14, map, draadjrbmkVar);
        }

        @Override // w0.draadjrbmk
        public long tzroggbefp(float f13) {
            return this.f6437zdlpuopuiu.tzroggbefp(f13);
        }

        @Override // w0.wkgbmnqykc
        public long uwvvkdfqfp(float f13) {
            return this.f6437zdlpuopuiu.uwvvkdfqfp(f13);
        }

        @Override // w0.draadjrbmk
        public float vipkmwdibw(long j13) {
            return this.f6437zdlpuopuiu.vipkmwdibw(j13);
        }

        @Override // w0.wkgbmnqykc
        public float x(int i13) {
            return this.f6437zdlpuopuiu.x(i13);
        }

        @Override // x.wflxmlrfwp
        public boolean zeieaojujs() {
            return this.f6437zdlpuopuiu.zeieaojujs();
        }
    }

    static final class lqeggnwhkg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f6438zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(zoijcleaow zoijcleaowVar) {
            super(0);
            this.f6438zdlpuopuiu = zoijcleaowVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            x xVarPpxfxbqfkf;
            if (this.f6438zdlpuopuiu.iobyxmoadg() || (xVarPpxfxbqfkf = this.f6438zdlpuopuiu.ppxfxbqfkf()) == null) {
                return;
            }
            xVarPpxfxbqfkf.deactivate();
        }
    }

    public static final class nufgyqmvbu implements istkbnxepw.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f6439iobyxmoadg = true;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ Object f6440ppxfxbqfkf;

        nufgyqmvbu(Object obj) {
            this.f6440ppxfxbqfkf = obj;
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.iobyxmoadg
        public istkbnxepw.zoijcleaow apply() {
            return btonecajqb.this.esjtqupxsv(this.f6440ppxfxbqfkf);
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.iobyxmoadg
        public void cancel() {
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.iobyxmoadg
        public boolean iobyxmoadg() {
            return this.f6439iobyxmoadg;
        }

        @Override // androidx.compose.ui.layout.istkbnxepw.iobyxmoadg
        public boolean zoijcleaow(b0 b0Var) {
            return true;
        }
    }

    private final class ppxfxbqfkf implements kegysxyocb {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private float f6443jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private float f6444yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private w0.zdlpuopuiu f6445zdlpuopuiu = w0.zdlpuopuiu.Rtl;

        public static final class iobyxmoadg implements x.istkbnxepw {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf f6446eablkybsjg;

            /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
            final /* synthetic */ btonecajqb f6447gxszxtbevo;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ int f6448iobyxmoadg;

            /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f6449lqeggnwhkg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ Map f6450ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f6451wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ int f6452zoijcleaow;

            iobyxmoadg(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar, ppxfxbqfkf ppxfxbqfkfVar, btonecajqb btonecajqbVar, tg.draadjrbmk draadjrbmkVar2) {
                this.f6448iobyxmoadg = i13;
                this.f6452zoijcleaow = i14;
                this.f6450ppxfxbqfkf = map;
                this.f6451wkgbmnqykc = draadjrbmkVar;
                this.f6446eablkybsjg = ppxfxbqfkfVar;
                this.f6447gxszxtbevo = btonecajqbVar;
                this.f6449lqeggnwhkg = draadjrbmkVar2;
            }

            @Override // x.istkbnxepw
            public Map agtfadlqog() {
                return this.f6450ppxfxbqfkf;
            }

            @Override // x.istkbnxepw
            public int getHeight() {
                return this.f6452zoijcleaow;
            }

            @Override // x.istkbnxepw
            public int getWidth() {
                return this.f6448iobyxmoadg;
            }

            @Override // x.istkbnxepw
            public void ojitshcjhn() {
                mbcevpiqjq mbcevpiqjqVarQ0;
                if (!this.f6446eablkybsjg.zeieaojujs() || (mbcevpiqjqVarQ0 = this.f6447gxszxtbevo.f6427zdlpuopuiu.crxdokpmqz().Q0()) == null) {
                    this.f6449lqeggnwhkg.invoke(this.f6447gxszxtbevo.f6427zdlpuopuiu.crxdokpmqz().M());
                } else {
                    this.f6449lqeggnwhkg.invoke(mbcevpiqjqVarQ0.M());
                }
            }

            @Override // x.istkbnxepw
            public tg.draadjrbmk rgvfuqvkyq() {
                return this.f6451wkgbmnqykc;
            }
        }

        public ppxfxbqfkf() {
        }

        @Override // w0.draadjrbmk
        public float F() {
            return this.f6443jyumaefscl;
        }

        @Override // androidx.compose.ui.layout.draadjrbmk
        public x.istkbnxepw Z(int i13, int i14, Map map, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
            if (!((i13 & (-16777216)) == 0 && ((-16777216) & i14) == 0)) {
                w.iobyxmoadg.zoijcleaow("Size(" + i13 + " x " + i14 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new iobyxmoadg(i13, i14, map, draadjrbmkVar, this, btonecajqb.this, draadjrbmkVar2);
        }

        @Override // x.kegysxyocb
        public List fmlbqenlif(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            return btonecajqb.this.mbcevpiqjq(obj, rgvfuqvkyqVar);
        }

        @Override // w0.wkgbmnqykc
        public float getDensity() {
            return this.f6444yggfygwlhe;
        }

        @Override // x.wflxmlrfwp
        public w0.zdlpuopuiu getLayoutDirection() {
            return this.f6445zdlpuopuiu;
        }

        public void gtknphoqwx(w0.zdlpuopuiu zdlpuopuiuVar) {
            this.f6445zdlpuopuiu = zdlpuopuiuVar;
        }

        public void gxszxtbevo(float f13) {
            this.f6444yggfygwlhe = f13;
        }

        public void lqeggnwhkg(float f13) {
            this.f6443jyumaefscl = f13;
        }

        @Override // x.wflxmlrfwp
        public boolean zeieaojujs() {
            return btonecajqb.this.f6427zdlpuopuiu.xrmfcynszj() == pkzmftpjix.eablkybsjg.LookaheadLayingOut || btonecajqb.this.f6427zdlpuopuiu.xrmfcynszj() == pkzmftpjix.eablkybsjg.LookaheadMeasuring;
        }
    }

    public static final class wkgbmnqykc extends pkzmftpjix.gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f6453ppxfxbqfkf;

        public static final class iobyxmoadg implements x.istkbnxepw {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final /* synthetic */ x.istkbnxepw f6455iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ int f6456ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ x.istkbnxepw f6457wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ btonecajqb f6458zoijcleaow;

            public iobyxmoadg(x.istkbnxepw istkbnxepwVar, btonecajqb btonecajqbVar, int i13, x.istkbnxepw istkbnxepwVar2) {
                this.f6458zoijcleaow = btonecajqbVar;
                this.f6456ppxfxbqfkf = i13;
                this.f6457wkgbmnqykc = istkbnxepwVar2;
                this.f6455iobyxmoadg = istkbnxepwVar;
            }

            @Override // x.istkbnxepw
            public Map agtfadlqog() {
                return this.f6455iobyxmoadg.agtfadlqog();
            }

            @Override // x.istkbnxepw
            public int getHeight() {
                return this.f6455iobyxmoadg.getHeight();
            }

            @Override // x.istkbnxepw
            public int getWidth() {
                return this.f6455iobyxmoadg.getWidth();
            }

            @Override // x.istkbnxepw
            public void ojitshcjhn() {
                this.f6458zoijcleaow.f6414cqumvgiudr = this.f6456ppxfxbqfkf;
                this.f6457wkgbmnqykc.ojitshcjhn();
                this.f6458zoijcleaow.cdpycssgdh();
            }

            @Override // x.istkbnxepw
            public tg.draadjrbmk rgvfuqvkyq() {
                return this.f6455iobyxmoadg.rgvfuqvkyq();
            }
        }

        public static final class zoijcleaow implements x.istkbnxepw {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final /* synthetic */ x.istkbnxepw f6459iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ int f6460ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ x.istkbnxepw f6461wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ btonecajqb f6462zoijcleaow;

            public zoijcleaow(x.istkbnxepw istkbnxepwVar, btonecajqb btonecajqbVar, int i13, x.istkbnxepw istkbnxepwVar2) {
                this.f6462zoijcleaow = btonecajqbVar;
                this.f6460ppxfxbqfkf = i13;
                this.f6461wkgbmnqykc = istkbnxepwVar2;
                this.f6459iobyxmoadg = istkbnxepwVar;
            }

            @Override // x.istkbnxepw
            public Map agtfadlqog() {
                return this.f6459iobyxmoadg.agtfadlqog();
            }

            @Override // x.istkbnxepw
            public int getHeight() {
                return this.f6459iobyxmoadg.getHeight();
            }

            @Override // x.istkbnxepw
            public int getWidth() {
                return this.f6459iobyxmoadg.getWidth();
            }

            @Override // x.istkbnxepw
            public void ojitshcjhn() {
                this.f6462zoijcleaow.f6418iwizpuwonk = this.f6460ppxfxbqfkf;
                this.f6461wkgbmnqykc.ojitshcjhn();
                btonecajqb btonecajqbVar = this.f6462zoijcleaow;
                btonecajqbVar.zynmafqrjb(btonecajqbVar.f6418iwizpuwonk);
            }

            @Override // x.istkbnxepw
            public tg.draadjrbmk rgvfuqvkyq() {
                return this.f6459iobyxmoadg.rgvfuqvkyq();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(tg.rgvfuqvkyq rgvfuqvkyqVar, String str) {
            super(str);
            this.f6453ppxfxbqfkf = rgvfuqvkyqVar;
        }

        @Override // x.zynmafqrjb
        public x.istkbnxepw lqeggnwhkg(draadjrbmk draadjrbmkVar, List list, long j13) {
            btonecajqb.this.f6422pmvmpeiblj.gtknphoqwx(draadjrbmkVar.getLayoutDirection());
            btonecajqb.this.f6422pmvmpeiblj.gxszxtbevo(draadjrbmkVar.getDensity());
            btonecajqb.this.f6422pmvmpeiblj.lqeggnwhkg(draadjrbmkVar.F());
            if (draadjrbmkVar.zeieaojujs() || btonecajqb.this.f6427zdlpuopuiu.uwvvkdfqfp() == null) {
                btonecajqb.this.f6418iwizpuwonk = 0;
                x.istkbnxepw istkbnxepwVar = (x.istkbnxepw) this.f6453ppxfxbqfkf.invoke(btonecajqb.this.f6422pmvmpeiblj, w0.zoijcleaow.iobyxmoadg(j13));
                return new zoijcleaow(istkbnxepwVar, btonecajqb.this, btonecajqb.this.f6418iwizpuwonk, istkbnxepwVar);
            }
            btonecajqb.this.f6414cqumvgiudr = 0;
            x.istkbnxepw istkbnxepwVar2 = (x.istkbnxepw) this.f6453ppxfxbqfkf.invoke(btonecajqb.this.f6428zynmafqrjb, w0.zoijcleaow.iobyxmoadg(j13));
            return new iobyxmoadg(istkbnxepwVar2, btonecajqb.this, btonecajqb.this.f6414cqumvgiudr, istkbnxepwVar2);
        }
    }

    public btonecajqb(pkzmftpjix pkzmftpjixVar, cdpycssgdh cdpycssgdhVar) {
        this.f6427zdlpuopuiu = pkzmftpjixVar;
        this.f6419jyumaefscl = cdpycssgdhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cdpycssgdh() {
        dsvhmnatus dsvhmnatusVar = this.f6424yadqdtsiqt;
        long[] jArr = dsvhmnatusVar.f4299iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        int i16 = (i13 << 3) + i15;
                        Object obj = dsvhmnatusVar.f4302zoijcleaow[i16];
                        istkbnxepw.zoijcleaow zoijcleaowVar = (istkbnxepw.zoijcleaow) dsvhmnatusVar.f4300ppxfxbqfkf[i16];
                        int iWflxmlrfwp = this.f6416iozdgvuglv.wflxmlrfwp(obj);
                        if (iWflxmlrfwp < 0 || iWflxmlrfwp >= this.f6414cqumvgiudr) {
                            zoijcleaowVar.iobyxmoadg();
                            dsvhmnatusVar.jyumaefscl(i16);
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    private final void cllcsxoeiz(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar, boolean z13) {
        if (this.f6427zdlpuopuiu.gxszxtbevo()) {
            wwaezpbzkn();
            if (this.f6420lereixgezr.ppxfxbqfkf(obj)) {
                return;
            }
            this.f6424yadqdtsiqt.yggfygwlhe(obj);
            dsvhmnatus dsvhmnatusVar = this.f6417istkbnxepw;
            Object objEablkybsjg = dsvhmnatusVar.eablkybsjg(obj);
            if (objEablkybsjg == null) {
                objEablkybsjg = sopmlzcsov(obj);
                if (objEablkybsjg != null) {
                    pkzmftpjix(this.f6427zdlpuopuiu.mbcevpiqjq().indexOf(objEablkybsjg), this.f6427zdlpuopuiu.mbcevpiqjq().size(), 1);
                    this.f6423wwaezpbzkn++;
                } else {
                    objEablkybsjg = cqumvgiudr(this.f6427zdlpuopuiu.mbcevpiqjq().size());
                    this.f6423wwaezpbzkn++;
                }
                dsvhmnatusVar.cqumvgiudr(obj, objEablkybsjg);
            }
            ulzqkzuiru((pkzmftpjix) objEablkybsjg, obj, z13, rgvfuqvkyqVar);
        }
    }

    private final pkzmftpjix cqumvgiudr(int i13) {
        pkzmftpjix pkzmftpjixVar = new pkzmftpjix(true, 0, 2, null);
        pkzmftpjix pkzmftpjixVar2 = this.f6427zdlpuopuiu;
        pkzmftpjixVar2.f127147hcddaimhww = true;
        this.f6427zdlpuopuiu.mhtqkkgtqm(i13, pkzmftpjixVar);
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        pkzmftpjixVar2.f127147hcddaimhww = false;
        return pkzmftpjixVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final istkbnxepw.zoijcleaow esjtqupxsv(Object obj) {
        return !this.f6427zdlpuopuiu.gxszxtbevo() ? new eablkybsjg() : new gxszxtbevo(obj);
    }

    static /* synthetic */ void hcddaimhww(btonecajqb btonecajqbVar, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            i15 = 1;
        }
        btonecajqbVar.pkzmftpjix(i13, i14, i15);
    }

    private final oipsdeybqn iozdgvuglv() {
        if (a.nufgyqmvbu.f62nufgyqmvbu) {
            return cllcsxoeiz.zoijcleaow(this.f6427zdlpuopuiu).getOutOfFrameExecutor();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void istkbnxepw(Object obj) {
        wwaezpbzkn();
        pkzmftpjix pkzmftpjixVar = (pkzmftpjix) this.f6417istkbnxepw.yggfygwlhe(obj);
        if (pkzmftpjixVar != null) {
            if (!(this.f6423wwaezpbzkn > 0)) {
                w.iobyxmoadg.zoijcleaow("No pre-composed items to dispose");
            }
            int iIndexOf = this.f6427zdlpuopuiu.mbcevpiqjq().indexOf(pkzmftpjixVar);
            if (!(iIndexOf >= this.f6427zdlpuopuiu.mbcevpiqjq().size() - this.f6423wwaezpbzkn)) {
                w.iobyxmoadg.zoijcleaow("Item is not in pre-composed item range");
            }
            this.f6421lmojexxdyd++;
            this.f6423wwaezpbzkn--;
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f6415esjtqupxsv.eablkybsjg(pkzmftpjixVar);
            if (zoijcleaowVar != null) {
                jyumaefscl(zoijcleaowVar);
            }
            int size = (this.f6427zdlpuopuiu.mbcevpiqjq().size() - this.f6423wwaezpbzkn) - this.f6421lmojexxdyd;
            pkzmftpjix(iIndexOf, size, 1);
            zynmafqrjb(size);
        }
    }

    private final void jyumaefscl(zoijcleaow zoijcleaowVar) {
        ipoelvxyzq ipoelvxyzqVarLqeggnwhkg = zoijcleaowVar.lqeggnwhkg();
        if (ipoelvxyzqVarLqeggnwhkg != null) {
            ipoelvxyzqVarLqeggnwhkg.cancel();
            zoijcleaowVar.rgvfuqvkyq(null);
            x xVarPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
            if (xVarPpxfxbqfkf != null) {
                xVarPpxfxbqfkf.iobyxmoadg();
            }
            zoijcleaowVar.draadjrbmk(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void kcexrzcfyt(zoijcleaow zoijcleaowVar, boolean z13) {
        ipoelvxyzq ipoelvxyzqVarLqeggnwhkg = zoijcleaowVar.lqeggnwhkg();
        if (ipoelvxyzqVarLqeggnwhkg != null) {
            androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg;
            androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
            tg.draadjrbmk draadjrbmkVarLqeggnwhkg = lqeggnwhkgVarWkgbmnqykc != null ? lqeggnwhkgVarWkgbmnqykc.lqeggnwhkg() : null;
            androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(lqeggnwhkgVarWkgbmnqykc);
            try {
                pkzmftpjix pkzmftpjixVar = this.f6427zdlpuopuiu;
                pkzmftpjixVar.f127147hcddaimhww = true;
                if (z13) {
                    while (!ipoelvxyzqVarLqeggnwhkg.iobyxmoadg()) {
                        ipoelvxyzqVarLqeggnwhkg.zoijcleaow(new b0() { // from class: x.cqumvgiudr
                            @Override // androidx.compose.runtime.b0
                            public final boolean iobyxmoadg() {
                                return androidx.compose.ui.layout.btonecajqb.zdlpuopuiu();
                            }
                        });
                    }
                }
                ipoelvxyzqVarLqeggnwhkg.apply();
                zoijcleaowVar.rgvfuqvkyq(null);
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                pkzmftpjixVar.f127147hcddaimhww = false;
            } finally {
                iobyxmoadgVar.wflxmlrfwp(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarGxszxtbevo, draadjrbmkVarLqeggnwhkg);
            }
        }
    }

    private final void lereixgezr(zoijcleaow zoijcleaowVar, oipsdeybqn oipsdeybqnVar) {
        oipsdeybqnVar.pmvmpeiblj(new lqeggnwhkg(zoijcleaowVar));
    }

    private final Object lmojexxdyd(List list, int i13) {
        Object objEablkybsjg = this.f6415esjtqupxsv.eablkybsjg((pkzmftpjix) list.get(i13));
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objEablkybsjg);
        return ((zoijcleaow) objEablkybsjg).nufgyqmvbu();
    }

    private final void ntlheqmsrt(pkzmftpjix pkzmftpjixVar, zoijcleaow zoijcleaowVar, boolean z13) {
        if (!(zoijcleaowVar.lqeggnwhkg() == null)) {
            w.iobyxmoadg.iobyxmoadg("new subcompose call while paused composition is still active");
        }
        androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg;
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        tg.draadjrbmk draadjrbmkVarLqeggnwhkg = lqeggnwhkgVarWkgbmnqykc != null ? lqeggnwhkgVarWkgbmnqykc.lqeggnwhkg() : null;
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(lqeggnwhkgVarWkgbmnqykc);
        try {
            pkzmftpjix pkzmftpjixVar2 = this.f6427zdlpuopuiu;
            pkzmftpjixVar2.f127147hcddaimhww = true;
            x xVarPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
            androidx.compose.runtime.cqumvgiudr cqumvgiudrVar = this.f6425yggfygwlhe;
            if (cqumvgiudrVar == null) {
                w.iobyxmoadg.ppxfxbqfkf("parent composition reference not set");
                throw new KotlinNothingValueException();
            }
            if (xVarPpxfxbqfkf == null || xVarPpxfxbqfkf.zoijcleaow()) {
                xVarPpxfxbqfkf = z13 ? n.iobyxmoadg(pkzmftpjixVar, cqumvgiudrVar) : n.zoijcleaow(pkzmftpjixVar, cqumvgiudrVar);
            }
            zoijcleaowVar.draadjrbmk(xVarPpxfxbqfkf);
            tg.rgvfuqvkyq rgvfuqvkyqVarWkgbmnqykc = zoijcleaowVar.wkgbmnqykc();
            if (iozdgvuglv() != null) {
                zoijcleaowVar.gtknphoqwx(false);
            } else {
                zoijcleaowVar.gtknphoqwx(true);
                rgvfuqvkyqVarWkgbmnqykc = ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(1524156494, true, new C0111btonecajqb(zoijcleaowVar, rgvfuqvkyqVarWkgbmnqykc));
            }
            if (z13) {
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(xVarPpxfxbqfkf, "null cannot be cast to non-null type androidx.compose.runtime.PausableComposition");
                if (zoijcleaowVar.gxszxtbevo()) {
                    zoijcleaowVar.rgvfuqvkyq(((fiwbwshyhd) xVarPpxfxbqfkf).yggfygwlhe(rgvfuqvkyqVarWkgbmnqykc));
                } else {
                    zoijcleaowVar.rgvfuqvkyq(((fiwbwshyhd) xVarPpxfxbqfkf).wkgbmnqykc(rgvfuqvkyqVarWkgbmnqykc));
                }
            } else if (zoijcleaowVar.gxszxtbevo()) {
                xVarPpxfxbqfkf.cqumvgiudr(rgvfuqvkyqVarWkgbmnqykc);
            } else {
                xVarPpxfxbqfkf.vdvldrhtss(rgvfuqvkyqVarWkgbmnqykc);
            }
            zoijcleaowVar.ojitshcjhn(false);
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            pkzmftpjixVar2.f127147hcddaimhww = false;
            iobyxmoadgVar.wflxmlrfwp(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarGxszxtbevo, draadjrbmkVarLqeggnwhkg);
        } catch (Throwable th2) {
            iobyxmoadgVar.wflxmlrfwp(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarGxszxtbevo, draadjrbmkVarLqeggnwhkg);
            throw th2;
        }
    }

    private final void pkzmftpjix(int i13, int i14, int i15) {
        pkzmftpjix pkzmftpjixVar = this.f6427zdlpuopuiu;
        pkzmftpjixVar.f127147hcddaimhww = true;
        this.f6427zdlpuopuiu.t(i13, i14, i15);
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        pkzmftpjixVar.f127147hcddaimhww = false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[LOOP:0: B:5:0x0015->B:17:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[EDGE_INSN: B:21:0x0053->B:18:0x0053 BREAK  A[LOOP:0: B:5:0x0015->B:17:0x0051], SYNTHETIC] */
    private final void pmvmpeiblj() {
        x xVarPpxfxbqfkf;
        pkzmftpjix pkzmftpjixVar = this.f6427zdlpuopuiu;
        pkzmftpjixVar.f127147hcddaimhww = true;
        dsvhmnatus dsvhmnatusVar = this.f6415esjtqupxsv;
        Object[] objArr = dsvhmnatusVar.f4300ppxfxbqfkf;
        long[] jArr = dsvhmnatusVar.f4299iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128 && (xVarPpxfxbqfkf = ((zoijcleaow) objArr[(i13 << 3) + i15]).ppxfxbqfkf()) != null) {
                            xVarPpxfxbqfkf.iobyxmoadg();
                        }
                        j13 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        this.f6427zdlpuopuiu.D();
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        pkzmftpjixVar.f127147hcddaimhww = false;
        this.f6415esjtqupxsv.gtknphoqwx();
        this.f6420lereixgezr.gtknphoqwx();
        this.f6423wwaezpbzkn = 0;
        this.f6421lmojexxdyd = 0;
        this.f6417istkbnxepw.gtknphoqwx();
        wwaezpbzkn();
    }

    private final pkzmftpjix sopmlzcsov(Object obj) {
        int i13;
        if (this.f6421lmojexxdyd == 0) {
            return null;
        }
        List listMbcevpiqjq = this.f6427zdlpuopuiu.mbcevpiqjq();
        int size = listMbcevpiqjq.size() - this.f6423wwaezpbzkn;
        int i14 = size - this.f6421lmojexxdyd;
        int i15 = size - 1;
        int i16 = i15;
        while (true) {
            if (i16 < i14) {
                i13 = -1;
                break;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lmojexxdyd(listMbcevpiqjq, i16), obj)) {
                i13 = i16;
                break;
            }
            i16--;
        }
        if (i13 == -1) {
            while (true) {
                if (i15 < i14) {
                    i16 = i15;
                    break;
                }
                Object objEablkybsjg = this.f6415esjtqupxsv.eablkybsjg((pkzmftpjix) listMbcevpiqjq.get(i15));
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objEablkybsjg);
                zoijcleaow zoijcleaowVar = (zoijcleaow) objEablkybsjg;
                if (zoijcleaowVar.nufgyqmvbu() == zynmafqrjb.f6572iobyxmoadg || this.f6419jyumaefscl.zoijcleaow(obj, zoijcleaowVar.nufgyqmvbu())) {
                    zoijcleaowVar.vdvldrhtss(obj);
                    i16 = i15;
                    i13 = i16;
                    break;
                }
                i15--;
            }
        }
        if (i13 == -1) {
            return null;
        }
        if (i16 != i14) {
            pkzmftpjix(i16, i14, 1);
        }
        this.f6421lmojexxdyd--;
        pkzmftpjix pkzmftpjixVar = (pkzmftpjix) listMbcevpiqjq.get(i14);
        Object objEablkybsjg2 = this.f6415esjtqupxsv.eablkybsjg(pkzmftpjixVar);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objEablkybsjg2);
        zoijcleaow zoijcleaowVar2 = (zoijcleaow) objEablkybsjg2;
        zoijcleaowVar2.btonecajqb(c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null));
        zoijcleaowVar2.ojitshcjhn(true);
        zoijcleaowVar2.agtfadlqog(true);
        return pkzmftpjixVar;
    }

    private final void stevsuqkhv(zoijcleaow zoijcleaowVar, boolean z13) {
        x xVarPpxfxbqfkf;
        if (z13 || !zoijcleaowVar.zoijcleaow()) {
            zoijcleaowVar.btonecajqb(c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null));
        } else {
            zoijcleaowVar.dxjokdxxww(false);
        }
        if (zoijcleaowVar.lqeggnwhkg() != null) {
            jyumaefscl(zoijcleaowVar);
            return;
        }
        if (z13) {
            x xVarPpxfxbqfkf2 = zoijcleaowVar.ppxfxbqfkf();
            if (xVarPpxfxbqfkf2 != null) {
                xVarPpxfxbqfkf2.deactivate();
                return;
            }
            return;
        }
        oipsdeybqn oipsdeybqnVarIozdgvuglv = iozdgvuglv();
        if (oipsdeybqnVarIozdgvuglv != null) {
            lereixgezr(zoijcleaowVar, oipsdeybqnVarIozdgvuglv);
        } else {
            if (zoijcleaowVar.zoijcleaow() || (xVarPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf()) == null) {
                return;
            }
            xVarPpxfxbqfkf.deactivate();
        }
    }

    private final void ulzqkzuiru(pkzmftpjix pkzmftpjixVar, Object obj, boolean z13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        dsvhmnatus dsvhmnatusVar = this.f6415esjtqupxsv;
        Object objEablkybsjg = dsvhmnatusVar.eablkybsjg(pkzmftpjixVar);
        if (objEablkybsjg == null) {
            objEablkybsjg = new zoijcleaow(obj, x.eablkybsjg.f120812iobyxmoadg.iobyxmoadg(), null, 4, null);
            dsvhmnatusVar.cqumvgiudr(pkzmftpjixVar, objEablkybsjg);
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) objEablkybsjg;
        boolean z14 = zoijcleaowVar.wkgbmnqykc() != rgvfuqvkyqVar;
        if (zoijcleaowVar.lqeggnwhkg() != null) {
            if (z14) {
                jyumaefscl(zoijcleaowVar);
            } else if (z13) {
                return;
            } else {
                kcexrzcfyt(zoijcleaowVar, true);
            }
        }
        x xVarPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
        boolean zIwizpuwonk = xVarPpxfxbqfkf != null ? xVarPpxfxbqfkf.iwizpuwonk() : true;
        if (z14 || zIwizpuwonk || zoijcleaowVar.eablkybsjg()) {
            zoijcleaowVar.wflxmlrfwp(rgvfuqvkyqVar);
            ntlheqmsrt(pkzmftpjixVar, zoijcleaowVar, z13);
            zoijcleaowVar.agtfadlqog(false);
        }
    }

    private final void wypolnanlu(pkzmftpjix pkzmftpjixVar) {
        sopmlzcsov sopmlzcsovVarYdmasvzmpa = pkzmftpjixVar.ydmasvzmpa();
        pkzmftpjix.lqeggnwhkg lqeggnwhkgVar = pkzmftpjix.lqeggnwhkg.NotUsed;
        sopmlzcsovVarYdmasvzmpa.x0(lqeggnwhkgVar);
        ntlheqmsrt ntlheqmsrtVarCzzsidtyhn = pkzmftpjixVar.czzsidtyhn();
        if (ntlheqmsrtVarCzzsidtyhn != null) {
            ntlheqmsrtVarCzzsidtyhn.v0(lqeggnwhkgVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List yggfygwlhe(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (!(this.f6416iozdgvuglv.draadjrbmk() >= this.f6414cqumvgiudr)) {
            w.iobyxmoadg.iobyxmoadg("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int iDraadjrbmk = this.f6416iozdgvuglv.draadjrbmk();
        int i13 = this.f6414cqumvgiudr;
        if (iDraadjrbmk == i13) {
            this.f6416iozdgvuglv.zoijcleaow(obj);
        } else {
            this.f6416iozdgvuglv.jyumaefscl(i13, obj);
        }
        this.f6414cqumvgiudr++;
        if (this.f6417istkbnxepw.zoijcleaow(obj)) {
            pkzmftpjix pkzmftpjixVar = (pkzmftpjix) this.f6417istkbnxepw.eablkybsjg(obj);
            zoijcleaow zoijcleaowVar = pkzmftpjixVar != null ? (zoijcleaow) this.f6415esjtqupxsv.eablkybsjg(pkzmftpjixVar) : null;
            if (zoijcleaowVar != null && zoijcleaowVar.eablkybsjg()) {
                ulzqkzuiru(pkzmftpjixVar, obj, false, rgvfuqvkyqVar);
            }
        } else {
            this.f6424yadqdtsiqt.cqumvgiudr(obj, hkdspvbjdz(obj, rgvfuqvkyqVar));
            if (this.f6427zdlpuopuiu.xrmfcynszj() == pkzmftpjix.eablkybsjg.LayingOut) {
                this.f6427zdlpuopuiu.H(true);
            } else {
                pkzmftpjix.K(this.f6427zdlpuopuiu, true, false, false, 6, null);
            }
        }
        pkzmftpjix pkzmftpjixVar2 = (pkzmftpjix) this.f6417istkbnxepw.eablkybsjg(obj);
        if (pkzmftpjixVar2 != null) {
            List listW = pkzmftpjixVar2.ydmasvzmpa().w();
            int size = listW.size();
            for (int i14 = 0; i14 < size; i14++) {
                ((sopmlzcsov) listW.get(i14)).g0();
            }
            if (listW != null) {
                return listW;
            }
        }
        return hg.jyumaefscl.wflxmlrfwp();
    }

    private final void ylkuphrtab(boolean z13) {
        this.f6423wwaezpbzkn = 0;
        this.f6417istkbnxepw.gtknphoqwx();
        List listMbcevpiqjq = this.f6427zdlpuopuiu.mbcevpiqjq();
        int size = listMbcevpiqjq.size();
        if (this.f6421lmojexxdyd != size) {
            this.f6421lmojexxdyd = size;
            androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg;
            androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
            tg.draadjrbmk draadjrbmkVarLqeggnwhkg = lqeggnwhkgVarWkgbmnqykc != null ? lqeggnwhkgVarWkgbmnqykc.lqeggnwhkg() : null;
            androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(lqeggnwhkgVarWkgbmnqykc);
            for (int i13 = 0; i13 < size; i13++) {
                try {
                    pkzmftpjix pkzmftpjixVar = (pkzmftpjix) listMbcevpiqjq.get(i13);
                    zoijcleaow zoijcleaowVar = (zoijcleaow) this.f6415esjtqupxsv.eablkybsjg(pkzmftpjixVar);
                    if (zoijcleaowVar != null && zoijcleaowVar.iobyxmoadg()) {
                        wypolnanlu(pkzmftpjixVar);
                        stevsuqkhv(zoijcleaowVar, z13);
                        zoijcleaowVar.vdvldrhtss(zynmafqrjb.f6572iobyxmoadg);
                    }
                } catch (Throwable th2) {
                    iobyxmoadgVar.wflxmlrfwp(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarGxszxtbevo, draadjrbmkVarLqeggnwhkg);
                    throw th2;
                }
            }
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            iobyxmoadgVar.wflxmlrfwp(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarGxszxtbevo, draadjrbmkVarLqeggnwhkg);
            this.f6420lereixgezr.gtknphoqwx();
        }
        wwaezpbzkn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zdlpuopuiu() {
        return false;
    }

    public final istkbnxepw.iobyxmoadg dsvhmnatus(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (!this.f6427zdlpuopuiu.gxszxtbevo()) {
            return new nufgyqmvbu(obj);
        }
        cllcsxoeiz(obj, rgvfuqvkyqVar, true);
        return new dxjokdxxww(obj);
    }

    public final istkbnxepw.zoijcleaow hkdspvbjdz(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        cllcsxoeiz(obj, rgvfuqvkyqVar, false);
        return esjtqupxsv(obj);
    }

    public final x.zynmafqrjb iwizpuwonk(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return new wkgbmnqykc(rgvfuqvkyqVar, this.f6426ylkuphrtab);
    }

    public void jpowsppfya() {
        ylkuphrtab(false);
    }

    public final void kegysxyocb(androidx.compose.runtime.cqumvgiudr cqumvgiudrVar) {
        this.f6425yggfygwlhe = cqumvgiudrVar;
    }

    public final List mbcevpiqjq(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        wwaezpbzkn();
        pkzmftpjix.eablkybsjg eablkybsjgVarXrmfcynszj = this.f6427zdlpuopuiu.xrmfcynszj();
        pkzmftpjix.eablkybsjg eablkybsjgVar = pkzmftpjix.eablkybsjg.Measuring;
        if (!(eablkybsjgVarXrmfcynszj == eablkybsjgVar || eablkybsjgVarXrmfcynszj == pkzmftpjix.eablkybsjg.LayingOut || eablkybsjgVarXrmfcynszj == pkzmftpjix.eablkybsjg.LookaheadMeasuring || eablkybsjgVarXrmfcynszj == pkzmftpjix.eablkybsjg.LookaheadLayingOut)) {
            w.iobyxmoadg.zoijcleaow("subcompose can only be used inside the measure or layout blocks");
        }
        dsvhmnatus dsvhmnatusVar = this.f6420lereixgezr;
        Object objEablkybsjg = dsvhmnatusVar.eablkybsjg(obj);
        if (objEablkybsjg == null) {
            objEablkybsjg = (pkzmftpjix) this.f6417istkbnxepw.yggfygwlhe(obj);
            if (objEablkybsjg != null) {
                if (!(this.f6423wwaezpbzkn > 0)) {
                    w.iobyxmoadg.zoijcleaow("Check failed.");
                }
                this.f6423wwaezpbzkn--;
            } else {
                objEablkybsjg = sopmlzcsov(obj);
                if (objEablkybsjg == null) {
                    objEablkybsjg = cqumvgiudr(this.f6418iwizpuwonk);
                }
            }
            dsvhmnatusVar.cqumvgiudr(obj, objEablkybsjg);
        }
        pkzmftpjix pkzmftpjixVar = (pkzmftpjix) objEablkybsjg;
        if (hg.jyumaefscl.lrnfpwlwnk(this.f6427zdlpuopuiu.mbcevpiqjq(), this.f6418iwizpuwonk) != pkzmftpjixVar) {
            int iIndexOf = this.f6427zdlpuopuiu.mbcevpiqjq().indexOf(pkzmftpjixVar);
            if (!(iIndexOf >= this.f6418iwizpuwonk)) {
                w.iobyxmoadg.iobyxmoadg("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i13 = this.f6418iwizpuwonk;
            if (i13 != iIndexOf) {
                hcddaimhww(this, iIndexOf, i13, 0, 4, null);
            }
        }
        this.f6418iwizpuwonk++;
        ulzqkzuiru(pkzmftpjixVar, obj, false, rgvfuqvkyqVar);
        return (eablkybsjgVarXrmfcynszj == eablkybsjgVar || eablkybsjgVarXrmfcynszj == pkzmftpjix.eablkybsjg.LayingOut) ? pkzmftpjixVar.dsvhmnatus() : pkzmftpjixVar.cllcsxoeiz();
    }

    @Override // androidx.compose.runtime.dxjokdxxww
    public void nufgyqmvbu() {
        ylkuphrtab(true);
    }

    public final void tzroggbefp(cdpycssgdh cdpycssgdhVar) {
        if (this.f6419jyumaefscl != cdpycssgdhVar) {
            this.f6419jyumaefscl = cdpycssgdhVar;
            ylkuphrtab(false);
            pkzmftpjix.O(this.f6427zdlpuopuiu, false, false, false, 7, null);
        }
    }

    public final void wwaezpbzkn() {
        int size = this.f6427zdlpuopuiu.mbcevpiqjq().size();
        if (!(this.f6415esjtqupxsv.lqeggnwhkg() == size)) {
            w.iobyxmoadg.iobyxmoadg("Inconsistency between the count of nodes tracked by the state (" + this.f6415esjtqupxsv.lqeggnwhkg() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.f6421lmojexxdyd) - this.f6423wwaezpbzkn >= 0)) {
            w.iobyxmoadg.iobyxmoadg("Incorrect state. Total children " + size + ". Reusable children " + this.f6421lmojexxdyd + ". Precomposed children " + this.f6423wwaezpbzkn);
        }
        if (this.f6417istkbnxepw.lqeggnwhkg() == this.f6423wwaezpbzkn) {
            return;
        }
        w.iobyxmoadg.iobyxmoadg("Incorrect state. Precomposed children " + this.f6423wwaezpbzkn + ". Map size " + this.f6417istkbnxepw.lqeggnwhkg());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[LOOP:0: B:7:0x001b->B:17:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056 A[EDGE_INSN: B:27:0x0056->B:18:0x0056 BREAK  A[LOOP:0: B:7:0x001b->B:17:0x0053], SYNTHETIC] */
    public final void yadqdtsiqt() {
        if (this.f6421lmojexxdyd != this.f6427zdlpuopuiu.mbcevpiqjq().size()) {
            dsvhmnatus dsvhmnatusVar = this.f6415esjtqupxsv;
            Object[] objArr = dsvhmnatusVar.f4300ppxfxbqfkf;
            long[] jArr = dsvhmnatusVar.f4299iobyxmoadg;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j13 = jArr[i13];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i13 != length) {
                            break;
                            break;
                        }
                        i13++;
                    } else {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j13) < 128) {
                                ((zoijcleaow) objArr[(i13 << 3) + i15]).agtfadlqog(true);
                            }
                            j13 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        } else if (i13 != length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
            if (this.f6427zdlpuopuiu.uwvvkdfqfp() != null) {
                if (this.f6427zdlpuopuiu.rlfsiqarku()) {
                    return;
                }
                pkzmftpjix.K(this.f6427zdlpuopuiu, false, false, false, 7, null);
            } else {
                if (this.f6427zdlpuopuiu.sflfametgt()) {
                    return;
                }
                pkzmftpjix.O(this.f6427zdlpuopuiu, false, false, false, 7, null);
            }
        }
    }

    @Override // androidx.compose.runtime.dxjokdxxww
    public void zoijcleaow() {
        pmvmpeiblj();
    }

    public final void zynmafqrjb(int i13) {
        boolean z13 = false;
        this.f6421lmojexxdyd = 0;
        List listMbcevpiqjq = this.f6427zdlpuopuiu.mbcevpiqjq();
        int size = (listMbcevpiqjq.size() - this.f6423wwaezpbzkn) - 1;
        if (i13 <= size) {
            this.f6413cdpycssgdh.clear();
            if (i13 <= size) {
                int i14 = i13;
                while (true) {
                    this.f6413cdpycssgdh.add(lmojexxdyd(listMbcevpiqjq, i14));
                    if (i14 == size) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f6419jyumaefscl.iobyxmoadg(this.f6413cdpycssgdh);
            androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg;
            androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
            tg.draadjrbmk draadjrbmkVarLqeggnwhkg = lqeggnwhkgVarWkgbmnqykc != null ? lqeggnwhkgVarWkgbmnqykc.lqeggnwhkg() : null;
            androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(lqeggnwhkgVarWkgbmnqykc);
            boolean z14 = false;
            while (size >= i13) {
                try {
                    pkzmftpjix pkzmftpjixVar = (pkzmftpjix) listMbcevpiqjq.get(size);
                    Object objEablkybsjg = this.f6415esjtqupxsv.eablkybsjg(pkzmftpjixVar);
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objEablkybsjg);
                    zoijcleaow zoijcleaowVar = (zoijcleaow) objEablkybsjg;
                    Object objNufgyqmvbu = zoijcleaowVar.nufgyqmvbu();
                    if (this.f6413cdpycssgdh.contains(objNufgyqmvbu)) {
                        this.f6421lmojexxdyd++;
                        if (zoijcleaowVar.iobyxmoadg()) {
                            wypolnanlu(pkzmftpjixVar);
                            stevsuqkhv(zoijcleaowVar, false);
                            if (zoijcleaowVar.zoijcleaow()) {
                                z14 = true;
                            }
                        }
                    } else {
                        pkzmftpjix pkzmftpjixVar2 = this.f6427zdlpuopuiu;
                        pkzmftpjixVar2.f127147hcddaimhww = true;
                        this.f6415esjtqupxsv.yggfygwlhe(pkzmftpjixVar);
                        x xVarPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
                        if (xVarPpxfxbqfkf != null) {
                            xVarPpxfxbqfkf.iobyxmoadg();
                        }
                        this.f6427zdlpuopuiu.E(size, 1);
                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                        pkzmftpjixVar2.f127147hcddaimhww = false;
                    }
                    this.f6420lereixgezr.yggfygwlhe(objNufgyqmvbu);
                    size--;
                } catch (Throwable th2) {
                    iobyxmoadgVar.wflxmlrfwp(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarGxszxtbevo, draadjrbmkVarLqeggnwhkg);
                    throw th2;
                }
            }
            gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
            iobyxmoadgVar.wflxmlrfwp(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarGxszxtbevo, draadjrbmkVarLqeggnwhkg);
            z13 = z14;
        }
        if (z13) {
            androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.agtfadlqog();
        }
        wwaezpbzkn();
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f6463eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private ipoelvxyzq f6464gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Object f6465iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private iwxlajgraz f6466lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private boolean f6467nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private x f6468ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f6469wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private tg.rgvfuqvkyq f6470zoijcleaow;

        public zoijcleaow(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar, x xVar) {
            this.f6465iobyxmoadg = obj;
            this.f6470zoijcleaow = rgvfuqvkyqVar;
            this.f6468ppxfxbqfkf = xVar;
            this.f6466lqeggnwhkg = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
        }

        public final void agtfadlqog(boolean z13) {
            this.f6469wkgbmnqykc = z13;
        }

        public final void btonecajqb(iwxlajgraz iwxlajgrazVar) {
            this.f6466lqeggnwhkg = iwxlajgrazVar;
        }

        public final void draadjrbmk(x xVar) {
            this.f6468ppxfxbqfkf = xVar;
        }

        public final void dxjokdxxww(boolean z13) {
            this.f6466lqeggnwhkg.setValue(Boolean.valueOf(z13));
        }

        public final boolean eablkybsjg() {
            return this.f6469wkgbmnqykc;
        }

        public final void gtknphoqwx(boolean z13) {
            this.f6467nufgyqmvbu = z13;
        }

        public final boolean gxszxtbevo() {
            return this.f6463eablkybsjg;
        }

        public final boolean iobyxmoadg() {
            return ((Boolean) this.f6466lqeggnwhkg.getValue()).booleanValue();
        }

        public final ipoelvxyzq lqeggnwhkg() {
            return this.f6464gxszxtbevo;
        }

        public final Object nufgyqmvbu() {
            return this.f6465iobyxmoadg;
        }

        public final void ojitshcjhn(boolean z13) {
            this.f6463eablkybsjg = z13;
        }

        public final x ppxfxbqfkf() {
            return this.f6468ppxfxbqfkf;
        }

        public final void rgvfuqvkyq(ipoelvxyzq ipoelvxyzqVar) {
            this.f6464gxszxtbevo = ipoelvxyzqVar;
        }

        public final void vdvldrhtss(Object obj) {
            this.f6465iobyxmoadg = obj;
        }

        public final void wflxmlrfwp(tg.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f6470zoijcleaow = rgvfuqvkyqVar;
        }

        public final tg.rgvfuqvkyq wkgbmnqykc() {
            return this.f6470zoijcleaow;
        }

        public final boolean zoijcleaow() {
            return this.f6467nufgyqmvbu;
        }

        public /* synthetic */ zoijcleaow(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar, x xVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(obj, rgvfuqvkyqVar, (i13 & 4) != 0 ? null : xVar);
        }
    }
}
