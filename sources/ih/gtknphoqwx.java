package ih;

import java.util.List;
import jh.lmojexxdyd;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.yadqdtsiqt;
import mh.iozdgvuglv;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx extends gh.dxjokdxxww {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f44227gtknphoqwx = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(cllcsxoeiz.zoijcleaow(gtknphoqwx.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final yi.dxjokdxxww f44228btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private tg.iobyxmoadg f44229dxjokdxxww;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final iobyxmoadg f44230nufgyqmvbu;

    public enum iobyxmoadg {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK;


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f44231cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f44236iobyxmoadg;

        static {
            int[] iArr = new int[iobyxmoadg.values().length];
            try {
                iArr[iobyxmoadg.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iobyxmoadg.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[iobyxmoadg.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44236iobyxmoadg = iArr;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lmojexxdyd f44237iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f44238zoijcleaow;

        public zoijcleaow(lmojexxdyd ownerModuleDescriptor, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f44237iobyxmoadg = ownerModuleDescriptor;
            this.f44238zoijcleaow = z13;
        }

        public final lmojexxdyd iobyxmoadg() {
            return this.f44237iobyxmoadg;
        }

        public final boolean zoijcleaow() {
            return this.f44238zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(yi.agtfadlqog storageManager, iobyxmoadg kind) {
        super(storageManager);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kind, "kind");
        this.f44230nufgyqmvbu = kind;
        this.f44228btonecajqb = storageManager.wkgbmnqykc(new nufgyqmvbu(this, storageManager));
        int i13 = ppxfxbqfkf.f44236iobyxmoadg[kind.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                gxszxtbevo(false);
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                gxszxtbevo(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yggfygwlhe ageimvtcrz(gtknphoqwx gtknphoqwxVar, yi.agtfadlqog agtfadlqogVar) {
        iozdgvuglv iozdgvuglvVarOxmwwwfdhm = gtknphoqwxVar.oxmwwwfdhm();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iozdgvuglvVarOxmwwwfdhm, "getBuiltInsModule(...)");
        return new yggfygwlhe(iozdgvuglvVarOxmwwwfdhm, agtfadlqogVar, new btonecajqb(gtknphoqwxVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zoijcleaow fyldjkxazc(gtknphoqwx gtknphoqwxVar) {
        tg.iobyxmoadg iobyxmoadgVar = gtknphoqwxVar.f44229dxjokdxxww;
        if (iobyxmoadgVar == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.invoke();
        gtknphoqwxVar.f44229dxjokdxxww = null;
        return zoijcleaowVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zoijcleaow ixidwrxhsl(lmojexxdyd lmojexxdydVar, boolean z13) {
        return new zoijcleaow(lmojexxdydVar, z13);
    }

    public final yggfygwlhe grlcpdaxtj() {
        return (yggfygwlhe) yi.wflxmlrfwp.iobyxmoadg(this.f44228btonecajqb, this, f44227gtknphoqwx[0]);
    }

    @Override // gh.dxjokdxxww
    protected lh.ppxfxbqfkf hkdspvbjdz() {
        return grlcpdaxtj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // gh.dxjokdxxww
    /* JADX INFO: renamed from: ipoelvxyzq, reason: merged with bridge method [inline-methods] */
    public List jyumaefscl() {
        Iterable iterableJyumaefscl = super.jyumaefscl();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iterableJyumaefscl, "getClassDescriptorFactories(...)");
        yi.agtfadlqog agtfadlqogVarNtlheqmsrt = ntlheqmsrt();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(agtfadlqogVarNtlheqmsrt, "getStorageManager(...)");
        iozdgvuglv iozdgvuglvVarOxmwwwfdhm = oxmwwwfdhm();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iozdgvuglvVarOxmwwwfdhm, "getBuiltInsModule(...)");
        return hg.jyumaefscl.mhtqkkgtqm(iterableJyumaefscl, new lqeggnwhkg(agtfadlqogVarNtlheqmsrt, iozdgvuglvVarOxmwwwfdhm, null, 4, null));
    }

    public final void jrbgnlbqoe(tg.iobyxmoadg computation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(computation, "computation");
        this.f44229dxjokdxxww = computation;
    }

    @Override // gh.dxjokdxxww
    protected lh.iobyxmoadg lqeggnwhkg() {
        return grlcpdaxtj();
    }

    public final void mhtqkkgtqm(lmojexxdyd moduleDescriptor, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(moduleDescriptor, "moduleDescriptor");
        jrbgnlbqoe(new dxjokdxxww(moduleDescriptor, z13));
    }
}
