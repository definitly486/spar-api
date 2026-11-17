package bk;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends fk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ah.wkgbmnqykc f16638iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gg.gtknphoqwx f16639ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private List f16640zoijcleaow;

    public gxszxtbevo(ah.wkgbmnqykc baseClass) {
        zdlpuopuiu.btonecajqb(baseClass, "baseClass");
        this.f16638iobyxmoadg = baseClass;
        this.f16640zoijcleaow = jyumaefscl.wflxmlrfwp();
        this.f16639ppxfxbqfkf = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, new tg.iobyxmoadg() { // from class: bk.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gxszxtbevo.wflxmlrfwp(this.f16643zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(gxszxtbevo gxszxtbevoVar, dk.iobyxmoadg buildSerialDescriptor) {
        zdlpuopuiu.btonecajqb(buildSerialDescriptor, "$this$buildSerialDescriptor");
        dk.iobyxmoadg.zoijcleaow(buildSerialDescriptor, "type", ck.iobyxmoadg.ylkuphrtab(tzroggbefp.f60034iobyxmoadg).iobyxmoadg(), null, false, 12, null);
        dk.iobyxmoadg.zoijcleaow(buildSerialDescriptor, "value", dk.wflxmlrfwp.nufgyqmvbu("kotlinx.serialization.Polymorphic<" + gxszxtbevoVar.btonecajqb().jyumaefscl() + '>', dk.agtfadlqog.iobyxmoadg.f29057iobyxmoadg, new dk.gxszxtbevo[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.nufgyqmvbu(gxszxtbevoVar.f16640zoijcleaow);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.gxszxtbevo wflxmlrfwp(final gxszxtbevo gxszxtbevoVar) {
        return dk.zoijcleaow.ppxfxbqfkf(dk.wflxmlrfwp.lqeggnwhkg("kotlinx.serialization.Polymorphic", dk.wkgbmnqykc.iobyxmoadg.f29102iobyxmoadg, new dk.gxszxtbevo[0], new tg.draadjrbmk() { // from class: bk.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.agtfadlqog(this.f16631zdlpuopuiu, (dk.iobyxmoadg) obj);
            }
        }), gxszxtbevoVar.btonecajqb());
    }

    @Override // fk.zoijcleaow
    public ah.wkgbmnqykc btonecajqb() {
        return this.f16638iobyxmoadg;
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return (dk.gxszxtbevo) this.f16639ppxfxbqfkf.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + btonecajqb() + ')';
    }
}
