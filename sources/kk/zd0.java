package kk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zd0 {
    public static final boolean iobyxmoadg(wc0 wc0Var, uc0 tag, b6 b6Var) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wc0Var, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        wc0Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        y60 y60Var = (y60) wc0Var.f59129wkgbmnqykc.get(tag);
        return y60Var != null && ((Boolean) y60Var.iobyxmoadg(b6Var)).booleanValue();
    }

    public static final boolean zoijcleaow(wc0 wc0Var, vf0 option) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wc0Var, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(option, "option");
        uc0 tag = uc0.S_BONUSES_PAYMENT;
        wc0Var.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        y60 y60Var = (y60) wc0Var.f59129wkgbmnqykc.get(tag);
        if (y60Var == null) {
            uc0 tag2 = uc0.S_BONUSES_PAYMENT_V2;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag2, "tag");
            y60Var = (y60) wc0Var.f59129wkgbmnqykc.get(tag2);
        }
        return y60Var != null && ((Boolean) y60Var.iobyxmoadg(option)).booleanValue();
    }
}
