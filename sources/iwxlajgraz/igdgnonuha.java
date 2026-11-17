package iwxlajgraz;

import androidx.compose.runtime.c1;
import androidx.compose.ui.platform.f;
import androidx.compose.ui.platform.g;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.platform.w;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class igdgnonuha extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements f, z.nufgyqmvbu, z.jyumaefscl, hszhottldk.iobyxmoadg {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private skhdrjzrfn.skhdrjzrfn f49864hcddaimhww;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f49865jpowsppfya = c1.ppxfxbqfkf(null, null, 2, null);

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private opjhrmiecq.igdgnonuha f49866pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private hszhottldk f49867ylkuphrtab;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f49868jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f49870zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f49868jyumaefscl = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return igdgnonuha.this.new iobyxmoadg(this.f49868jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f49870zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                igdgnonuha igdgnonuhaVar = igdgnonuha.this;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f49868jyumaefscl;
                this.f49870zdlpuopuiu = 1;
                if (g.zoijcleaow(igdgnonuhaVar, rgvfuqvkyqVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public igdgnonuha(hszhottldk hszhottldkVar, opjhrmiecq.igdgnonuha igdgnonuhaVar, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar) {
        this.f49867ylkuphrtab = hszhottldkVar;
        this.f49866pkzmftpjix = igdgnonuhaVar;
        this.f49864hcddaimhww = skhdrjzrfnVar;
    }

    private void H0(x.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f49865jpowsppfya.setValue(rgvfuqvkyqVar);
    }

    public void I0(opjhrmiecq.igdgnonuha igdgnonuhaVar) {
        this.f49866pkzmftpjix = igdgnonuhaVar;
    }

    public final void J0(hszhottldk hszhottldkVar) {
        if (n0()) {
            this.f49867ylkuphrtab.ppxfxbqfkf();
            this.f49867ylkuphrtab.draadjrbmk(this);
        }
        this.f49867ylkuphrtab = hszhottldkVar;
        if (n0()) {
            this.f49867ylkuphrtab.btonecajqb(this);
        }
    }

    public void K0(skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar) {
        this.f49864hcddaimhww = skhdrjzrfnVar;
    }

    @Override // iwxlajgraz.hszhottldk.iobyxmoadg
    public opjhrmiecq.igdgnonuha Y() {
        return this.f49866pkzmftpjix;
    }

    @Override // iwxlajgraz.hszhottldk.iobyxmoadg
    public m getSoftwareKeyboardController() {
        return (m) z.dxjokdxxww.iobyxmoadg(this, androidx.compose.ui.platform.zeieaojujs.rgvfuqvkyq());
    }

    @Override // iwxlajgraz.hszhottldk.iobyxmoadg
    public w getViewConfiguration() {
        return (w) z.dxjokdxxww.iobyxmoadg(this, androidx.compose.ui.platform.zeieaojujs.kcexrzcfyt());
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void q0() {
        this.f49867ylkuphrtab.btonecajqb(this);
    }

    @Override // iwxlajgraz.hszhottldk.iobyxmoadg
    public skhdrjzrfn.skhdrjzrfn r() {
        return this.f49864hcddaimhww;
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void r0() {
        this.f49867ylkuphrtab.draadjrbmk(this);
    }

    @Override // iwxlajgraz.hszhottldk.iobyxmoadg
    public x.rgvfuqvkyq skhdrjzrfn() {
        return (x.rgvfuqvkyq) this.f49865jpowsppfya.getValue();
    }

    @Override // z.jyumaefscl
    public void yggfygwlhe(x.rgvfuqvkyq rgvfuqvkyqVar) {
        H0(rgvfuqvkyqVar);
    }

    @Override // iwxlajgraz.hszhottldk.iobyxmoadg
    public pj.auzgnhcxok z(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (n0()) {
            return pj.gtknphoqwx.wkgbmnqykc(g0(), null, pj.wypolnanlu.UNDISPATCHED, new iobyxmoadg(rgvfuqvkyqVar, null), 1, null);
        }
        return null;
    }
}
