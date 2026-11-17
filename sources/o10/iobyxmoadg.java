package o10;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes4.dex */
public enum iobyxmoadg {
    RADIO_BUTTON("radio"),
    CHECKBOX("checkbox"),
    CHECKBOX_TEXT("checkbox-text"),
    NULL("");


    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f71546pmvmpeiblj = zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final C1547iobyxmoadg f71547yggfygwlhe = new C1547iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f71548zdlpuopuiu;

    /* JADX INFO: renamed from: o10.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1547iobyxmoadg {
        public /* synthetic */ C1547iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final iobyxmoadg iobyxmoadg(String type) {
            zdlpuopuiu.btonecajqb(type, "type");
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.RADIO_BUTTON;
            if (zdlpuopuiu.eablkybsjg(type, iobyxmoadgVar.wkgbmnqykc())) {
                return iobyxmoadgVar;
            }
            iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.CHECKBOX;
            if (zdlpuopuiu.eablkybsjg(type, iobyxmoadgVar2.wkgbmnqykc())) {
                return iobyxmoadgVar2;
            }
            iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.CHECKBOX_TEXT;
            return zdlpuopuiu.eablkybsjg(type, iobyxmoadgVar3.wkgbmnqykc()) ? iobyxmoadgVar3 : iobyxmoadg.NULL;
        }

        private C1547iobyxmoadg() {
        }
    }

    iobyxmoadg(String str) {
        this.f71548zdlpuopuiu = str;
    }

    public final String wkgbmnqykc() {
        return this.f71548zdlpuopuiu;
    }
}
