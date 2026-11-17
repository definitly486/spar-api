package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class y50 extends xj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ll f59389iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final wc0 f59390zoijcleaow;

    public y50(ll sPayRepository, pc sPaySdkReducer, wc0 featuresHandler) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        this.f59389iobyxmoadg = sPayRepository;
        this.f59390zoijcleaow = featuresHandler;
    }

    public static final void iobyxmoadg(y50 y50Var) {
        wc0 wc0Var = y50Var.f59390zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wc0Var, "<this>");
        uc0 tag = uc0.S_BONUSES_PAYMENT;
        wc0Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        y60 y60Var = (y60) wc0Var.f59129wkgbmnqykc.get(tag);
        ei0 ei0Var = null;
        ei0 ei0Var2 = y60Var instanceof ei0 ? (ei0) y60Var : null;
        if (ei0Var2 == null) {
            uc0 tag2 = uc0.S_BONUSES_PAYMENT_V2;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag2, "tag");
            y60 y60Var2 = (y60) wc0Var.f59129wkgbmnqykc.get(tag2);
            if (y60Var2 instanceof ei0) {
                ei0Var = (ei0) y60Var2;
            }
        } else {
            ei0Var = ei0Var2;
        }
        if (ei0Var != null) {
            ei0Var.f56427iobyxmoadg = false;
            ei0Var.f56428zoijcleaow = false;
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }
}
