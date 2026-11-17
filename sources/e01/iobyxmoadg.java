package e01;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes5.dex */
public enum iobyxmoadg {
    RADIO_BUTTON("radio"),
    CHECKBOX("checkbox"),
    CHECKBOX_TEXT("checkbox-text"),
    NULL("");


    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f30128pmvmpeiblj = zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final C0627iobyxmoadg f30129yggfygwlhe = new C0627iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f30130zdlpuopuiu;

    /* JADX INFO: renamed from: e01.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0627iobyxmoadg {
        public /* synthetic */ C0627iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
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

        private C0627iobyxmoadg() {
        }
    }

    iobyxmoadg(String str) {
        this.f30130zdlpuopuiu = str;
    }

    public final String wkgbmnqykc() {
        return this.f30130zdlpuopuiu;
    }
}
